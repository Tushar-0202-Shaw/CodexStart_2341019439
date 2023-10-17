import java.util.Scanner;
public class Q1_1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-");
        long x = sc.nextInt();
        System.out.print(x);
        while(x!=1){
            if(x%2==0){
                x /= 2;
            }  else {
                x = (x*3)+1;
            }
            System.out.print(" "+x);
        }
    }
}
