```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testConstructor() {
        Bug bug = new Bug(1L, "Test bug", "This is a test bug", "HIGH", "John Doe", "OPEN");
        assertEquals(1L, bug.getId());
        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("John Doe", bug.getAssignedTo());
        assertEquals("OPEN", bug.getStatus());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setId(2L);
        bug.setTitle("Another test bug");
        bug.setDescription("This is another test bug");
        bug.setPriority("LOW");
        bug.setAssignedTo("Jane Doe");
        bug.setStatus("CLOSED");

        assertEquals(2L, bug.getId());
        assertEquals("Another test bug", bug.getTitle());
        assertEquals("This is another test bug", bug.getDescription());
        assertEquals("LOW", bug.getPriority());
        assertEquals("Jane Doe", bug.getAssignedTo());
        assertEquals("CLOSED", bug.getStatus());
    }

    @Test
    void testToString() {
        Bug bug = new Bug(3L, "Bug title", "Bug description", "MEDIUM", "Bob Smith", "IN_PROGRESS");
        String expectedString = "Bug{id=3, title='Bug title', description='Bug description', priority='MEDIUM', assignedTo='Bob Smith', status='IN_PROGRESS'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

* **Imports:**
    * `com.bug.api.model.domain.Bug`: Imports the `Bug` class.
    * `org.junit.jupiter.api.Test`: Imports the `Test` annotation for defining test methods.
    * `static org.junit.jupiter.api.Assertions.*`: Imports all assertion methods from JUnit for comparing expected and actual values.
* **Test Cases:**
    * **`testConstructor()`:** Tests the constructor of the `Bug` class by creating a new instance and verifying that the values are correctly set.
    * **`testSettersAndGetters()`:** Tests the setter and getter methods of the `Bug` class by setting values and then retrieving them to ensure they are correctly stored and retrieved.
    * **`testToString()`:** Tests the `toString()` method of the `Bug` class by creating a `Bug` object and comparing the output of `toString()` with an expected string.

**Running the Tests:**

1. Make sure you have JUnit installed in your project.
2. Compile the code.
3. Run the test class.

The test cases will run, and you will see the results in the console. If any assertion fails, the test will fail, indicating a potential issue with the `Bug` class.
