Calculate the square matrix diagonal difference takes the following parameter:

int arr[n][m]: an array of integers
Note: |x| is the absolute value of x

Input Format

The first line contains a single integer (n), the number of rows and columns in the square matrix arr.
Each of the next n lines describes a row, arr[i], and consists of n space-separated integers arr[i][j].
Constraints

(-100) <= arr[i][j] <= 100
Output Format

Return the absolute difference between the sums of the matrix’s two diagonals as a single integer.
Sample Input 0

3
1 2 3
4 5 6
9 8 9
Sample Output 0

2
Explanation 0

Diagonal starting at top left = 1+5+9 = 15 Diagonal starting at top right = 3+5+9 = 17 Absolute difference is |15 - 17| = |-2| = 2