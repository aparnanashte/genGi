```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccClassTest {

    // Test cases for deposit() method
    @Test
    public void testDeposit_ValidAmount() {
        BankAccClass bankAcc = new BankAccClass("John Doe", 1000);
        bankAcc.deposit(500);
        assertEquals(1500, bankAcc.getBalance());
    }

    @Test
    public void testDeposit_ZeroAmount() {
        BankAccClass bankAcc = new BankAccClass("John Doe", 1000);
        bankAcc.deposit(0);
        assertEquals(1000, bankAcc.getBalance());
    }

    @Test
    public void testDeposit_NegativeAmount() {
        BankAccClass bankAcc = new BankAccClass("John Doe", 1000);
        bankAcc.deposit(-500);
        assertEquals(1000, bankAcc.getBalance());
    }

    // Test cases for withdraw() method
    @Test
    public void testWithdraw_ValidAmount() {
        BankAccClass bankAcc = new BankAccClass("John Doe", 1000);
        bankAcc.withdraw(500);
        assertEquals(500, bankAcc.getBalance());
    }

    @Test
    public void testWithdraw_InsufficientFunds() {
        BankAccClass bankAcc = new BankAccClass("John Doe", 1000);
        bankAcc.withdraw(1500);
        assertEquals(1000, bankAcc.getBalance());
    }

    @Test
    public void testWithdraw_ZeroAmount() {
        BankAccClass bankAcc = new BankAccClass("John Doe", 1000);
        bankAcc.withdraw(0);
        assertEquals(1000, bankAcc.getBalance());
    }

    @Test
    public void testWithdraw_NegativeAmount() {
        BankAccClass bankAcc = new BankAccClass("John Doe", 1000);
        bankAcc.withdraw(-500);
        assertEquals(1000, bankAcc.getBalance());
    }

    // Test cases for getBalance() method
    @Test
    public void testGetBalance() {
        BankAccClass bankAcc = new BankAccClass("John Doe", 1000);
        assertEquals(1000, bankAcc.getBalance());
    }
}
```

**Note:**

* Replace `BankAccClass` with the actual name of your bank account class.
* You need to have a `BankAccClass` class defined with the methods `deposit()`, `withdraw()`, and `getBalance()`.
* The test cases are just examples. You may need to add more test cases based on your specific requirements.
* Make sure to add the necessary import statement for `org.junit.jupiter.api.Test` and `org.junit.jupiter.api.Assertions`.

**How to run the test cases:**

1. Save the code as a `.java` file (e.g., `BankAccClassTest.java`).
2. Make sure you have JUnit 5 installed in your project.
3. Run the test class using your IDE's test runner or by running the following command in your terminal: `mvn test` (if you're using Maven).

The test cases will then run and you will see the results in the console or your IDE's test runner window.
