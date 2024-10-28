public class AntonAndDanik {

    public static String determineWinner(int n, String results) {
        int antonWins = 0;
        int danikWins = 0;

        // Contar las victorias de Anton y Danik
        for (int i = 0; i < n; i++) {
            char result = results.charAt(i);
            if (result == 'A') {
                antonWins++;
            } else if (result == 'D') {
                danikWins++;
            }
        }

        // Determinar quién ganó más juegos
        if (antonWins > danikWins) {
            return "Anton";
        } else if (danikWins > antonWins) {
            return "Danik";
        } else {
            return "Friendship";
        }
    }
}
