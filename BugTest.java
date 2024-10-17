```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.bug.api.model.domain.Bug;

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
    void testAccessors() {
        Bug bug = new Bug();
        bug.setId(1L);
        bug.setTitle("Test bug");
        bug.setDescription("This is a test bug");
        bug.setPriority("HIGH");

        assertEquals(1L, bug.getId());
        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testToString() {
        Bug bug = new Bug(1L, "Test bug", "This is a test bug", "HIGH");
        String expectedString = "Bug{" +
                "id=1," +
                "title='Test bug'," +
                "description='This is a test bug'," +
                "priority='HIGH'" +
                "}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

* **Import Statements:**  
    * `import org.junit.jupiter.api.Test;` imports the `@Test` annotation for defining test methods.
    * `import static org.junit.jupiter.api.Assertions.*;` imports static assertion methods for validating test results.
    * `import com.bug.api.model.domain.Bug;` imports the `Bug` class under test.

* **Test Class:**
    * The `BugTest` class contains test methods for the `Bug` class.

* **Test Methods:**
    * **`testConstructor()`:**
        * Creates a `Bug` object using the constructor.
        * Uses `assertEquals` to verify the values of the fields.
    * **`testAccessors()`:**
        * Creates a `Bug` object.
        * Uses the setter methods to set the values of the fields.
        * Uses `assertEquals` to verify the values of the fields using the getter methods.
    * **`testToString()`:**
        * Creates a `Bug` object.
        * Uses `assertEquals` to verify the expected string representation of the `Bug` object using the `toString()` method. 

**Important Notes:**

* This is a basic example of JUnit test cases. You can add more test cases to cover other methods and scenarios of the `Bug` class.
* Replace `com.bug.api.model.domain.Bug` with the actual package and class name of your `Bug` class.
* Make sure to run these tests using a JUnit runner to execute them and check for any errors or failures. 
