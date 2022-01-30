import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().trim();
        Boolean valid = true;
        for (char c : str.toCharArray()) {
            if (c != '1' && c != '6' && c != '8' && c != '9' && c != '3') {
                valid = false;
            }
        }
        if (valid) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}