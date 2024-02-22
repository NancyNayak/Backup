package webproject.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverManager {

    private WebDriver driver;




    public WebDriver getDriver(){

        return driver;
    }

    public void setDriver(WebDriver driver){
        this.driver=driver;
    }

    public void setupDriver(){
        String browser="LOCAL_CHROME";
        String gridHubURL=System.getProperty(browser);
        DesiredCapabilities dc=null;
        BrowserType browserType=BrowserType.valueOf(browser);
        switch(browserType) {
            case LOCAL_CHROME:
                System.setProperty("webdriver.chrome.driver","C:\\Users\\Nancy_Nayak\\IdeaProjects\\WebProject\\src\\main\\resources\\chromedriver.exe");
                driver=new ChromeDriver();
                break;
            default:
                driver=new ChromeDriver();
                break;
        }
    }

    public  void  teardownDriver(){
if(driver!=null) {
    driver.quit();
}
}}
