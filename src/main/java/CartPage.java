import org.openqa.selenium.WebDriver;

public class CartPage extends CommonClass {

    public CartPage(WebDriver driver){
        super(driver);
    }

    public ProductListPage Search(){
        return new ProductListPage(driver);
    }

    public ProductListPage SearchByAutoComplete(){
        return new ProductListPage(driver);
    }
}
