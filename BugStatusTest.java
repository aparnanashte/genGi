```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugStatusTest {

    @Test
    void testToString() {
        BugStatus status = BugStatus.OPEN;
        assertEquals("OPEN", status.toString());

        status = BugStatus.IN_PROGRESS;
        assertEquals("IN_PROGRESS", status.toString());

        status = BugStatus.RESOLVED;
        assertEquals("RESOLVED", status.toString());

        status = BugStatus.CLOSED;
        assertEquals("CLOSED", status.toString());
    }
}
```

**Explanation:**

* **Import Statements:** We import `org.junit.jupiter.api.Test` for our test method and `static org.junit.jupiter.api.Assertions.*` to use the `assertEquals` method.
* **Test Class:** The `BugStatusTest` class contains a test method to test the `toString()` method of the `BugStatus` class.
* **Test Method:** The `testToString()` method checks that the `toString()` method returns the expected string for each status.
* **Assertions:** The `assertEquals` method is used to verify that the actual string returned by `toString()` matches the expected string.

**Assumption:**

This test assumes that the `BugStatus` class has an enum with the following values:

* OPEN
* IN_PROGRESS
* RESOLVED
* CLOSED

**To Run the Test:**

1. Ensure you have JUnit 5 installed in your project.
2. Compile and run the test class.

**Note:**

This is a basic test case. You can add more test cases to cover other methods or functionality of the `BugStatus` class.
