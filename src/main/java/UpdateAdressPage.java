import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UpdateAdressPage extends CommonClass{


    By firstNameIdSelector = By.id("firstname");
    By lastNameIdSelector = By.id("lastname");
    By adressNameIdSelector = By.id("address1");
    By citydSelector = By.id("city");
    By adressNickNameIdSelector = By.id("alias");
    By phoneIdSelector = By.id("phone");
    By postCodeIdSelector = By.id("postcode");
    By stateIdSelector = By.id("id_state");
    By buttonSaveIdSelector = By.id("submitAddress");

    public UpdateAdressPage(WebDriver driver){
        super(driver);
    }

    private void enterGeneric(String text, By selector){
        WebElement Input = driver.findElement(selector);
        Input.clear();
        Input.sendKeys(text);
    }

    public UpdateAdressPage enterFirstName(String newFirstName){
        enterGeneric(newFirstName, firstNameIdSelector);
        return this;
    }

    public UpdateAdressPage enterLastName(String newLastName){
        enterGeneric(newLastName, lastNameIdSelector);
        return this;
    }

    public UpdateAdressPage enterAdressName(String newAdressName){
        enterGeneric(newAdressName, adressNameIdSelector);
        return this;
    }

    public UpdateAdressPage enterAdressNickName(String newAdressNickName){
        enterGeneric(newAdressNickName, adressNickNameIdSelector);
        return this;
    }

    public UpdateAdressPage enterCity(String newCity){
        enterGeneric(newCity, citydSelector);
        return this;
    }
    public UpdateAdressPage enterPhone(String newPhone){
        enterGeneric(newPhone, phoneIdSelector);
        return this;
    }
    public UpdateAdressPage enterPostCode(String newPostCode){
        enterGeneric(newPostCode, postCodeIdSelector);
        return this;
    }
    public UpdateAdressPage enterState(String newState){
        Select select = new Select(driver.findElement(stateIdSelector));
        select.selectByVisibleText(newState);
        return this;
    }

    public MyAdressesPage saveAdresse(){
        driver.findElement(buttonSaveIdSelector).click();
        return new MyAdressesPage(driver);
    }

}
