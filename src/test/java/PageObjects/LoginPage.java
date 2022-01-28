package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final Waits waits;

    public LoginPage(WebDriver driver){
        waits = new Waits(driver);
    }

    public WebElement getUsernameTextField(){
        return waits.visibilityOfElement(By.id("user-name"));
    }

    public WebElement getPasswordTextField(){
        return waits.visibilityOfElement(By.name("password"));
    }
    public WebElement getLoginButton(){
        return waits.visibilityOfElement(By.xpath("//*[@data-test='login-button']"));
    }

    public WebElement getLoginImage(){
        return waits.visibilityOfElement(By.cssSelector(".bot_column"));
    }
}
