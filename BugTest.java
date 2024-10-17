```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugTest {

    @Test
    void testConstructor() {
        // Arrange
        String title = "Bug title";
        String description = "Bug description";
        String severity = "High";
        String status = "Open";

        // Act
        Bug bug = new Bug(title, description, severity, status);

        // Assert
        assertEquals(title, bug.getTitle());
        assertEquals(description, bug.getDescription());
        assertEquals(severity, bug.getSeverity());
        assertEquals(status, bug.getStatus());
    }

    @Test
    void testSettersAndGetters() {
        // Arrange
        Bug bug = new Bug();

        // Act
        bug.setTitle("Bug title");
        bug.setDescription("Bug description");
        bug.setSeverity("High");
        bug.setStatus("Open");

        // Assert
        assertEquals("Bug title", bug.getTitle());
        assertEquals("Bug description", bug.getDescription());
        assertEquals("High", bug.getSeverity());
        assertEquals("Open", bug.getStatus());
    }

    @Test
    void testToString() {
        // Arrange
        Bug bug = new Bug("Bug title", "Bug description", "High", "Open");

        // Act
        String toString = bug.toString();

        // Assert
        assertTrue(toString.contains("Bug title"));
        assertTrue(toString.contains("Bug description"));
        assertTrue(toString.contains("High"));
        assertTrue(toString.contains("Open"));
    }
}
```

**Explanation:**

- The test class `BugTest` contains three test methods:
    - `testConstructor()`: This method tests the constructor of the `Bug` class by creating a new instance and verifying that its properties are set correctly.
    - `testSettersAndGetters()`: This method tests the setters and getters of the `Bug` class by setting the properties of an instance and then retrieving them using the corresponding getter methods.
    - `testToString()`: This method tests the `toString()` method of the `Bug` class by creating an instance, calling `toString()`, and verifying that the returned string contains the expected information.

- The `assertEquals()`, `assertTrue()`, and `assertFalse()` methods from JUnit are used to assert the expected outcomes of the tests.

- The `@Test` annotation marks each method as a test method.

- The import statement `import com.bug.api.model.domain.Bug;` imports the `Bug` class for testing.

**Note:**

- This is a basic example of JUnit test cases for the `Bug` class. You may need to add more test cases based on the specific requirements of your application.
- The `Bug` class should be properly defined with the necessary properties, setters, and getters for the test cases to work.
- The test cases assume that the `Bug` class follows the conventions of JavaBeans with a no-arg constructor and getter/setter methods.
