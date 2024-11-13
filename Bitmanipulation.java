import java.util.Scanner;
class Bitmanipulation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int opr = sc.nextInt();
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;

        if(opr==0){
            int newbitmask = ~(bitmask);
            int newnumber = newbitmask & n;
            System.out.println(newnumber);
        }
        else{

            int newno = bitmask | n;
            System.out.println(newno);
        }


    }
    

}