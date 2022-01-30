import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().trim();
        String newStr = str.replaceAll("A", "").replaceAll("E", "").replaceAll("I", "").replaceAll("O", "")
                .replaceAll("U", "").replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "")
                .replaceAll("u", "");
        System.out.println(str.length() - newStr.length());
    }
}