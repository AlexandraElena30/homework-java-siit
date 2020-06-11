package com.siit.homeworks.homework11.exercise03;

import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class WallStreetTest {

    static Trader raoul = new Trader("Raoul", "Cambridge");

    static Trader mario = new Trader("Mario", "Milan");

    static Trader alan = new Trader("Alan", "Cambridge");

    static Trader brian = new Trader("Brian", "Cambridge");

    static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );
    WallStreet c = new WallStreet();

    @Test

    public void shouldGetTransaction2011() {


        List<Transaction> result = c.sortByYear(transactions);
        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(brian, 2011, 300));
        expected.add(new Transaction(raoul, 2011, 400));
        assertThat(result, IsIterableContainingInOrder.contains(expected.toArray()));
    }

    @Test
    public void shouldFindUniqueCities() {
        List<String> result = c.uniqueCities(transactions);
        List<String> expected = new ArrayList<>();
        expected.add("Cambridge");
        expected.add("Milan");
        assertThat(result, IsIterableContainingInOrder.contains(expected.toArray()));
    }

    @Test
    public void shouldFindCambridgeTraders() {
        List<Trader> result = c.cambridgeTraders(transactions);
        List<Trader> expected = new ArrayList<>();
        expected.add(alan);
        expected.add(brian);
        expected.add(raoul);
        assertThat(result, IsIterableContainingInOrder.contains(expected.toArray()));
    }

    @Test
    public void shouldFindTradersName() {
        List<Trader> result = c.tradersNameSorted(transactions);
        List<Trader> expected = new ArrayList<>();
        expected.add(alan);
        expected.add(brian);
        expected.add(mario);
        expected.add(raoul);
        assertThat(result, IsIterableContainingInOrder.contains(expected.toArray()));
    }

    @Test
    public void shouldFindBasedInMilan() {
        boolean result = c.basedInMilan(transactions);
        boolean expected = true;
        if (expected) {
            assertTrue(result);
        } else {
            assertFalse(result);
        }

    }

    @Test
    public void shouldFindTransactionFromCambridge() {
        List<Integer> result = c.tradersValueCambridge(transactions);
        List<Integer> expected = new ArrayList<>();
        expected.add(300);
        expected.add(1000);
        expected.add(400);
        expected.add(950);
        assertThat(result, IsIterableContainingInOrder.contains(expected.toArray()));
    }

    @Test
    public void shouldFindHighestValue() {
        int result = c.highestValue(transactions);
        int expected = 1000;
        assertEquals(result, (expected));
    }

    @Test
    public void shouldFindSmallestValue() {
        int result = c.smallestValue(transactions);
        int expected = 300;
        assertEquals(result, (expected));
    }
}
