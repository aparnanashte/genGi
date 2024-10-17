```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugTest {

    @Test
    void testConstructor() {
        Bug bug = new Bug("Test Bug", "This is a test bug.", "HIGH", "John Doe");
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("John Doe", bug.getAssignee());
    }

    @Test
    void testGettersAndSetters() {
        Bug bug = new Bug();
        bug.setTitle("Test Bug");
        bug.setDescription("This is a test bug.");
        bug.setPriority("HIGH");
        bug.setAssignee("John Doe");

        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("John Doe", bug.getAssignee());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Test Bug", "This is a test bug.", "HIGH", "John Doe");
        String expected = "Bug{title='Test Bug', description='This is a test bug.', priority='HIGH', assignee='John Doe'}";
        assertEquals(expected, bug.toString());
    }
}
```

**Explanation:**

* **Imports:** The `com.bug.api.model.domain.Bug` class is imported to be used in the test class.
* **Test Class:** The `BugTest` class is a JUnit 5 test class.
* **Test Methods:**
    * `testConstructor()`: This test verifies that the constructor correctly initializes the bug object with the given title, description, priority, and assignee.
    * `testGettersAndSetters()`: This test checks that the getter and setter methods for each attribute are working as expected.
    * `testToString()`: This test checks that the `toString()` method returns a string representation of the bug object in the expected format.
* **Assertions:** The `assertEquals()` method is used to assert that the actual values match the expected values. 

**Running the Tests:**

To run the tests, you will need to have JUnit 5 installed in your project.  Then, you can run the `BugTest` class as a JUnit test. 

**Note:** This test case is a basic example and you can expand it by adding more test cases for different scenarios and edge cases.
