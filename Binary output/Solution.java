import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.parseInt(reader.readLine().trim());
        String bin = num.toBinaryString(num) + "x";
        int max = 0;
        int count = 0;
        for (char c : bin.toCharArray()) {
            if (c == '1') {
                count++;
            } else {
                if (count > max) {
                    max = count;
                    count = 0;
                }
            }
        }
        System.out.println(max);
    }
}