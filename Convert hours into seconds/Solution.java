import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Double hours = Double.parseDouble(reader.readLine().trim());
        DecimalFormat formatter = new DecimalFormat("#,###");
        System.out.println("Calculated seconds to the given hours: " + formatter.format((hours * 60 * 60)));
    }
}