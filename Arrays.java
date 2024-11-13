import java.util.Scanner;
class Arrays{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size, how many numbers u want to print");
        int size = sc.nextInt();
        int n[] = new int [size];

        
   // int[] marks = new int[3];    
      //int marks[] = {97, 98, 99};

        
        //marks[0]=97;
        //marks [1]=98;
        //marks [2]=99;

       // System.out.println("Physics=    "+marks[0]);
        //System.out.println("Chemistry=  "+marks[1]);
        //System.out.println("Maths=      "+marks[2]);
        System.out.println("Enter your numbers which numbers");
        for(int i=0; i<size; i++){
            n[i] = sc.nextInt();
            
        }
        System.out.println("These are your numbers after printing");
        for(int i=0; i<size; i++){
           System.out.println(n[i]);
        }
        
    }
}