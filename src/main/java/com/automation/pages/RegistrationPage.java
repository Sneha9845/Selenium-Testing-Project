package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private WebDriver driver;

    // Locators
    private By firstNameInput = By.id("customer.firstName");
    private By lastNameInput = By.id("customer.lastName");
    private By addressInput = By.id("customer.address.street");
    private By cityInput = By.id("customer.address.city");
    private By stateInput = By.id("customer.address.state");
    private By zipCodeInput = By.id("customer.address.zipCode");
    private By phoneInput = By.id("customer.phoneNumber");
    private By ssnInput = By.id("customer.ssn");
    private By usernameInput = By.id("customer.username");
    private By passwordInput = By.id("customer.password");
    private By confirmPasswordInput = By.id("repeatedPassword");
    private By registerButton = By.xpath("//input[@value='Register']");
    
    // Validation Error Locators
    private By firstNameError = By.id("customer.firstName.errors");
    private By lastNameError = By.id("customer.lastName.errors");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillRegistrationForm(String firstName, String lastName, String address, String city, String state, String zip, String phone, String ssn, String username, String password) {
        driver.findElement(firstNameInput).sendKeys(firstName);
        driver.findElement(lastNameInput).sendKeys(lastName);
        driver.findElement(addressInput).sendKeys(address);
        driver.findElement(cityInput).sendKeys(city);
        driver.findElement(stateInput).sendKeys(state);
        driver.findElement(zipCodeInput).sendKeys(zip);
        driver.findElement(phoneInput).sendKeys(phone);
        driver.findElement(ssnInput).sendKeys(ssn);
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(confirmPasswordInput).sendKeys(password);
    }

    public void clickRegister() {
        driver.findElement(registerButton).click();
    }
    
    public String getFirstNameError() {
        return driver.findElement(firstNameError).getText();
    }
    
    public String getLastNameError() {
        return driver.findElement(lastNameError).getText();
    }
    
    public String getSuccessMessage() {
        return driver.findElement(By.xpath("//div[@id='rightPanel']/p")).getText();
    }
}
