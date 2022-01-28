package Tasks;

import Framework.Report;
import PageObjects.InventoryItemPage;
import PageObjects.InventoryPage;
import Utils.FileOperations;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class InventoryTask {
    private final InventoryPage inventoryPage;
    private final InventoryItemPage inventoryItemPage;

    public InventoryTask(WebDriver driver) {
        inventoryPage = new InventoryPage(driver);
        inventoryItemPage = new InventoryItemPage(driver);
    }

    public void changeDropdownSelection(){
        inventoryPage.getDropdownSort().selectByIndex(2);
    }

    public void selectItem(){
        String mochilaTexto = inventoryPage.getSauceLabsBackPackTextField().getText();

        FileOperations.setProperties("data", "itemName", mochilaTexto);

        inventoryPage.getSauceLabsBackpackImageLink().click();

        validateNextPage();
    }

    public void validateNextPage() {
        try {
            String textoExtraido = inventoryItemPage.getItemNameTextField().getText();

            Assertions.assertEquals(FileOperations.getProperties("data.properties").getProperty("itemName"), textoExtraido);
            Report.log(Status.PASS, "Página de InventoryItem foi carregada com sucesso!");
        } catch (Exception e) {
            Report.log(Status.FAIL, "Pagina não foi carregada!");
        }
    }
}