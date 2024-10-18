```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProjectStatusTest {

    @Test
    void testConstructor() {
        // Arrange
        String name = "Test Project";
        String status = "In Progress";

        // Act
        ProjectStatus projectStatus = new ProjectStatus(name, status);

        // Assert
        assertEquals(name, projectStatus.getName());
        assertEquals(status, projectStatus.getStatus());
    }

    @Test
    void testGettersAndSetters() {
        // Arrange
        ProjectStatus projectStatus = new ProjectStatus();

        // Act
        projectStatus.setName("Test Project");
        projectStatus.setStatus("Completed");

        // Assert
        assertEquals("Test Project", projectStatus.getName());
        assertEquals("Completed", projectStatus.getStatus());
    }

    @Test
    void testToString() {
        // Arrange
        ProjectStatus projectStatus = new ProjectStatus("Test Project", "In Progress");

        // Act
        String toString = projectStatus.toString();

        // Assert
        assertTrue(toString.contains("Test Project"));
        assertTrue(toString.contains("In Progress"));
    }
}
```

**Assumptions:**

* You have a class named `ProjectStatus` with the following attributes:
    * `name` (String)
    * `status` (String)
* The `ProjectStatus` class has getters and setters for the attributes.
* The `ProjectStatus` class has a `toString()` method.

**Explanation:**

* **`testConstructor()`:** This test case verifies that the constructor correctly initializes the `name` and `status` attributes.
* **`testGettersAndSetters()`:** This test case checks if the getter and setter methods work as expected.
* **`testToString()`:** This test case ensures that the `toString()` method returns a string containing the project name and status.

**Import Statements:**

* `org.junit.jupiter.api.Test`:  Imports the `Test` annotation to mark methods as test cases.
* `static org.junit.jupiter.api.Assertions.*`: Imports static methods from `Assertions` class for assertions.

**To run this test case:**

1. Save the code as `ProjectStatusTest.java`.
2. Compile the test case and the `ProjectStatus` class.
3. Run the test case using your preferred testing framework (e.g., JUnit).

Remember to adapt this test case to the specific implementation of your `ProjectStatus` class.
