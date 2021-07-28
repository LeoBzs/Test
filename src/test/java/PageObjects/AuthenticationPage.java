package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationPage {
    private WebDriver driver;
    private Waits waits;

    public AuthenticationPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getCreateAnAccountEmailTextField(){
        return waits.visibilityOfElement(By.id("email_create"));
    }

    public WebElement getCreateAnAccountButton(){
        return waits.visibilityOfElement(By.id("SubmitCreate"));
    }
}
