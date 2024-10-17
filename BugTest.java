```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugCreation() {
        Bug bug = new Bug("Test Bug", "This is a test bug", "HIGH");
        assertNotNull(bug);
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getSeverity());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setTitle("Updated Title");
        bug.setDescription("Updated Description");
        bug.setSeverity("LOW");

        assertEquals("Updated Title", bug.getTitle());
        assertEquals("Updated Description", bug.getDescription());
        assertEquals("LOW", bug.getSeverity());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Test Bug", "This is a test bug", "HIGH");
        String expectedString = "Bug{title='Test Bug', description='This is a test bug', severity='HIGH'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

* **Import Statements:** This imports the necessary classes for testing, including the `Bug` class and assertion methods from JUnit.
* **Test Class:** This class contains the JUnit test methods.
* **`testBugCreation()`:** This method tests the creation of a `Bug` object with provided title, description, and severity. It asserts that the object is not null and that the getters return the expected values.
* **`testSettersAndGetters()`:** This method tests the setters and getters of the `Bug` class by updating the values and asserting that the getters return the updated values.
* **`testToString()`:** This method tests the `toString()` method of the `Bug` class by creating a `Bug` object and comparing its string representation with the expected string. 

This is a basic example of JUnit test cases for the `Bug` class. You can add more test cases to cover different scenarios and edge cases based on your specific requirements.
