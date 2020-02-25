package algorithm.fun;


public class TowersApp {

    static int nDisks = 3;

    public static void main(String[] args) {

        doTowers(nDisks, 'A', 'B', 'C');
    }

    private static void doTowers(int topN, char from, char inter, char to) {
        if (topN == 1) {
            System.out.println("Disk 1 move from " + from + "  to " + to);
        } else {
            doTowers(topN - 1, from, to, inter); // from -to -inter
            System.out.println("Disk " + topN + " move from " + from + "  to " + to);
            doTowers(topN - 1, inter, from, to); // from -inter -to
        }
    }

}
