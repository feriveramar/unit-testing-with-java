import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VanyaAndFenceTest {

    @Test
    public void testExample1() {
        int n = 3;
        int h = 7;
        int[] heights = {4, 5, 14};
        int result = VanyaAndFence.calculateMinWidth(n, h, heights);
        assertEquals(4, result); // Resultado esperado
    }

    @Test
    public void testExample2() {
        int n = 6;
        int h = 1;
        int[] heights = {1, 1, 1, 1, 1, 1};
        int result = VanyaAndFence.calculateMinWidth(n, h, heights);
        assertEquals(6, result); // Resultado esperado
    }

    @Test
    public void testExample3() {
        int n = 6;
        int h = 5;
        int[] heights = {7, 6, 8, 9, 10, 5};
        int result = VanyaAndFence.calculateMinWidth(n, h, heights);
        assertEquals(11, result); // Resultado esperado
    }
}
