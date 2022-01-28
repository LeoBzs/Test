package Tasks;

import PageObjects.ShippingPage;
import org.openqa.selenium.WebDriver;

public class ShippingTask {
    private final ShippingPage shippingPage;

    public ShippingTask(WebDriver driver) {
        shippingPage = new ShippingPage(driver);
    }

    public void checkboxAndProceed(){
        shippingPage.getTermsOfServiceBox().click();
        shippingPage.getShippingToCheckout().click();
    }
}