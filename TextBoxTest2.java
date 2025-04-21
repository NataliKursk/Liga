
public class TextBoxTest2 {
    public WebDriver driver;

    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.setCapability(CapabilityType.PAGE_LOAD_STRATEGY,"eager");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }




}
