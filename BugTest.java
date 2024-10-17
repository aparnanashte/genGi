```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugTest {

    @Test
    void testConstructor() {
        Bug bug = new Bug(1L, "Test Bug", "This is a test bug", "HIGH", "FIXED");
        assertEquals(1L, bug.getId());
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("FIXED", bug.getStatus());
    }

    @Test
    void testGettersAndSetters() {
        Bug bug = new Bug();
        bug.setId(2L);
        bug.setTitle("Another Test Bug");
        bug.setDescription("This is another test bug");
        bug.setPriority("MEDIUM");
        bug.setStatus("IN_PROGRESS");

        assertEquals(2L, bug.getId());
        assertEquals("Another Test Bug", bug.getTitle());
        assertEquals("This is another test bug", bug.getDescription());
        assertEquals("MEDIUM", bug.getPriority());
        assertEquals("IN_PROGRESS", bug.getStatus());
    }

    @Test
    void testToString() {
        Bug bug = new Bug(3L, "Third Test Bug", "This is the third test bug", "LOW", "OPEN");
        String expectedString = "Bug{id=3, title='Third Test Bug', description='This is the third test bug', priority='LOW', status='OPEN'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

* The test class is named `BugTest` and uses JUnit 5 annotations like `@Test`.
* **`testConstructor()`:**
    * Creates a `Bug` object with sample data using the constructor.
    * Uses `assertEquals` to verify that the getter methods return the correct values.
* **`testGettersAndSetters()`:**
    * Creates a `Bug` object.
    * Sets the values for all attributes using the setter methods.
    * Uses `assertEquals` to verify that the getter methods return the correct values after setting them.
* **`testToString()`:**
    * Creates a `Bug` object with sample data.
    * Uses `assertEquals` to verify that the `toString()` method returns a string representation of the `Bug` object with expected values.

**Note:** This is a basic example of JUnit test cases for the `Bug` class. You can expand upon this by adding more tests for different scenarios, edge cases, and boundary conditions based on your specific requirements.
