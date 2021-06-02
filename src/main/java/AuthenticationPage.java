import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPage extends CommonClass {

    By emailAdress = By.id("email");
    By passWord = By.id("passwd");
    By buttonSubmitIdSelector = By.id("SubmitLogin");
    By errorText = By.cssSelector(".alert.alert-danger>p");

    public AuthenticationPage(WebDriver driver){

        super(driver);
    }

    public MyAccountPage SignIn(String email, String password){
        WebDriverWait wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(emailAdress))).sendKeys(email);
        driver.findElement(passWord).sendKeys(password);
        driver.findElement(buttonSubmitIdSelector).click();
        return new MyAccountPage(driver);
    }

    public String getErrorMessage(){

        return driver.findElement(errorText).getText();
    }
}
