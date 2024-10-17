```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoleClassTest {

    @Test
    void testGetRoleName() {
        // Arrange
        RoleClass roleClass = new RoleClass("Admin");

        // Act
        String roleName = roleClass.getRoleName();

        // Assert
        assertEquals("Admin", roleName);
    }

    @Test
    void testSetRoleName() {
        // Arrange
        RoleClass roleClass = new RoleClass("User");

        // Act
        roleClass.setRoleName("Manager");

        // Assert
        assertEquals("Manager", roleClass.getRoleName());
    }

    @Test
    void testToString() {
        // Arrange
        RoleClass roleClass = new RoleClass("Developer");

        // Act
        String toStringOutput = roleClass.toString();

        // Assert
        assertTrue(toStringOutput.contains("RoleClass{roleName='Developer'}"));
    }
}
```

**Assumptions:**

* You have a class named `RoleClass` with the following methods:
    * `getRoleName()`: Returns the role name as a String.
    * `setRoleName(String roleName)`: Sets the role name.
    * `toString()`: Returns a String representation of the `RoleClass` object.

**Explanation:**

1. **Import Statements:** We import `org.junit.jupiter.api.Test` for writing test methods and `static org.junit.jupiter.api.Assertions.*` for using assertion methods like `assertEquals` and `assertTrue`.

2. **Test Class:** We define a test class named `RoleClassTest`.

3. **Test Methods:**
   * **`testGetRoleName()`:** This test verifies that the `getRoleName()` method correctly returns the role name. 
   * **`testSetRoleName()`:** This test verifies that the `setRoleName()` method successfully updates the role name.
   * **`testToString()`:** This test verifies that the `toString()` method returns a string representation of the `RoleClass` object containing the role name.

4. **Assertions:**
   * `assertEquals` compares the actual and expected values.
   * `assertTrue` checks if a condition is true.

**How to use the test cases:**

1. Make sure you have JUnit 5 in your project dependencies.
2. Create a `RoleClass` class with the required methods.
3. Run the test cases to verify the functionality of your `RoleClass` implementation.

**Note:** You might need to modify the test cases based on the specific implementation of your `RoleClass` class. 
