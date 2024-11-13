import java.util.Scanner;
public class TwoDArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row = sc.nextInt();
        System.out.println("Enter number of columns");
        int column = sc.nextInt();
        int num[][] = new int[row][column];


    System.out.println("Enter ur numbers");
    for(int i=0; i<row; i++){
        for(int j=0; j<column; j++){
            num[i][j] = sc.nextInt();
        }
        System.out.println();
    }
    for(int i=0; i<row; i++){
        for(int j=0; j<column; j++ ){
            System.out.print(num[i][j] +" ");
        }
        System.out.println();
    }
    
}
}
