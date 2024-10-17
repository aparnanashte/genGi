```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProjectStatusTest {

    @Test
    void testConstructor() {
        ProjectStatus status = new ProjectStatus("In Progress", "Some progress made.");
        assertEquals("In Progress", status.getStatus());
        assertEquals("Some progress made.", status.getDescription());
    }

    @Test
    void testSetStatus() {
        ProjectStatus status = new ProjectStatus("In Progress", "Some progress made.");
        status.setStatus("Completed");
        assertEquals("Completed", status.getStatus());
    }

    @Test
    void testSetDescription() {
        ProjectStatus status = new ProjectStatus("In Progress", "Some progress made.");
        status.setDescription("Project successfully completed.");
        assertEquals("Project successfully completed.", status.getDescription());
    }

    @Test
    void testToString() {
        ProjectStatus status = new ProjectStatus("In Progress", "Some progress made.");
        String expectedString = "ProjectStatus{status='In Progress', description='Some progress made.'}";
        assertEquals(expectedString, status.toString());
    }
}
```

**Explanation:**

1. **Import Statements:** The test case imports the necessary JUnit 5 classes for testing.
2. **Test Class:** The `ProjectStatusTest` class contains the test methods.
3. **`testConstructor()`:** This test method verifies the constructor of the `ProjectStatus` class by creating an instance and asserting the initial status and description values.
4. **`testSetStatus()`:** This test method verifies the `setStatus()` method by setting a new status and asserting the updated value.
5. **`testSetDescription()`:** This test method verifies the `setDescription()` method by setting a new description and asserting the updated value.
6. **`testToString()`:** This test method verifies the `toString()` method by comparing the expected string representation with the actual string returned by the method.

**To use this test case:**

1. Make sure you have JUnit 5 added to your project's dependencies.
2. Create a class named `ProjectStatus` with the methods tested in this example.
3. Run the test case to verify the functionality of the `ProjectStatus` class.

This example provides a basic set of test cases. You can add more test methods to cover different scenarios and edge cases of your `ProjectStatus` class.
