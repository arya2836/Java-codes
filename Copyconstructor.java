class Children {
    String name;
    int age;

    public void printi() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Children(Children s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    public Children() {
        // Default constructor
    }
}

public class Copyconstructor {
    public static void main(String args[]) {
        Children s1 = new Children();
        s1.name = "Shreya";
        s1.age = 16;

        Children s2 = new Children(s1);
        s2.printi();
    }
}