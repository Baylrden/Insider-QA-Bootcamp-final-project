package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.Locators;
import utilities.ConfigReader;
import utilities.Driver;

public class US_001 {
    Locators locators = new Locators();


    @AfterClass
    public void teardown() {
        Driver.quitDriver();
    }

    @Test(priority = 1)
    public void TC_01() {

        Driver.getDriver().get(ConfigReader.getProperty("HomepageUrl"));

        String expectedUrl = "https://useinsider.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test(description = "Verify if the Career page, including its Locations, Teams, and Life at Insider sections are accessible.", priority = 2)
    public void TC_02() {

        locators.HomePageCompanyDropDown.click();
        locators.HomePageCompanyDPCareers.click();

        String expectedUrl = "https://useinsider.com/careers/";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);

    }

    @Test(description = "Verify if the Locations section is accessible", priority = 3)
    public void TC_03() {

        Assert.assertTrue(locators.CareersPageLocationsSection.isDisplayed());
    }

    @Test(description = "Verify if the Teams section is accessible", priority = 4)
    public void TC_04() {
        Assert.assertTrue(locators.CareersPageTeamsSection.isDisplayed());
    }

    @Test(description = "Verify if the Locations section is accessible", priority = 5)
    public void TC_05() {
        Assert.assertTrue(locators.CareersPagelifeAtInsiderSection.isDisplayed());
    }
}
