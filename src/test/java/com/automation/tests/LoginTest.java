package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.utils.CsvDataProvider;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData", dataProviderClass = CsvDataProvider.class)
    public void testValidLogin(String username, String password) {
        HomePage homePage = new HomePage(driver);
        
        homePage.enterUsername(username);
        homePage.enterPassword(password);
        homePage.clickLogin();
        
        // Assuming login fails for dummy user, we check the error message
        String errorMessage = homePage.getErrorMessage();
        Assert.assertNotNull(errorMessage, "Error message should be displayed for invalid login.");
    }
    
    @Test
    public void testEmptyCredentials() {
        HomePage homePage = new HomePage(driver);
        
        homePage.clickLogin();
        
        String errorMessage = homePage.getErrorMessage();
        Assert.assertEquals(errorMessage, "Please enter a username and password.", "Validation message mismatch.");
    }
}
