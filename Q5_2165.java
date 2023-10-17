import java.util.Scanner;
public class Q5_2165 {
    public static void hanoi(int n,char first_twr,char second_twr,char third_twr){
        if(n==0){
            return;
        }
        hanoi(n-1,first_twr,third_twr,second_twr);
        System.out.println(first_twr+" "+second_twr);
        hanoi(n-1,third_twr,second_twr,first_twr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = (1 << N) - 1 ;
        System.out.println(ans);
        hanoi(N, '1', '3', '2');
    }
}