package webproject.common;

public class TestContext {

    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;

    public DriverManager getDriverManager() {
        if (driverManager == null) {
            driverManager = new DriverManager();
        }
        return driverManager;
    }
    public PageObjectManager getPageObjectManager() {
        if (pageObjectManager == null) {
            pageObjectManager = new PageObjectManager(driverManager.getDriver());
        }
        return pageObjectManager;
    }
}