import java.util.Scanner;
class Arrays3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size, how many numbers u want to Enter");
        int size = sc.nextInt();
        int n[] = new int[size];
        
        System.out.println("Enter your numbers according to size  you gave");
        for(int i =0; i<size; i++){
            n[i] = sc.nextInt();
        }
        System.out.println("Which number u want to search");
        int s = sc.nextInt();

        for(int i= 0; i<size; i++){
            if(n[i]==s){
                System.out.println("your num is on index " +i);
            }
        }
        
        
        }
            
            
        }

    



