```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccclassTest {

    @Test
    void testDeposit() {
        BankAccclass account = new BankAccclass("John Doe", 1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccclass account = new BankAccclass("Jane Doe", 1000);
        account.withdraw(200);
        assertEquals(800, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccclass account = new BankAccclass("John Doe", 1000);
        try {
            account.withdraw(1500);
            fail("Expected InsufficientFundsException");
        } catch (InsufficientFundsException e) {
            // Expected exception, so test passes
        }
    }

    @Test
    void testGetBalance() {
        BankAccclass account = new BankAccclass("Jane Doe", 1000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void testGetName() {
        BankAccclass account = new BankAccclass("John Doe", 1000);
        assertEquals("John Doe", account.getName());
    }
}
```

**Explanation:**

* **Import Statements:**
    * `import org.junit.jupiter.api.Test;`: Imports the `Test` annotation from JUnit 5, which marks methods as test methods.
    * `import static org.junit.jupiter.api.Assertions.*;`: Imports static assertions methods from JUnit 5, like `assertEquals`, `assertTrue`, etc.
* **Test Class:**
    * `public class BankAccclassTest { ... }`: Defines a test class for the `BankAccclass` class.
* **Test Methods:**
    * Each method represents a test case for a specific functionality of the `BankAccclass`.
    * **`testDeposit()`:** Tests the deposit functionality by adding 500 to an initial balance of 1000 and asserting the final balance is 1500.
    * **`testWithdraw()`:** Tests the withdraw functionality by withdrawing 200 from an initial balance of 1000 and asserting the final balance is 800.
    * **`testWithdrawInsufficientFunds()`:** Tests the scenario where withdrawal amount exceeds the balance. It uses `try...catch` block to catch the expected `InsufficientFundsException` and ensure the test passes.
    * **`testGetBalance()`:** Tests the `getBalance()` method by asserting that the returned balance matches the expected value.
    * **`testGetName()`:** Tests the `getName()` method by asserting that the returned name matches the expected value.

**Assumptions:**

* **`BankAccclass` class:** You have a `BankAccclass` class with methods `deposit(double amount)`, `withdraw(double amount)`, `getBalance()`, and `getName()`.
* **`InsufficientFundsException` class:** You have an `InsufficientFundsException` class that is thrown when attempting to withdraw more than the available balance.

**To run the test cases:**

1. Ensure you have JUnit 5 library in your project.
2. Run the `BankAccclassTest` class as a JUnit test. 

This test case will help you verify the correct functionality of your `BankAccclass` class. Remember to modify it based on your specific class and expected behavior.
