package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClothesPage {
    private WebDriver driver;
    private Waits waits;

    public ClothesPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getHoverToProduct(){
        return waits.visibilityOfElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[2]/div[1]/span"));
    }

    public WebElement getAddToCart(){
        return waits.visibilityOfElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[2]/div[2]/a[1]"));
    }

    public WebElement getClickToCheckout(){
        return waits.visibilityOfElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a"));
    }
}
