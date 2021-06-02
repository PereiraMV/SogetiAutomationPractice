import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends CommonClass{

    By userName = By.cssSelector(".account>span");
    By TitleMyAccount = By.id("slider_row");
    By MyAddresses = By.cssSelector("[title='Addresses']");

    public MyAccountPage(WebDriver driver){
        super(driver);
    }

    public String getUserName(){
        String userNameTest = driver.findElement(userName).getText();
        return userNameTest;
    }

    public boolean isMyAccountVisible(){
        return driver.findElement(TitleMyAccount).isDisplayed();
    }

    public MyAdressesPage openMyAdressesPage(){
        driver.findElement(MyAddresses).click();
        return new MyAdressesPage(driver);
    }

}
