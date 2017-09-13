import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by kirsanov_rd on 13.09.2017.
 */
public abstract class GitTest {


    protected ChromeDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= new ChromeDriver();
        System.out.println("init Driver");
    }

//     @Test
//    public void SelelniumTest() throws InterruptedException {
//         driver.get("https://git-scm.com/");
//         Thread.sleep(3000);
//     }

    @AfterMethod
    public void tearsDown() {
        driver.close();
        System.out.println("close driver");
    }



}
