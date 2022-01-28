package TestCases;

import Framework.Report;
import Framework.ReportType;
import TestBase;
import Tasks.*;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizaCompraComSucesso extends TestBase {

    private final WebDriver driver = getDriver();
    private final ClothesTask clothesTask = new ClothesTask(driver);
    private final OrderTask orderTask = new OrderTask(driver);
    private final AuthenticationTask authenticationTask = new AuthenticationTask(driver);
    private final RegistrationTask registrationTask = new RegistrationTask(driver);
    private final ConfirmAddressTask confirmAddressTask = new ConfirmAddressTask(driver);
    private final ShippingTask shippingTask = new ShippingTask(driver);
    private final PaymentTask paymentTask = new PaymentTask(driver);
    private final ConfirmPaymentTask confirmPaymentTask = new ConfirmPaymentTask(driver);

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
            Report.log(Status.FAIL, e.getMessage());
        }
    }
}