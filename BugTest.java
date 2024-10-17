```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugTest {

    @Test
    void testConstructor() {
        Bug bug = new Bug(1L, "Bug Title", "Bug Description", "HIGH", "OPEN");
        assertEquals(1L, bug.getId());
        assertEquals("Bug Title", bug.getTitle());
        assertEquals("Bug Description", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("OPEN", bug.getStatus());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setId(1L);
        bug.setTitle("Bug Title");
        bug.setDescription("Bug Description");
        bug.setPriority("HIGH");
        bug.setStatus("OPEN");

        assertEquals(1L, bug.getId());
        assertEquals("Bug Title", bug.getTitle());
        assertEquals("Bug Description", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("OPEN", bug.getStatus());
    }

    @Test
    void testToString() {
        Bug bug = new Bug(1L, "Bug Title", "Bug Description", "HIGH", "OPEN");
        String expectedToString = "Bug{id=1, title='Bug Title', description='Bug Description', priority='HIGH', status='OPEN'}";
        assertEquals(expectedToString, bug.toString());
    }
}
```

**Explanation:**

* **Imports:** We import the `Bug` class from the `com.bug.api.model.domain` package and the `Assertions` class from JUnit for assertion methods.
* **Constructor Test:** This test verifies that the constructor correctly initializes the Bug object with provided values.
* **Setters and Getters Test:** This test demonstrates how to use the setter methods to set the values of the Bug object and then use the getter methods to retrieve those values, ensuring they are consistent.
* **ToString Test:** This test ensures that the `toString()` method returns a well-formatted string representation of the Bug object.

**Note:** This is a basic example, and you may need to add more test cases to cover various scenarios and edge cases depending on the complexity of your `Bug` class. For instance, you might want to test:

* **Validation:**  Add tests for input validation (e.g., ensuring priority and status values are valid).
* **Equality:**  Implement and test the `equals()` and `hashCode()` methods.
* **Other methods:** If your `Bug` class has additional methods, create test cases to cover them. 
