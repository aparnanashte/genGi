```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testConstructor() {
        Bug bug = new Bug(1L, "Test bug", "This is a test bug", "HIGH");
        assertEquals(1L, bug.getId());
        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testGettersAndSetters() {
        Bug bug = new Bug();
        bug.setId(1L);
        bug.setTitle("Test bug");
        bug.setDescription("This is a test bug");
        bug.setPriority("HIGH");

        assertEquals(1L, bug.getId());
        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testToString() {
        Bug bug = new Bug(1L, "Test bug", "This is a test bug", "HIGH");
        String expectedString = "Bug{id=1, title='Test bug', description='This is a test bug', priority='HIGH'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

* **Import Statements:** The test class imports the `Bug` class from the `com.bug.api.model.domain` package and necessary assertion methods from `org.junit.jupiter.api.Assertions`.
* **`testConstructor()`:** This test case checks that the constructor of the `Bug` class initializes the object with the correct values.
* **`testGettersAndSetters()`:** This test case verifies that the getter and setter methods of the `Bug` class work correctly by setting and retrieving values for each attribute.
* **`testToString()`:** This test case checks that the `toString()` method of the `Bug` class returns a string representation of the object with the expected format.

**To run these test cases:**

1. Make sure you have JUnit 5 installed in your project.
2. Add the test class to your project.
3. Run the test class using your IDE's testing functionality or by running the `BugTest` class as a JUnit test.

**Note:** These are just basic examples. You may need to add more test cases depending on the specific requirements of your `Bug` class.
