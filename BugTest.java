```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugConstructor() {
        Bug bug = new Bug("Test bug", "This is a test bug", "HIGH");
        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setTitle("Test bug");
        bug.setDescription("This is a test bug");
        bug.setPriority("HIGH");
        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Test bug", "This is a test bug", "HIGH");
        String expectedToString = "Bug{" +
                "title='Test bug'," +
                "description='This is a test bug'," +
                "priority='HIGH'" +
                '}';
        assertEquals(expectedToString, bug.toString());
    }
}
```

**Explanation:**

* **Import Statement:** This imports the necessary class `Bug` from the `com.bug.api.model.domain` package.
* **Test Class:** The `BugTest` class contains JUnit test cases for the `Bug` class.
* **`testBugConstructor()`:** This test verifies that the `Bug` constructor correctly initializes the bug object with the given title, description, and priority.
* **`testSettersAndGetters()`:** This test verifies that the setter and getter methods for title, description, and priority work as expected.
* **`testToString()`:** This test verifies that the `toString()` method returns a correctly formatted string representation of the bug object.

**Note:**

* Replace `com.bug.api.model.domain` with the actual package where your `Bug` class is located.
* You can add more test cases to cover other methods or scenarios in your `Bug` class.
* Make sure to run these tests to ensure the functionality of your `Bug` class.