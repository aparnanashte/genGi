```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserclassTest {

    @Test
    void testValidUserCreation() {
        // Arrange
        String username = "testuser";
        String password = "testpassword";
        Userclass user = new Userclass(username, password);

        // Act
        // (No action needed, Userclass constructor is tested)

        // Assert
        assertEquals(username, user.getUsername());
        assertEquals(password, user.getPassword());
    }

    @Test
    void testInvalidUsername() {
        // Arrange
        String invalidUsername = ""; // Or any other invalid username format
        String password = "testpassword";

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> new Userclass(invalidUsername, password));
    }

    @Test
    void testInvalidPassword() {
        // Arrange
        String username = "testuser";
        String invalidPassword = ""; // Or any other invalid password format

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> new Userclass(username, invalidPassword));
    }

    // Add more test cases for other methods in your Userclass
    // Example: testLogin(), testChangePassword(), etc.
}
```

**Explanation:**

1. **Import Statements:**
   - `import org.junit.jupiter.api.Test;`: This imports the `Test` annotation from JUnit 5, used to mark methods as test methods.
   - `import static org.junit.jupiter.api.Assertions.*;`: This imports static methods from `Assertions` class, providing assertion methods for verifying expected behavior.

2. **Test Class:**
   - `public class UserclassTest { ... }`: This defines the test class. The name should follow a convention like `[ClassName]Test`.

3. **Test Methods:**
   - `@Test`: This annotation marks a method as a test method.
   - **`testValidUserCreation()`:**
     - **Arrange:** Sets up the input data for the test (valid username and password).
     - **Act:** Executes the code under test (constructs a `Userclass` instance).
     - **Assert:** Verifies the expected results using `assertEquals` to check if the username and password are correctly stored.
   - **`testInvalidUsername()` and `testInvalidPassword()`:**
     - **Arrange:** Sets up the input data for the test (invalid username or password).
     - **Act and Assert:** Uses `assertThrows` to check if an `IllegalArgumentException` is thrown when trying to create a `Userclass` with invalid data.

**Key Points:**

- Replace `Userclass` with your actual class name.
- Add more test cases for other methods in your `Userclass`.
- Consider edge cases and boundary conditions in your test data.
- Ensure your test methods are independent and don't rely on data from other tests.

**Running the Test:**

- Make sure you have JUnit 5 on your classpath.
- Run the test class using your chosen test runner or IDE.