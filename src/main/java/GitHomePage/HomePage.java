package GitHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/**
 * Created by kirsanov_rd on 13.09.2017.
 */
public class HomePage extends BasicPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

   public HelpMenuPage openHelpMenu(String nameHelpMenu) {
        // getElement
        driver.findElement(By.xpath("//ul//h3[text()='"+nameHelpMenu+"']")).click();
        return new HelpMenuPage(driver);
    }

    public HomePage open() {
        driver.get("https://git-scm.com/");
        return this;
    }

    public SearchPage searchItem(String item) {
        driver.findElement(By.id("search-text")).sendKeys(item+ Keys.ENTER);
        return new SearchPage(driver);
    }
}
