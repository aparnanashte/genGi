```java
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class BugkApiApplicationTest {

    @Test
    void contextLoads() {
        BugkApiApplication application = new BugkApiApplication();
        assertNotNull(application);
    }
}
```

**Explanation:**

* **`@SpringBootTest`:** This annotation indicates that this is a Spring Boot test, enabling Spring Boot's test framework to be used.
* **`contextLoads()`:** This method is a basic test that checks if the application context is loaded successfully.
* **`BugkApiApplication application = new BugkApiApplication();`:** This line creates an instance of your `BugkApiApplication` class.
* **`assertNotNull(application);`:** This assertion checks if the created application instance is not null, confirming that the context was loaded.

**Import statement:**

* **`import org.junit.jupiter.api.Test;`:** Imports the `Test` annotation from JUnit Jupiter.
* **`import org.springframework.boot.test.context.SpringBootTest;`:** Imports the `SpringBootTest` annotation from Spring Boot.
* **`import static org.junit.jupiter.api.Assertions.assertNotNull;`:** Imports the `assertNotNull` assertion method.

**To run the test:**

1. Make sure you have JUnit Jupiter and Spring Boot Test dependencies in your project.
2. Run the test using your IDE's test runner or by executing the `mvn test` command from the command line. 

**Note:** This is a very basic test case. You can create more complex tests by interacting with your application's controllers, services, and repositories, and asserting the expected outcomes.
