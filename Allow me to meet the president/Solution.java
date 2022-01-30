import java.io.*;
import java.util.*;

public class Solution {

    public static String addToIndex(String str, Integer index, String characters) {
        return new StringBuilder(str).insert(index, characters).toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine().trim();
        if (num.contains("P") && num.contains("A") && num.contains("M") && num.contains("S")) {
            num = num.replaceAll("T", "");
            System.out.println("C" + num);
        } else {
            System.out.println(num);
        }

    }
}