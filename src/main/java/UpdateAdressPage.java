import org.openqa.selenium.WebDriver;

public class UpdateAdressPage {

    WebDriver driver;

    public UpdateAdressPage(WebDriver driver){
        this.driver = driver;
    }

    public UpdateAdressPage enterFirstName(String newFirstName){

        return this;
    }
    public UpdateAdressPage enterLastName(String newFirstName){
        return this;
    }
    public UpdateAdressPage enterAdressName(String newFirstName){
        return this;
    }
    public UpdateAdressPage enterAdressNickName(String newFirstName){
        return this;
    }
    public UpdateAdressPage enterCity(String newFirstName){
        return this;
    }
    public MyAdressesPage saveAdresse(){
        return new MyAdressesPage(driver);
    }

}
