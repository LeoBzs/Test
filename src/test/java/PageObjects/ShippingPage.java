package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingPage {
    private WebDriver driver;
    private Waits waits;

    public ShippingPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getTermsOfServiceBox(){
        return waits.visibilityOfElement(By.id("uniform-cgv"));
    }
    public WebElement getShippingToCheckout(){
        return waits.visibilityOfElement(By.name("processCarrier"));
    }
}
