package OOPS.staticExample;

public class Human {
    String name;
    int age;
    int salary;
    boolean married;
    static int population;   // when static is applied it can be accessed without/before creating the single object of that class

    static void message(){
        System.out.println("Hello from");
    }

    Human(String name, int age, int salary, boolean married){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        this.population += 1;
    }
}
