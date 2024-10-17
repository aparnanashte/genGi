```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugConstructor() {
        Bug bug = new Bug("Bug Title", "Bug Description", "HIGH");
        assertEquals("Bug Title", bug.getTitle());
        assertEquals("Bug Description", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setTitle("Updated Bug Title");
        bug.setDescription("Updated Bug Description");
        bug.setPriority("LOW");
        assertEquals("Updated Bug Title", bug.getTitle());
        assertEquals("Updated Bug Description", bug.getDescription());
        assertEquals("LOW", bug.getPriority());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Bug Title", "Bug Description", "MEDIUM");
        String expectedString = "Bug{title='Bug Title', description='Bug Description', priority='MEDIUM'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

- **Imports:** The code starts with importing necessary classes, including `Bug` from your domain package and assertion methods from JUnit.
- **Test Class:** The class `BugTest` contains the JUnit tests.
- **`testBugConstructor`:**
    - Creates a `Bug` object using the constructor with title, description, and priority.
    - Uses `assertEquals` to assert that the retrieved title, description, and priority match the values passed to the constructor.
- **`testSettersAndGetters`:**
    - Creates a `Bug` object.
    - Sets the title, description, and priority using the setter methods.
    - Uses `assertEquals` to assert that the retrieved values match the set values.
- **`testToString`:**
    - Creates a `Bug` object.
    - Calls `toString()` on the object and compares the result with the expected string representation.

**To run these tests:**

1. Make sure you have JUnit installed in your project.
2. Compile and run the `BugTest` class. 
3. JUnit will execute the tests and report the results.

**Remember to replace the package name `com.bug.api.model.domain` with your actual package name.**
