```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugConstructor() {
        Bug bug = new Bug("Test Bug", "This is a test bug.", "HIGH");
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getSeverity());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setTitle("New Title");
        bug.setDescription("New Description");
        bug.setSeverity("LOW");
        
        assertEquals("New Title", bug.getTitle());
        assertEquals("New Description", bug.getDescription());
        assertEquals("LOW", bug.getSeverity());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Bug Title", "Bug Description", "MEDIUM");
        String expectedString = "Bug{title='Bug Title', description='Bug Description', severity='MEDIUM'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

* **Import Statements:** Imports the necessary classes: `Bug`, `Test`, and `Assertions` from JUnit.
* **Test Class:** `BugTest` class contains JUnit test methods.
* **`testBugConstructor()`:**
    * Creates a new `Bug` object with title, description, and severity.
    * Asserts that the getter methods return the expected values.
* **`testSettersAndGetters()`:**
    * Creates a new `Bug` object.
    * Sets the title, description, and severity using the setter methods.
    * Asserts that the getter methods return the correct values.
* **`testToString()`:**
    * Creates a `Bug` object.
    * Asserts that the `toString()` method returns the expected string representation of the object.

**Note:**

* Replace `com.bug.api.model.domain.Bug` with the actual package and class name of your `Bug` class.
* You can add more test cases to cover other aspects of your `Bug` class, such as validation, data manipulation, etc.
* Remember to run these tests to ensure the correctness of your `Bug` class. 
