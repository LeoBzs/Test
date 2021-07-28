package TestCases;

import Framework.Report;
import Framework.ReportType;
import Framework.Screenshot;
import Framework.TestBase;
import Tasks.*;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizaCompraComSucesso extends TestBase {

    private WebDriver driver = getDriver();
    private ClothesTask clothesTask = new ClothesTask(driver);
    private OrderTask orderTask = new OrderTask(driver);
    private AuthenticationTask authenticationTask = new AuthenticationTask(driver);
    private RegistrationTask registrationTask = new RegistrationTask(driver);
    private ConfirmAddressTask confirmAddressTask = new ConfirmAddressTask(driver);
    private ShippingTask shippingTask = new ShippingTask(driver);
    private PaymentTask paymentTask = new PaymentTask(driver);
    private ConfirmPaymentTask confirmPaymentTask = new ConfirmPaymentTask(driver);

    @Test
    public void realizarCompraComSucesso(){
        try{

            clothesTask.HoverToProduct();
            clothesTask.selectProduct();
            clothesTask.ProductToCheckout();
            orderTask.proceedToAuthorize();
            authenticationTask.createAccount();
            registrationTask.CompleteRegistration();
            confirmAddressTask.proceedToShipping();
            shippingTask.checkboxAndProceed();
            paymentTask.selectPaymentOption();
            confirmPaymentTask.confirmPaymentToRecipt();

            Report.createTest("Purchase successful!", ReportType.SINGLE);

        }catch (Exception e) {
            Report.log(Status.FAIL, e.getMessage(), (MediaEntityModelProvider) Screenshot.fullPageBase64(driver));
        }
    }
}