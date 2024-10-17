```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
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

**Assumptions:**

* The `BankAccount` class has the following methods:
    * `deposit(double amount)`: Deposits money into the account.
    * `withdraw(double amount)`: Withdraws money from the account. Throws an `IllegalArgumentException` if insufficient funds.
    * `getBalance()`: Returns the current balance of the account.
* The `BankAccount` class has a constructor that accepts an initial balance.

**Explanation:**

* **`testDeposit()`:** Deposits 100 into a new account and verifies the balance is 100.
* **`testWithdraw()`:** Withdraws 50 from an account with an initial balance of 100 and verifies the balance is 50.
* **`testWithdrawInsufficientFunds()`:** Attempts to withdraw 150 from an account with an initial balance of 100 and verifies an `IllegalArgumentException` is thrown.
* **`testGetBalance()`:** Creates an account with an initial balance of 100 and verifies the `getBalance()` method returns 100.

**To use this test case:**

1. Replace `BankAccount` with the actual name of your `BankAccount` class.
2. Make sure the test case is in the same package as your `BankAccount` class.
3. Run the test case using your IDE or a test runner like JUnit.

This is a basic example, and you may need to add more test cases depending on the specific functionality of your `BankAccount` class.
