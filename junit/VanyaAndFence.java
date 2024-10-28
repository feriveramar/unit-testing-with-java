import java.util.Scanner;

public class VanyaAndFence {

    public static int calculateMinWidth(int n, int h, int[] heights) {
        int totalWidth = 0;
        for (int i = 0; i < n; i++) {
            int height = heights[i];
            if (height > h) {
                totalWidth += 2;
            } else {
                totalWidth += 1;
            }
        }
        return totalWidth;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        System.out.println(calculateMinWidth(n, h, heights));
    }
}
