```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugStatusTest {

    @Test
    void testOpenStatus() {
        BugStatus status = BugStatus.OPEN;
        assertEquals("OPEN", status.getStatus());
    }

    @Test
    void testInProgressStatus() {
        BugStatus status = BugStatus.IN_PROGRESS;
        assertEquals("IN_PROGRESS", status.getStatus());
    }

    @Test
    void testResolvedStatus() {
        BugStatus status = BugStatus.RESOLVED;
        assertEquals("RESOLVED", status.getStatus());
    }

    @Test
    void testClosedStatus() {
        BugStatus status = BugStatus.CLOSED;
        assertEquals("CLOSED", status.getStatus());
    }

    @Test
    void testValueOf() {
        assertEquals(BugStatus.OPEN, BugStatus.valueOf("OPEN"));
        assertEquals(BugStatus.IN_PROGRESS, BugStatus.valueOf("IN_PROGRESS"));
        assertEquals(BugStatus.RESOLVED, BugStatus.valueOf("RESOLVED"));
        assertEquals(BugStatus.CLOSED, BugStatus.valueOf("CLOSED"));
    }

    @Test
    void testValueOfInvalidStatus() {
        assertThrows(IllegalArgumentException.class, () -> BugStatus.valueOf("INVALID_STATUS"));
    }
}
```

**BugStatus Class (Assuming):**

```java
public enum BugStatus {
    OPEN("OPEN"),
    IN_PROGRESS("IN_PROGRESS"),
    RESOLVED("RESOLVED"),
    CLOSED("CLOSED");

    private final String status;

    BugStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
```

**Explanation:**

1. **Import Statements:**
   - `org.junit.jupiter.api.Test`: Imports the `Test` annotation for marking test methods.
   - `static org.junit.jupiter.api.Assertions.*`: Imports assertion methods for verifying test results.

2. **Test Methods:**
   - **`testOpenStatus()`:**
     - Creates a `BugStatus` object with the `OPEN` value.
     - Uses `assertEquals()` to check if the `getStatus()` method returns "OPEN".
   - **`testInProgressStatus()`**, **`testResolvedStatus()`**, **`testClosedStatus()`**: Similar to `testOpenStatus()`, but for other status values.
   - **`testValueOf()`:**
     - Tests the `valueOf()` method with valid status strings and asserts that the correct `BugStatus` enum values are returned.
   - **`testValueOfInvalidStatus()`:**
     - Uses `assertThrows()` to check that an `IllegalArgumentException` is thrown when an invalid status string is passed to `valueOf()`.

**Running the Tests:**

1. Ensure you have JUnit Jupiter installed in your project.
2. Run the `BugStatusTest` class.
3. The tests will execute, and you can see the results in your IDE or test runner.

**Note:** You need to have the `BugStatus` class defined in your project for these tests to work.
