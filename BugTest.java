```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugTest {

    @Test
    void testBugConstructor() {
        // Arrange
        String title = "Test Bug";
        String description = "This is a test bug.";
        String status = "Open";
        String priority = "High";
        Bug bug = new Bug(title, description, status, priority);

        // Assert
        assertEquals(title, bug.getTitle());
        assertEquals(description, bug.getDescription());
        assertEquals(status, bug.getStatus());
        assertEquals(priority, bug.getPriority());
    }

    @Test
    void testSettersAndGetters() {
        // Arrange
        Bug bug = new Bug("Test Bug", "This is a test bug.", "Open", "High");

        // Act
        bug.setTitle("Updated Title");
        bug.setDescription("Updated Description");
        bug.setStatus("Closed");
        bug.setPriority("Low");

        // Assert
        assertEquals("Updated Title", bug.getTitle());
        assertEquals("Updated Description", bug.getDescription());
        assertEquals("Closed", bug.getStatus());
        assertEquals("Low", bug.getPriority());
    }

    @Test
    void testToString() {
        // Arrange
        Bug bug = new Bug("Test Bug", "This is a test bug.", "Open", "High");

        // Act
        String toStringOutput = bug.toString();

        // Assert
        assertTrue(toStringOutput.contains("Test Bug"));
        assertTrue(toStringOutput.contains("This is a test bug."));
        assertTrue(toStringOutput.contains("Open"));
        assertTrue(toStringOutput.contains("High"));
    }
}
```

**Explanation:**

* **Import statements:** Include the necessary import statements to access the `Bug` class and JUnit framework.
* **Test class:** Create a test class named `BugTest`.
* **Test methods:**
    * **`testBugConstructor()`:** This method tests the constructor of the `Bug` class by creating a `Bug` object and asserting that its attributes are correctly initialized.
    * **`testSettersAndGetters()`:** This method tests the setter and getter methods of the `Bug` class by setting and retrieving attribute values and verifying their consistency.
    * **`testToString()`:** This method tests the `toString()` method of the `Bug` class by asserting that the output string contains the expected attributes.
* **Assertions:** The `assertEquals()` and `assertTrue()` methods are used to assert the expected behavior of the `Bug` class.

**To run these tests:**

1. Ensure that you have JUnit installed in your project.
2. Run the test class `BugTest`.

This test case provides a basic foundation for testing the `Bug` class. You can further extend this test case by adding more test scenarios based on the specific functionality of your `Bug` class.
