package homework11.exercise2;

import homework11.exercise3.Transaction;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
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
