import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CommonClass {
    WebDriver driver;
    By searchBarIdSelector = By.id("search_query_top");
    By buttonSearchcssSelector = By.cssSelector("[name='submit_search']");
    By resultSearchAutoCompleteClassSelector = By.className("ac_results");
    By resultListItemCssSelector = By.cssSelector("li");
    By buttonAccountClassSelector = By.className("login");
    By buttonConctactUsCssSelector = By.cssSelector("[title='Contact Us']");
    By buttonCartClassSelector = By.className("shopping_cart");

    public CommonClass(WebDriver driver){
        this.driver = driver;
    }
    public AuthenticationPage openSignInPage(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(buttonAccountClassSelector)));
        driver.findElement(buttonAccountClassSelector).click();
        return new AuthenticationPage(driver);
    }

    public CartPage openCartPage(){

        driver.findElement(buttonCartClassSelector).click();
        return new CartPage(driver);
    }

    public ContactPage openContactPage(){

        driver.findElement(buttonConctactUsCssSelector).click();
        return new ContactPage(driver);
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
            throw new ArrayIndexOutOfBoundsException("The element searched is not recognize or the time expired and couldn't find any product corresponding");
        }

        List<WebElement> ListItemInList = listResult.findElements(resultListItemCssSelector);

        Integer numberItem = ListItemInList.size();
        // Regarder la taille du tableau

        if ( index < 0 || index >= numberItem ){

            throw new ArrayIndexOutOfBoundsException("The index indicated is out of bound regarding the result list");
        }
        String itemTitle = ListItemInList.get(index).getText();
        ListItemInList.get(index).click();


        return new ProductDescriptionPage(driver, itemTitle);
    }
}
