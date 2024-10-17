```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugConstructor() {
        Bug bug = new Bug("Bug Title", "Description", "HIGH");
        assertEquals("Bug Title", bug.getTitle());
        assertEquals("Description", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setTitle("Bug Title");
        bug.setDescription("Description");
        bug.setPriority("HIGH");
        assertEquals("Bug Title", bug.getTitle());
        assertEquals("Description", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Bug Title", "Description", "HIGH");
        String expectedString = "Bug{title='Bug Title', description='Description', priority='HIGH'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

1. **Import statements:** The test class imports the `Bug` class and necessary assertion methods from JUnit.
2. **`testBugConstructor`:** Tests the constructor of the `Bug` class.
    - It creates a new `Bug` object with provided title, description, and priority.
    - It then uses `assertEquals` to assert that the getters return the expected values.
3. **`testSettersAndGetters`:** Tests the setters and getters of the `Bug` class.
    - It creates a new `Bug` object.
    - It sets the title, description, and priority using the setters.
    - It uses `assertEquals` to assert that the getters return the expected values.
4. **`testToString`:** Tests the `toString()` method of the `Bug` class.
    - It creates a new `Bug` object.
    - It uses `assertEquals` to assert that the `toString()` method returns the expected string representation of the `Bug` object.

**Remember:**

- These are basic test cases and you should add more tests to cover all the functionalities and edge cases of the `Bug` class.
- This assumes the `Bug` class has the following attributes and methods:
    - `title` (String)
    - `description` (String)
    - `priority` (String)
    - `getTitle()`, `getDescription()`, `getPriority()`, `setTitle()`, `setDescription()`, `setPriority()`, and `toString()`.
- You may need to modify the test cases based on the actual implementation of the `Bug` class. 
