import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage {

    WebDriver driver;
    By searchTitleTagSelector = By.tagName("h1");
    public ProductListPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isSearchVisible(){

        return driver.findElement(searchTitleTagSelector).isDisplayed();
    }
}
