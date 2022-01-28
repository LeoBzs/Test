package Tasks;
import Framework.Report;
import PageObjects.ConfirmPaymentPage;
import Utils.Highlights;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ConfirmPaymentTask {
    private final WebDriver driver;
    private final ConfirmPaymentPage confirmPaymentPage;

    public ConfirmPaymentTask(WebDriver driver) {
        this.driver = driver;
        confirmPaymentPage = new ConfirmPaymentPage(driver);
    }

    public void confirmPaymentToRecipt(){
        confirmPaymentPage.getConfirm().click();
        verifyLoadedPage();
    }

    public void verifyLoadedPage(){
        try{
            boolean messageOn = confirmPaymentPage.getIsConfirmed().isDisplayed();

            Assertions.assertTrue(messageOn);
            Highlights.highlighterMethod(driver, confirmPaymentPage.getIsConfirmed(), "blue");
            Report.log(Status.PASS, "Mensagem na tela!");

        }catch (Exception e){
            Report.log(Status.FAIL, "Página não foi carregada");
        }
    }
}