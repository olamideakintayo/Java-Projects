package BankApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void testThatYouCanGetAccountBalance() {
        Account olamideAccount = new Account();
        olamideAccount.setPin("correctPin");
        int balance = olamideAccount.getBalance("correctPin");
        assertEquals(0, balance);
    }


    @Test
    public void depositTest() {
        Account olamideAccount = new Account();
        olamideAccount.setPin("correctPin");
        int balance = olamideAccount.getBalance("correctPin");
        assertEquals(0, balance);

        int deposit = olamideAccount.deposit(2000);
        assertEquals(2000, deposit);
    }


    @Test
    public void depositMultipleTimesTest() {
        Account olamideAccount = new Account();
        olamideAccount.setPin("correctPin");
        int firstDeposit = olamideAccount.deposit(4000);
        assertEquals(4000, firstDeposit);

        int secondDeposit = olamideAccount.deposit(3000);
        assertEquals(7000, secondDeposit);

        int thirdDeposit = olamideAccount.deposit(1000);
        assertEquals(8000, thirdDeposit);

        int finalBalance = olamideAccount.getBalance("correctPin");
        assertEquals(8000, finalBalance);
    }


    @Test
    public void negativeAmountDepositIsNotAddedToBalanceTest() {
        Account olamideAccount = new Account();
        olamideAccount.setPin("correctPin");
        int initialBalance = olamideAccount.getBalance("correctPin");
        assertEquals(0, initialBalance);

        int deposit = olamideAccount.deposit(-500);
        assertEquals(0, deposit);

        olamideAccount.deposit(-1000);
        assertEquals(0, olamideAccount.getBalance("correctPin"));
    }

    @Test
    public void testThatYouCanWithdrawFromAccount() {
        Account olamideAccount = new Account();
        olamideAccount.setPin("correctPin");
        assertEquals(0, olamideAccount.getBalance("correctPin"));

        olamideAccount.deposit(5000);
        int balanceAfterDeposit = olamideAccount.getBalance("correctPin");
        assertEquals(5000, balanceAfterDeposit);

        int withdrawal = olamideAccount.withdraw(2000 , "correctPin");
        assertEquals(3000, withdrawal);
    }

    @Test
    public void testThatYouCannotWithdrawMoreThanBalance() {
        Account olamideAccount = new Account();
        olamideAccount.setPin("correctPin");
        olamideAccount.deposit(3000);
        int withdrawal = olamideAccount.withdraw(5000 , "correctPin");
        assertEquals(0, withdrawal);
        assertEquals(3000, olamideAccount.getBalance("correctPin"));
    }

    @Test
    public void testThatYouCannotWithdrawNegativeAmount() {
        Account olamideAccount = new Account();
        olamideAccount.setPin("correctPin");
        olamideAccount.deposit(2000);
        int withdrawal = olamideAccount.withdraw(-1000 , "correctPin");
        assertEquals(0, withdrawal);
        assertEquals(2000, olamideAccount.getBalance("correctPin"));
    }

    @Test
    public void testThatYouCannotWithdrawZeroAmount() {
        Account olamideAccount = new Account();
        olamideAccount.setPin("correctPin");
        olamideAccount.deposit(1000);
        int withdrawal = olamideAccount.withdraw(0 , "correctPin");
        assertEquals(0, withdrawal);
        assertEquals(1000, olamideAccount.getBalance("correctPin"));
    }

    @Test
    public void testThatReturnsBalanceAsZeroIfIncorrectPasswordIsInputed() {
        Account olamideAccount = new Account();
        olamideAccount.setPin("correctPin");
        assertEquals(0, olamideAccount.getBalance("correctPin"));

        olamideAccount.deposit(5000);
        int balanceAfterDeposit = olamideAccount.getBalance("correctPin");
        assertEquals(5000, balanceAfterDeposit);

        olamideAccount.withdraw(2000 , "wrongPin");
        olamideAccount.getBalance("wrongPin");
        assertEquals(0, olamideAccount.getBalance("wrongPin"));
    }
}