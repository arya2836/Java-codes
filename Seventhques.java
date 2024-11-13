import java.util.Scanner;
 

public class Seventhques{
    public static void main(String args[]){
        int p=0, n=0, z=0;
        
        System.out.println("press 1 for continue, press 0 for stop");
        Scanner sc=new Scanner(System.in);
        int press = sc.nextInt();


        while(press == 1){
            System.out.println("Enter your number");
            int input =sc.nextInt();
            if (input > 0){
                p++;
            }
            else if(input < 0){
                n++;

            }
            else{
                z++;
            }
            System.out.println("Press 1 for continue and 0 for stop");
            press = sc.nextInt();

        }
        System.out.println("positive numbers are="+ p);
        System.out.println("negetive numbers are="+ n);;
        System.out.println("zeros are="+ z);
    }
}