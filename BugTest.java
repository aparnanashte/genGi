```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugTest {

    @Test
    void testConstructor() {
        Bug bug = new Bug("Test Bug", "This is a test bug", "HIGH");
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getSeverity());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setTitle("New Title");
        bug.setDescription("New Description");
        bug.setSeverity("MEDIUM");

        assertEquals("New Title", bug.getTitle());
        assertEquals("New Description", bug.getDescription());
        assertEquals("MEDIUM", bug.getSeverity());
    }

    @Test
    void testToString() {
        Bug bug = new Bug("Test Bug", "This is a test bug", "HIGH");
        String expectedString = "Bug{title='Test Bug', description='This is a test bug', severity='HIGH'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

1. **Import statement:** The `import` statement imports the `Bug` class from the package `com.bug.api.model.domain`.
2. **Test class:** The `BugTest` class contains the JUnit test cases for the `Bug` class.
3. **Test methods:** Each test method is annotated with `@Test` to indicate that it is a JUnit test case.
4. **`testConstructor()`:** This method tests the constructor of the `Bug` class. It creates a `Bug` object with specific values for the title, description, and severity, and then uses `assertEquals()` to verify that the object's attributes have the expected values.
5. **`testSettersAndGetters()`:** This method tests the setter and getter methods of the `Bug` class. It creates a `Bug` object and sets its attributes using the setter methods. Then, it uses the getter methods to retrieve the values and verifies that they are correct using `assertEquals()`.
6. **`testToString()`:** This method tests the `toString()` method of the `Bug` class. It creates a `Bug` object and compares the string representation returned by `toString()` with the expected string representation using `assertEquals()`.

**Note:** This is a basic set of test cases for the `Bug` class. You can add more test cases to cover different scenarios and edge cases based on your specific requirements.
