import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int hour = Integer.parseInt(tokenizer.nextToken());
        int minute = Integer.parseInt(tokenizer.nextToken());

        LocalTime time = LocalTime.of(hour, minute);
        time = time.minusMinutes(45);

        System.out.println(time.getHour() + " " + time.getMinute());
    }
}

