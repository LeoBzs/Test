package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmPaymentPage {
    private WebDriver driver;
    private Waits waits;

    public ConfirmPaymentPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getIsConfirmed(){
        return waits.visibilityOfElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/p/strong"));
    }

    public WebElement getConfirm(){
        return waits.visibilityOfElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
    }
}