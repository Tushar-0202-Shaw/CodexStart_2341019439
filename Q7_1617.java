/*
Name :- Tushar Shaw
Regd No. :- 2341019439
Linl :- https://cses.fi/problemset/task/1617
    */
import java.util.Scanner;
public class Q7_1617 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long number = sc.nextInt();
            long ans = 1;
            for(int i = 0; i < number; i++) {
                ans = ans*2 % 1000000007;
            }
            System.out.println(ans);
    }
}
