```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(100);
        account.withdraw(20);
        assertEquals(80, account.getBalance());
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(150));
    }

    @Test
    public void testGetBalance() {
        BankAccount account = new BankAccount(100);
        assertEquals(100, account.getBalance());
    }
}
```

**Explanation:**

* **Import Statements:**
    * `import org.junit.jupiter.api.Test;` imports the `Test` annotation from JUnit 5, which marks a method as a test case.
    * `import static org.junit.jupiter.api.Assertions.*;` imports all static methods from `Assertions` class, which provides methods for asserting conditions in tests.
* **Test Cases:**
    * **`testDeposit()`:**
        * Creates a new `BankAccount` object with an initial balance of 100.
        * Calls the `deposit()` method to add 50 to the balance.
        * Uses `assertEquals()` to assert that the balance is now 150.
    * **`testWithdraw()`:**
        * Creates a new `BankAccount` object with an initial balance of 100.
        * Calls the `withdraw()` method to subtract 20 from the balance.
        * Uses `assertEquals()` to assert that the balance is now 80.
    * **`testWithdrawInsufficientFunds()`:**
        * Creates a new `BankAccount` object with an initial balance of 100.
        * Uses `assertThrows()` to assert that calling `withdraw()` with an amount greater than the balance (150) throws an `IllegalArgumentException`.
    * **`testGetBalance()`:**
        * Creates a new `BankAccount` object with an initial balance of 100.
        * Uses `assertEquals()` to assert that the `getBalance()` method returns the correct initial balance of 100.

**Note:**

* You will need to have the JUnit 5 library added to your project's dependencies.
* Replace `BankAccount` with the actual name of your class.
* You may need to adjust the test cases based on the specific functionality of your `BankAccount` class.

This test case provides a basic example of how to write JUnit tests for a bank account class. It covers the deposit, withdraw, and get balance functionalities. You can extend this test case to include more complex scenarios, such as testing transactions, account creation, and other bank account operations.
