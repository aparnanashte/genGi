```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testGetId() {
        Bug bug = new Bug(1L, "Test bug", "Description", "HIGH");
        assertEquals(1L, bug.getId());
    }

    @Test
    void testGetTitle() {
        Bug bug = new Bug(1L, "Test bug", "Description", "HIGH");
        assertEquals("Test bug", bug.getTitle());
    }

    @Test
    void testGetDescription() {
        Bug bug = new Bug(1L, "Test bug", "Description", "HIGH");
        assertEquals("Description", bug.getDescription());
    }

    @Test
    void testGetPriority() {
        Bug bug = new Bug(1L, "Test bug", "Description", "HIGH");
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testToString() {
        Bug bug = new Bug(1L, "Test bug", "Description", "HIGH");
        String expectedString = "Bug{id=1, title='Test bug', description='Description', priority='HIGH'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

* **Imports:** We import the `Bug` class and necessary assertion methods from JUnit.
* **Test Class:** The `BugTest` class holds all the test methods.
* **Test Methods:** Each test method tests a specific functionality of the `Bug` class:
    * **`testGetId`:** Tests that the `getId` method returns the correct ID.
    * **`testGetTitle`:** Tests that the `getTitle` method returns the correct title.
    * **`testGetDescription`:** Tests that the `getDescription` method returns the correct description.
    * **`testGetPriority`:** Tests that the `getPriority` method returns the correct priority.
    * **`testToString`:** Tests that the `toString` method returns the expected string representation of the `Bug` object.
* **Assertions:** We use `assertEquals` to verify that the actual values returned by the methods match the expected values.

**To run the tests:**

1. Make sure you have JUnit 5 added as a dependency to your project.
2. Run the `BugTest` class as a JUnit test.

This test case covers the basic functionality of the `Bug` class. You can add more tests as needed to cover additional functionalities and edge cases.
