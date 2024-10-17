```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testConstructor() {
        Bug bug = new Bug("Test bug", "This is a test bug.", "HIGH");
        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testGettersAndSetters() {
        Bug bug = new Bug();
        bug.setTitle("Test bug");
        bug.setDescription("This is a test bug.");
        bug.setPriority("HIGH");

        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Test bug", "This is a test bug.", "HIGH");
        String expectedString = "Bug{title='Test bug', description='This is a test bug.', priority='HIGH'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

* **Import statements:**
    * `com.bug.api.model.domain.Bug`: imports the Bug class to be tested.
    * `org.junit.jupiter.api.Test`: imports the `@Test` annotation for marking test methods.
    * `static org.junit.jupiter.api.Assertions.*`: imports all assertion methods from JUnit.
* **Test class:**
    * The class `BugTest` contains test methods for the `Bug` class.
* **Test methods:**
    * **`testConstructor()`:**
        * Creates a new `Bug` object using the constructor.
        * Asserts that the title, description, and priority of the created bug are as expected.
    * **`testGettersAndSetters()`:**
        * Creates a new `Bug` object.
        * Sets the title, description, and priority using the setter methods.
        * Asserts that the getter methods return the expected values.
    * **`testToString()`:**
        * Creates a new `Bug` object.
        * Asserts that the `toString()` method returns the expected string representation of the bug.

**Note:** This is a basic example, and you may need to add more tests depending on the specific functionality of your `Bug` class. For instance, you might want to add tests for:

* Validation of input parameters (e.g., ensuring the priority is valid).
* Other methods in the `Bug` class.
* Different scenarios, such as testing edge cases.
