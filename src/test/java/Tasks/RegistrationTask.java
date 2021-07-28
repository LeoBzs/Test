package Tasks;

import PageObjects.RegistrationPage;
import Utils.FileOperations;
import org.openqa.selenium.WebDriver;

public class RegistrationTask {
    private WebDriver driver;
    RegistrationPage registrationPage;

    public RegistrationTask(WebDriver driver){
        this.driver = driver;
        registrationPage = new RegistrationPage(driver);
    }

    public void CompleteRegistration() throws Exception{

        String NameUser = FileOperations.getProperties("RegistrationData").getProperty("FirstNamePersonal");
        String SurnameUser = FileOperations.getProperties("RegistrationData").getProperty("LastNamePersonal");
        String EmailUser = FileOperations.getProperties("RegistrationData").getProperty("EmailPersonal");
        String PasswordUser = FileOperations.getProperties("RegistrationData").getProperty("PasswordPersonal");
        String NameAddress = FileOperations.getProperties("RegistrationData").getProperty("FirstNameAddress");
        String SurNameAddress = FileOperations.getProperties("RegistrationData").getProperty("LastNameAddress");
        String AddressUser = FileOperations.getProperties("RegistrationData").getProperty("Address");
        String CityUser = FileOperations.getProperties("RegistrationData").getProperty("City");
        String PostalUser = FileOperations.getProperties("RegistrationData").getProperty("PostalCode");
        String MobilePhoneUser = FileOperations.getProperties("RegistrationData").getProperty("MobilePhone");
        String AliasUser = FileOperations.getProperties("RegistrationData").getProperty("Alias");

        registrationPage.getRadioMrsBtn().click();

        registrationPage.getFirstNameTextbox().sendKeys(NameUser);
        registrationPage.getLastNameTextbox().sendKeys(SurnameUser);
        // registrationPage.getEmailTextbox().sendKeys(EmailUser);
        registrationPage.getPasswordTextbox().sendKeys(PasswordUser);
        // registrationPage.getFirstNameAddress().sendKeys(NameAddress);
        // registrationPage.getLastNameAddress().sendKeys(SurNameAddress);
        registrationPage.getAddressTextbox().sendKeys(AddressUser);
        registrationPage.getCityTextbox().sendKeys(CityUser);
        registrationPage.getStateClick().click();
        registrationPage.getStateClick2().click();
        // 5 -> California
        //registrationPage.getStateSelect().selectByIndex(5);
        registrationPage.getPostalCodeTextbox().sendKeys(PostalUser);
        //21 -> US
        // registrationPage.getCountrySelect().selectByIndex(21);
        registrationPage.getMobilePhoneTextbox().sendKeys(MobilePhoneUser);
        registrationPage.getAliasTextbox().sendKeys(AliasUser);
        registrationPage.getSubmitAccountBtn().click();

    }
}