```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProjectStatusTest {

    @Test
    void testConstructor() {
        ProjectStatus status = new ProjectStatus("In Progress", "Description of current progress");
        assertEquals("In Progress", status.getStatus());
        assertEquals("Description of current progress", status.getDescription());
    }

    @Test
    void testGetStatus() {
        ProjectStatus status = new ProjectStatus("Completed", "Project successfully finished.");
        assertEquals("Completed", status.getStatus());
    }

    @Test
    void testSetStatus() {
        ProjectStatus status = new ProjectStatus("In Progress", "");
        status.setStatus("On Hold");
        assertEquals("On Hold", status.getStatus());
    }

    @Test
    void testGetDescription() {
        ProjectStatus status = new ProjectStatus("In Progress", "Working on feature X.");
        assertEquals("Working on feature X.", status.getDescription());
    }

    @Test
    void testSetDescription() {
        ProjectStatus status = new ProjectStatus("In Progress", "");
        status.setDescription("Waiting for external input.");
        assertEquals("Waiting for external input.", status.getDescription());
    }

    @Test
    void testToString() {
        ProjectStatus status = new ProjectStatus("Completed", "All tasks completed and reviewed.");
        String expectedString = "ProjectStatus{status='Completed', description='All tasks completed and reviewed.'}";
        assertEquals(expectedString, status.toString());
    }
}
```

**Explanation:**

- The `@Test` annotation marks each method as a JUnit test case.
- `assertEquals` asserts that the actual value matches the expected value.
- The tests cover the constructor, getters, setters, and `toString` method.

**Important:**

- Replace `ProjectStatus` with the actual name of your class.
- Make sure your `ProjectStatus` class has the corresponding methods and properties.
- You may need to add additional test cases depending on the specific functionality of your `ProjectStatus` class.

This example provides a basic test suite. You can extend it by adding more scenarios, edge cases, and boundary conditions to ensure comprehensive testing.
