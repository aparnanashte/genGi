```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testConstructor() {
        Bug bug = new Bug("Test bug", "This is a test bug", "HIGH");
        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setTitle("New bug title");
        bug.setDescription("New bug description");
        bug.setPriority("LOW");

        assertEquals("New bug title", bug.getTitle());
        assertEquals("New bug description", bug.getDescription());
        assertEquals("LOW", bug.getPriority());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Test bug", "This is a test bug", "HIGH");
        String expectedToString = "Bug{title='Test bug', description='This is a test bug', priority='HIGH'}";
        assertEquals(expectedToString, bug.toString());
    }
}
```

**Explanation:**

* **Import Statement:** We import the `Bug` class from the package `com.bug.api.model.domain`.
* **Test Class:** The test class is named `BugTest`.
* **Test Methods:**
    * **`testConstructor()`:** This method tests the constructor of the `Bug` class. It creates a new `Bug` object and asserts that the title, description, and priority are set correctly.
    * **`testSettersAndGetters()`:** This method tests the setters and getters of the `Bug` class. It creates a `Bug` object, sets its properties, and then asserts that the values returned by the getters are correct.
    * **`testToString()`:** This method tests the `toString()` method of the `Bug` class. It creates a `Bug` object and asserts that the output of `toString()` matches the expected format.

**Note:** This test case assumes the `Bug` class has the following fields:

* `title` (String)
* `description` (String)
* `priority` (String)

You might need to adjust the test cases based on the actual fields and methods in your `Bug` class.
