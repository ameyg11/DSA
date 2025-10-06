package OOPS;

public class basic01 {

    public static class Student{
        int roll;
        String name;
        double percentage;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll=21;
        s1.name="Amey";
        s1.percentage=86.00;

        System.out.println(s1.name);
    }
}
