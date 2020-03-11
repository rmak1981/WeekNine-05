package browsertesting4;
/*
Opera Test
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaTest {

    public static void main(String []args){

        String basrURL03 = "https://www.harrow.gov.uk/";

        System.setProperty("webdriver.opera.driver","drivers/operadriver.exe");

        WebDriver driver = new OperaDriver();

        driver.manage().window().maximize();

        driver.get(basrURL03);

        driver.quit();
    }


}
