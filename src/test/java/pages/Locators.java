package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Locators {
    public Locators() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//*[@id='navbarDropdownMenuLink'])[5]")
    public WebElement HomePageCompanyDropDown;

    @FindBy(xpath = "//*[@href='https://useinsider.com/careers/']")
    public WebElement HomePageCompanyDPCareers;

    @FindBy(xpath = "//*[@id='career-our-location']")
    public WebElement CareersPageLocationsSection;

    @FindBy(xpath = "//*[@class='elementor-widget-wrap elementor-element-populated e-swiper-container']")
    public WebElement CareersPagelifeAtInsiderSection;

    @FindBy(xpath = "//*[@id='career-find-our-calling']")
    public WebElement CareersPageTeamsSection;

    @FindBy(xpath = "//*[@class='btn btn-outline-secondary rounded text-medium mt-2 py-3 px-lg-5 w-100 w-md-50']")
    public WebElement QApageSeeAllJobsButton;

    @FindBy(xpath = "//*[@id='filter-by-location']")
    public WebElement locationsCombobox;

    @FindBy(xpath = "//*[@class='position-list-item-wrapper bg-light']")
    public List<WebElement> QAjobsList;

    @FindBy(xpath = "//*[@class='position-title font-weight-bold']")
    public List<WebElement> jobsPositionTextList;

    @FindBy(xpath = "//*[@class='position-department text-large font-weight-600 text-primary']")
    public List<WebElement> jobsDepartmentTextList;

    @FindBy(xpath = "//*[@class='position-location text-large']")
    public List<WebElement> jobsLocationTextList;

    @FindBy(xpath = "//*[@id='wt-cli-accept-all-btn']")
    public WebElement cookiesAcceptAll;

    @FindBy(xpath = "(//*[@class='btn btn-navy rounded pt-2 pr-5 pb-2 pl-5'])[1]")
    public WebElement jobsViewRoleButton;
}
