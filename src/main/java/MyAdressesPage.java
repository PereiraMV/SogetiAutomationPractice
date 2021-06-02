import org.openqa.selenium.WebDriver;

public class MyAdressesPage {

    WebDriver driver;

    public MyAdressesPage(WebDriver driver){
        this.driver = driver;
    }
    public String getAdressName(int index){
        return "";
    }
    public String getCountry(int index){
        return "";
    }
    public String getUsername(int index){
        return "";
    }

    public UpdateAdressPage openUpdateAdressPage(int index){
        return new UpdateAdressPage(driver);
    }
    public MyAdressesPage deleteAdress(int index){

        return this;
    }

}
