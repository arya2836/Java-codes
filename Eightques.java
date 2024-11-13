import java.util.Scanner;
class Eirthques{
    public static int powerRaised( int x, int n){
         int result=1;
         for(int i=1; i<=n; i++){
            result= result*x;
        }
         return result;

        }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
         int nowresult= powerRaised(x,n);
        System.out.println(nowresult);

    }
}