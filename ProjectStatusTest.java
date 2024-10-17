```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProjectStatusTest {

    @Test
    void testConstructor() {
        // Arrange
        String name = "Test Project";
        String description = "Test project description";
        ProjectStatus.Status status = ProjectStatus.Status.IN_PROGRESS;

        // Act
        ProjectStatus projectStatus = new ProjectStatus(name, description, status);

        // Assert
        assertEquals(name, projectStatus.getName());
        assertEquals(description, projectStatus.getDescription());
        assertEquals(status, projectStatus.getStatus());
    }

    @Test
    void testGettersAndSetters() {
        // Arrange
        ProjectStatus projectStatus = new ProjectStatus();

        // Act
        projectStatus.setName("Test Project");
        projectStatus.setDescription("Test project description");
        projectStatus.setStatus(ProjectStatus.Status.COMPLETED);

        // Assert
        assertEquals("Test Project", projectStatus.getName());
        assertEquals("Test project description", projectStatus.getDescription());
        assertEquals(ProjectStatus.Status.COMPLETED, projectStatus.getStatus());
    }

    @Test
    void testToString() {
        // Arrange
        ProjectStatus projectStatus = new ProjectStatus("Test Project", "Test project description", ProjectStatus.Status.IN_PROGRESS);

        // Act
        String toString = projectStatus.toString();

        // Assert
        assertTrue(toString.contains("Test Project"));
        assertTrue(toString.contains("Test project description"));
        assertTrue(toString.contains("IN_PROGRESS"));
    }
}
```

**Explanation:**

* **Import Statement:**  Imports the necessary JUnit 5 classes for testing.
* **Test Class:**  Creates a test class named `ProjectStatusTest` to hold the test methods.
* **Test Methods:**
    * `testConstructor()`:  Tests the constructor of the `ProjectStatus` class by creating an instance with known values and asserting the expected values.
    * `testGettersAndSetters()`:  Tests the getter and setter methods of the `ProjectStatus` class by setting values and then retrieving them to verify they match.
    * `testToString()`:  Tests the `toString()` method of the `ProjectStatus` class by creating an instance, calling `toString()`, and asserting that the string representation contains the expected values.

**Assumptions:**

* You have a `ProjectStatus` class with the following structure:

```java
public class ProjectStatus {

    private String name;
    private String description;
    private Status status;

    // Constructor, getters, setters, and toString() method
    // ...

    public enum Status {
        IN_PROGRESS,
        COMPLETED,
        CANCELLED
    }
}
```

**How to Run the Test:**

1. Ensure you have JUnit 5 installed in your project.
2. Compile and run the `ProjectStatusTest` class.
3. The tests will be executed, and you can see the results in your IDE or test runner.

This is a basic example, and you may need to add more test cases depending on the complexity of your `ProjectStatus` class and the functionality you want to test.