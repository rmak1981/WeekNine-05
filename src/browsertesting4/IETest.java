package browsertesting4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
/*
internet explorer browser test
 */
public class IETest {
    public static void main(String []args){

        String baseURL04 = "https://www.harrow.gov.uk/";

        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");

        WebDriver driver = new InternetExplorerDriver();

        driver.manage().window().maximize();

        driver.get(baseURL04);

        driver.quit();

    }


}
