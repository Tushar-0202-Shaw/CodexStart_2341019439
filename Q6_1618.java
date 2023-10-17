/*
Name :- Tushar Shaw
Regd No. :- 2341019439
Linl :- https://cses.fi/problemset/task/1618
    */
import java.util.Scanner;
public class Q6_1618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long C = 0;
        while(N != 0) {
            C += (N/5);
            N /= 5;
        }
        System.out.println(C);
    }
}
