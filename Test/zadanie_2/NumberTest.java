package zadanie_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberTest {

    private Number checker;

    @BeforeEach
    public void setUp() {
        checker = new Number();
    }

    @Test
    public void testNumberInInterval() {
        assertTrue(checker.numberInInterval(50));
    }

    @Test
    public void testNumberBelowInterval() {
        assertFalse(checker.numberInInterval(20));
    }

    @Test
    public void testNumberAboveInterval() {
        assertFalse(checker.numberInInterval(150));
    }

    @Test
    public void testLowerBound() {
        assertFalse(checker.numberInInterval(25));
    }

    @Test
    public void testUpperBound() {
        assertFalse(checker.numberInInterval(100));
    }
}