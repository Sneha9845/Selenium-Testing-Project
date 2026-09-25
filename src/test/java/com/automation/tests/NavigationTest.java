package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test
    public void testAboutUsNavigation() {
        HomePage homePage = new HomePage(driver);
        homePage.clickAboutUs();
        
        Assert.assertTrue(driver.getCurrentUrl().contains("about.htm"), "Navigation to About Us failed.");
    }

    @Test
    public void testServicesNavigation() {
        HomePage homePage = new HomePage(driver);
        homePage.clickServices();
        
        Assert.assertTrue(driver.getCurrentUrl().contains("services.htm"), "Navigation to Services failed.");
    }
}
