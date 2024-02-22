package webprojectSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import webproject.common.CommanTask;
import webproject.common.TestContext;
import webproject.pages.MainPage;

public class MainPageSteps {

    private  TestContext testContext;
    public  MainPage mainPage;

    public MainPageSteps(TestContext testContext){
        this.testContext= testContext;
        this.mainPage=testContext.getPageObjectManager().getMainPage();

    }

   // @Given("I am on Wikipedia Page")
    public void iAmOnWikipediaPage() {
        CommanTask.navigateToURL(testContext.getDriverManager().getDriver(),"https://en.wikipedia.org/wiki/Main_Page");
        Assert.assertEquals("Wikipedia, the free encyclopedia",mainPage.getTittle());

    }


   // @Given("I search for {String}}")
    public void iSearchFor(String searchItem) {
        mainPage.searchItem(searchItem);


    }

    //@Then("{string} should be  displayed in the header")
    public void should_be_displayed_in_the_header(String string) {
        Assert.assertEquals("India",mainPage.getPageHeader());

    }



    //@Then("today feature article Displayed")
    public void todayFeatureArticleDisplayed() {
        Assert.assertEquals("From today's featured article",mainPage.getFeaturedArticleHeader());


    }
}
