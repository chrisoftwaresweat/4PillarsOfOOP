public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        //POLYMORPHISM
        Shape[] shape = {rectangle, circle};

        for (Shape x : shape) {
            x.draw();
        }
    }
}
