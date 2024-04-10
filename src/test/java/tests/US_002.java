package tests;

import org.bouncycastle.util.StringList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.Locators;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US_002 {
    Locators locators = new Locators();

    @AfterClass
    public void teardown() {
        Driver.quitDriver();
    }

    @Test
    public void TC_01() {
        Driver.getDriver().get(ConfigReader.getProperty("QAJobsurl"));

        locators.QApageSeeAllJobsButton.click();

        Select select = new Select(locators.locationsCombobox);

        select.selectByVisibleText("Istanbul, Turkey");

        Assert.assertFalse(locators.QAjobsList.isEmpty());

        locators.cookiesAcceptAll.click();


    }

    @Test
    public void TC_02() {

        WebElement h3 = Driver.getDriver().findElement(By.xpath("(//h3)[2]"));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", h3);

        ReusableMethods.bekle(3);

        List<String> departmentStringList = ReusableMethods.stringListeCevir(locators.jobsDepartmentTextList);

        for (String eachElement : departmentStringList) {
            Assert.assertTrue(departmentStringList.contains("Quality Assurance"));
        }


        List<String> locationStringList = ReusableMethods.stringListeCevir(locators.jobsLocationTextList);

        for (String eachElement : locationStringList) {
            Assert.assertTrue(locationStringList.contains("Istanbul, Turkey"));
        }


        List<String> positionStringList = ReusableMethods.stringListeCevir(locators.jobsPositionTextList);
        for (String eachElement : positionStringList) {
            Assert.assertTrue(positionStringList.contains("Quality Assurance"));
        }


    }

    @Test
    public void TC_03() {
        locators.jobsViewRoleButton.click();

        ReusableMethods.bekle(3);

        ReusableMethods.titleIleWindowDegistir("Insider. - Senior Software Quality Assurance Engineer", Driver.getDriver());

        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains("lever"));

    }

}
