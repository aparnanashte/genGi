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
        account.withdraw(50);
        assertEquals(50, account.getBalance());
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
}
```

**Import Statements:**

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
```

**Assumptions:**

- You have a `BankAccount` class with the following methods:
    - `BankAccount(double initialBalance)`: Constructor to initialize the account with an initial balance.
    - `deposit(double amount)`: Deposits the given amount into the account.
    - `withdraw(double amount)`: Withdraws the given amount from the account. Throws an `IllegalArgumentException` if insufficient funds.
    - `getBalance()`: Returns the current balance of the account.

**Test Cases:**

1. **testDeposit():** Tests that the `deposit()` method correctly increases the account balance.
2. **testWithdraw():** Tests that the `withdraw()` method correctly decreases the account balance.
3. **testWithdrawInsufficientFunds():** Tests that the `withdraw()` method throws an `IllegalArgumentException` when attempting to withdraw more than the available balance.
4. **testGetBalance():** Tests that the `getBalance()` method returns the correct balance.

**Notes:**

- This is a basic set of test cases. You may need to add more test cases depending on the complexity of your `BankAccount` class.
- You should also consider testing edge cases (e.g., zero balance, negative amounts) and boundary conditions (e.g., maximum balance allowed).
- Remember to replace `BankAccount` with the actual name of your class.
