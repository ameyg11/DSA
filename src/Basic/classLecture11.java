//package Basic;
//
//class Student {
//    int age=10;
//    String studentName;
//}
//
//public class classLecture11 {
//    public static void main(String[] args){
//
//        classLecture11 Amey = new classLecture11();
//        System.out.println(Amey.age);
//        Amey.studentName = "Gawade" ;
//        System.out.println(Amey.studentName);
//    }
//}
//java methods
package Basic;

import java.sql.SQLOutput;
import java.util.Scanner;


    class Algebra{
        int add(int a, int b) {


            int ans = a + b;
            return ans;
        }
    }
    class classLecture11 {

//    public static void welcome(){
//        System.out.println("Welcome to Methods");
//        int sum(int a,int b){
//            int ans=a+b;
//            return ans;








    public static void main(String[] args){

//        Student Amey = new Student(); // Corrected instantiation
//        System.out.println(Amey.age); // Accessing age variable from Student class
//        Amey.studentName = "Gawade" ;
//        System.out.println(Amey.studentName);
//        welcome();
//
//        Amey.sum(3,4);

        Algebra obj=new Algebra();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(" sum is " );

        int ans = obj.add(b,a);

        System.out.println(ans);

    }
}