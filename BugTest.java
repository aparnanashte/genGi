```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugConstructor() {
        Bug bug = new Bug("Test bug", "This is a test bug.", "HIGH");
        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testGettersAndSetters() {
        Bug bug = new Bug();
        bug.setTitle("Test bug");
        bug.setDescription("This is a test bug.");
        bug.setPriority("HIGH");
        assertEquals("Test bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Test bug", "This is a test bug.", "HIGH");
        String expectedToString = "Bug{title='Test bug', description='This is a test bug.', priority='HIGH'}";
        assertEquals(expectedToString, bug.toString());
    }
}
```

**Explanation:**

* **Import statements:** We import the necessary classes for testing, including `Bug` from the package `com.bug.api.model.domain`, `Test` annotation from JUnit 5, and assertion methods from `Assertions`.
* **Test Class:** The `BugTest` class is the test class for the `Bug` class.
* **Test Methods:**
    * **`testBugConstructor()`:** This method tests the constructor of the `Bug` class by creating an instance and verifying the initial values.
    * **`testGettersAndSetters()`:** This method tests the getter and setter methods of the `Bug` class by setting values and then retrieving them to ensure they are correct.
    * **`testToString()`:** This method tests the `toString()` method of the `Bug` class by creating an instance and comparing the expected string representation with the actual output.
* **Assertions:** Each test method uses assertion methods like `assertEquals()` to verify that the actual results match the expected results. 

**Note:**  This is a basic example of JUnit test cases. You can expand these tests to cover different scenarios, such as testing invalid input, boundary conditions, and edge cases.
