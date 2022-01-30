import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            Integer num1 = Integer.parseInt(reader.readLine().trim());
            Integer num2 = Integer.parseInt(reader.readLine().trim());
            if (num1 > num2)
                System.out.println(num1);
            else
                System.out.println(num2);
        }
    }
}