import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public AuthenticationPage openSignInPage(){

        return new AuthenticationPage(driver);
    }

    public CartPage openCartPage(){

        return new CartPage(driver);
    }

    public ProductListPage Search(){

        return new ProductListPage(driver);
    }

    public ProductListPage SearchByAutoComplete(){
        return new ProductListPage(driver);
    }


}
