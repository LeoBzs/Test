package Tasks;

import PageObjects.ClothesPage;
import org.openqa.selenium.WebDriver;

public class ClothesTask {
    private WebDriver driver;
    private ClothesPage clothesPage;

    public ClothesTask(WebDriver driver) {
        this.driver = driver;
        clothesPage = new ClothesPage(driver);
    }

    public void HoverToProduct(){
        clothesPage.getHoverToProduct().click();
    }
    public void selectProduct(){
        // String mochilaTexto = inventoryPage.getSauceLabsBackPackTextField().getText();
        // FileOperations.setProperties("data", "itemName", mochilaTexto);
        clothesPage.getAddToCart().click();

        // inventoryPage.getSauceLabsBackpackImageLink().click();
    }

    public void ProductToCheckout(){
        clothesPage.getClickToCheckout().click();
    }
}