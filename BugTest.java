```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugConstructor() {
        Bug bug = new Bug(1L, "Bug Title", "Bug Description", "Open");
        assertEquals(1L, bug.getId());
        assertEquals("Bug Title", bug.getTitle());
        assertEquals("Bug Description", bug.getDescription());
        assertEquals("Open", bug.getStatus());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setId(1L);
        bug.setTitle("Bug Title");
        bug.setDescription("Bug Description");
        bug.setStatus("Open");

        assertEquals(1L, bug.getId());
        assertEquals("Bug Title", bug.getTitle());
        assertEquals("Bug Description", bug.getDescription());
        assertEquals("Open", bug.getStatus());
    }

    @Test
    void testToString() {
        Bug bug = new Bug(1L, "Bug Title", "Bug Description", "Open");
        String expectedString = "Bug{id=1, title='Bug Title', description='Bug Description', status='Open'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

* **Import Statements:** Imports the necessary classes from the `com.bug.api.model.domain` package and the `org.junit.jupiter.api` package.
* **Test Class:** Defines a `BugTest` class with `@Test` annotations to mark each test method.
* **`testBugConstructor()`:**
    * Creates a `Bug` object using the constructor.
    * Asserts that the expected values are set correctly using `assertEquals()`.
* **`testSettersAndGetters()`:**
    * Creates a `Bug` object.
    * Sets the properties using the setters.
    * Retrieves the values using the getters.
    * Asserts that the expected values are retrieved.
* **`testToString()`:**
    * Creates a `Bug` object.
    * Calls the `toString()` method.
    * Asserts that the expected string representation is returned.

**Note:**

* This test case assumes that the `Bug` class has the following properties:
    * `id` (Long)
    * `title` (String)
    * `description` (String)
    * `status` (String)
* The `assertEquals()` method is used to verify the expected values.
* You can add more test cases to cover other functionality or scenarios in your `Bug` class. 
