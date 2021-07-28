package Tasks;

import PageObjects.AuthenticationPage;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class AuthenticationTask {
    private WebDriver driver;
    private AuthenticationPage authenticationPage;
    private static Faker faker = new Faker(new Locale("pt-BR"));

    public static String getEmailAdress(){
        return faker.internet().emailAddress();
    }

    public AuthenticationTask(WebDriver driver){
        this.driver = driver;
        authenticationPage = new AuthenticationPage(driver);
    }

    public void createAccount() throws Exception{
        authenticationPage.getCreateAnAccountEmailTextField().sendKeys(getEmailAdress());
        authenticationPage.getCreateAnAccountButton().click();
    }
}
