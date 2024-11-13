public class student1
{
    String name;
    int rollno;
    int marks;
    
    void displayname()
    {
       System.out.println("Name of Student="+ name);
    }
    void displayrollno()
    {
        System.out.println("Rollno of Student="+ rollno);

    }
    void displaymarks()
    {
        System.out.println("Student Marks="+ marks );
    }
}

    class Ritesh extends student1
{
    {
    this.name= "Arya srivastava";
    this.rollno= 203548;
    this.marks= 700;
}   
}
 class ToniExample{

    public static void main(String args[])
    {
    Ritesh R=new Ritesh();
    R.displayname();
    R.displayrollno();
    R.displaymarks();
    }
 }