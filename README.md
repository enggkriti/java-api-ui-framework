# Java API/UI Testing Framework

© 2026 Kriti Rastogi. All rights reserved.

This framework is proprietary and may not be copied, distributed, or modified without explicit permission.

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
java-api-ui-framework/
├── api-framework/
│   ├── src/main/java/com/apiuitest/
│   │   ├── services/       # API service classes (PostService, etc.)
│   │   └── models/         # API data models (Post, User, etc.)
│   ├── src/test/java/com/apiuitest/
│   │   └── api/            # API test classes (PostApiTest, etc.)
│   └── pom.xml
├── ui-framework/
│   ├── src/main/java/com/apiuitest/
│   │   ├── factory/        # WebDriver factory
│   │   └── pages/          # Page Object Model classes (BasePage, etc.)
│   ├── src/test/java/com/apiuitest/
│   │   └── ui/             # UI test classes
│   └── pom.xml
├── shared/
│   ├── src/main/java/com/apiuitest/
│   │   ├── builders/       # Test data builders
│   │   ├── config/         # Configuration management (ConfigReader)
│   │   ├── models/         # Shared data models
│   │   └── utils/          # Utility classes (LoggerUtil, ApiUtils, etc.)
│   ├── src/test/java/com/apiuitest/
│   │   ├── base/           # Base test classes (ApiBaseTest, UiBaseTest)
│   │   ├── data/           # Test data providers (TestDataProvider)
│   │   └── listeners/      # TestNG listeners
│   └── pom.xml
├── pom.xml                  # Parent POM
├── testng.xml
└── README.md
```

## Prerequisites

- Java 21 LTS
- Maven 3.6+
- Chrome/Firefox/Edge browser

## Configuration

Update `shared/src/test/resources/config.properties`:

```properties
base.url=https://jsonplaceholder.typicode.com
browser=chrome
timeout=10
```

## Running Tests

### Compile and Test
```bash
mvn clean install
mvn test
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

- **Chrome**: Download ChromeDriver matching your Chrome version
- **Firefox**: Download GeckoDriver
- **Edge**: Download MSEdgeDriver

Place drivers in system PATH or configure in WebDriverFactory.

## Logging

Logs are written to:
- Console output
- `logs/test.log` file

## Screenshots

UI test screenshots are saved to `screenshots/` directory.

## Installation

1. Clone the repository:
```bash
git clone <repository-url>
cd java-api-ui-framework
```

2. Install dependencies:
```bash
mvn clean install
```

## License

© 2026 Kriti Rastogi. All rights reserved.

This framework is proprietary and may not be copied, distributed, or modified without explicit permission.