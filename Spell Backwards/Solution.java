import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().trim();
        if (str.toLowerCase().equals(new StringBuilder(str.toLowerCase()).reverse().toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}