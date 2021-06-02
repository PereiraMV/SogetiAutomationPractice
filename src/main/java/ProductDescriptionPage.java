import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDescriptionPage {
    WebDriver driver;
    String itemTitleSearch;
    By searchTitleTagSelector = By.tagName("h1");

    public ProductDescriptionPage(WebDriver driver){
        this.driver = driver;
        this.itemTitleSearch = "";
    }
    public ProductDescriptionPage(WebDriver driver, String itemTitle){
        this.driver = driver;
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
