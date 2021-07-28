package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
    private WebDriver driver;
    private Waits waits;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getRadioMrsBtn(){
        return waits.visibilityOfElement(By.id("uniform-id_gender2"));
    }

    public WebElement getFirstNameTextbox(){
        return waits.visibilityOfElement(By.id("customer_firstname"));
    }
    public WebElement getLastNameTextbox(){
        return waits.visibilityOfElement(By.id("customer_lastname"));
    }
    public WebElement getEmailTextbox(){
        return waits.visibilityOfElement(By.id("email"));
    }
    public WebElement getPasswordTextbox(){
        return waits.visibilityOfElement(By.id("passwd"));
    }

    public WebElement getFirstNameAddress(){
        return waits.visibilityOfElement(By.id("firstname"));
    }

    public WebElement getLastNameAddress(){
        return waits.visibilityOfElement(By.id("lastname"));
    }

    public WebElement getAddressTextbox(){
        return waits.visibilityOfElement(By.id("address1"));
    }
    public WebElement getCityTextbox(){
        return waits.visibilityOfElement(By.id("city"));
    }
    public WebElement getStateClick(){
        return waits.visibilityOfElement(By.id("uniform-id_state"));
    }
    public WebElement getStateClick2(){
        return waits.visibilityOfElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[7]/div/select/option[6]"));
    }
    public Select getStateSelect(){
        return new Select(waits.visibilityOfElement(By.id("id_state")));
    }
    public WebElement getPostalCodeTextbox(){
        return waits.visibilityOfElement(By.id("postcode"));
    }
    public Select getCountrySelect(){
        return new Select(waits.visibilityOfElement(By.id("id_country")));
    }
    public WebElement getMobilePhoneTextbox(){
        return waits.visibilityOfElement(By.id("phone_mobile"));
    }
    public WebElement getAliasTextbox(){
        return waits.visibilityOfElement(By.id("alias"));
    }
    public WebElement getSubmitAccountBtn(){
        return waits.visibilityOfElement(By.id("submitAccount"));
    }
}
