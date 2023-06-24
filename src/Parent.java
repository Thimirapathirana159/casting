public class Parent {
    String name;
    void display(){
        System.out.println("Super class is running");
    }
}
class Child extends Parent{
    int age;

    @Override
    void display() {
        System.out.println("Sub class is running");
    }
}
class Downcasting{
    public static void main(String[] args) {
        Parent p = new Child();//upcasted object
        p.name="Bhagya";
        Child c = (Child) p;//downcasted object
        c.age=21;
        System.out.println(c.name);
        System.out.println(c.age);
        c.display();
    }
}
