```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugConstructor() {
        Bug bug = new Bug("Bug Title", "Bug Description", "High");
        assertEquals("Bug Title", bug.getTitle());
        assertEquals("Bug Description", bug.getDescription());
        assertEquals("High", bug.getSeverity());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setTitle("New Bug Title");
        bug.setDescription("New Bug Description");
        bug.setSeverity("Low");

        assertEquals("New Bug Title", bug.getTitle());
        assertEquals("New Bug Description", bug.getDescription());
        assertEquals("Low", bug.getSeverity());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Bug Title", "Bug Description", "Medium");
        String expectedToString = "Bug{title='Bug Title', description='Bug Description', severity='Medium'}";
        assertEquals(expectedToString, bug.toString());
    }
}
```

**Import Statements:**

- `com.bug.api.model.domain.Bug`: Imports the `Bug` class from the project's domain package.
- `org.junit.jupiter.api.Test`: Imports the `Test` annotation from JUnit 5.
- `static org.junit.jupiter.api.Assertions.*`: Imports static methods from JUnit 5's `Assertions` class to use assertion methods like `assertEquals`.

**Test Cases:**

- `testBugConstructor()`: Tests the constructor of the `Bug` class, ensuring that the title, description, and severity are initialized correctly.
- `testSettersAndGetters()`: Tests the setter and getter methods of the `Bug` class, ensuring that values can be set and retrieved correctly.
- `testToString()`: Tests the `toString()` method of the `Bug` class, ensuring that it returns a correctly formatted string representation of the object.

**Notes:**

- This is a basic example of JUnit test cases for the `Bug` class. You may need to add more test cases depending on the specific functionalities and properties of your `Bug` class.
- Remember to run these tests to ensure that your `Bug` class is working as expected.
