import java.util.Scanner;
class Table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for print the table");
        int a = sc.nextInt();
        System.out.println("Table is = ");
        for( int i=1; i<11; i++){
             System.out.println(a*i);
        }

    }

}