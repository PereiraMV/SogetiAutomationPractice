import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUS4 extends CommonTestClass {


    @Test
    public void SearchArticle(){
        //Cas 8 : Recherche d'un article à partir d'une saisie libre dans la barre de recherche

        //Arrange

        String searchElement = "skirt";

        //Act

        HomePage homePage = new HomePage(driver);
        boolean searchDisplayed = homePage
                .openCartPage()
                .search(searchElement)
                .isSearchVisible();
        //Assert

        Assert.assertTrue(searchDisplayed);
    }

    @Test
    public void SearchByAutoCompleteArticle(){
        //Cas 9 : Recherche d'un article à partir des suggestions du moteur de recherche

        //Arrange

        String searchElement = "dresses";
        Integer indexSearch = 0;

        //Act

        HomePage homePage = new HomePage(driver);
        boolean productDisplayed = homePage
                .openContactPage()
                .searchByAutoComplete(searchElement,indexSearch)
                .isProductVisible();
        //Assert

        Assert.assertTrue(productDisplayed);
    }


}
