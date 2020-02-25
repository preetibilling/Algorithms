package algorithm.fun;

import java.util.Arrays;

public class NutsAndBoltsProblem {

    public static void main(String[] args) {
        char charArray[] = { '@', '#', '$', '%', '^', '&', '~', '*', '!' };
        Arrays.sort(charArray);

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }

}
