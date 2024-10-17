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
        bug.setTitle("New Bug Title");
        bug.setDescription("New bug description");
        bug.setPriority("LOW");

        assertEquals("New Bug Title", bug.getTitle());
        assertEquals("New bug description", bug.getDescription());
        assertEquals("LOW", bug.getPriority());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Bug Title", "Bug Description", "MEDIUM");
        String expectedToString = "Bug{title='Bug Title', description='Bug Description', priority='MEDIUM'}";
        assertEquals(expectedToString, bug.toString());
    }
}
```

**Explanation:**

* **Imports:** The test class imports the `Bug` class from the correct package (`com.bug.api.model.domain`) and uses `junit.jupiter.api` for the test annotations.
* **`testConstructor()`:** This test case verifies that the constructor correctly initializes the bug object with the provided title, description, and priority.
* **`testSettersAndGetters()`:** This test case tests the setters and getters of the `Bug` class, ensuring they correctly modify and retrieve the bug's attributes.
* **`testToString()`:** This test case verifies that the `toString()` method returns the expected string representation of a `Bug` object.

**To run these tests:**

1. Make sure you have JUnit 5 (or later) added to your project dependencies.
2. Save the test class in a suitable location (e.g., `src/test/java/com/bug/api/model/domain/BugTest.java`).
3. Run the tests using your IDE or a build tool like Maven or Gradle.

Remember to adapt the test cases based on the specific requirements and functionalities of your `Bug` class.
