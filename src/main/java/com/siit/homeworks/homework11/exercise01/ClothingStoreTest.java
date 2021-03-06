package com.siit.homeworks.homework11.exercise01;

//import homework11.exercise5.streams.tutorial.Streams;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ClothingStoreTest {

    @Test
    public void shouldCountPairs() {
        List<Integer> input = asList(1, 2, 3, 1, 2, 2, 1, 4, 5);
        ClothingStore c = new ClothingStore();
        long result = c.countPairs(input);
        assertEquals(result, (2l));
    }

    @Test
    public void shouldCountPairsWithoutValue() {
        List<Integer> input = asList();
        ClothingStore c = new ClothingStore();
        long result = c.countPairs(input);
        assertEquals(result, (0l));
    }

    @Test
    public void shouldCountPairsWithOneValue() {
        List<Integer> input = asList(1);
        ClothingStore c = new ClothingStore();
        long result = c.countPairs(input);
        assertEquals(result, (0l));
    }

    @Test
    public void shouldCountPairsWithDistinctValue() {
        List<Integer> input = asList(1, 2, 3, 4, 5, 6);
        ClothingStore c = new ClothingStore();
        long result = c.countPairs(input);
        assertEquals(result, (0l));
    }
}
