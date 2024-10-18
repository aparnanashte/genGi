```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugStatusTest {

    @Test
    void testBugStatusCreation() {
        // Arrange
        String status = "Open";
        BugStatus bugStatus = new BugStatus(status);

        // Assert
        assertEquals(status, bugStatus.getStatus());
    }

    @Test
    void testBugStatusToString() {
        // Arrange
        BugStatus bugStatus = new BugStatus("Closed");

        // Act
        String expectedString = "BugStatus{status='Closed'}";
        String actualString = bugStatus.toString();

        // Assert
        assertEquals(expectedString, actualString);
    }

    @Test
    void testEquals() {
        // Arrange
        BugStatus bugStatus1 = new BugStatus("Open");
        BugStatus bugStatus2 = new BugStatus("Open");
        BugStatus bugStatus3 = new BugStatus("Closed");

        // Assert
        assertTrue(bugStatus1.equals(bugStatus2));
        assertFalse(bugStatus1.equals(bugStatus3));
    }

    @Test
    void testHashCode() {
        // Arrange
        BugStatus bugStatus1 = new BugStatus("Open");
        BugStatus bugStatus2 = new BugStatus("Open");

        // Assert
        assertEquals(bugStatus1.hashCode(), bugStatus2.hashCode());
    }
}
```

**Note:** This code assumes you have a class named `BugStatus` with a constructor that takes a `String` representing the status and a `getStatus()` method to retrieve the status. You may need to adjust the code based on your actual `BugStatus` class implementation. 

**Import statement:**

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
```

This import statement imports the necessary classes for writing JUnit 5 tests. 
