import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestUS2 {

    WebDriver driver;

    @BeforeMethod
    public void ouvrirChrome() {
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        driver.manage().window().maximize();

    }

    @AfterMethod
    public void fermerChrome(){
        driver.quit();
    }

    @Test
    public void test(){

        HomePage homePage = new HomePage(driver);

        homePage.searchByAutoComplete("dress",0);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
