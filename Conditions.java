import java.util.Scanner;
class Conditions{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for a ");
        int a = sc.nextInt();
        System.out.println("Enter number for b");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("a is Equal to b");
        }
          else if(a>b){
                System.out.println(" a is Greater");
            }
            else{
                System.out.println(" a is Lesser");
            }
        
        
    }
}

