import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = reader.readLine().trim().split(",");
        ArrayList<Integer> list = new ArrayList();
        for (String str : arr) {
            list.add(Integer.parseInt(str));
        }
        System.out.println("Smallest number: " + Collections.min(list));
        System.out.println("Largest number: " + Collections.max(list));
    }
}