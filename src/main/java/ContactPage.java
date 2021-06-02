import org.openqa.selenium.WebDriver;

public class ContactPage {
    WebDriver driver;

    public ContactPage(WebDriver driver){
        this.driver = driver;
    }

    public ProductListPage SearchByAutoComplete(){
        return new ProductListPage(driver);
    }
}
