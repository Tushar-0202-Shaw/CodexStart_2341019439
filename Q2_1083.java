/*
Name :- Tushar Shaw
Regd No. :- 2341019439
Linl :- https://cses.fi/problemset/task/1083
    */
import java.util.Scanner;
public class Q2_Missing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long sum = (x*(x+1))/2;
        for(int i = 0; i < x-1; i++) {
            long temp = sc.nextLong();
            sum = sum - temp;
        }
        System.out.println(sum);
    }
}
