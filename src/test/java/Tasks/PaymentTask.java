package Tasks;

import PageObjects.PaymentPage;
import org.openqa.selenium.WebDriver;

public class PaymentTask {
    private WebDriver driver;
    private PaymentPage paymentPage;

    public PaymentTask(WebDriver driver) {
        this.driver = driver;
        paymentPage = new PaymentPage(driver);
    }

    public void selectPaymentOption(){
        paymentPage.getPaymentOption().click();
    }
}