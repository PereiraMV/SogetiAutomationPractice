import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {
    WebDriver driver;
    By buttonAccountClassSelector = By.className("account");
    By buttonCartClassSelector = By.className("shopping_cart");
    By searchBarIdSelector = By.id("search_query_top");
    By buttonSearchcssSelector = By.cssSelector("[name='submit_search']");
    By resultSearchAutoCompleteClassSelector = By.className("ac_results");
    By resultListItemCssSelector = By.cssSelector("li");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public AuthenticationPage openSignInPage(){

        driver.findElement(buttonAccountClassSelector).click();
        return new AuthenticationPage(driver);
    }

    public CartPage openCartPage(){

        driver.findElement(buttonCartClassSelector).click();
        return new CartPage(driver);
    }

    public ProductListPage search(String elementSearched){

        driver.findElement(searchBarIdSelector).sendKeys(elementSearched);
        driver.findElement(buttonSearchcssSelector).click();
        return new ProductListPage(driver);
    }

    public ProductDescriptionPage searchByAutoComplete(String elementSearched, int index){
        driver.findElement(searchBarIdSelector).sendKeys(elementSearched);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement listResult = wait.until( ExpectedConditions.elementToBeClickable(resultSearchAutoCompleteClassSelector));

        if (listResult == null){

        }

        List<WebElement> ListItemInList = listResult.findElements(resultListItemCssSelector);

        Integer numberItem = ListItemInList.size();
        System.out.println(numberItem);
        // Regarder la taille du tableau
        ListItemInList.get(0).click();


        return new ProductDescriptionPage(driver);
    }


}
