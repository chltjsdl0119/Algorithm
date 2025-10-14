import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> set1 = readSet(reader);
        Set<Integer> set2 = readSet(reader);

        set1.retainAll(set2);

        List<Integer> list = set1.stream()
                .sorted()
                .collect(Collectors.toList());

        StringBuilder builder = new StringBuilder();

        for (Integer i : list) {
            builder.append(i).append(" ");
        }

        System.out.println(builder);
    }

    private static Set<Integer> readSet(BufferedReader reader) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        Set<Integer> set = new HashSet<>(n);

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        while(tokenizer.hasMoreTokens()) {
            set.add(Integer.parseInt(tokenizer.nextToken()));
        }

        return set;
    }
}
