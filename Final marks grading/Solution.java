import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer count = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < count; i++) {
            Integer grade = Integer.parseInt(reader.readLine().trim());
            if (grade > 40) {
                String last = grade.toString().substring(grade.toString().length() - 1, grade.toString().length());
                int diff = 0;
                if (Integer.parseInt(last) < 5) {
                    diff = 5 - Integer.parseInt(last);

                } else {
                    diff = 10 - Integer.parseInt(last);
                }
                int newGrade = grade;
                if (diff < 3) {
                    newGrade = (int) (5 * (Math.ceil(Math.abs(grade / 5))));
                    if (newGrade < grade) {
                        newGrade += 5;
                    }
                }
                System.out.println(newGrade);
            } else {
                System.out.println(grade);
            }
        }
    }
}