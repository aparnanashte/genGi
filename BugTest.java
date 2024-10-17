```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugTest {

    @Test
    void testConstructor() {
        Bug bug = new Bug(1L, "Test bug", "This is a test bug.", "HIGH", "John Doe");
        assertEquals(1L, bug.getId());
        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("John Doe", bug.getReporter());
    }

    @Test
    void testGettersAndSetters() {
        Bug bug = new Bug();
        bug.setId(1L);
        bug.setTitle("Test bug");
        bug.setDescription("This is a test bug.");
        bug.setPriority("HIGH");
        bug.setReporter("John Doe");

        assertEquals(1L, bug.getId());
        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("John Doe", bug.getReporter());
    }
}
```

**Explanation:**

* **Import statement:** Imports the `Bug` class and necessary assertions from JUnit.
* **Test class:** Creates a test class `BugTest`.
* **`testConstructor()` method:**
    * Creates a `Bug` object using the constructor with test data.
    * Asserts that the getter methods return the expected values set in the constructor.
* **`testGettersAndSetters()` method:**
    * Creates a `Bug` object.
    * Sets the properties using setter methods.
    * Asserts that the getter methods return the expected values after setting.

**Note:** This is a basic example and can be extended to test other methods and functionalities of the `Bug` class, such as validation, updates, and relationships with other entities. You can add more test cases to cover different scenarios and edge cases.
