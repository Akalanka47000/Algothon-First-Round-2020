import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());
        if (n % 2 == 1) {
            System.out.println("Abnormal");
        } else {
            if (n >= 10 && n <= 15) {
                System.out.println("Not Abnormal");
            } else if (n >= 16 && n <= 25) {
                System.out.println("Abnormal");
            } else if (n > 25) {
                System.out.println("Not Abnormal");
            }
        }
    }
}