/*
Name :- Tushar Shaw
Regd No. :- 2341019439
Linl :- https://cses.fi/problemset/task/1072
    */
import java.util.Scanner;
public class Q8_1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        for(long i=1;i<=x;i++){
            long n = ((i*i)*(i*i-1))/2;
            long m = 4*(i-1)*(i-2);
            System.out.println(n-m);
        }
    }
}
