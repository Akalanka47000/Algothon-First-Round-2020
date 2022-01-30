import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer count = Integer.parseInt(reader.readLine().trim());
        ArrayList<String> animals = new ArrayList();
        for (int i = 0; i < count; i++) {
            String animal = reader.readLine().trim();
            animals.add(animal);
        }
        if (animals.indexOf("wolf") == animals.size() - 1) {
            System.out.println("Hey leave my farm");
        } else {
            System.out.println("Hey! Goat in " + (animals.indexOf("wolf") + 1) + "! Wolf is going to eat you!");
        }
    }
}