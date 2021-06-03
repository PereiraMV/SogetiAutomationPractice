import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestUS2 extends CommonTestClass {



    @Test
    public void UserConnexion(){
        //Cas de test 3 - Connexion à un compte Utilisateur

        //Arrange

        String email = "zahia.slimaneamara@gmail.com";
        String password = "Zaza1234";

        //Act

        HomePage homePage = new HomePage(driver);
        boolean accountVisibility = homePage.openSignInPage()
                .SignIn(email,password)
                .isMyAccountVisible();

        //Assert

        Assert.assertTrue(accountVisibility);

    }

    @Test
    public void UserConnexionWrongPwd(){
        //Cas de test 4 - Connexion à  un compte avec mot de passe érroné

        //Arrange

        String email = "zahia.slimaneamara@gmail.com";
        String password = "Toto1234";

        String expectedErrorMessage = "There is 1 error";

        //Act

        HomePage homePage = new HomePage(driver);
        AuthenticationPage authenticationPage = homePage.openSignInPage();
        authenticationPage.SignIn(email,password);

        String observedErrorMessage = authenticationPage.getErrorMessage();

        //Assert

        Assert.assertEquals(observedErrorMessage,expectedErrorMessage);

    }
}
