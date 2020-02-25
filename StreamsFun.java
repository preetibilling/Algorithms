package algorithm.fun;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsFun {

    public static void main(String[] args) {
        Integer nums[] = { 1, 2, 3, 4 };
        Stream<Integer> streamOfIntegers = Arrays.stream(nums);

        long greaterThanOne = streamOfIntegers.filter(i -> i > 1).count();
        
        System.out.println(greaterThanOne);

        System.out.println(Stream.of(nums).count());

        Stream.of(2, 4, 5);

        List<String> fileContents = readFile("text.txt");
    }

    private static List<String> readFile(String uri) {
        List<String> response = new ArrayList<String>();
        try {
            Stream<String> stream = Files.lines(Paths.get(uri));

            stream.forEach(line -> {
                response.add(line);
            });
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}
