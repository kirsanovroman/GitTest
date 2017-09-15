package GitHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by kirsanov_rd on 15.09.2017.
 */
public class SearchPage extends BasicPage {

    protected SearchPage(WebDriver driver) {
        super(driver);
    }


    public String getItemName(String item) {
        return driver.findElement(By.xpath("//a[text()='" + item + "']")).getText();
    }
}
