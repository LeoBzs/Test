package Tasks;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.LoginPage;
import Utils.FileOperations;
import Utils.Highlights;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class LoginTask {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginTask(WebDriver driver){
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }

    public void realizarLogin() throws Exception{
        String user = FileOperations.getProperties("loginData").getProperty("user");
        String password = FileOperations.getProperties("loginData").getProperty("password");

        verificaCarregamentoLogin();
        loginPage.getUsernameTextField().sendKeys(user);
        loginPage.getPasswordTextField().sendKeys(password);
        loginPage.getLoginButton().click();
    }

    public void verificaCarregamentoLogin(){
        try{
            boolean imagemOn = loginPage.getLoginImage().isDisplayed();

            Assertions.assertTrue(imagemOn);
            Highlights.highlighterMethod(driver, loginPage.getLoginImage(), "red");

            Report.log(Status.PASS, "Imagem na tela!");
        }catch (Exception e){
            Report.log(Status.FAIL, "Página de login não foi carregada", (MediaEntityModelProvider) Screenshot.fullPageBase64(driver));
        }
    }
}
