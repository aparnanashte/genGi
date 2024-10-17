```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugStatusTest {

    @Test
    void testBugStatusCreation() {
        BugStatus bugStatus = new BugStatus("Open", "Description");
        assertEquals("Open", bugStatus.getStatus());
        assertEquals("Description", bugStatus.getDescription());
    }

    @Test
    void testBugStatusGetters() {
        BugStatus bugStatus = new BugStatus("Resolved", "Bug fixed");
        assertEquals("Resolved", bugStatus.getStatus());
        assertEquals("Bug fixed", bugStatus.getDescription());
    }

    @Test
    void testBugStatusSetters() {
        BugStatus bugStatus = new BugStatus("In Progress", "Working on the bug");
        bugStatus.setStatus("Closed");
        bugStatus.setDescription("Bug closed successfully");
        assertEquals("Closed", bugStatus.getStatus());
        assertEquals("Bug closed successfully", bugStatus.getDescription());
    }

    @Test
    void testBugStatusToString() {
        BugStatus bugStatus = new BugStatus("Pending", "Waiting for more information");
        assertEquals("BugStatus{status='Pending', description='Waiting for more information'}", bugStatus.toString());
    }
}
```

**Import Statements:**

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
```

**Explanation:**

* **Import Statements:** Import necessary classes from JUnit for writing test cases.
* **Test Class:** Define a test class named `BugStatusTest`.
* **Test Methods:** Define test methods for each functionality of the `BugStatus` class:
    * `testBugStatusCreation()`: Tests the creation of a `BugStatus` object with initial status and description.
    * `testBugStatusGetters()`: Tests the `getStatus()` and `getDescription()` methods.
    * `testBugStatusSetters()`: Tests the `setStatus()` and `setDescription()` methods.
    * `testBugStatusToString()`: Tests the `toString()` method.
* **Assertions:** Use `assertEquals()` to verify the expected values against the actual values.

**Note:** Replace the `BugStatus` class with your actual class definition. You may need to adjust the test cases based on the specific methods and functionalities of your class.
