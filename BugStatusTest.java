```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugStatusTest {

    @Test
    void testNewBugStatus() {
        BugStatus bugStatus = new BugStatus("NEW");
        assertEquals("NEW", bugStatus.getStatus());
    }

    @Test
    void testInProgressBugStatus() {
        BugStatus bugStatus = new BugStatus("IN_PROGRESS");
        assertEquals("IN_PROGRESS", bugStatus.getStatus());
    }

    @Test
    void testResolvedBugStatus() {
        BugStatus bugStatus = new BugStatus("RESOLVED");
        assertEquals("RESOLVED", bugStatus.getStatus());
    }

    @Test
    void testClosedBugStatus() {
        BugStatus bugStatus = new BugStatus("CLOSED");
        assertEquals("CLOSED", bugStatus.getStatus());
    }

    @Test
    void testInvalidBugStatus() {
        assertThrows(IllegalArgumentException.class, () -> new BugStatus("INVALID"));
    }
}
```

**Import Statements:**

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
```

**Explanation:**

* **`BugStatusTest` class:** This class contains the JUnit test cases for the `BugStatus` class.
* **`@Test` annotation:** Marks each method as a test case.
* **`BugStatus` class:** The class under test.
* **`testNewBugStatus()`, `testInProgressBugStatus()`, `testResolvedBugStatus()`, `testClosedBugStatus()`:** Test cases for valid bug status values. These tests create `BugStatus` objects with valid statuses and assert that the `getStatus()` method returns the expected status.
* **`testInvalidBugStatus()`:** Test case for an invalid bug status. This test attempts to create a `BugStatus` object with an invalid status and asserts that an `IllegalArgumentException` is thrown.
* **`assertEquals()`:** Asserts that two values are equal.
* **`assertThrows()`:** Asserts that a specific exception is thrown.

**To run these tests:**

1. Make sure you have JUnit 5 installed in your project.
2. Add the test class to your project.
3. Run the tests using your IDE or a test runner.

**Note:** The actual implementation of the `BugStatus` class is not provided here. You will need to create the `BugStatus` class with the appropriate constructor and `getStatus()` method.