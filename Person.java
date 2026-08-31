public class Person {

    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //ENCAPSULATION
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //not necessary because we aren't modifying the name and age input BUT for the sake of example
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    //display
    public void display(){
        System.out.printf("Name: %s\n", getName());
        System.out.printf("Age: %d\n", getAge());
    }
}
