```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugTest {

    @Test
    void testConstructor() {
        // Arrange
        String title = "Bug Title";
        String description = "Bug Description";
        String severity = "Major";
        String status = "Open";
        String priority = "High";

        // Act
        Bug bug = new Bug(title, description, severity, status, priority);

        // Assert
        assertEquals(title, bug.getTitle());
        assertEquals(description, bug.getDescription());
        assertEquals(severity, bug.getSeverity());
        assertEquals(status, bug.getStatus());
        assertEquals(priority, bug.getPriority());
    }

    @Test
    void testGettersAndSetters() {
        // Arrange
        Bug bug = new Bug();

        // Act
        bug.setTitle("Bug Title");
        bug.setDescription("Bug Description");
        bug.setSeverity("Major");
        bug.setStatus("Open");
        bug.setPriority("High");

        // Assert
        assertEquals("Bug Title", bug.getTitle());
        assertEquals("Bug Description", bug.getDescription());
        assertEquals("Major", bug.getSeverity());
        assertEquals("Open", bug.getStatus());
        assertEquals("High", bug.getPriority());
    }

    @Test
    void testToString() {
        // Arrange
        Bug bug = new Bug("Bug Title", "Bug Description", "Major", "Open", "High");

        // Act
        String bugString = bug.toString();

        // Assert
        assertTrue(bugString.contains("Bug Title"));
        assertTrue(bugString.contains("Bug Description"));
        assertTrue(bugString.contains("Major"));
        assertTrue(bugString.contains("Open"));
        assertTrue(bugString.contains("High"));
    }
}
```

**Explanation:**

* **Imports:** The test class imports the `Bug` class and `Assertions` class from JUnit.
* **Constructor Test:** This test verifies the constructor sets the correct values for the bug object.
* **Getters and Setters Test:** This test ensures that the getters and setters for the bug object work correctly.
* **toString Test:** This test verifies that the `toString()` method returns a string that contains all the bug's information.

**Note:** This is a basic test case and may need to be expanded depending on the specific requirements of the `Bug` class. For example, you could add tests for:

* Validation of input parameters
* Handling of edge cases
* Interactions with other classes or databases
* Any other specific functionality of the `Bug` class.
