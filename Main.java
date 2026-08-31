public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        System.out.print("Enter the name of the student: ");
        String name = scanner.nextLine();
        System.out.print("Enter the age of the student: ");
        int age = scanner.nextInt();
        System.out.print("Enter the student gpa: ");
        double gpa = scanner.nextDouble();
        
        Student student = new Student(name, age, gpa);

        student.display();

        //POLYMORPHISM
        Shape[] shape = {rectangle, circle};

        for (Shape x : shape) {
            x.draw();
        }

        scanner.close();
    }
}
