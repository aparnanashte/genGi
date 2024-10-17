```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugCreation() {
        Bug bug = new Bug("Test Bug", "This is a test bug", "HIGH");
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setTitle("Test Bug 2");
        bug.setDescription("This is another test bug");
        bug.setPriority("LOW");

        assertEquals("Test Bug 2", bug.getTitle());
        assertEquals("This is another test bug", bug.getDescription());
        assertEquals("LOW", bug.getPriority());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Test Bug 3", "This is the third test bug", "MEDIUM");
        String expectedString = "Bug{title='Test Bug 3', description='This is the third test bug', priority='MEDIUM'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

* **Import Statements:**
    * `com.bug.api.model.domain.Bug`: Imports the Bug class to be tested.
    * `org.junit.jupiter.api.Test`: Imports the JUnit 5 annotation to mark test methods.
    * `static org.junit.jupiter.api.Assertions.*`: Imports static methods from Assertions class for assertions.
* **Test Methods:**
    * `testBugCreation()`: Tests the creation of a Bug object with different values for title, description, and priority.
    * `testSettersAndGetters()`: Tests the setters and getters for title, description, and priority.
    * `testToString()`: Tests the toString() method of the Bug class.
* **Assertions:**
    * `assertEquals()`: Used to verify expected values against actual values.

**Note:**

* This is a basic example and you can add more test cases depending on the specific requirements of your Bug class.
* Make sure to adjust the import statements and test cases according to your actual code structure.