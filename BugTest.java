```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugTest {

    @Test
    void testBugConstructor() {
        Bug bug = new Bug(1L, "Test Bug", "This is a test bug.", "HIGH");
        assertEquals(1L, bug.getId());
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testSettersAndGetters() {
        Bug bug = new Bug();
        bug.setId(1L);
        bug.setTitle("Test Bug");
        bug.setDescription("This is a test bug.");
        bug.setPriority("HIGH");

        assertEquals(1L, bug.getId());
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testToString() {
        Bug bug = new Bug(1L, "Test Bug", "This is a test bug.", "HIGH");
        String expectedString = "Bug{id=1, title='Test Bug', description='This is a test bug.', priority='HIGH'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

* **Import Statement:** The test class imports the `Bug` class from the `com.bug.api.model.domain` package.
* **Test Methods:**
    * `testBugConstructor()`: Tests the constructor of the `Bug` class by creating a new instance with specific values and asserting that the getter methods return the correct values.
    * `testSettersAndGetters()`: Tests the setter and getter methods of the `Bug` class by setting values to the object and then asserting that the getter methods return the correct values.
    * `testToString()`: Tests the `toString()` method of the `Bug` class by creating a new instance, calling `toString()`, and asserting that the returned string matches the expected format.
* **Assertions:** The `assertEquals()` method from JUnit's `Assertions` class is used to verify the expected values.

This test case covers the basic functionality of the `Bug` class, including its constructor, setter and getter methods, and `toString()` method. You can expand this test case to include more specific tests based on your specific requirements.
