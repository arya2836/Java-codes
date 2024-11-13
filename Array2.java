import java.util.Scanner;
class Array2{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of array");
       int size = sc.nextInt();
        int a[] = new int [size]; //  array variable
        
    
        System.out.println("Enter number according to ur size");
        for(int i =0 ; i<a.length; i++){
            
            a[i] = sc.nextInt();
        }
        System.out.println("Which number you want to search");
        int x = sc.nextInt();
        for(int i=0; i<a.length; i++){
            if(a[i] == x){
                System.out.println("x fount at index:  " +i);
            }
            

        }
        System.out.println("Number not present");



    }
}