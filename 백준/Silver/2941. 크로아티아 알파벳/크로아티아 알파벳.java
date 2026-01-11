import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<String> set = Set.of(
                "c=",
                "c-",
                "d-",
                "lj",
                "nj",
                "s=",
                "z="
        );

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        input = input.replace("dz=", "*");

        for (String s : set) {
            input = input.replace(s, "*");
        }

        System.out.println(input.length());
    }
}
