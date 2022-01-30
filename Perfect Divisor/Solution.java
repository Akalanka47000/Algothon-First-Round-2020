// passes 4/5 test cases

import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String student1 = reader.readLine().trim();
        String student2 = reader.readLine().trim();
        Integer digits = Integer.parseInt(reader.readLine().trim());
        String student1Sub = student1.substring(student1.length() - digits - 1, student1.length() - 1);
        String student2Sub = student2.substring(student2.length() - digits - 1, student2.length() - 1);
        double ans1 = Integer.parseInt(student1Sub) / Integer.parseInt(student2Sub);
        double ans2 = Integer.parseInt(student2Sub) / Integer.parseInt(student1Sub);
        if (ans1 == Math.floor(ans1) && ans2 == Math.floor(ans2)) {
            System.out.println("Pair");
        } else {
            System.out.println("No");
        }
    }
}