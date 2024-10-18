```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugStatusTest {

    @Test
    void testBugStatus_ValidStatus() {
        BugStatus status = BugStatus.valueOf("OPEN");
        assertEquals("OPEN", status.name());
    }

    @Test
    void testBugStatus_InvalidStatus() {
        assertThrows(IllegalArgumentException.class, () -> BugStatus.valueOf("INVALID"));
    }

    @Test
    void testBugStatus_ValidStatus_CaseInsensitive() {
        BugStatus status = BugStatus.valueOf("open");
        assertEquals("OPEN", status.name());
    }
}
```

**Explanation:**

* **Import Statements:**
    * `org.junit.jupiter.api.Test`: Imports the `Test` annotation for marking test methods.
    * `static org.junit.jupiter.api.Assertions.*`: Imports static methods from `Assertions` class for asserting test results.
* **Test Class:**
    * `BugStatusTest`: Defines the test class for testing the `BugStatus` class.
* **Test Methods:**
    * `testBugStatus_ValidStatus()`: Tests the `valueOf()` method with a valid status value ("OPEN").
        * `assertEquals("OPEN", status.name())`: Asserts that the returned `BugStatus` object has the correct name ("OPEN").
    * `testBugStatus_InvalidStatus()`: Tests the `valueOf()` method with an invalid status value ("INVALID").
        * `assertThrows(IllegalArgumentException.class, () -> BugStatus.valueOf("INVALID"))`: Asserts that an `IllegalArgumentException` is thrown when an invalid status is provided.
    * `testBugStatus_ValidStatus_CaseInsensitive()`: Tests the `valueOf()` method with a valid status value in lowercase ("open").
        * `assertEquals("OPEN", status.name())`: Asserts that the returned `BugStatus` object has the correct name ("OPEN").

**Note:**

* This code assumes that you have a `BugStatus` class defined with the following code:

```java
public enum BugStatus {
    OPEN,
    IN_PROGRESS,
    RESOLVED,
    CLOSED
}
```

* You can modify the test cases to cover additional scenarios and functionalities of your `BugStatus` class.
* Make sure to replace `BugStatus` with the actual name of your enum class.
* The test cases provided are basic examples. You can add more complex scenarios to your test suite.
