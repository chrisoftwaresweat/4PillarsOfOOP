public class Student extends Person{ //INHERITANCE

    //to get this private variable we need getter method a.k.a. getters, and if u wanna modify/filter that you'll need setter method a.k.a. setters
    private double gpa;

    Student(String name, int age, double gpa){
        super(name, age);
        this.setGpa(gpa);
    }

    //status
    public String status(){
        if (gpa>=3.5) {
            return "Honor";
        } else if (gpa>=2.0) {
            return "Pass";
        }else {
            return "Fail";
        }
    }
    
    //ENCAPSULATION
    public double getGpa(){
        return gpa;
    }
    
    public void setGpa(double gpa){
        if (gpa<0.0 || gpa > 4.0) {
            System.out.println("Invalid Input");
        }else {
            this.gpa = gpa;
        }
    }

    //override display
    @Override
    public void display(){
        System.out.printf("Name: %s\n", getName());
        System.out.printf("Age: %d\n", getAge());
        System.out.printf("GPA: %.1f\n", getGpa());
        System.out.printf("Status: %s\n", status());
    }
}
