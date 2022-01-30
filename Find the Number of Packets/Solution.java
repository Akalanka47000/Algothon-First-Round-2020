import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer weight = Integer.parseInt(reader.readLine().trim());
        double count1 = (weight * 0.5 * 1000 / 400);
        double fb = (count1 - Math.floor(count1)) * 400;
        double count2 = (weight * 0.25 * 1000 / 200);
        double sb = (count2 - Math.floor(count2)) * 200;
        double count3 = (fb + sb + (weight * 0.25 * 1000)) / 100;
        double tb = (count3 - Math.floor(count3)) * 100;
        System.out.println("F=" + (int) Math.floor(count1));
        System.out.println("T=" + (int) Math.floor(count2));
        System.out.println("H=" + (int) Math.floor(count3));
        System.out.println("B=" + (int) tb);
    }
}