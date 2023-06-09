/*
Take N as input, Calculate it's reverse also Print the reverse.

Input Format
Constraints
0 <= N <= 1000000000

Output Format

Sample Input
123456789

Sample Output
987654321

Explanation
You've to calculate the reverse in a number, not just print the reverse.

*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans=0;
        while(n>0)
        {
            ans = ans*10+n%10;
            n/=10;
        }
        System.out.println(ans);
    }
}