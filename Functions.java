package algorithm.fun;

import java.util.Map;
import java.util.TreeMap;

public class Functions {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Map<String, String> aprilWinner = new TreeMap<>();
        aprilWinner.put("April 2015", "Bob");
        aprilWinner.put("April 2016", "Sam");
        aprilWinner.put("April 2017", "Ansal");

        System.out.println("Printing at first--->");

        aprilWinner.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));

        aprilWinner.computeIfAbsent("April 2014", (k) -> "Ansal");
        System.out.println("Printing again--->");

        aprilWinner.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
        aprilWinner.replaceAll((k, v) -> v.toUpperCase());

        aprilWinner.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));

        // IntToDoubleFunction

    }

}
