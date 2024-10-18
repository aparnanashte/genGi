```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProjectStatusTest {

    @Test
    void testConstructor() {
        ProjectStatus status = new ProjectStatus("Test Project", "In Progress", "John Doe");
        assertEquals("Test Project", status.getProjectName());
        assertEquals("In Progress", status.getStatus());
        assertEquals("John Doe", status.getAssignedTo());
    }

    @Test
    void testGettersAndSetters() {
        ProjectStatus status = new ProjectStatus();
        status.setProjectName("Test Project");
        status.setStatus("Completed");
        status.setAssignedTo("Jane Doe");

        assertEquals("Test Project", status.getProjectName());
        assertEquals("Completed", status.getStatus());
        assertEquals("Jane Doe", status.getAssignedTo());
    }

    @Test
    void testToString() {
        ProjectStatus status = new ProjectStatus("Test Project", "In Progress", "John Doe");
        String expectedString = "Project: Test Project, Status: In Progress, Assigned to: John Doe";
        assertEquals(expectedString, status.toString());
    }

}
```

**Import statements:**

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
```

**Explanation:**

* **Import Statements:** These lines import the necessary classes from JUnit 5 for writing test cases.
* **Test Class:** `ProjectStatusTest` is the test class that contains the test methods.
* **Test Methods:** Each test method tests a specific aspect of the `ProjectStatus` class.
* **Assertions:** The `assertEquals()` method from JUnit is used to verify the expected results of each test.
* **Constructor Test:** This test checks that the constructor correctly initializes the `ProjectStatus` object with the provided values.
* **Getter and Setter Test:** This test verifies that the getter and setter methods correctly access and modify the object's properties.
* **ToString Test:** This test verifies that the `toString()` method returns the expected string representation of the object.

**Assumptions:**

* The `ProjectStatus` class has the following attributes:
    * `projectName` (String)
    * `status` (String)
    * `assignedTo` (String)
* The `ProjectStatus` class has the following methods:
    * Constructor
    * Getter and setter methods for each attribute
    * `toString()` method

**How to run the tests:**

1. Ensure that JUnit 5 is included in your project dependencies.
2. Compile the test class.
3. Run the test class using your IDE's test runner or command line tools.

This test case provides a basic starting point for testing the `ProjectStatus` class. You can add more test cases to cover all the functionality and edge cases of your class.
