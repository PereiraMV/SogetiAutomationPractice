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
        //driver.quit();
    }

    @Test
    public void test(){

        HomePage homePage = new HomePage(driver);

        //homePage.searchByAutoComplete("dress",0);
        homePage.searchByAutoComplete("summer",0);
        homePage.openSignInPage()
                .SignIn("pereiramarc@hotmail.fr","testautomation123")
                .openMyAdressesPage()
                .openUpdateAdressPage(0)
                .enterAdressName("4 rue BillBao")
                .enterAdressNickName("My Adress Change")
                .enterCity("BouBou")
                .enterFirstName("Ma")
                .enterLastName("Couscous")
                .enterState("Missouri")
                .saveAdresse();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
