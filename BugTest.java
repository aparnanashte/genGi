```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugConstructor() {
        Bug bug = new Bug(1L, "Test Bug", "This is a test bug.", "HIGH", "PENDING");
        assertEquals(1L, bug.getId());
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("PENDING", bug.getStatus());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setId(1L);
        bug.setTitle("Test Bug");
        bug.setDescription("This is a test bug.");
        bug.setPriority("HIGH");
        bug.setStatus("PENDING");

        assertEquals(1L, bug.getId());
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("PENDING", bug.getStatus());
    }

    @Test
    void testToString() {
        Bug bug = new Bug(1L, "Test Bug", "This is a test bug.", "HIGH", "PENDING");
        String expectedString = "Bug{id=1, title='Test Bug', description='This is a test bug.', priority='HIGH', status='PENDING'}";
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

**Test Cases:**

- **testBugConstructor()**: Tests the constructor of the Bug class by creating a new Bug object and asserting the values of its fields.
- **testSettersAndGetters()**: Tests the setters and getters of the Bug class by setting the values of the fields and then asserting that the getters return the correct values.
- **testToString()**: Tests the toString() method of the Bug class by creating a new Bug object and asserting that the toString() method returns the expected string representation of the object.

**Assumptions:**

- The Bug class has a constructor that accepts the following parameters: id, title, description, priority, and status.
- The Bug class has setters and getters for all of its fields.
- The Bug class has a toString() method that returns a string representation of the object.

**Note:**

- You will need to replace `com.bug.api.model.domain.Bug` with the actual package and class name of your Bug class.
- You may need to add more test cases depending on the specific functionality of your Bug class.
