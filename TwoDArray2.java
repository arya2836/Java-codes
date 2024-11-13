import java.util.Scanner;
public class TwoDArray2{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter row size");
        int row = sc.nextInt();
        System.out.println("Enter column size");
        int column =  sc.nextInt();
        int num[][] = new int [row][column];

        System.out.println("Enter those numbers which u want to input on matrix");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                num[i][j] = sc.nextInt();
            }
        }
        System.out.println("Which number u want to search");
        int n = sc.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(num[i][j] == n){
                    System.out.println("your number found on indices ( "+ i + ","+ j +")");
                }
            }

        }

  }
}
