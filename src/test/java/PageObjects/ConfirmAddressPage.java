package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmAddressPage {
    private WebDriver driver;
    private Waits waits;

    public ConfirmAddressPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getSubmitOrder(){
        return waits.visibilityOfElement(By.name("processAddress"));
    }
}
