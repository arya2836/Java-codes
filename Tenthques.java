import java.util.Scanner;
class Tenthques{
    public static int fibonacci(int n){
        int x =0, y=1, z;
        for(int i=1; i<=n; i++){
         System.out.println(x);
         z= x + y;
         x=y;
         y=z;
        }return x;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your limit for series");
        int n = sc.nextInt();
        System.out.println("Now this is your Fibonacci series");
        System.out.println(fibonacci(n));
    }
}