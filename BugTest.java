```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testConstructor() {
        Bug bug = new Bug(1L, "Test Bug", "This is a test bug.", "HIGH", "OPEN");
        assertEquals(1L, bug.getId());
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("OPEN", bug.getStatus());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();

        bug.setId(1L);
        bug.setTitle("Test Bug");
        bug.setDescription("This is a test bug.");
        bug.setPriority("HIGH");
        bug.setStatus("OPEN");

        assertEquals(1L, bug.getId());
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("OPEN", bug.getStatus());
    }

    @Test
    void testToString() {
        Bug bug = new Bug(1L, "Test Bug", "This is a test bug.", "HIGH", "OPEN");
        String expectedString = "Bug{id=1, title='Test Bug', description='This is a test bug.', priority='HIGH', status='OPEN'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

* **Import Statements:** Import the `Bug` class and necessary assertion methods from JUnit.
* **Test Class:** Create a JUnit test class named `BugTest`.
* **Test Methods:**
    * **testConstructor():** Tests the constructor by creating a `Bug` object and verifying the values of its attributes.
    * **testSettersAndGetters():** Tests the setter and getter methods for each attribute by setting values and then verifying that the getters return the correct values.
    * **testToString():** Tests the `toString()` method by comparing the actual string representation of the `Bug` object with the expected string.

**Running the Tests:**

To run these test cases, you need to have JUnit installed in your project and configure your test runner to execute them. You can then run the tests using your IDE or command line tools.

**Note:**

This is a basic example of JUnit test cases. You can extend it by adding more test methods to cover all the functionalities of the `Bug` class, including edge cases and error handling.
