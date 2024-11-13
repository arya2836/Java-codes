class pens{
    String color;
    String type;
    public void write(){
        System.out.println("write ;something");

    }
    public void printtype() {
     System.out.println(this.type); //this keyword.....
     System.out.println(this.color); //this keyword.....
    }
}
    

 public class Thiskeyword{
    public static void main(String args[]){
        

    //object for pen1
    pens pen1= new pens();
    pen1.color = "blue";
    pen1.type  = "gel";
    
    //object for pen2
    pens pen2 = new pens();
    pen2.color = "black";
    pen2.type = "ballpoint";

    pen1.printtype();
    pen2.printtype();

    }
    
}