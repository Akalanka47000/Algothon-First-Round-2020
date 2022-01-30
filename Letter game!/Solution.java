import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer count = Integer.parseInt(reader.readLine().trim());
        char arr[] = reader.readLine().trim().toCharArray();
        Arrays.sort(arr);
        System.out.println(new String(arr));

    }
}