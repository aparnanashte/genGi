```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugTest {

    @Test
    void testBugConstructor() {
        Bug bug = new Bug(1L, "Test Bug", "This is a test bug.", "HIGH", "John Doe", "Assigned to Jane Doe", "OPEN");
        assertEquals(1L, bug.getId());
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("John Doe", bug.getReporter());
        assertEquals("Assigned to Jane Doe", bug.getAssignee());
        assertEquals("OPEN", bug.getStatus());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setId(1L);
        bug.setTitle("Test Bug");
        bug.setDescription("This is a test bug.");
        bug.setPriority("HIGH");
        bug.setReporter("John Doe");
        bug.setAssignee("Assigned to Jane Doe");
        bug.setStatus("OPEN");

        assertEquals(1L, bug.getId());
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("John Doe", bug.getReporter());
        assertEquals("Assigned to Jane Doe", bug.getAssignee());
        assertEquals("OPEN", bug.getStatus());
    }

    @Test
    void testToString() {
        Bug bug = new Bug(1L, "Test Bug", "This is a test bug.", "HIGH", "John Doe", "Assigned to Jane Doe", "OPEN");
        String expectedString = "Bug{id=1, title='Test Bug', description='This is a test bug.', priority='HIGH', reporter='John Doe', assignee='Assigned to Jane Doe', status='OPEN'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

* **Import statements:** Include necessary imports for the `Bug` class and JUnit assertions.
* **Test class:** Create a `BugTest` class to contain the test methods.
* **Test methods:**
    * **`testBugConstructor()`:**
        * Create a `Bug` object using the constructor.
        * Assert that the values set in the constructor are correctly assigned to the object's properties.
    * **`testSettersAndGetters()`:**
        * Create a `Bug` object.
        * Use the setter methods to assign values to the object's properties.
        * Use the getter methods to retrieve the values and assert they are correct.
    * **`testToString()`:**
        * Create a `Bug` object.
        * Call the `toString()` method to get a string representation of the object.
        * Assert that the string representation is as expected.

**Note:** This is a basic example of JUnit test cases. You can add more tests to cover different scenarios and edge cases for the `Bug` class. 
