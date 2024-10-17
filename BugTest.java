```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugTest {

    @Test
    void testBugConstructor() {
        Bug bug = new Bug(1L, "Bug Title", "Bug Description", "HIGH", "CREATED");
        assertEquals(1L, bug.getId());
        assertEquals("Bug Title", bug.getTitle());
        assertEquals("Bug Description", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("CREATED", bug.getStatus());
    }

    @Test
    void testGettersAndSetters() {
        Bug bug = new Bug();
        bug.setId(1L);
        bug.setTitle("Bug Title");
        bug.setDescription("Bug Description");
        bug.setPriority("HIGH");
        bug.setStatus("CREATED");

        assertEquals(1L, bug.getId());
        assertEquals("Bug Title", bug.getTitle());
        assertEquals("Bug Description", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("CREATED", bug.getStatus());
    }

    @Test
    void testToString() {
        Bug bug = new Bug(1L, "Bug Title", "Bug Description", "HIGH", "CREATED");
        String expectedString = "Bug{id=1, title='Bug Title', description='Bug Description', priority='HIGH', status='CREATED'}";
        assertEquals(expectedString, bug.toString());
    }
}
```

**Explanation:**

* **Import statement:** Imports the `Bug` class and necessary JUnit assertions.
* **`testBugConstructor()`:** Tests the constructor by creating a new `Bug` object and verifying its initial state.
* **`testGettersAndSetters()`:** Tests the getter and setter methods by setting values and then retrieving them, ensuring they are correctly stored and retrieved.
* **`testToString()`:** Tests the `toString()` method by comparing the expected string representation with the actual output.

**Note:**

* This is a basic example and you might need to add more test cases depending on the specific functionality of your `Bug` class.
* Consider testing edge cases and invalid inputs.
* You can use mocking libraries like Mockito to test interactions with other classes or external dependencies.
