```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(100);
        account.withdraw(25);
        assertEquals(75, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(150));
    }

    @Test
    void testGetBalance() {
        BankAccount account = new BankAccount(100);
        assertEquals(100, account.getBalance());
    }

    // Add more test cases as needed...
}
```

**Explanation:**

1. **Import Statements:**
   - `import org.junit.jupiter.api.Test;`: Imports the `Test` annotation from JUnit 5.
   - `import static org.junit.jupiter.api.Assertions.*;`: Imports static methods from the `Assertions` class for performing assertions.

2. **Test Class:**
   - `public class BankAccountTest { ... }`: Defines a test class named `BankAccountTest`.

3. **Test Methods:**
   - Each test method is annotated with `@Test`.
   - **`testDeposit()`**: Tests the `deposit()` method by depositing 50 and verifying the updated balance.
   - **`testWithdraw()`**: Tests the `withdraw()` method by withdrawing 25 and verifying the updated balance.
   - **`testWithdrawInsufficientFunds()`**: Tests the scenario where insufficient funds are available for withdrawal. It uses `assertThrows()` to ensure an `IllegalArgumentException` is thrown.
   - **`testGetBalance()`**: Tests the `getBalance()` method by verifying the initial balance.

**How to run the tests:**

1. Make sure you have JUnit 5 in your project's dependencies.
2. Save the code as `BankAccountTest.java` in your project.
3. Run the test class from your IDE or using a command-line test runner.

**Note:**

- The `BankAccount` class should be defined in a separate file, and its methods should be accessible from the test class.
- You can add more test cases to cover different scenarios and edge cases of your `BankAccount` class.
- Replace the placeholder `// Add more test cases as needed...` with your additional test methods.
