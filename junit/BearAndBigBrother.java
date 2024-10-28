public class BearAndBigBrother {
    public static int yearsUntilLimakIsHeavier(int a, int b) {
        int years = 0;
        while (a <= b) {
            a *= 3; // Limak's weight triples each year
            b *= 2; // Bob's weight doubles each year
            years++;
        }
        return years;
    }
}
