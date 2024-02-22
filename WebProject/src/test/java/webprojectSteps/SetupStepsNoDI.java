package webprojectSteps;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import webproject.common.DriverManager;

import java.security.PrivateKey;

public class SetupStepsNoDI{
    private static boolean executed = false;
    public static WebDriver driver= null;

    @Before
    public void beforeAll(){
        if(!executed) {
            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    driver.close();
                    driver.quit();

                    System.out.println("After all scenarios");

                }
            });
            DriverManager driverManager = new DriverManager();
            driverManager.setupDriver();
            driver = driverManager.getDriver();
            System.out.println("Before all scenarios");
            executed = true;
        }

    }


}
