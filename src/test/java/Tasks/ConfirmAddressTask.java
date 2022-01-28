package Tasks;

import PageObjects.ConfirmAddressPage;
import org.openqa.selenium.WebDriver;

public class ConfirmAddressTask {
    private final ConfirmAddressPage confirmAddressPage;

    public ConfirmAddressTask(WebDriver driver) {
        confirmAddressPage = new ConfirmAddressPage(driver);
    }

    public void proceedToShipping(){
        confirmAddressPage.getSubmitOrder().click();
    }
}