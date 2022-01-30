O/L marking has the following grading policy:

int grades[n]: the grades before rounding
Every student receives a grade in the inclusive range from 0 to 100
Any grade less than 40 is a failing grade
Head decided to round each student's grade according to these rules:

If the difference between the grade and the next multiple of 5 is less than 3 , round grade up to the next multiple of 5.
If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
Examples :

grade = 83 round to 85 (85 - 83 is less than 3)
grade = 23 do not round (result is less than 40)
grade = 67 do not round (70 - 67 is 3 or higher)
Given the initial value of grade for each of n students, write code to automate the rounding process.

Input Format

The first line contains a single integer, n, the number of students.
Each line i of the n subsequent lines contains a single integer, grades[i]
Constraints

1 <= n <= 60
0 <= grades[i] <= 100
Output Format

Returns - int[n]: the grades after rounding as appropriate

Sample Input 0

3
67
48
23 
Sample Output 0

67
50
23
Explanation 0

Student 1 received a 67, and the next multiple of 5 from 67 is 70. Since 70 - 67 = 3, the grade will not be modified and the student's final grade is 67. Student 2 received a 48, and the next multiple of 5 from 48 is 50. Since 50 - 48 = 2, the student's grade will be rounded to 50. Student 3 received a grade below 23, so the grade will not be modified and the student's final grade is 23.