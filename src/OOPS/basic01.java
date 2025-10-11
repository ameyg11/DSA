package OOPS;

public class basic01 {
     static class Car{
        String name;
        int price;
    }

    static void displayName(String name, int amount){
        System.out.println(name);
    }


    public static void main(String[] args) {

//        Car maruti = new Car();
//        maruti.name = "alto";
//        maruti.price = 200000;
//        displayName(maruti.name, maruti.price);

        Student s1 = new Student();
        s1.setRoll(21);
        System.out.println(s1.getRoll());
        s1.name="Amey";
        s1.percentage=86.00;
        System.out.println(s1.name);

        Student s2 = new Student(36, "Amey", 86.00);
        System.out.println(s2.name);
        System.out.println(s2.getRoll());
        System.out.println(s2.percentage);
    }
}
