The SLIIT administration has decided to pair up senior student and junior students for a mentorship program. To pair them up, the final digits of their IT numbers have to be perfect divisors of one another. Write a program that helps our administrative staff with this task.

Input Format

The first line of input will contain the IT number of the first student (I1)
The second line of input will contain the IT number of the second student (I2)
The third line will contain how many final digits are considered (N)
Constraints

00000000 <= I1 <= 99999999
00000000 <= I2 <= 99999999
1 <= N <= 8
Output Format

One word in the output, "Pair" if the students should be paired, "No" if not
Sample Input 0

12345678
12345672
1
Sample Output 0

Pair
Explanation 0

consider the last digit(N=1) from 12345678 = 8
consider the last digit(N=1) from 12345672 = 2
2 is a perfect divisor of 8
therefore the answer is "Pair"