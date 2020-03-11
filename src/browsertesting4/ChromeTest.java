package browsertesting4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
Chrome browser Test
 */
public class ChromeTest {

    public static void main (String []args){

        String baseURL01 = "https://www.harrow.gov.uk/";

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(baseURL01);

        driver.quit();

    }
}
