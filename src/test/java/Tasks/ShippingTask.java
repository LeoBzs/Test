package Tasks;

import PageObjects.ShippingPage;
import org.openqa.selenium.WebDriver;

public class ShippingTask {
    private WebDriver driver;
    private ShippingPage shippingPage;

    public ShippingTask(WebDriver driver) {
        this.driver = driver;
        shippingPage = new ShippingPage(driver);
    }

    public void checkboxAndProceed(){
        shippingPage.getTermsOfServiceBox().click();
        shippingPage.getShippingToCheckout().click();
    }
}