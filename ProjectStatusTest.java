```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProjectStatusTest {

    @Test
    void testConstructor() {
        // Arrange
        String name = "In Progress";
        String description = "Project is currently being worked on.";

        // Act
        ProjectStatus projectStatus = new ProjectStatus(name, description);

        // Assert
        assertEquals(name, projectStatus.getName());
        assertEquals(description, projectStatus.getDescription());
    }

    @Test
    void testGetters() {
        // Arrange
        ProjectStatus projectStatus = new ProjectStatus("Completed", "Project is finished.");

        // Act & Assert
        assertEquals("Completed", projectStatus.getName());
        assertEquals("Project is finished.", projectStatus.getDescription());
    }

    @Test
    void testSetters() {
        // Arrange
        ProjectStatus projectStatus = new ProjectStatus("In Progress", "Project is currently being worked on.");

        // Act
        projectStatus.setName("On Hold");
        projectStatus.setDescription("Project is temporarily paused.");

        // Assert
        assertEquals("On Hold", projectStatus.getName());
        assertEquals("Project is temporarily paused.", projectStatus.getDescription());
    }

    @Test
    void testToString() {
        // Arrange
        ProjectStatus projectStatus = new ProjectStatus("Completed", "Project is finished.");

        // Act
        String toStringOutput = projectStatus.toString();

        // Assert
        assertTrue(toStringOutput.contains("Completed"));
        assertTrue(toStringOutput.contains("Project is finished."));
    }
}
```

**Import statement:**

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
```

**Explanation:**

* **`@Test` annotation:** Marks each method as a test case.
* **`assertEquals()`:** Asserts that two values are equal.
* **`assertTrue()`:** Asserts that a condition is true.
* **`toStringOutput.contains()`:** Checks if a string contains a specific substring.
* **`ProjectStatus` class:** This is assumed to be the class you are testing. Replace this with the actual class name.

**Note:**

* You need to replace the placeholder comments with actual assertions based on the expected behavior of the `ProjectStatus` class.
* You may need to add more test cases depending on the functionality of the `ProjectStatus` class.
* This example assumes that the `ProjectStatus` class has a constructor, getters, setters, and a `toString()` method. If your class has different methods, you will need to adjust the test cases accordingly.
