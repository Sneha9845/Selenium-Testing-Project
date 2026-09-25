package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;
import com.automation.pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormValidationTest extends BaseTest {

    @Test
    public void testRegistrationFormValidation() {
        HomePage homePage = new HomePage(driver);
        RegistrationPage registrationPage = homePage.clickRegister();
        
        // Submit empty form to trigger validation
        registrationPage.clickRegister();
        
        String firstNameError = registrationPage.getFirstNameError();
        String lastNameError = registrationPage.getLastNameError();
        
        Assert.assertEquals(firstNameError, "First name is required.", "First name validation message mismatch.");
        Assert.assertEquals(lastNameError, "Last name is required.", "Last name validation message mismatch.");
    }
}
