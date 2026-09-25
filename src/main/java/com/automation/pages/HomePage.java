package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // Locators
    private By usernameInput = By.name("username");
    private By passwordInput = By.name("password");
    private By loginButton = By.xpath("//input[@value='Log In']");
    private By registerLink = By.linkText("Register");
    private By errorText = By.className("error");
    
    // Navigation links
    private By aboutUsLink = By.linkText("About Us");
    private By servicesLink = By.linkText("Services");
    private By productsLink = By.linkText("Products");
    private By locationsLink = By.linkText("Locations");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    
    public RegistrationPage clickRegister() {
        driver.findElement(registerLink).click();
        return new RegistrationPage(driver);
    }

    public String getErrorMessage() {
        return driver.findElement(errorText).getText();
    }
    
    // Navigation Methods
    public void clickAboutUs() {
        driver.findElement(aboutUsLink).click();
    }
    
    public void clickServices() {
        driver.findElement(servicesLink).click();
    }
    
    public void clickProducts() {
        driver.findElement(productsLink).click();
    }
    
    public void clickLocations() {
        driver.findElement(locationsLink).click();
    }
}
