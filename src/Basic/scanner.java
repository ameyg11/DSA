package Basic;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number a:");
        int a = sc.nextInt();

        System.out.println("Enter a Number b:");
        int b = sc.nextInt();

        // Clear the buffer
        sc.nextLine();

//        System.out.println("Enter your Name:");
//        String c = sc.nextLine();
//
//        System.out.println("Enter a letter num you want (index starts from 0):");
//        int index = sc.nextInt();
//
//        if (index >= 0 && index < c.length()) {
//            char letter = c.charAt(index);
//            System.out.println("The letter at position " + index + " is: " + letter);
//        } else {
//            System.out.println("Invalid index.");
//        }

        System.out.println("Enter your name :");
        String c = sc.nextLine();

        System.out.println("Enter a letter you want :");
        int index = sc.nextInt();

        if(index>=0 && index < c.length()){
            char letter =c.charAt(index);
            System.out.println("Char at index " +index+ "is " +letter);
        }
        else{
            System.out.println("Invalid index no.");
        }
        System.out.println("Addition of a and b is: " + (a + b));

        // Convert the string to uppercase
        String upperCaseName = c.toUpperCase();
        System.out.println("Your name in uppercase: " + upperCaseName);

        // Convert the string to lowercase
        String lowerCaseName = c.toLowerCase();
        System.out.println("Your name in lowercase: " + lowerCaseName);
    }
}
