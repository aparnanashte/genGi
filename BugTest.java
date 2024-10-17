```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testConstructor() {
        Bug bug = new Bug(1L, "Test bug", "This is a test bug", "HIGH");
        assertEquals(1L, bug.getId());
        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testGettersAndSetters() {
        Bug bug = new Bug();
        bug.setId(2L);
        bug.setTitle("Another bug");
        bug.setDescription("This is another bug");
        bug.setPriority("MEDIUM");

        assertEquals(2L, bug.getId());
        assertEquals("Another bug", bug.getTitle());
        assertEquals("This is another bug", bug.getDescription());
        assertEquals("MEDIUM", bug.getPriority());
    }

    @Test
    void testToString() {
        Bug bug = new Bug(3L, "Bug with toString", "This is a bug with a toString", "LOW");
        String expected = "Bug{id=3, title='Bug with toString', description='This is a bug with a toString', priority='LOW'}";
        assertEquals(expected, bug.toString());
    }
}
```

**Explanation:**

* **Import Statements:** We import the `Bug` class and necessary JUnit assertions.
* **Test Cases:**
    * **`testConstructor()`:**
        * Creates a `Bug` object using the constructor.
        * Asserts that the values set in the constructor are correctly assigned to the object's fields.
    * **`testGettersAndSetters()`:**
        * Creates a `Bug` object.
        * Uses the setters to modify the object's fields.
        * Uses the getters to retrieve the modified values and assert they are correct.
    * **`testToString()`:**
        * Creates a `Bug` object.
        * Uses `toString()` to get the string representation of the object.
        * Asserts that the string representation matches the expected format.

**Note:** This is a basic example, and you may need to add more test cases based on the specific requirements of your `Bug` class. For example, you might want to test:

* Validations on input data (e.g., non-null values, valid priority levels).
* The behavior of other methods in the `Bug` class.
* Edge cases and boundary conditions. 
