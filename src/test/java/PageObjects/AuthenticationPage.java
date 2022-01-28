package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationPage {
    private final Waits waits;

    public AuthenticationPage(WebDriver driver){
        waits = new Waits(driver);
    }

    public WebElement getCreateAnAccountEmailTextField(){
        return waits.visibilityOfElement(By.id("email_create"));
    }

    public WebElement getCreateAnAccountButton(){
        return waits.visibilityOfElement(By.id("SubmitCreate"));
    }
}
