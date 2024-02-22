package webproject;

import io.cucumber.java.et.Ja;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Selenium {



    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nancy_Nayak\\IdeaProjects\\WebProject\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement((By.xpath("//input[@id='password']"))).sendKeys("secret_sauce");
        driver.findElement((By.xpath("//input[@id='login-button']"))).click();

        Select s= new Select(driver.findElement(By.xpath("//select[@data-test='product_sort_container']")));

      List <WebElement>al= s.getOptions();
        for (WebElement a:al) {
            System.out.println(a.getText());

        }
        s.selectByVisibleText("Price (high to low)");

        TakesScreenshot sc=  (TakesScreenshot)driver;
      File f=  sc.getScreenshotAs(OutputType.FILE);

        Actions ac= new Actions(driver);
        ac.moveToElement(driver.findElement(By.xpath(""))).click().perform();

        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeAsyncScript("window.scrollBy(0,350)","");

        js.executeAsyncScript("argument[0].scrollIntoView();","driver.");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(" ");


        Wait <WebDriver> WAIT= (new FluentWait<WebDriver>(driver).
                withTimeout(Duration.ofSeconds(6)).pollingEvery(Duration.ofSeconds(7)).ignoring(NoSuchElementException.class));
       String parent= driver.getWindowHandle();

        Set<String> Window=driver.getWindowHandles();
       Iterator<String> itr= Window.iterator();
       while(itr.hasNext()){
           String child_window=itr.next();
           if(!(parent==child_window)){
               driver.switchTo().window(child_window).getTitle();
               driver.close();
               JavascriptExecutor js1= (JavascriptExecutor) driver;
               js1.executeScript("document.getElementByid('user').value=''");


                   }
               }



           }

       }






