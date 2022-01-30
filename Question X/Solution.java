import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer inlet = Integer.parseInt(reader.readLine().trim());
        Integer usage = Integer.parseInt(reader.readLine().trim());
        Integer target = Integer.parseInt(reader.readLine().trim());
        int sum = 0;
        int days = 0;
        while (true) {
            days++;
            if (days != 1)
                sum -= usage;
            sum += inlet;
            if (sum >= target) {
                System.out.println(days);
                break;
            }
        }
    }
}