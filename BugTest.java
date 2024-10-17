```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testConstructor() {
        Bug bug = new Bug("Test Bug", "This is a test bug", "HIGH");
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getSeverity());
    }

    @Test
    void testGettersAndSetters() {
        Bug bug = new Bug();
        bug.setTitle("Test Bug");
        bug.setDescription("This is a test bug");
        bug.setSeverity("HIGH");
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getSeverity());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Test Bug", "This is a test bug", "HIGH");
        String expectedString = "Bug{title='Test Bug', description='This is a test bug', severity='HIGH'}";
        assertEquals(expectedString, bug.toString());
    }

    @Test
    void testEquals() {
        Bug bug1 = new Bug("Test Bug", "This is a test bug", "HIGH");
        Bug bug2 = new Bug("Test Bug", "This is a test bug", "HIGH");
        Bug bug3 = new Bug("Another Bug", "This is another bug", "MEDIUM");
        assertTrue(bug1.equals(bug2));
        assertFalse(bug1.equals(bug3));
    }

    @Test
    void testHashCode() {
        Bug bug1 = new Bug("Test Bug", "This is a test bug", "HIGH");
        Bug bug2 = new Bug("Test Bug", "This is a test bug", "HIGH");
        assertEquals(bug1.hashCode(), bug2.hashCode());
    }
}
```

**Explanation:**

1. **Import Statements:** The test class imports the `Bug` class and the necessary assertions from JUnit.
2. **`testConstructor()`:** This test verifies that the constructor correctly initializes the bug object with the given title, description, and severity.
3. **`testGettersAndSetters()`:** This test verifies that the getter and setter methods work correctly for the title, description, and severity attributes.
4. **`testToString()`:** This test verifies that the `toString()` method returns the expected string representation of the bug object.
5. **`testEquals()`:** This test verifies that the `equals()` method correctly compares two bug objects. Two bugs are considered equal if they have the same title, description, and severity.
6. **`testHashCode()`:** This test verifies that the `hashCode()` method returns the same hash code for two equal bug objects.

**Note:**

* This is just a basic example of JUnit tests. You can add more test cases based on your specific requirements and the functionality of the `Bug` class.
* Make sure to replace `com.bug.api.model.domain.Bug` with the actual package and class name of your `Bug` class.
* You can also use different assertion methods from JUnit based on your specific needs.