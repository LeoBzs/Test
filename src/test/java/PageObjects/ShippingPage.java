package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingPage {
    private final Waits waits;

    public ShippingPage(WebDriver driver){
        waits = new Waits(driver);
    }

    public WebElement getTermsOfServiceBox(){
        return waits.visibilityOfElement(By.id("uniform-cgv"));
    }
    public WebElement getShippingToCheckout(){
        return waits.visibilityOfElement(By.name("processCarrier"));
    }
}
