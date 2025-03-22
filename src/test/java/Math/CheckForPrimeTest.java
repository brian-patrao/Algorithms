package Math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CheckForPrimeTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 1031})
    public void testCheckForPrimeTrue(int number) {
        assertTrue(CheckForPrime.naiveCheckForPrime(number));
        assertTrue(CheckForPrime.betterApproachForPrime(number));
        assertTrue(CheckForPrime.optimalSolutionForPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 1})
    public void testCheckForPrimeFalse(int number) {
        assertFalse(CheckForPrime.naiveCheckForPrime(number));
        assertFalse(CheckForPrime.betterApproachForPrime(number));
        assertFalse(CheckForPrime.optimalSolutionForPrime(number));
    }
}