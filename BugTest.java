```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugTest {

    @Test
    void testConstructor() {
        Bug bug = new Bug(1L, "Test Bug", "This is a test bug.", "HIGH");
        assertEquals(1L, bug.getId());
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
    }

    @Test
    void testGettersAndSetters() {
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
}
```

**Explanation:**

* **Import Statement:** This imports the `Bug` class from the `com.bug.api.model.domain` package.
* **Test Class:** The `BugTest` class is annotated with `@Test` to indicate it's a JUnit test class.
* **`testConstructor()`:** This test method checks if the constructor correctly initializes the Bug object with given values.
    * It creates a new Bug object using the constructor.
    * It then uses `assertEquals()` to verify that the id, title, description, and priority of the object are set as expected.
* **`testGettersAndSetters()`:** This test method verifies that the getters and setters work correctly.
    * It creates a new Bug object.
    * It sets the values for id, title, description, and priority using the setters.
    * It then uses `assertEquals()` to verify that the getters return the correct values.

**To run the test:**

1. Ensure you have JUnit installed in your project.
2. Right-click on the test class and select "Run 'BugTest'".

This will run the test methods and show the results in the JUnit view.
