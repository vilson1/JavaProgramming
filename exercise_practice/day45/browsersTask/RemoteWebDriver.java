package day45.browsersTask;

public class RemoteWebDriver implements WebDriver, TakeScreenShot, JavaScriptExecutor{

    private final String browserName;

    public RemoteWebDriver(String browserName, String locator) {
        this.browserName = browserName;
        System.out.println("Opening "+ browserName+" browser");

    }

    public String getBrowserName() {
        return browserName;
    }

    @Override
    public void executeString(String script) {

    }

    @Override
    public void takeScreenShoot() {

    }

    @Override
    public void get() {
        System.out.println("Getting the "+" on " + browserName + " browser");
    }

    @Override
    public void close() {

    }

    @Override
    public void quit() {

    }

    @Override
    public void getTitle() {

    }

    @Override
    public String findElement(String locator) {
        return null;
    }

    @Override
    public String findElements(String locator) {
        return null;
    }
}
