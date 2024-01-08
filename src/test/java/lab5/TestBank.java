package lab5;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestBank {
    private Bank bank;
    private BankAccount account1;
    private BankAccount account2;

    @BeforeEach
    public void setUp() {
        bank = new Bank();
        account1 = bank.createAccount(72831803, "Dan Johnson", 350.0);
        account2 = bank.createAccount(19238473, "Diana Taylor", 720.0);
    }

    @Test
    public void testDepositWithNegativeAmount() {
        try {
            account1.deposit(-50);
            fail("Expected NegativeAmountException, but no exception was thrown.");
        } catch (NegativeAmountException e) {
            assertEquals("Deposit cannot be a negative number!", e.getMessage());
        } catch (InsufficientFundsException | AccountNotFoundException e) {
            fail("Unexpected exception was thrown: " + e.getClass().getName());
        }
    }

    @Test
    public void testDepositWithValidAmount() {
        try {
            account1.deposit(50);
            assertEquals(400.0, account1.getBalance(), 0.001);
        } catch (NegativeAmountException | InsufficientFundsException | AccountNotFoundException e) {
            fail("Unexpected exception was thrown: " + e.getClass().getName());
        }
    }

    @Test
    public void testTransferMoneySuccess() {
        try {
            bank.transferMoney(account1.getAccountNumber(), account2.getAccountNumber(), 300.0);
            assertEquals(50.0, account1.getBalance(), 0.001);
            assertEquals(1020.0, account2.getBalance(), 0.001);
        } catch (NegativeAmountException | InsufficientFundsException | AccountNotFoundException e) {
            fail("Unexpected exception was thrown: " + e.getClass().getName());
        }
    }

    @Test
    public void testTransferMoneyAccountNotFound() {
        try {
            bank.transferMoney(account1.getAccountNumber(), 23942029, 300.0);
            fail("Expected AccountNotFoundException, but no exception was thrown.");
        } catch (AccountNotFoundException e) {
            assertEquals("Account not found!", e.getMessage());
        } catch (NegativeAmountException | InsufficientFundsException e) {
            fail("Unexpected exception was thrown: " + e.getClass().getName());
        }
    }

    @Test
    public void testTransferMoneyInsufficientFunds() {
        try {
            bank.transferMoney(account1.getAccountNumber(), account2.getAccountNumber(), 400.0);
            fail("Expected InsufficientFundsException, but no exception was thrown.");
        } catch (InsufficientFundsException e) {
            assertEquals("Insufficient funds in your account!", e.getMessage());
        } catch (NegativeAmountException | AccountNotFoundException e) {
            fail("Unexpected exception was thrown: " + e.getClass().getName());
        }
    }

    @Test
    public void testWithdrawSuccess() {
        try {
            account1.withdraw(100);
            assertEquals(250.0, account1.getBalance(), 0.001);
        } catch (NegativeAmountException | InsufficientFundsException | AccountNotFoundException e) {
            fail("Unexpected exception was thrown: " + e.getClass().getName());
        }
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        try {
            account1.withdraw(500);
            fail("Expected InsufficientFundsException, but no exception was thrown.");
        } catch (InsufficientFundsException e) {
            assertEquals("Insufficient funds in your account!", e.getMessage());
        } catch (NegativeAmountException | AccountNotFoundException e) {
            fail("Unexpected exception was thrown: " + e.getClass().getName());
        }
    }
    @Test
    public void testWithdrawNegativeAmount() {
        try {
            account1.withdraw(-50);
            fail("Expected NegativeAmountException, but no exception was thrown.");
        } catch (NegativeAmountException e) {
            assertEquals("Withdraw cannot be a negative number!", e.getMessage());
        } catch (InsufficientFundsException | AccountNotFoundException e) {
            fail("Unexpected exception was thrown: " + e.getClass().getName());
        }
    }
}
