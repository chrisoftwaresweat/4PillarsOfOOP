public class Main {
    public static void main(String[] args){
        //POLYMORPHISM
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();
        s2.draw();
    }
}