import java.util.Scanner;
class Secondques{
    public static int sum(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
            sum=sum+i;
            System.out.println(sum);
            }
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Till which number,sum of odd you want");
        int n = sc.nextInt();
        sum(n);

    }
}