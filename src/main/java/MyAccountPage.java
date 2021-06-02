import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    WebDriver driver;

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
    }

    public String getUserName(){

        return "";
    }
    public boolean isMyAccountVisible(){

        return true;
    }

    public MyAdressesPage openMyAdressesPage(){

        return new MyAdressesPage(driver);
    }



}
