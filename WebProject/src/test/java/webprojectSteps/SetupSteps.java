package webprojectSteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import webproject.common.TestContext;

public class SetupSteps {
    private  TestContext testContext;

    public SetupSteps(TestContext testContext){
        this.testContext= testContext;

    }

    //@Before
    public void setUp(){
        testContext.getDriverManager().setupDriver();
    }

    //@After
    public void tearDown(){
        testContext.getDriverManager().teardownDriver();
    }
}
