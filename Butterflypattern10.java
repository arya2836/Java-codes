class Butterflypattern10{
    public static void main(String args[]){
        
        //first half
        for(int i=1; i<=6; i++){
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space
            int space=2*(6-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        //lower half
        for(int i=6; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int spaces=2*(6-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();       
         }
    }
}