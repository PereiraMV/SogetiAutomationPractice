import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUS6 extends CommonTestClass {

    String email = "zahia.slimaneamara@gmail.com";
    String password = "Zaza1234";
    Integer indexAdress = 0;

    String expectedAdressName = "77 Bd Lefebvre";
    String expectedAdressSurname = "MY ADDRESS 1";
    String expectedFirstName = "Slimane";
    String expectedLastName = "Zahia";
    String expectedPhone = "0660998833";
    String expectedCity = "Paris";
    String expectedState = "California";
    String expectedPostCode = "75015";

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void verificationUserAdress(){
        //Cas 13 Vérification des coordonnées du client

        //Arrange

        //Act

        HomePage homePage = new HomePage(driver);

        MyAdressesPage myAdressesPage =
                homePage
                        .openSignInPage()
                        .SignIn(email,password)
                        .openMyAdressesPage();

        String currentAdressName = myAdressesPage.getAdressName(indexAdress);
        String currentAdressSurname = myAdressesPage.getAdressSurname(indexAdress);
        String currentFirstName = myAdressesPage.getUserFirstname(indexAdress);
        String currentLastName = myAdressesPage.getUserLastname(indexAdress);
        String currentPhone = myAdressesPage.getPhone(indexAdress);
        String currentCity = myAdressesPage.getCity(indexAdress);
        String currentState = myAdressesPage.getState(indexAdress);
        String currentPostCode = myAdressesPage.getPostCode(indexAdress);

        //Assert

        Assert.assertEquals(currentAdressName, expectedAdressName);
        Assert.assertEquals(currentAdressSurname, expectedAdressSurname);
        Assert.assertEquals(currentFirstName, expectedFirstName);
        Assert.assertEquals(currentLastName, expectedLastName);
        Assert.assertEquals(currentPhone, expectedPhone);
        Assert.assertEquals(currentCity, expectedCity);
        Assert.assertEquals(currentState, expectedState);
        Assert.assertEquals(currentPostCode, expectedPostCode);

    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void modificationAdress(){
        //Cas 14: Mettre à jour les coordonnées du client

        //Arrange

        String expectedNewFirstName = "Oukaci";
        String expectedNewLastName = "lola";
        String expectedNewCity = "Vienne";
        String expectedNewState = "Idaho";

        //Act

        HomePage homePage = new HomePage(driver);

        MyAdressesPage myAdressesPage =
                homePage
                        .openSignInPage()
                        .SignIn(email,password)
                        .openMyAdressesPage()
                        .openUpdateAdressPage(indexAdress)
                        .enterFirstName(expectedNewFirstName)
                        .enterLastName(expectedNewLastName)
                        .enterCity(expectedNewCity)
                        .enterState(expectedNewState)
                        .saveAdresse();

        String currentFirstName = myAdressesPage.getUserFirstname(indexAdress);
        String currentLastName = myAdressesPage.getUserLastname(indexAdress);
        String currentCity = myAdressesPage.getCity(indexAdress);
        String currentState = myAdressesPage.getState(indexAdress);

        //Assert

        Assert.assertEquals(currentFirstName, expectedNewFirstName);
        Assert.assertEquals(currentLastName, expectedNewLastName);
        Assert.assertEquals(currentCity, expectedNewCity);
        Assert.assertEquals(currentState, expectedNewState);

        //Re-Act

        myAdressesPage
                .openUpdateAdressPage(indexAdress)
                .enterFirstName(expectedFirstName)
                .enterLastName(expectedLastName)
                .enterCity(expectedCity)
                .enterState(expectedState)
                .saveAdresse();


    }

    @Test
    public void createAdress(){

        //Arrange

        String expectedNewAdressName = "77 Bd Lefeb";
        String expectedNewAdressSurname = "MY ADDRESS ADDED";
        String expectedNewFirstName = "Slima";
        String expectedNewLastName = "Zaza";
        String expectedNewPhone = "0620233098";
        String expectedNewCity = "Marseille";
        String expectedNewState = "Hawaii";
        String expectedNewPostCode = "75002";
        Integer indexAdressCreate = 1;
        //Act
        HomePage homePage = new HomePage(driver);
        MyAdressesPage myAdressesPage =
                homePage
                        .openSignInPage()
                        .SignIn(email,password)
                        .openMyAdressesPage()
                        .openUpdateAdressPageWithCreate()
                        .enterFirstName(expectedNewFirstName)
                        .enterLastName(expectedNewLastName)
                        .enterCity(expectedNewCity)
                        .enterState(expectedNewState)
                        .enterAdressName(expectedNewAdressName)
                        .enterAdressNickName(expectedNewAdressSurname)
                        .enterPhone(expectedNewPhone)
                        .enterPostCode(expectedNewPostCode)
                        .saveAdresse();

        String currentAdressName = myAdressesPage.getAdressName(indexAdressCreate);
        String currentAdressSurname = myAdressesPage.getAdressSurname(indexAdressCreate);
        String currentFirstName = myAdressesPage.getUserFirstname(indexAdressCreate);
        String currentLastName = myAdressesPage.getUserLastname(indexAdressCreate);
        String currentPhone = myAdressesPage.getPhone(indexAdressCreate);
        String currentCity = myAdressesPage.getCity(indexAdressCreate);
        String currentState = myAdressesPage.getState(indexAdressCreate);
        String currentPostCode = myAdressesPage.getPostCode(indexAdressCreate);

        //Assert

        Assert.assertEquals(currentAdressName, expectedNewAdressName);
        Assert.assertEquals(currentAdressSurname, expectedNewAdressSurname);
        Assert.assertEquals(currentFirstName, expectedNewFirstName);
        Assert.assertEquals(currentLastName, expectedNewLastName);
        Assert.assertEquals(currentPhone, expectedNewPhone);
        Assert.assertEquals(currentCity, expectedNewCity);
        Assert.assertEquals(currentState, expectedNewState);
        Assert.assertEquals(currentPostCode, expectedNewPostCode);

        //Re-Act

        myAdressesPage.deleteAdress(indexAdressCreate);

    }

}
