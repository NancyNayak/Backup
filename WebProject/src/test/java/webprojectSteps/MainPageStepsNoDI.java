package webprojectSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import webproject.common.CommanTask;
import webproject.pages.MainPage;

public class MainPageStepsNoDI {
    public WebDriver driver=SetupStepsNoDI.driver;
    private MainPage mainPage;

    @Given("I am on Wikipedia Page")
    public void iAmOnWikipediaPage() {
        CommanTask.navigateToURL(driver,"https://en.wikipedia.org/wiki/Main_Page");
        mainPage =new MainPage(driver);
        Assert.assertEquals("Wikipedia, the free encyclopedia",mainPage.getTittle());

    }



    @Then("{string} should be  displayed in the header")
    public void shouldBeDisplayedInTheHeader(String header) {
        mainPage =new MainPage(driver);

        Assert.assertEquals("India",mainPage.getPageHeader());

    }

    //@Given("I search for {String}")
    public void iSearchFor(String searchItem) {
        mainPage =new MainPage(driver);

        mainPage.searchItem(searchItem);


    }
    @Given("I search for {string}")
    public void i_search_for(String searchItem) {
        mainPage =new MainPage(driver);
        mainPage.searchItem("India");
    }

    @Then("today feature article Displayed")
    public void todayFeatureArticleDisplayed() {
        mainPage =new MainPage(driver);

        Assert.assertEquals("From today's featured article",mainPage.getFeaturedArticleHeader());


    }


}
