```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugConstructor() {
        Bug bug = new Bug("Test Bug", "This is a test bug", "LOW", "NEW");
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("LOW", bug.getPriority());
        assertEquals("NEW", bug.getStatus());
    }

    @Test
    void testGettersAndSetters() {
        Bug bug = new Bug();
        bug.setTitle("Test Bug");
        bug.setDescription("This is a test bug");
        bug.setPriority("MEDIUM");
        bug.setStatus("IN_PROGRESS");

        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("MEDIUM", bug.getPriority());
        assertEquals("IN_PROGRESS", bug.getStatus());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Test Bug", "This is a test bug", "LOW", "NEW");
        String expectedString = "Bug{title='Test Bug', description='This is a test bug', priority='LOW', status='NEW'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

* **Import Statements:**
    * `com.bug.api.model.domain.Bug`: Imports the `Bug` class from the specified package.
    * `org.junit.jupiter.api.Test`: Imports the `Test` annotation from JUnit 5.
    * `static org.junit.jupiter.api.Assertions.*`: Imports all static assertion methods from JUnit 5.
* **Test Class:**
    * `public class BugTest`: Declares a test class named `BugTest`.
* **Test Methods:**
    * **`testBugConstructor()`:**
        * Creates a new `Bug` object using the constructor.
        * Verifies that the constructor correctly sets the values of the fields using the `assertEquals()` method.
    * **`testGettersAndSetters()`:**
        * Creates a new `Bug` object.
        * Uses the setter methods to set the values of the fields.
        * Verifies that the getter methods return the correct values using the `assertEquals()` method.
    * **`testToString()`:**
        * Creates a new `Bug` object.
        * Calls the `toString()` method and compares the returned string with the expected string using the `assertEquals()` method.

**Running the Test:**

1. Ensure you have JUnit 5 added to your project.
2. Run the `BugTest` class.

This test case will execute the three test methods and provide feedback on whether the `Bug` class is functioning as expected.
