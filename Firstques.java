import java.util.Scanner;
class Firstques{
    public static float avg(int a, int b, int c ){
        int sum = a+b+c;
       float average = sum/3f;
       System.out.println("your avg of three num is");
       System.out.println(average);
       return average;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a =sc.nextInt();
        System.out.println("Enter second number");
        int b =sc.nextInt();
        System.out.println("Enter third number");
        int c =sc.nextInt();
        avg(a,b,c);//function call
        
    }
}