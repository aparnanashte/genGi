```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugCreation() {
        Bug bug = new Bug("Test bug", "This is a test bug", "High");

        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("High", bug.getPriority());
    }

    @Test
    void testGettersAndSetters() {
        Bug bug = new Bug();

        bug.setTitle("New title");
        assertEquals("New title", bug.getTitle());

        bug.setDescription("New description");
        assertEquals("New description", bug.getDescription());

        bug.setPriority("Low");
        assertEquals("Low", bug.getPriority());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Test bug", "This is a test bug", "High");
        String expectedToString = "Bug{title='Test bug', description='This is a test bug', priority='High'}";

        assertEquals(expectedToString, bug.toString());
    }
}
```

**Explanation:**

1. **Imports:**
   - `com.bug.api.model.domain.Bug`: Imports the `Bug` class being tested.
   - `org.junit.jupiter.api.Test`: Imports the `@Test` annotation for marking test methods.
   - `static org.junit.jupiter.api.Assertions.*`: Imports all static assertion methods from `Assertions` class.

2. **Test Class:**
   - `public class BugTest` declares the test class named `BugTest`.

3. **Test Methods:**
   - `testBugCreation()`:
     - Creates a new `Bug` object with initial values.
     - Uses `assertEquals()` to assert that the values set during creation are correctly retrieved using getters.
   - `testGettersAndSetters()`:
     - Creates a new `Bug` object.
     - Sets values using setters.
     - Uses `assertEquals()` to assert that the values are correctly set and retrieved.
   - `testToString()`:
     - Creates a new `Bug` object.
     - Uses `assertEquals()` to assert that the `toString()` method returns the expected string representation of the `Bug` object.

**Note:**

- You can add more test cases based on the specific functionality and attributes of your `Bug` class.
- Adjust the test values and expected outcomes according to your requirements.
- Remember to adapt the test class name and import statements accordingly.
- Run these tests using JUnit to ensure the correctness of your `Bug` class.
