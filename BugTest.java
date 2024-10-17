```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugTest {

    @Test
    void testBugConstructor() {
        Bug bug = new Bug("Test Bug", "This is a test bug", "HIGH", "John Doe");
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("John Doe", bug.getReporter());
    }

    @Test
    void testGettersAndSetters() {
        Bug bug = new Bug();
        bug.setTitle("Test Bug");
        bug.setDescription("This is a test bug");
        bug.setPriority("HIGH");
        bug.setReporter("John Doe");

        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("John Doe", bug.getReporter());
    }
}
```

**Explanation:**

* **Import Statement:** The `import` statement imports the necessary class `com.bug.api.model.domain.Bug`.
* **Test Class:** The `BugTest` class is a JUnit test class for the `Bug` class.
* **Test Methods:**
    * **`testBugConstructor()`:** This method tests the constructor of the `Bug` class. It creates a new `Bug` object with some test data and then verifies that the values are correctly set using `assertEquals()`.
    * **`testGettersAndSetters()`:** This method tests the getters and setters of the `Bug` class. It creates a `Bug` object, sets its properties using the setters, and then verifies that the values can be retrieved using the getters.
* **Assertions:** The `assertEquals()` method from `org.junit.jupiter.api.Assertions` is used to assert that the expected values match the actual values.

**Note:** This is just a basic example. You can add more test cases to cover other scenarios and functionalities of the `Bug` class. For example, you can test the `setStatus()` method, the `getCreatedAt()` and `getUpdatedAt()` methods, or any other relevant methods.
