package GitHomePage;

import org.openqa.selenium.WebDriver;

/**
 * Created by kirsanov_rd on 13.09.2017.
 */
public abstract class BasicPage {

    public WebDriver driver;

    protected BasicPage(WebDriver driver) {
        this.driver = driver;
    }


}
