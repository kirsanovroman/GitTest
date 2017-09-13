package GitHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by kirsanov_rd on 13.09.2017.
 */
public class HomePage extends BasicPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    

    public HelpMenuPage openHelpMenu(String nameHelpMenu) {
        return null;
    }

    public HomePage open() {
        driver.findElement(By.xpath(""));
        return this;
    }
}
