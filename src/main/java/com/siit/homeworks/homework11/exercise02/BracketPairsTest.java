package com.siit.homeworks.homework11.exercise02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BracketPairsTest {

    BracketPairs b = new BracketPairs();

    @Test
    public void shouldGetBracketPairsTrue() {

        String test = "({([])})";

        boolean expected = b.checkBracketPairs(test);
        if (expected) {
            assertTrue(expected);
        } else {
            assertFalse(expected);
        }

    }

    @Test
    public void shouldGetBracketPairsFalse() {

        String test = "({([]()})";

        boolean expected = b.checkBracketPairs(test);
        if (expected) {
            assertTrue(expected);
        } else {
            assertFalse(expected);
        }

    }

    @Test
    public void shouldGetBracketPairsFalseWithChar() {

        String test = "({([a])})";

        boolean expected = b.checkBracketPairs(test);
        if (expected) {
            assertTrue(expected);
        } else {
            assertFalse(expected);
        }

    }
}
