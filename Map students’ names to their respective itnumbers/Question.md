The SLIIT administration has decided to map students’ names to their respective itnumbers. The objective is to find the itnumber for a given name using a query.

For each name queried, print the associated entry from your itnumber record on a new line in the form name=itnumber; if an entry for name is not found, print Not found instead.

Write a program that helps our administrative staff with this task.

Input Format

The first line contains an integer, n, denoting the itnumber of entries in the itnumber record.
Each of the n subsequent lines describes an entry in the form of 2 space-separated values on a single line.
The first value is a students’ name, and the second value is an 8 digit itnumber.
After the n lines of itnumber record entries, there are an unknown number of lines of queries. Each line (query) contains a name to look up, and you must continue reading lines until there is no more input.

Note: Names consist of lowercase English alphabetic letters and are first names only.

Constraints

1 <= n <= 10^5
1 <= queries <= 10^5
Output Format

On a new line for each query, print Not found if the name has no corresponding entry in the itnumber record; otherwise, print the full name and itnumber in the format name=itnumber.
Sample Input 0

4
vishnu 20200001
kala 20200012
myuran 20202001
bala 20204080
vishnu
kala
mala
myuran
Sample Output 0

vishnu=20200001
kala=20200012
Not found
myuran=20202001