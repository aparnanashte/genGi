```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testConstructor() {
        Bug bug = new Bug("Test Bug", "This is a test bug.", "HIGH");
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testAccessors() {
        Bug bug = new Bug("Test Bug", "This is a test bug.", "HIGH");
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());

        bug.setTitle("Updated Title");
        bug.setDescription("Updated Description");
        bug.setPriority("LOW");

        assertEquals("Updated Title", bug.getTitle());
        assertEquals("Updated Description", bug.getDescription());
        assertEquals("LOW", bug.getPriority());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Test Bug", "This is a test bug.", "HIGH");
        String expectedToString = "Bug{title='Test Bug', description='This is a test bug.', priority='HIGH'}";
        assertEquals(expectedToString, bug.toString());
    }
}
```

**Explanation:**

* **Import Statements:**
    * `com.bug.api.model.domain.Bug`: Imports the `Bug` class.
    * `org.junit.jupiter.api.Test`: Imports the `Test` annotation for marking test methods.
    * `static org.junit.jupiter.api.Assertions.*`: Imports static assertion methods from JUnit.

* **Test Class:**
    * `BugTest`: The test class for the `Bug` class.

* **Test Methods:**
    * `testConstructor()`: Tests the constructor of the `Bug` class, asserting that the initialized bug object has the correct title, description, and priority.
    * `testAccessors()`: Tests the getter and setter methods of the `Bug` class, ensuring that values can be retrieved and modified correctly.
    * `testToString()`: Tests the `toString()` method of the `Bug` class, verifying that it generates the expected string representation of the bug object.

**How to Run:**

1.  Ensure you have JUnit installed as a dependency in your project.
2.  Save the test code as a `.java` file (e.g., `BugTest.java`).
3.  Run the test class using your JUnit runner (e.g., in an IDE or using the `mvn test` command in Maven).
4.  Junit will execute the test methods and report the results.

This test case provides a starting point for testing the `Bug` class. You can add more test cases to cover other functionalities and edge cases in your code.
