import org.openqa.selenium.WebDriver;

public class ProductListPage {

    WebDriver driver;

    public ProductListPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isSearchVisible(){

        return true;
    }
}
