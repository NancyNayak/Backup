package webproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {

        this.driver = driver;
    }

    public String getTittle() {
        return driver.getTitle();
    }

    public String getFeaturedArticleHeader() {
        return driver.findElement(By.id("From_today's_featured_article")).getText();
    }
    public  void searchItem(String searchItem){
        driver.findElement(By.id("searchInput")).sendKeys(searchItem);
        driver.findElement(By.id("searchButton")).click();

    }
    public String getPageHeader(){
      return driver.findElement(By.id("firstHeading")).getText();

    }

}

