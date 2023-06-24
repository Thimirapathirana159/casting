public class World {
    String name;
    void process(){
        System.out.println("earth can rotate");
    }
}
class Earth extends World{
    int area;

    @Override
    void process() {
        System.out.println("earth is a world");
    }
}
class Testcasting{
    public static void main(String[] args) {
        World w = new Earth();
        w.name="earth";
        System.out.println(w.name);
        w.process();
        Earth e = (Earth) w;
        e.area=510;
        System.out.println(e.name);
        System.out.println(e.area);
        e.process();

    }
}
