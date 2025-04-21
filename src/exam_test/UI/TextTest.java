package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextTest {

    public WebDriver driver;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.setCapability(CapabilityType.PAGE_LOAD_STRATEGY,"eager");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test(description = "Перейти на web форму , внести валидные значения во все поля , " +
            " поставить парочку чекбоксов, радиобатонов и надеяться, что будет счастье" +
            " нажать на кнопку 'Submit'")
    public void step_01(){
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        WebElement my-text-idInput = driver.findElement(By.xpath("//input[@id='my-text-id']"));
        my-text-idInput.sendKeys("Коровина Наталья Юрьевна");

        WebElement my-textareaTextArea = driver.findElement(By.xpath("//input[@id='my-textarea']"));
        my-textareaTextArea.sendKeys("Компания 4K");

        WebElement my-passwordInput = driver.findElement(By.xpath("//input[@name='my-password']"));
        my-passwordInput.sendKeys("Password");


        WebElement my-text-idInput = driver.findElement(By.xpath("//p[@id='my-text-id']"));
        WebElement my-textareaTextArea = driver.findElement(By.xpath("//p[@id='my-textarea']"));
        WebElement my-passwordInput = driver.findElement(By.xpath("//p[@name='my-password']"));

        String Text_input = my-text-idIOutput.getText();
        String Textarea = my-textareaOutput.getText();
        String my-password = my-passwordOutput.getText();


        System.out.println("Text input : " + Text_input + " , Textarea : " + Textarea
                + " , password: " + my-password);

}