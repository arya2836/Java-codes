import java.util.Scanner;
public class Thirdques{
    public static int whoGreat(int a,  int b){
        if(a > b){
            return a;
            }

        else{
            
            return b;
        }
    }
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         int nowgreat = whoGreat(a,b);
         System.out.println(nowgreat);

    }
}
