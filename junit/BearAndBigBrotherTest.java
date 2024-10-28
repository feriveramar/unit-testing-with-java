import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BearAndBigBrotherTest {

    @Test
    public void testLimakBecomesHeavierInOneYear() {
        assertEquals(1, BearAndBigBrother.yearsUntilLimakIsHeavier(1, 1)); // Limak pesará más que Bob en 1 año
    }

    @Test
    public void testLimakBecomesHeavierInTwoYears() {
        assertEquals(2, BearAndBigBrother.yearsUntilLimakIsHeavier(1, 2)); // Limak pesará más que Bob en 2 años
    }

    @Test
    public void testLimakBecomesHeavierInThreeYears() {
        assertEquals(3, BearAndBigBrother.yearsUntilLimakIsHeavier(2, 5)); // Limak pesará más que Bob en 3 años
    }

    @Test
    public void testEqualWeights() {
        assertEquals(1, BearAndBigBrother.yearsUntilLimakIsHeavier(5, 5)); // Limak y Bob tienen el mismo peso
    }

    @Test
    public void testLimakIsHeavierInitially() {
        assertEquals(0, BearAndBigBrother.yearsUntilLimakIsHeavier(20, 10)); // Limak ya es más pesado que Bob
    }

    @Test
    public void testLimakBecomesHeavierWithDifferentInitialWeights() {
        assertEquals(2, BearAndBigBrother.yearsUntilLimakIsHeavier(5, 10)); // Limak pesará más que Bob en 2 años
    }
}
