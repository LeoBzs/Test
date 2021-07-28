package Tasks;

import PageObjects.OrderPage;
import org.openqa.selenium.WebDriver;

public class OrderTask {
    private WebDriver driver;
    private OrderPage orderPage;

    public OrderTask(WebDriver driver) {
        this.driver = driver;
        orderPage = new OrderPage(driver);
    }

    public void proceedToAuthorize(){
        // String mochilaTexto = inventoryPage.getSauceLabsBackPackTextField().getText();
        // FileOperations.setProperties("data", "itemName", mochilaTexto);
        orderPage.getProceedToCheckout().click();
        // inventoryPage.getSauceLabsBackpackImageLink().click();
    }
}