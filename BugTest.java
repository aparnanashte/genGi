```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugConstructor() {
        Bug bug = new Bug("Test bug", "This is a test bug", "HIGH");
        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testGettersAndSetters() {
        Bug bug = new Bug();
        bug.setTitle("Test bug");
        bug.setDescription("This is a test bug");
        bug.setPriority("HIGH");
        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Test bug", "This is a test bug", "HIGH");
        String expectedString = "Bug{title='Test bug', description='This is a test bug', priority='HIGH'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Import Statements:**

```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
```

**Explanation of Test Cases:**

1. **`testBugConstructor()`:**
   - Creates a new `Bug` object using the constructor.
   - Asserts that the values passed to the constructor are correctly set in the object's fields.

2. **`testGettersAndSetters()`:**
   - Creates a new `Bug` object.
   - Sets values for the `title`, `description`, and `priority` fields using the setters.
   - Asserts that the getter methods return the expected values.

3. **`testToString()`:**
   - Creates a new `Bug` object.
   - Calls the `toString()` method on the object.
   - Asserts that the returned string matches the expected format.

**Note:**

- This is a basic example and can be extended to cover more complex scenarios and edge cases in your `Bug` class.
- You can add more test cases for different constructors, methods, or validation logic.
- Make sure to replace `"com.bug.api.model.domain.Bug"` with the actual package and class name of your `Bug` class.
