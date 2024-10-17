```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugConstructor() {
        // Arrange
        String title = "Bug title";
        String description = "Bug description";
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
    void testSettersGetters() {
        // Arrange
        Bug bug = new Bug();

        // Act
        bug.setTitle("New bug title");
        bug.setDescription("New bug description");
        bug.setPriority("Medium");
        bug.setStatus("In Progress");

        // Assert
        assertEquals("New bug title", bug.getTitle());
        assertEquals("New bug description", bug.getDescription());
        assertEquals("Medium", bug.getPriority());
        assertEquals("In Progress", bug.getStatus());
    }

    @Test
    void testToString() {
        // Arrange
        Bug bug = new Bug("Bug title", "Bug description", "High", "Open");

        // Act
        String toStringResult = bug.toString();

        // Assert
        assertTrue(toStringResult.contains("Bug title"));
        assertTrue(toStringResult.contains("Bug description"));
        assertTrue(toStringResult.contains("High"));
        assertTrue(toStringResult.contains("Open"));
    }
}
```

**Explanation:**

1. **Import Statements:**
   - `com.bug.api.model.domain.Bug`: Imports the `Bug` class.
   - `org.junit.jupiter.api.Test`: Imports the `Test` annotation for marking test methods.
   - `static org.junit.jupiter.api.Assertions.*`: Imports all assertion methods from JUnit for easier use.

2. **Test Class:**
   - `public class BugTest`: Defines a test class named `BugTest`.

3. **Test Methods:**
   - **`testBugConstructor()`:**
     - **Arrange:** Creates a `Bug` object with sample data.
     - **Act:** None, the constructor is executed automatically.
     - **Assert:** Uses `assertEquals` to check if the getter methods return the expected values initialized by the constructor.
   - **`testSettersGetters()`:**
     - **Arrange:** Creates an empty `Bug` object.
     - **Act:** Sets values using the setter methods.
     - **Assert:** Uses `assertEquals` to check if the getter methods return the expected values set by the setter methods.
   - **`testToString()`:**
     - **Arrange:** Creates a `Bug` object with sample data.
     - **Act:** Calls the `toString()` method.
     - **Assert:** Uses `assertTrue` to check if the generated string contains the expected values from the `Bug` object.

**Running the Tests:**

1. Make sure you have JUnit 5 installed in your project.
2. Run the `BugTest` class as a JUnit test.

**Note:**

- This is a basic example, and you can expand it to cover more scenarios and aspects of the `Bug` class.
- Adjust the test data and assertions based on your specific requirements and the functionality of your `Bug` class.
