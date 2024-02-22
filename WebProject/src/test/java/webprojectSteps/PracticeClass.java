package webprojectSteps;
//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class PracticeClass {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nancy_Nayak\\IdeaProjects\\WebProject\\src\\main\\resources\\chromedriver.exe");

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("standard_user");
        driver.findElement(By.id("login-button"));





    }}