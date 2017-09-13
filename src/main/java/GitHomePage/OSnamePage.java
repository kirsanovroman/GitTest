package GitHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by kirsanov_rd on 13.09.2017.
 */
public class OSnamePage extends BasicPage {

    protected OSnamePage(WebDriver driver) {
        super(driver);
    }

    public String getItemName(String Item) {
        return driver.findElement(By.xpath("")).getText();
    }
}
