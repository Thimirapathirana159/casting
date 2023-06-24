public class Animal {
    String name;
    void petname(){

        System.out.println("Elephant");
    }
}
class Fish extends Animal{
    String colour;

    @Override
    void petname() {

        System.out.println("Blue fish");
    }
}
class Run{
    public static void main(String[] args) {
        Animal a = new Fish();
        a.name = "alaguduwa";
        Fish f = new Fish();
        f.name = "Linna";
        f.colour = "grey";
        System.out.println("Name :- " + a.name);
        a.petname();
        System.out.println("Name :- "+ f.name);
        System.out.println("Colour :- " + f.colour);
    }
}