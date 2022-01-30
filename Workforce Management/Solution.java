import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer os = Integer.parseInt(reader.readLine().trim());
        Integer team = Integer.parseInt(reader.readLine().trim());
        Integer ns = Integer.parseInt(reader.readLine().trim());
        double ans = (os / (double) ns) * team;
        System.out.println((int) Math.ceil(ans));
    }
}