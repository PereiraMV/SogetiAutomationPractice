import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAdressesPage {

    WebDriver driver;
    By adressesClassName = By.className(".address");
    By phoneClassName = By.className(".address_phone_mobile");
    By adressNameClassName = By.className(".address_name");
    By adressPlaceClassName = By.className(".address_address1");
    By ButtonUpdateCssSelector = By.className("[title='Update']");
    By ButtonDeleteCssSelector = By.className("[title='Delete']");
    public MyAdressesPage(WebDriver driver){
        this.driver = driver;
    }

    private WebElement getAdressBox(int index){

        List<WebElement> adresses = driver.findElements(adressesClassName);

        if (index > 1 && index < adresses.size()){
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
        return getAdressBox(index).findElements(adressNameClassName).get(0).getText();
    }
    public String getUserLastname(int index){
        return getAdressBox(index).findElements(adressNameClassName).get(1).getText();
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
