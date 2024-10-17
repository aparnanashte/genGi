```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testConstructor() {
        Bug bug = new Bug("Test bug", "This is a test bug.", "LOW");
        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("LOW", bug.getSeverity());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setTitle("New bug title");
        bug.setDescription("New bug description");
        bug.setSeverity("MEDIUM");

        assertEquals("New bug title", bug.getTitle());
        assertEquals("New bug description", bug.getDescription());
        assertEquals("MEDIUM", bug.getSeverity());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Bug title", "Bug description", "HIGH");
        String expectedString = "Bug{title='Bug title', description='Bug description', severity='HIGH'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Import Statement:**

```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
```

**Explanation:**

* **`import com.bug.api.model.domain.Bug;`:** Imports the `Bug` class from the specified package.
* **`import org.junit.jupiter.api.Test;`:** Imports the `Test` annotation from JUnit 5.
* **`import static org.junit.jupiter.api.Assertions.*;`:** Imports static assertion methods from JUnit 5 for easier use.

**Test Cases:**

* **`testConstructor()`:** Tests the constructor by creating a `Bug` object and verifying the initial values of the attributes.
* **`testSettersAndGetters()`:** Tests the setter and getter methods by setting values and then retrieving them.
* **`testToString()`:** Tests the `toString()` method by comparing the expected string representation of the `Bug` object.

This is a basic example of JUnit test cases for the `Bug` class. You can add more test cases to cover different scenarios and edge cases.
