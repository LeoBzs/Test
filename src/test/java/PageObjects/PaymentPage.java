package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {
    private final Waits waits;

    public PaymentPage(WebDriver driver){
        waits = new Waits(driver);
    }

    public WebElement getPaymentOption(){
        return waits.visibilityOfElement(By.className("bankwire"));
    }
}