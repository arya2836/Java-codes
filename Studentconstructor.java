class Student{
    String name;
    int age;
    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
         }
       Student(){
         System.out.println("constructor called");
         }
}
 public class Studentconstructor{
    public static void main (String args[]){
        Student s1 = new Student();
        s1.name = "Arya";
        s1.age = 22;
        s1.info();

    }

 }