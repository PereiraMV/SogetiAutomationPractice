import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage {

    WebDriver driver;
    By emailAdress = By.id("email");
    By passWord = By.id("passwd");
    By errorText = By.cssSelector(".alert.alert-danger>p");

    public AuthenticationPage(WebDriver driver){

        this.driver = driver;
    }

    public MyAccountPage SignIn(String email, String password){


        driver.findElement(emailAdress).sendKeys(email);
        driver.findElement(passWord).sendKeys(password);

        return new MyAccountPage(driver);
    }

    public String getErrorMessage(){

        return driver.findElement(errorText).getText();
    }
}
