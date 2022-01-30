import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer count = Integer.parseInt(reader.readLine().trim());
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < count; i++) {
            String arr[] = reader.readLine().trim().split(" ");
            map.put(arr[0], arr[1]);
        }
        while (true) {
            try {
                String str = reader.readLine().trim();
                if (str.length() == 0)
                    break;
                if (map.containsKey(str)) {
                    System.out.println(str + "=" + map.get(str));
                } else {
                    System.out.println("Not found");
                }
            } catch (NullPointerException e) {
                break;
            }
        }
    }
}