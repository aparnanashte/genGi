```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugClassTest {

    @Test
    void testBugClassMethod1() {
        // Arrange
        BugClass bugClass = new BugClass();
        // Act
        // Call the method you want to test on bugClass
        // ...
        // Assert
        // Assert the expected result
        // ...
    }

    @Test
    void testBugClassMethod2() {
        // Arrange
        BugClass bugClass = new BugClass();
        // Act
        // Call the method you want to test on bugClass
        // ...
        // Assert
        // Assert the expected result
        // ...
    }

    // Add more test methods for each method in BugClass
}
```

**Explanation:**

1. **Import Statements:**
   - `import org.junit.jupiter.api.Test;`: Imports the `Test` annotation to mark methods as test methods.
   - `import static org.junit.jupiter.api.Assertions.*;`: Imports all static methods from the `Assertions` class for making assertions in your tests.

2. **Test Class:**
   - Create a public class named `BugClassTest` (replace "BugClass" with the actual name of your class).

3. **Test Methods:**
   - Each test method should have the `@Test` annotation.
   - Follow the Arrange-Act-Assert pattern:
      - **Arrange:** Set up any necessary objects or data for the test.
      - **Act:** Execute the method you're testing.
      - **Assert:** Use assertion methods from `Assertions` to verify the expected results.

**Example Test Method:**

```java
@Test
void testCalculateSum() {
    // Arrange
    BugClass bugClass = new BugClass();
    int num1 = 5;
    int num2 = 10;

    // Act
    int sum = bugClass.calculateSum(num1, num2);

    // Assert
    assertEquals(15, sum);
}
```

**Remember:**

- Replace `BugClass` with the actual name of your class.
- Replace `testBugClassMethod1`, `testBugClassMethod2`, etc. with meaningful names that describe the tested functionality.
- Write tests for all the methods in your `BugClass` class.
- Provide different test cases for each method to cover various scenarios (e.g., boundary conditions, edge cases, typical inputs).
- Use the appropriate assertion methods from `Assertions` to check your expectations.
