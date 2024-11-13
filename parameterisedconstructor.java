class Students{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Students(String name, int age){
        this.name = name;
        this.age = age;
    }

}
class parameterisedconstructor{
    public static void main(String args[]){
        Students s1 = new Students("Arya", 22);
        s1.printinfo();
    }
}