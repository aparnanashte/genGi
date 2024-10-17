```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugTest {

    @Test
    void testBugConstructor() {
        // Arrange
        String title = "Test bug";
        String description = "This is a test bug";
        String status = "Open";
        String priority = "High";
        String assignedTo = "John Doe";

        // Act
        Bug bug = new Bug(title, description, status, priority, assignedTo);

        // Assert
        assertEquals(title, bug.getTitle());
        assertEquals(description, bug.getDescription());
        assertEquals(status, bug.getStatus());
        assertEquals(priority, bug.getPriority());
        assertEquals(assignedTo, bug.getAssignedTo());
    }

    @Test
    void testGettersAndSetters() {
        // Arrange
        Bug bug = new Bug();

        // Act and Assert
        bug.setTitle("Test bug");
        assertEquals("Test bug", bug.getTitle());

        bug.setDescription("This is a test bug");
        assertEquals("This is a test bug", bug.getDescription());

        bug.setStatus("Open");
        assertEquals("Open", bug.getStatus());

        bug.setPriority("High");
        assertEquals("High", bug.getPriority());

        bug.setAssignedTo("John Doe");
        assertEquals("John Doe", bug.getAssignedTo());
    }

    @Test
    void testToString() {
        // Arrange
        Bug bug = new Bug("Test bug", "This is a test bug", "Open", "High", "John Doe");

        // Act
        String toStringResult = bug.toString();

        // Assert
        assertTrue(toStringResult.contains("Test bug"));
        assertTrue(toStringResult.contains("This is a test bug"));
        assertTrue(toStringResult.contains("Open"));
        assertTrue(toStringResult.contains("High"));
        assertTrue(toStringResult.contains("John Doe"));
    }
}
```

**Explanation:**

1. **Import statement:** This line imports the `Bug` class from the `com.bug.api.model.domain` package.
2. **Class declaration:** This line declares a test class named `BugTest`.
3. **Test methods:**
   - **`testBugConstructor()`:**
     - It creates a `Bug` object with some sample data.
     - It asserts that the getters for title, description, status, priority, and assignedTo return the expected values.
   - **`testGettersAndSetters()`:**
     - It creates a `Bug` object.
     - It sets each field using the setters and asserts that the getters return the expected values.
   - **`testToString()`:**
     - It creates a `Bug` object with some sample data.
     - It calls the `toString()` method on the object.
     - It asserts that the resulting string contains the expected values for title, description, status, priority, and assignedTo.

**Notes:**

- This is a basic example of JUnit test cases for the `Bug` class. You may need to add more tests depending on the specific functionality of your class.
- You can use other assertion methods from `org.junit.jupiter.api.Assertions` as needed.
- You can run these tests using your preferred JUnit test runner.

This code provides a starting point for testing the `Bug` class. You can expand it by adding more test cases to cover all possible scenarios and edge cases.
