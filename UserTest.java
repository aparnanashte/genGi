```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserClassTest {

    @Test
    void testConstructor() {
        User user = new User("John Doe", "john.doe@example.com");
        assertEquals("John Doe", user.getName());
        assertEquals("john.doe@example.com", user.getEmail());
    }

    @Test
    void testGetName() {
        User user = new User("Jane Doe", "jane.doe@example.com");
        assertEquals("Jane Doe", user.getName());
    }

    @Test
    void testSetName() {
        User user = new User("John Doe", "john.doe@example.com");
        user.setName("Jane Doe");
        assertEquals("Jane Doe", user.getName());
    }

    @Test
    void testGetEmail() {
        User user = new User("John Doe", "john.doe@example.com");
        assertEquals("john.doe@example.com", user.getEmail());
    }

    @Test
    void testSetEmail() {
        User user = new User("John Doe", "john.doe@example.com");
        user.setEmail("jane.doe@example.com");
        assertEquals("jane.doe@example.com", user.getEmail());
    }

    @Test
    void testToString() {
        User user = new User("John Doe", "john.doe@example.com");
        assertEquals("User{name='John Doe', email='john.doe@example.com'}", user.toString());
    }
}
```

**Explanation:**

* **Import statements:** The code starts with `import` statements to import necessary classes from JUnit and the class under test (`User`).
* **Test class:** The test class `UserClassTest` contains multiple test methods.
* **Test methods:** Each test method tests a specific functionality of the `User` class using assertions.
* **Assertions:** Assertions are used to verify the expected results of the tests.
    * `assertEquals()` checks if two values are equal.
    * `assertTrue()` checks if a condition is true.
    * `assertFalse()` checks if a condition is false.
* **Test data:** Test methods use sample data to test different scenarios.

**To run the test cases:**

1. Save the code as `UserClassTest.java`.
2. Compile the test class using a Java compiler.
3. Run the test class using a JUnit test runner.

This test suite covers the basic functionalities of the `User` class, including its constructor, getter and setter methods, and `toString()` method. You can add more test cases to cover other functionalities or edge cases of your `User` class. 
