```java
import com.bug.api.model.domain.Bug;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugTest {

    @Test
    void testBugConstructor() {
        Bug bug = new Bug("Test Bug", "This is a test bug.", "HIGH", "John Doe", "Feature");
        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("John Doe", bug.getReporter());
        assertEquals("Feature", bug.getCategory());
    }

    @Test
    void testSettersGetters() {
        Bug bug = new Bug();
        bug.setTitle("Test Bug");
        bug.setDescription("This is a test bug.");
        bug.setPriority("HIGH");
        bug.setReporter("John Doe");
        bug.setCategory("Feature");

        assertEquals("Test Bug", bug.getTitle());
        assertEquals("This is a test bug.", bug.getDescription());
        assertEquals("HIGH", bug.getPriority());
        assertEquals("John Doe", bug.getReporter());
        assertEquals("Feature", bug.getCategory());
    }
}
```

**Explanation:**

1. **Import Statements:**
   - `import com.bug.api.model.domain.Bug;`: This line imports the `Bug` class from the specified package.
   - `import org.junit.jupiter.api.Test;`: This line imports the `Test` annotation from JUnit 5.
   - `import static org.junit.jupiter.api.Assertions.*;`: This line imports static methods from the `Assertions` class for writing assertions.

2. **Test Class:**
   - `public class BugTest {}`: This defines a JUnit test class named `BugTest`.

3. **Test Methods:**
   - **`testBugConstructor()`:**
     - Creates a new `Bug` object using the constructor.
     - Uses `assertEquals()` to assert that the values set in the constructor are correctly stored in the object's fields.
   - **`testSettersGetters()`:**
     - Creates a new `Bug` object.
     - Uses the setters to set values for each field.
     - Uses `assertEquals()` to assert that the values returned by the getters match the values set using the setters.

**Running the Tests:**

To run these tests, you will need a JUnit runner or an IDE that supports JUnit testing. The test methods will be executed, and any failed assertions will be reported.
