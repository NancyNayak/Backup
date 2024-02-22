package webproject.common;

import org.openqa.selenium.WebDriver;

public class CommanTask {
    public  static  void  navigateToURL(WebDriver driver, String appURL){
        driver.get(appURL);
    }
}
