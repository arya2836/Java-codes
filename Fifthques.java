import java.util.Scanner;
class Fifthques{
    public static boolean vote(int age){
        if(age>=18){
            System.out.println("Yes I am Eligible");
            return true;
        }
        else{
            System.out.println("Nope I am not Eligible");
            return false;
        }
    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(vote(age));
    }
}