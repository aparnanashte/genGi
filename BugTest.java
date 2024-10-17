```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testConstructor() {
        // Arrange
        String title = "Bug Title";
        String description = "Bug Description";
        String status = "Open";

        // Act
        Bug bug = new Bug(title, description, status);

        // Assert
        assertEquals(title, bug.getTitle());
        assertEquals(description, bug.getDescription());
        assertEquals(status, bug.getStatus());
    }

    @Test
    void testSettersAndGetters() {
        // Arrange
        Bug bug = new Bug();

        // Act
        bug.setTitle("Updated Title");
        bug.setDescription("Updated Description");
        bug.setStatus("Closed");

        // Assert
        assertEquals("Updated Title", bug.getTitle());
        assertEquals("Updated Description", bug.getDescription());
        assertEquals("Closed", bug.getStatus());
    }

    @Test
    void testToString() {
        // Arrange
        Bug bug = new Bug("Test Bug", "This is a test bug.", "Open");

        // Act
        String toStringOutput = bug.toString();

        // Assert
        assertTrue(toStringOutput.contains("Bug [title=Test Bug, description=This is a test bug., status=Open]"));
    }
}
```

**Explanation:**

* **Import Statements:** The test class imports the `Bug` class and necessary assertions from JUnit 5.
* **`testConstructor()`:** This test verifies the constructor correctly initializes the bug object with provided title, description, and status.
* **`testSettersAndGetters()`:** This test checks that the setter methods correctly modify the object's attributes and the getter methods retrieve the correct values.
* **`testToString()`:** This test asserts that the `toString()` method generates an expected string representation of the `Bug` object.

**Note:** This is a basic example, and you can add more comprehensive test cases based on the specific functionalities and validations required for your `Bug` class.
