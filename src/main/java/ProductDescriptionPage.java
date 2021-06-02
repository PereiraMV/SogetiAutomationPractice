import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDescriptionPage extends CommonClass{
    String itemTitleSearch;
    By searchTitleTagSelector = By.tagName("h1");

    public ProductDescriptionPage(WebDriver driver){
        super(driver);
        this.itemTitleSearch = "";
    }
    public ProductDescriptionPage(WebDriver driver, String itemTitle){
        super(driver);
        this.itemTitleSearch = itemTitle;
    }

    public boolean isProductVisible(){

        WebElement titleProduct = driver.findElement(searchTitleTagSelector);
        if ( titleProduct.isDisplayed()) {
            return itemTitleSearch.contains( titleProduct.getText());
        }
        else{
            return false;
        }
    }


}
