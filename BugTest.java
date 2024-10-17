```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugConstructor() {
        Bug bug = new Bug("Test Bug", "This is a test bug.", "High", "John Doe");
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("High", bug.getSeverity());
        assertEquals("John Doe", bug.getReporter());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setTitle("Test Bug");
        bug.setDescription("This is a test bug.");
        bug.setSeverity("High");
        bug.setReporter("John Doe");

        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("High", bug.getSeverity());
        assertEquals("John Doe", bug.getReporter());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Test Bug", "This is a test bug.", "High", "John Doe");
        String expectedString = "Bug{title='Test Bug', description='This is a test bug.', severity='High', reporter='John Doe'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

* **Import Statements:** The test class imports the `Bug` class and the necessary assertion methods from JUnit.
* **Test Methods:**
    * `testBugConstructor()`: Tests the constructor by creating a `Bug` object and verifying its attributes.
    * `testSettersAndGetters()`: Tests the setter and getter methods by setting and retrieving the attributes of a `Bug` object.
    * `testToString()`: Tests the `toString()` method by verifying the expected string representation of a `Bug` object.
* **Assertions:** The test methods use the `assertEquals()` method from JUnit to assert that the actual values match the expected values. 

**Note:** This test case provides a basic set of tests for the `Bug` class. You may need to add more comprehensive tests depending on the specific requirements of your application.
