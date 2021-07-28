package Tasks;

import PageObjects.ConfirmAddressPage;
import org.openqa.selenium.WebDriver;

public class ConfirmAddressTask {
    private WebDriver driver;
    private ConfirmAddressPage confirmAddressPage;

    public ConfirmAddressTask(WebDriver driver) {
        this.driver = driver;
        confirmAddressPage = new ConfirmAddressPage(driver);
    }

    public void proceedToShipping(){
        confirmAddressPage.getSubmitOrder().click();
    }
}