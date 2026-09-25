package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;
import com.automation.pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test
    public void testSuccessfulRegistration() {
        HomePage homePage = new HomePage(driver);
        RegistrationPage registrationPage = homePage.clickRegister();
        
        // Generate a unique username using a random UUID
        String username = "usr" + java.util.UUID.randomUUID().toString().replace("-", "").substring(0, 10);
        
        registrationPage.fillRegistrationForm(
                "John", 
                "Doe", 
                "123 Main St", 
                "Anytown", 
                "CA", 
                "90210", 
                "555-1234", 
                "123-45-678", 
                username, 
                "password123"
        );
        registrationPage.clickRegister();
        
        String successMessage = registrationPage.getSuccessMessage();
        Assert.assertTrue(successMessage.contains("Your account was created successfully"), "Registration failed.");
    }
}
