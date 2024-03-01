package zadanie_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberCheckerTest {

    private NumberChecker checker;

    @BeforeEach
    public void setUp() {
        checker = new NumberChecker();
    }

    @Test
    public void testEvenNumber() {
        assertTrue(checker.evenOddNumber(4));
    }

    @Test
    public void testOddNumber() {
        assertFalse(checker.evenOddNumber(7));
    }

    @Test
    public void testZero() {
        assertTrue(checker.evenOddNumber(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        assertTrue(checker.evenOddNumber(-6));
    }

    @Test
    public void testNegativeOddNumber() {
        assertFalse(checker.evenOddNumber(-3));
    }
}