import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.List;
//import java.util.stream.Collectors;

class TestResults03 {

    public static void main(String[] args) {

        List<ArrayList<Integer>> list; // Arraylistの二次元配列

        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get(".", "scores.csv"),
                StandardCharsets.UTF_8)) {

            int index = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                // list[index] = line.split(",");
                // i++;
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        // 多次元配列でのソートのやり方
        // int[][] array = new int[][] { { };
        // Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));

        // ArrayListのソートのやり方
        // List<String> deta =
        // list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    }

}
