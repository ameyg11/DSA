package OOPS;

public class Student{
    private int roll;
    public String name;
    double percentage;
    public Student(int rollNo, String naam, double percentage){
        roll = rollNo;
        name = naam;
        this.percentage = percentage;
    }
    public Student() {
    }

    public int getRoll(){
        return roll;
    }

    public void setRoll(int roll){
        this.roll = roll;
    }
}