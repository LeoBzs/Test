package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {
    private final Waits waits;

    public OrderPage(WebDriver driver){
        waits = new Waits(driver);
    }

    public WebElement getProceedToCheckout(){
        return waits.visibilityOfElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]"));
    }

}
