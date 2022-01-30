A supermarket is trying to avoid wastage when packing sugar packets. They are employing a new strategy which they hope will minimise the wastage while giving customers the option of choosing from a resonable number of large, medium, and small packs.

Given total weight of sugar (w) in the supermarket on a given day:

Half of the total weight (50%) should be packed into (F) number of 400g packets
Quarter of the total weight (25%) should be packed into (T) number of 200g packets.
The balance should be packed into (H) number of 100g packets.
You have to write a program that will help the supermarket find all the packet counts (F, T, H), and the balance sugar B that will remain after all the packaging is done.

Input Format

The first line of input will contain the Total weight of sugar(w) in kilograms
Constraints

1 <= w <= 100000

Output Format

The output should contain four lines F, T, H, B, in the form of type=count (see sample answer for a guide)

Sample Input 0

30
Sample Output 0

F=37
T=37
H=78
B=0
Explanation 0

Consider ½ of 30 is Fw 30/2=15
Consider ¼ of 30 is Tw 30/4 = 7.5
Consider ¼ of 30 is Hw 30/4 = 7.5
F=15*1000/400 = 37 400g package Balance is Fb = 15*1000-37*400 = 200g
T=7.5*1000/200 =37 200g package Balance is Tb = 7.5*1000-37*200 = 100g
H=(Fb+Tb+(7.5*1000))/100 =78
B=(Fb+Tb+(7.5*1000-78*100)) = 0