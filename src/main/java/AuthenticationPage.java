import org.openqa.selenium.WebDriver;

public class AuthenticationPage {

    WebDriver driver;

    public AuthenticationPage(WebDriver driver){
        this.driver = driver;
    }
    public MyAccountPage SignIn(String email, String password){

        return new MyAccountPage(driver);
    }

    public String getErrorMessage(){
        return "";
    }
}
