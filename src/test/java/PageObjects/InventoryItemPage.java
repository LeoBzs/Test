package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryItemPage {
    private final Waits waits;

    public InventoryItemPage(WebDriver driver) {
        waits = new Waits(driver);
    }

    public WebElement getItemNameTextField(){
        return waits.visibilityOfElement(By.cssSelector(".inventory_details_name.large_size"));
    }
}
