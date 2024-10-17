```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugConstructor() {
        // Given
        String title = "Bug Title";
        String description = "Bug Description";
        String priority = "High";
        String status = "Open";

        // When
        Bug bug = new Bug(title, description, priority, status);

        // Then
        assertEquals(title, bug.getTitle());
        assertEquals(description, bug.getDescription());
        assertEquals(priority, bug.getPriority());
        assertEquals(status, bug.getStatus());
    }

    @Test
    void testSettersAndGetters() {
        // Given
        Bug bug = new Bug("Bug Title", "Bug Description", "High", "Open");

        // When
        bug.setTitle("New Bug Title");
        bug.setDescription("New Bug Description");
        bug.setPriority("Low");
        bug.setStatus("Closed");

        // Then
        assertEquals("New Bug Title", bug.getTitle());
        assertEquals("New Bug Description", bug.getDescription());
        assertEquals("Low", bug.getPriority());
        assertEquals("Closed", bug.getStatus());
    }

    @Test
    void testToString() {
        // Given
        Bug bug = new Bug("Bug Title", "Bug Description", "High", "Open");

        // When
        String toString = bug.toString();

        // Then
        assertTrue(toString.contains("Bug Title"));
        assertTrue(toString.contains("Bug Description"));
        assertTrue(toString.contains("High"));
        assertTrue(toString.contains("Open"));
    }
}
```

**Explanation:**

1. **Import Statements:**
   - Import the necessary classes: `Bug` from the `com.bug.api.model.domain` package, `Test` from `org.junit.jupiter.api`, and assertion methods from `org.junit.jupiter.api.Assertions`.

2. **Test Class:**
   - Create a test class named `BugTest`.

3. **Test Methods:**
   - **`testBugConstructor()`:**
     - Creates a `Bug` object with sample data.
     - Asserts that the values of the getters match the expected values set in the constructor.

   - **`testSettersAndGetters()`:**
     - Creates a `Bug` object.
     - Sets new values using the setters.
     - Asserts that the values retrieved using the getters match the newly set values.

   - **`testToString()`:**
     - Creates a `Bug` object.
     - Uses the `toString()` method to get the string representation.
     - Asserts that the string representation contains the expected values (title, description, priority, status).

**Note:**

- This is a basic example of JUnit tests. You can add more tests for edge cases or specific scenarios based on your `Bug` class's functionality.
- Remember to replace `"com.bug.api.model.domain"` with the actual package name of your `Bug` class.
- You might need additional imports depending on the specific methods or annotations you use in your tests.
