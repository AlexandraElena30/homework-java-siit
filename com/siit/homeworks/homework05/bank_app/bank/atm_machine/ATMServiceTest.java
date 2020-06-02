package com.siit.homeworks.homework05.bank_app.bank.atm_machine;

import com.siit.homeworks.homework05.bank_app.bank.repository.Database;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class ATMServiceTest {
    private User sut;

    @Mock
    private Database database;
    @Before
    public void setup() {
        sut = new User("ion");
    }
    @Test
    public void given_card_when_interrogate_balance_then_balance_is_returned() {
        //given

        Card card = new Card("1234",100.0,"John","0000");
        BankAccount ba=new BankAccount("123456788",card);
        //Card card1 = mock(Card.class);
        double balance = 100.0;



        given(database.addToDatabase(ba.getIBAN())).willReturn(true);

        //when
        ArrayList<BankAccount> returnedAccounts= sut.getAccounts();

        //then
        assertThat(returnedAccounts.contains(ba)).isTrue();



    }

}


