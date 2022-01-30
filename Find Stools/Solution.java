import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().trim().replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", "");
        String highest = "";
        if (str.contains("4")) {
            highest = "4";
        } else if (str.contains("3")) {
            highest = "3";
        } else if (str.contains("2")) {
            highest = "2";
        } else {
            highest = "1";
        }
        String newStr = str.replaceAll(highest, "");
        System.out.println(str.length() - newStr.length());
    }
}