# Java API/UI Testing Framework

A comprehensive testing framework built with Java 21, Selenium WebDriver, REST Assured, and TestNG for API and UI testing.

## Features

- **API Testing**: REST API testing with REST Assured
- **UI Testing**: Web UI testing with Selenium WebDriver
- **Test Data Management**: Builder pattern for test data creation
- **Configuration Management**: External configuration files
- **Logging**: Log4j2 for comprehensive logging
- **Screenshots**: Automatic screenshot capture for UI tests
- **Cross-browser Support**: Chrome, Firefox, Edge
- **Test Reporting**: TestNG reports with custom listeners

## Project Structure

```
src/
├── main/java/com/apiuitest/
│   ├── base/           # Base classes
│   ├── builders/       # Test data builders
│   ├── config/         # Configuration management
│   ├── factory/        # WebDriver factory
│   ├── models/         # Data models (User, Post, etc.)
│   ├── pages/          # Page Object Model classes
│   ├── services/       # API service classes
│   └── utils/          # Utility classes
└── test/java/com/apiuitest/
    ├── api/            # API test classes
    ├── base/           # Base test classes
    ├── data/           # Test data providers
    ├── listeners/      # TestNG listeners
    ├── ui/             # UI test classes
    └── utils/          # Test utilities
```

## Prerequisites

- Java 21 LTS
- Maven 3.6+
- Chrome/Firefox/Edge browser

## Configuration

Update `src/test/resources/config.properties`:

```properties
base.url=https://jsonplaceholder.typicode.com
browser=chrome
timeout=10
```

## Running Tests

### Compile and Test
```bash
mvn clean compile test
```

### Run Specific Test Suite
```bash
mvn test -DsuiteXmlFile=testng.xml
```

### Run API Tests Only
```bash
mvn test -Dgroups=api
```

### Run UI Tests Only
```bash
mvn test -Dgroups=ui
```

## Test Examples

### API Test
```java
@Test
public void testGetAllPosts() {
    Response response = postService.getAllPosts();
    ApiUtils.validateStatusCode(response, 200);
}
```

### UI Test
```java
@Test
public void testHomePage() {
    driver.get("https://example.com");
    HomePage homePage = new HomePage(driver);
    assert homePage.getPageTitle().contains("Example");
}
```

## Dependencies

- Selenium WebDriver 4.15.0
- REST Assured 5.3.2
- TestNG 7.8.0
- Jackson 2.15.2
- Log4j2 2.20.0
- Commons IO 2.11.0

## Browser Setup

For Chrome: Download ChromeDriver matching your Chrome version
For Firefox: Download GeckoDriver
For Edge: Download MSEdgeDriver

Place drivers in system PATH or configure in WebDriverFactory.

## Logging

Logs are written to:
- Console output
- `logs/test.log` file

## Screenshots

UI test screenshots are saved to `screenshots/` directory.