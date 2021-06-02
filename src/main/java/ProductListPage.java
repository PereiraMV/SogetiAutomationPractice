import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage extends CommonClass{

    By searchTitleTagSelector = By.tagName("h1");
    public ProductListPage(WebDriver driver){
        super(driver);
    }

    public boolean isSearchVisible(){

        return driver.findElement(searchTitleTagSelector).isDisplayed();
    }
}
