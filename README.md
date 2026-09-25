# Selenium Automation Testing Framework

> A modular Page Object Model (POM) Java test automation framework for end-to-end web testing of the ParaBank web application using Selenium WebDriver and TestNG.

---

## 🎯 What It Tests

This project automates web application testing for **ParaBank** (`https://parabank.parasoft.com/parabank/index.htm`), covering four core user flows:

- **Login Flow**: Validates user login attempts using data-driven inputs from external CSV files as well as empty credential error validations.
- **Form Validation Flow**: Checks registration form submission behavior to verify required field error messages (e.g., missing first name or last name).
- **Navigation Flow**: Verifies site header navigation links (such as "About Us" and "Services") to ensure proper page routing.
- **Registration Flow**: Automates complete user account registration using dynamically generated unique usernames and verifies success responses.

---

## ⚙️ How It Works

- **Selenium WebDriver**: Configures and manages browser driver instances (`ChromeDriver`, `FirefoxDriver`, `EdgeDriver`) with options for window maximization, implicit waits, and headless execution.
- **TestNG**: Handles test lifecycle orchestration (`@BeforeMethod`, `@AfterMethod`, `@Test`), assertion checking, and test suite execution configured via `testng.xml`.
- **Data-Driven Testing with CSV**: Uses OpenCSV (`CsvDataProvider`) to read test records from `src/test/resources/testdata/login-data.csv` and inject parameters into TestNG data provider methods.
- **Screenshots on Failure**: Implements `ITestListener` (`TestListener`) to catch test failures, capture screenshots using Selenium's `TakesScreenshot` (`ScreenshotUtil`), save PNG files under `reports/screenshots/`, and attach them directly to HTML reports.
- **Logging with Log4j2**: Configured via `log4j2.xml` to record test execution events, test initialization, status updates (start, pass, fail, skip), and error stack traces.
- **ExtentReports**: Generates detailed HTML test execution reports (`reports/ExtentReport.html`) with embedded screenshots and system metadata.

---

## 🛠️ Tech Stack

- **Programming Language**: Java 11
- **Automation Tool**: Selenium WebDriver 4.45.0
- **Testing Framework**: TestNG 7.10.2
- **Build Tool**: Apache Maven (with Maven Wrapper `mvnw.cmd`)
- **Data Parsing**: OpenCSV 5.9
- **Logging**: Log4j2 2.23.1
- **Reporting**: ExtentReports 5.1.1 (Spark Reporter)
- **Design Pattern**: Page Object Model (POM)

---

## 🚀 How to Run the Tests

### Prerequisites
- **JDK 11** or higher installed and added to system `PATH`.
- Chrome, Edge, or Firefox browser installed.

### Execution Commands

Run the full test suite using the included Maven Wrapper:

```bash
# Run all tests configured in testng.xml
.\mvnw.cmd clean test
```

Optionally, pass system properties to run in headless mode or target specific configurations:

```bash
# Run tests in headless mode
.\mvnw.cmd test -Dheadless=true
```

---

## 👤 Author

**Sneha G**  
MCA Graduate, Bengaluru
