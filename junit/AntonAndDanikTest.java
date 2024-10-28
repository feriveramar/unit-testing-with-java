import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AntonAndDanikTest {

    @Test
    public void testAntonWins() {
        // Ejemplo 1: Anton gana
        String result = AntonAndDanik.determineWinner(6, "ADAAAA");
        assertEquals("Anton", result);
    }

    @Test
    public void testDanikWins() {  
        // Ejemplo 2: Danik gana
        String result = AntonAndDanik.determineWinner(7, "DDDAADA");
        assertEquals("Danik", result);
    }

    @Test
    public void testFriendship() {
        // Ejemplo 3: Empate
        String result = AntonAndDanik.determineWinner(6, "DADADA");
        assertEquals("Friendship", result);
    }
}
