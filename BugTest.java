```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugConstructor() {
        // Arrange
        String title = "Test bug";
        String description = "This is a test bug description";
        String priority = "High";
        String status = "Open";

        // Act
        Bug bug = new Bug(title, description, priority, status);

        // Assert
        assertEquals(title, bug.getTitle());
        assertEquals(description, bug.getDescription());
        assertEquals(priority, bug.getPriority());
        assertEquals(status, bug.getStatus());
    }

    @Test
    void testBugGettersAndSetters() {
        // Arrange
        Bug bug = new Bug();

        // Act
        bug.setTitle("Test bug");
        bug.setDescription("This is a test bug description");
        bug.setPriority("High");
        bug.setStatus("Open");

        // Assert
        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug description", bug.getDescription());
        assertEquals("High", bug.getPriority());
        assertEquals("Open", bug.getStatus());
    }

    @Test
    void testBugToString() {
        // Arrange
        Bug bug = new Bug("Test bug", "This is a test bug description", "High", "Open");

        // Act
        String bugString = bug.toString();

        // Assert
        assertTrue(bugString.contains("Test bug"));
        assertTrue(bugString.contains("This is a test bug description"));
        assertTrue(bugString.contains("High"));
        assertTrue(bugString.contains("Open"));
    }
}
```

**Explanation:**

* **Import statements:** The test class imports the necessary classes for testing, including the `Bug` class and assertion methods from JUnit.
* **Test cases:**
    * `testBugConstructor()`: This test case tests the constructor of the `Bug` class by creating an instance with specific values and verifying that the getters return the expected values.
    * `testBugGettersAndSetters()`: This test case tests the getters and setters of the `Bug` class by setting values using the setters and verifying that the getters return the correct values.
    * `testBugToString()`: This test case tests the `toString()` method of the `Bug` class by creating an instance and verifying that the returned string contains the expected values.
* **Assertions:** The test cases use assertion methods like `assertEquals()` and `assertTrue()` to verify the expected results.

**How to run the tests:**

1. Make sure you have JUnit 5 installed in your project.
2. Run the test class as a JUnit test.

This test case provides a basic example of how to write JUnit tests for the `Bug` class. You can add more test cases to cover other functionalities and edge cases of the class. 
