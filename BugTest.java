```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testConstructor() {
        Bug bug = new Bug(1L, "Test Bug", "This is a test bug.", "HIGH", "John Doe", "2023-03-08T10:00:00Z");
        assertEquals(1L, bug.getId());
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("John Doe", bug.getReporter());
        assertEquals("2023-03-08T10:00:00Z", bug.getCreatedAt());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setId(1L);
        bug.setTitle("Test Bug");
        bug.setDescription("This is a test bug.");
        bug.setPriority("HIGH");
        bug.setReporter("John Doe");
        bug.setCreatedAt("2023-03-08T10:00:00Z");

        assertEquals(1L, bug.getId());
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("John Doe", bug.getReporter());
        assertEquals("2023-03-08T10:00:00Z", bug.getCreatedAt());
    }

    @Test
    void testToString() {
        Bug bug = new Bug(1L, "Test Bug", "This is a test bug.", "HIGH", "John Doe", "2023-03-08T10:00:00Z");
        String expected = "Bug{id=1, title='Test Bug', description='This is a test bug.', priority='HIGH', reporter='John Doe', createdAt='2023-03-08T10:00:00Z'}";
        assertEquals(expected, bug.toString());
    }
}
```

**Explanation:**

* **Import Statements:** We import the `Bug` class from the relevant package and the necessary JUnit assertions.
* **Test Methods:**
    * **`testConstructor()`:** This method tests the constructor of the `Bug` class. It creates a `Bug` object with specific values and then asserts that the values are correctly set using the `assertEquals()` method.
    * **`testSettersAndGetters()`:** This method tests the setter and getter methods of the `Bug` class. It sets values using the setter methods and then retrieves them using the getter methods, asserting that the values are consistent.
    * **`testToString()`:** This method tests the `toString()` method of the `Bug` class. It creates a `Bug` object and asserts that the `toString()` method returns the expected string representation of the object.

**Note:** 

* You'll need to adapt this test case to fit the specific structure and behavior of your `Bug` class.
* Make sure to add more test cases based on the specific requirements and functionalities of your `Bug` class.
* You may need to adjust the `expected` string in the `testToString()` method depending on the actual implementation of your `toString()` method.