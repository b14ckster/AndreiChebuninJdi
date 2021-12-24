package hw1.tests;

import static hw1.data.UserData.DEFAULT_USER_ROMAN_IOVLEV;
import static hw1.site.JdiLightSite.homePage;
import static hw1.site.JdiLightSite.metalColorsPage;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.init.PageFactory;
import hw1.site.JdiLightSite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void setUp() {
        PageFactory.initElements(JdiLightSite.class);

    }

    @BeforeClass
    public void logIn() {
        homePage.open();
        homePage.getHeader().loginAs(DEFAULT_USER_ROMAN_IOVLEV);
        homePage.getHeader().getUsername().is().text(DEFAULT_USER_ROMAN_IOVLEV.getUsername());
        homePage.getHeader().getMetalColors().click();
        assertThat(metalColorsPage.isOpened()).isTrue();
    }

    @AfterMethod
    public void clearFormMetalColorsPage() {
        WebPage.refresh();
    }

    @AfterSuite
    public void tearDown() {
        WebDriverUtils.killAllSeleniumDrivers();
    }

}
