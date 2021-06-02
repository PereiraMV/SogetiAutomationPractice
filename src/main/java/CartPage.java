import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public ProductListPage Search(){
        return new ProductListPage(driver);
    }

    public ProductListPage SearchByAutoComplete(){
        return new ProductListPage(driver);
    }
}
