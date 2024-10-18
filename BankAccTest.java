```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccclassTest {

    // Test case for deposit method
    @Test
    public void testDeposit() {
        BankAccclass account = new BankAccclass("John Doe", 1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    // Test case for withdraw method
    @Test
    public void testWithdraw() {
        BankAccclass account = new BankAccclass("Jane Doe", 1000);
        account.withdraw(200);
        assertEquals(800, account.getBalance());
    }

    // Test case for withdraw method with insufficient funds
    @Test
    public void testWithdrawInsufficientFunds() {
        BankAccclass account = new BankAccclass("John Doe", 1000);
        try {
            account.withdraw(1500);
            fail("Expected InsufficientFundsException");
        } catch (InsufficientFundsException e) {
            // Expected exception
        }
    }

    // Test case for getBalance method
    @Test
    public void testGetBalance() {
        BankAccclass account = new BankAccclass("Jane Doe", 1000);
        assertEquals(1000, account.getBalance());
    }

    // Test case for getAccountName method
    @Test
    public void testGetAccountName() {
        BankAccclass account = new BankAccclass("John Doe", 1000);
        assertEquals("John Doe", account.getAccountName());
    }
}
```

**Import Statements:**

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
```

**Explanation:**

* **BankAccclassTest:** This is the name of the test class.
* **@Test:** This annotation marks a method as a test method.
* **assertEquals(expected, actual):** This assertion method verifies that the expected value matches the actual value.
* **fail(message):** This method fails the test with the given message.
* **InsufficientFundsException:** This exception is thrown when an attempt is made to withdraw more money than available in the account.

**Assumptions:**

* You have a class named `BankAccclass` with the following methods:
    * `deposit(double amount)`: Deposits money into the account.
    * `withdraw(double amount)`: Withdraws money from the account.
    * `getBalance()`: Returns the current balance.
    * `getAccountName()`: Returns the account holder's name.
* You have a class named `InsufficientFundsException` that is thrown when there are insufficient funds to withdraw.

**To run the test cases:**

1. Save the code as `BankAccclassTest.java`.
2. Compile the code using `javac BankAccclassTest.java`.
3. Run the test cases using `java -cp . org.junit.jupiter.engine.JUnitPlatform BankAccclassTest`.

**Note:** Replace `BankAccclass` and `InsufficientFundsException` with the actual names of your classes.
