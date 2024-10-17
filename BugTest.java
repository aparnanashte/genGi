```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugTest {

    @Test
    void testGetId() {
        Bug bug = new Bug(1L, "Test bug", "Test description", "HIGH");
        assertEquals(1L, bug.getId());
    }

    @Test
    void testGetTitle() {
        Bug bug = new Bug(1L, "Test bug", "Test description", "HIGH");
        assertEquals("Test bug", bug.getTitle());
    }

    @Test
    void testGetDescription() {
        Bug bug = new Bug(1L, "Test bug", "Test description", "HIGH");
        assertEquals("Test description", bug.getDescription());
    }

    @Test
    void testGetPriority() {
        Bug bug = new Bug(1L, "Test bug", "Test description", "HIGH");
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testToString() {
        Bug bug = new Bug(1L, "Test bug", "Test description", "HIGH");
        String expectedString = "Bug{id=1, title='Test bug', description='Test description', priority='HIGH'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

* **Import Statements:** The test class imports the `Bug` class from the `com.bug.api.model.domain` package and the `assertEquals` method from the `org.junit.jupiter.api.Assertions` class.
* **Test Methods:** Each test method is annotated with `@Test` and tests a specific aspect of the `Bug` class:
    * `testGetId()`: Tests the `getId()` method.
    * `testGetTitle()`: Tests the `getTitle()` method.
    * `testGetDescription()`: Tests the `getDescription()` method.
    * `testGetPriority()`: Tests the `getPriority()` method.
    * `testToString()`: Tests the `toString()` method.
* **Assertions:** The `assertEquals()` method is used to assert that the actual value returned by the method matches the expected value.
* **Constructor:** Each test method creates a new `Bug` object with specific values for its attributes.

**How to run the test:**

1. Make sure you have JUnit 5 added to your project dependencies.
2. Compile the test class.
3. Run the test class using a JUnit test runner.

This test case covers the basic functionalities of the `Bug` class. You can add more test cases to cover other aspects of the class, such as its setters or any custom methods it might have.
