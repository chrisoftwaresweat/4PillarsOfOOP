public class Main {
    public static void main(String[] args){
        //POLYMORPHISM
        Shape[] shape = {Rectangle, Circle};

        for(Shape x : shape){
            x.draw();
        }
    }
}
