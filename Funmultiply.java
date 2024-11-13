import java.util.Scanner; 
 class Funmultiply{
    public static int Multiply( int a, int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mul=Multiply(a,b);
        System.out.println("Multiplication of two num = "+ mul);

    }
}