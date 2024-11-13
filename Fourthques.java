import java.util.Scanner;
class Fourthques{
    public static double circum(double r){
        double circumference = 2* 3.14 * r;
        //System.out.println(circumference); -----we also can do 
        return circumference;
    }
    

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();
    
   // System.out.println(circum(r));
    double circumference = circum(r);
    System.out.println(circumference);
    
}
}