package UI;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.demoqa.SelectMenuPage;

public class SelectMenuTest extends BaseTest {

    private SelectMenuPage selectMenuPage;

    @BeforeClass
    public void beforeClass(){
        System.out.println("Setting up before class in SelectMenuTest.");
        selectMenuPage = new SelectMenuPage(driver);
    }


    @Test(description = "В первом выпадающем списке выбрать 'two")
    public void step_01(){

        selectMenuPage.clickFirstDropDown();
        selectMenuPage.setSecondOptionInFirstDropDown();
        Assert.assertTrue(selectMenuPage.isSecondOptionDisplayedInFirstField());
    }

    @Test(description = "Во втором выпадающем списке выбрать 'Seattle")
    public void step_02(){

        selectMenuPage.clickDropDown(//*[@id="my-options"]);
        selectMenuPage.setOptionInFirstDropDown();
        Assert.assertTrue(selectMenuPage.isSecondOptionDisplayedInFirstField(By.xpath("//*[@id="my-options"]/option[3]")));
    }
}