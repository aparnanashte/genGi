```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugStatusTest {

    @Test
    void testConstructor() {
        BugStatus bugStatus = new BugStatus("OPEN", "Assigned to John Doe", "Low");
        assertEquals("OPEN", bugStatus.getStatus());
        assertEquals("Assigned to John Doe", bugStatus.getDescription());
        assertEquals("Low", bugStatus.getPriority());
    }

    @Test
    void testGetters() {
        BugStatus bugStatus = new BugStatus("OPEN", "Assigned to John Doe", "Low");
        assertEquals("OPEN", bugStatus.getStatus());
        assertEquals("Assigned to John Doe", bugStatus.getDescription());
        assertEquals("Low", bugStatus.getPriority());
    }

    @Test
    void testSetters() {
        BugStatus bugStatus = new BugStatus("OPEN", "Assigned to John Doe", "Low");
        bugStatus.setStatus("CLOSED");
        bugStatus.setDescription("Fixed by John Doe");
        bugStatus.setPriority("High");
        assertEquals("CLOSED", bugStatus.getStatus());
        assertEquals("Fixed by John Doe", bugStatus.getDescription());
        assertEquals("High", bugStatus.getPriority());
    }

    @Test
    void testToString() {
        BugStatus bugStatus = new BugStatus("OPEN", "Assigned to John Doe", "Low");
        String expected = "BugStatus{status='OPEN', description='Assigned to John Doe', priority='Low'}";
        assertEquals(expected, bugStatus.toString());
    }
}
```

**Import Statements:**

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
```

**Explanation:**

* **`BugStatusTest`:** This is the class name for the JUnit test case.
* **`@Test`:** This annotation marks each method as a test case.
* **`testConstructor()`:** This test verifies the constructor of the `BugStatus` class by creating an instance and checking the initial values of its fields.
* **`testGetters()`:** This test verifies the getter methods of the `BugStatus` class by retrieving the values of its fields and comparing them to the expected values.
* **`testSetters()`:** This test verifies the setter methods of the `BugStatus` class by setting new values to the fields and then retrieving them to check if the values have been updated correctly.
* **`testToString()`:** This test verifies the `toString()` method of the `BugStatus` class by comparing the output of the method with the expected string representation.

**Note:**

* You need to have the `BugStatus` class defined in your project for these tests to run correctly.
* You can add more test cases as needed to cover all aspects of the `BugStatus` class.
