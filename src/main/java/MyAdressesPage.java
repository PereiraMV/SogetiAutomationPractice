import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class MyAdressesPage extends CommonClass{

    By adressesClassName = By.className("address");
    By phoneClassName = By.className("address_phone_mobile");
    By adressNameClassName = By.className("page-subheading");
    By userNameClassName = By.className("address_name");
    By adressPlaceClassName = By.className("address_address1");
    By adressCityStatePostCssSelectore = By.cssSelector("li:nth-of-type(5)>span");
    By ButtonUpdateCssSelector = By.cssSelector("[title='Update']");
    By ButtonDeleteCssSelector = By.cssSelector("[title='Delete']");
    By ButtonAddAdressCssSelector = By.cssSelector("[title='Add an address']");
    public MyAdressesPage(WebDriver driver){
        super(driver);
    }

    private WebElement getAdressBox(int index){

        List<WebElement> adresses = driver.findElements(adressesClassName);

        if (index >= 0 && index < adresses.size()){
            return adresses.get(index);
        }
        else{
            throw new ArrayIndexOutOfBoundsException("The index specified for the Adress is incorrect, it must be between one and the number of Adresses of the user");
        }
    }

    public String getAdressSurname(int index){

        return getAdressBox(index).findElement(adressNameClassName).getText();

    }
    public String getAdressName(int index){

        return getAdressBox(index).findElement(adressPlaceClassName).getText();
    }
    public String getPhone(int index){

        return getAdressBox(index).findElement(phoneClassName).getText();
    }
    public String getUserFirstname(int index){
        return getAdressBox(index).findElements(userNameClassName).get(0).getText();
    }
    public String getUserLastname(int index){
        return getAdressBox(index).findElements(userNameClassName).get(1).getText();
    }
    public String getCity(int index){
        String city = getAdressBox(index).findElements(adressCityStatePostCssSelectore).get(0).getText();
        return city.substring(0,city.length()-1);
    }
    public String getState(int index){
        return getAdressBox(index).findElements(adressCityStatePostCssSelectore).get(1).getText();
    }
    public String getPostCode(int index){
        return getAdressBox(index).findElements(adressCityStatePostCssSelectore).get(2).getText();
    }

    public UpdateAdressPage openUpdateAdressPage(int index){

        getAdressBox(index).findElement(ButtonUpdateCssSelector).click();
        return new UpdateAdressPage(driver);
    }

    public MyAdressesPage deleteAdress(int index){
        getAdressBox(index).findElement(ButtonDeleteCssSelector).click();
        return this;
    }


}
