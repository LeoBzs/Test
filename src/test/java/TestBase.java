import Framework.DriverManager;
import Framework.Paths;
import Framework.Report;
import Framework.TypeDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBase extends DriverManager {

    public static WebDriver getDriver(){
        return getDriver(TypeDriver.CHROME);
    }

    @BeforeEach
    public void setUp(){
        getDriver().get(Paths.BASE_URL);
    }

    @AfterEach
    public void tearDown() throws Exception{
        Thread.sleep(5000);
        Report.close();
        quitDriver();
    }

}
