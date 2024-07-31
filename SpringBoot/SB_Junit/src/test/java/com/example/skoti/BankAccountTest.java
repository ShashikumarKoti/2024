package com.example.skoti;

import com.example.skoti.service.BankAccount;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
//@ExtendWith(MockitoExtension.class)
public class BankAccountTest {

    @Spy
    private BankAccount bankAccount = new BankAccount(100);

//Below method is used if we add @ExtendWith(MockitoExtension.class)
//    @Before
//    public void setUp() {
//        bankAccount = Mockito.spy(new BankAccount(100));
//    }

    @Test
    public void depositTest() {

        //calling real method as we have used spy to bankAccount object
        bankAccount.deposit(50.0);
        assertEquals(150, bankAccount.getBalance());
    }
    @Test
    public void depositNegativeTest() {

        //calling real method as we have used spy to bankAccount object
        bankAccount.deposit(-50.0);
        assertEquals(100, bankAccount.getBalance());
    }


    @Test
    public void withdrawTest() {
        //calling real method as we have used spy to bankAccount object
        bankAccount.withdraw(50);
        assertEquals(50, bankAccount.getBalance());
    }

    @Test
    public void withdrawNegativeTest() {
        //calling real method as we have used spy to bankAccount object
        bankAccount.withdraw(700);
        assertEquals(100, bankAccount.getBalance());
    }
    @Test
    public void withdrawNegativeTest2() {
        //calling real method as we have used spy to bankAccount object
        bankAccount.withdraw(-10);
        assertEquals(100, bankAccount.getBalance());
    }


    @Test
    public void withdrawWithStubTest() {
        doNothing().when(bankAccount).withdraw(50);
        //calling mock method as we have stubbed in above line
        bankAccount.withdraw(50);
        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    public void testDepositAndWithdraw() {
        doNothing().when(bankAccount).withdraw(50.0);

        bankAccount.deposit(100.0);
        bankAccount.withdraw(50.0);

        assertEquals(200.0, bankAccount.getBalance()); // Real deposit method
        // Balance remains 200.0 because withdraw was stubbed
    }
}
