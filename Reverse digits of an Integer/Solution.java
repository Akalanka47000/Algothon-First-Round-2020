import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().trim().replaceAll("x", "").replaceAll("=", "").replaceAll(" ", "");
        Boolean minus = false;
        if (str.contains("-")) {
            minus = true;
            str = str.replaceAll("-", "");
        }

        String output = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            output += String.valueOf(str.charAt(i));
        }
        try {
            Integer num = Integer.parseInt(output);
            if (minus) {
                System.out.println(num * -1);
            } else {
                System.out.println(num);
            }
        } catch (Exception e) {
            System.out.println(0);
        }
    }
}