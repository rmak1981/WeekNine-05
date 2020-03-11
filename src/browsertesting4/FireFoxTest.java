package browsertesting4;
/*
FireFox Browser test
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest {

    public static void main (String[]args){

        String baseURL02 = "https://www.harrow.gov.uk/";

        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get(baseURL02);

        driver.quit();

    }
}
