package algorithm.fun;


public class RaisingNumberToPowerByRecursion {

    public static void main(String[] args) {
        // raising 2 to the power of 8
        int x = 2, y = 6;

        int res = calculate(x, y);

        System.out.println("res *** " + res);
    }

    private static int calculate(int x, int y) {
        if (y == 1) {
            return x;
        } else {
            x = calculate(x * x, y / 2);
            return x;
        }
    }

}
