# Web Automation Testing Project

This project demonstrates automated web testing using Java, Selenium WebDriver, and TestNG. It uses Maven for dependency management and execution.

## Features Covered
- **Login Module Testing:** Validates login flow and error handling.
- **Registration Module Testing:** Automates the user registration process.
- **Form Validation:** Checks required field validation during registration.
- **Navigation Module Testing:** Ensures main navigation links are functional.

## Prerequisites
- **Java 11 or higher** installed and added to your system PATH.
- **Maven** installed and added to your system PATH.
- (Optional) An IDE like IntelliJ IDEA or Eclipse.

## Project Structure
- `pom.xml`: Maven configuration containing dependencies (Selenium, TestNG) and plugins.
- `testng.xml`: TestNG suite file used to configure test execution.
- `src/main/java/com/automation/pages`: Page Object Model classes (HomePage, RegistrationPage).
- `src/test/java/com/automation/base`: BaseTest for WebDriver setup and teardown.
- `src/test/java/com/automation/tests`: TestNG test classes for different modules.

## How to Run the Tests
You can run the tests from your terminal using Maven:

```bash
mvn clean test
```

This will automatically:
1. Compile the project.
2. Download required dependencies (Selenium, TestNG).
3. Use Selenium Manager to set up the correct browser driver.
4. Execute the tests defined in `testng.xml`.
5. Generate a report in the `target/surefire-reports` directory.

Alternatively, you can import this project into IntelliJ IDEA or Eclipse as a Maven project and run `testng.xml` directly.
