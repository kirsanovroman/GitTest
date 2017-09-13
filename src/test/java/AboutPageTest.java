import GitHomePage.HomePage;
import GitHomePage.OSnamePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by kirsanov_rd on 13.09.2017.
 */
public class AboutPageTest extends GitTest {

   @Test
   public void aboutPageTest(){
       String OSname="Linux";
       String menu="Downloads";
       String item = "Gentoo";
       OSnamePage osPage=new HomePage(driver).open().openHelpMenu(menu).downloadForWindows(OSname);
       osPage.getItemName(item);
   }

}
