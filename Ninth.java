import java.util.Scanner;
class Ninthques{
    public static int GCD(int n1, int n2){
        while(n1 != n2){
            if(n1 > n2){
                n1 = n1 - n2;
            }
            else{
                n2 = n2 - n1;
            }
            
        }return n1;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        System.out.println("GCD is=" +GCD(n1 , n2));



    }
}