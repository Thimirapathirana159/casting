public class MyExample {
    String name;
    void ex(){

        System.out.println("This is an example");
    }
}
class Example extends MyExample {
    int number;

    @Override
    void ex() {
        System.out.println("This is the first example");
    }
}
class MainRun{
    public static void main(String[] args) {
        MyExample e=new Example();
        e.name="bhagya";
        System.out.println("Hello "+e.name);
        Example x=(Example) e;
        x.number=100;
        System.out.println("your number is "+x.number);
        e.ex();
        x.ex();
    }
}