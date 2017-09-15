import GitHomePage.HomePage;
import GitHomePage.OSnamePage;
import GitHomePage.SearchPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by kirsanov_rd on 13.09.2017.
 */
public class AboutPageTest extends GitTest {

   @Test(description = "Git Page Basic Test")
   public void aboutPageTest(){
       String OSname="Linux";
       String menu="Downloads";
       String item = "Gentoo";
       OSnamePage osPage = new HomePage(driver).open().openHelpMenu(menu).downloadForWindows(OSname);
       assertEquals(osPage.getItemName(item), "Gentoo");
   }

    @Test(description = "GitSearchCheck")
    public void gitSearchCheck() {
        String item = "remote";
        SearchPage sP = new HomePage(driver).open().searchItem(item);
        assertEquals(sP.getItemName(item),"Worspace");
    }

}
