import java.io.*;
import java.util.*;

public class Solution {

    static Set<String> permutaions = new HashSet<String>();

    static void generatePermutations(String str, String ans) {
        if (str.length() == 0) {
            permutaions.add(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            generatePermutations(ros, ans + ch);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().trim();
        generatePermutations(str, "");
        TreeSet<String> treeSet = new TreeSet(permutaions);
        for (String permutation : treeSet) {
            System.out.println(permutation);
        }
    }
}