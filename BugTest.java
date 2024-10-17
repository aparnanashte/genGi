```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugTest {

    @Test
    void testBugConstructor() {
        // Arrange
        String title = "Bug Title";
        String description = "Bug Description";
        String status = "Open";
        String priority = "High";
        String assignedTo = "John Doe";

        // Act
        Bug bug = new Bug(title, description, status, priority, assignedTo);

        // Assert
        assertEquals(title, bug.getTitle());
        assertEquals(description, bug.getDescription());
        assertEquals(status, bug.getStatus());
        assertEquals(priority, bug.getPriority());
        assertEquals(assignedTo, bug.getAssignedTo());
    }

    @Test
    void testGettersAndSetters() {
        // Arrange
        Bug bug = new Bug();

        // Act
        bug.setTitle("Bug Title");
        bug.setDescription("Bug Description");
        bug.setStatus("Open");
        bug.setPriority("High");
        bug.setAssignedTo("John Doe");

        // Assert
        assertEquals("Bug Title", bug.getTitle());
        assertEquals("Bug Description", bug.getDescription());
        assertEquals("Open", bug.getStatus());
        assertEquals("High", bug.getPriority());
        assertEquals("John Doe", bug.getAssignedTo());
    }
}
```

**Explanation:**

1. **Import Statements:** We import the necessary classes:
   - `com.bug.api.model.domain.Bug`: The class we are testing.
   - `org.junit.jupiter.api.Test`: Annotation for test methods.
   - `static org.junit.jupiter.api.Assertions.*`: Import assertion methods.

2. **Test Class:** We create a JUnit test class named `BugTest`.

3. **Test Method 1: `testBugConstructor()`:**
   - **Arrange:** Define sample values for the bug attributes.
   - **Act:** Create a `Bug` object using the constructor with the sample values.
   - **Assert:** Use `assertEquals()` to verify that the values of the bug object match the expected values.

4. **Test Method 2: `testGettersAndSetters()`:**
   - **Arrange:** Create a `Bug` object.
   - **Act:** Use the setter methods to set the attributes of the bug object.
   - **Assert:** Use `assertEquals()` to verify that the values returned by the getter methods match the values set by the setter methods.

**To run these tests:**

1. Ensure you have JUnit 5 installed in your project.
2. Create a `Test` class in your project (e.g., `BugTest.java`).
3. Add the code above to the `BugTest.java` file.
4. Run the tests using your IDE's JUnit test runner or the `mvn test` command.

This test case provides basic validation for the `Bug` class, covering its constructor and getter/setter methods. You can expand these tests by adding more methods to cover other aspects of the class, such as validation rules for attributes, interactions with other objects, or specific business logic. 
