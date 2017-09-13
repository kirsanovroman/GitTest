package GitHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by kirsanov_rd on 13.09.2017.
 */
public class HelpMenuPage extends BasicPage {

    protected HelpMenuPage(WebDriver driver) {
        super(driver);
    }

    public OSnamePage  downloadForWindows(String nameOS) {
        driver.findElement(By.xpath(""+nameOS+"")).click();
        return new OSnamePage(driver);
    }
}
