import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.parseInt(reader.readLine().trim());
        int check = (int) Math.floor(Math.sqrt(num));
        Boolean prime = true;
        for (int i = check; i > 1; i--) {
            if (num / (double) i == Math.floor(num / (double) i)) {
                prime = false;
            }
        }
        if (prime)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
}