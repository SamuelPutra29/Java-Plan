package Week1.Day1;

import java.util.Scanner;

public class PersonalDetailsProgram {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        // Declare the variables
        String name;
        int age;
        double height;
        boolean isStudent;


        // Input the variables value from user
        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your age: ");
        age = input.nextInt();
        System.out.println("Enter your height: ");
        height = input.nextDouble();
        System.out.print("Are you a student? (true/false): ");
        // Make sure to validate boolean input
        while (!input.hasNextBoolean()) {
            System.out.println("Invalid input. Please enter 'true' or 'false'.");
            input.next();  // Consume the invalid input
        }
        isStudent = input.nextBoolean();

        // Display the details
        System.out.println("Name " + name);
        System.out.println("Age "+ age);
        System.out.println("Height " + height);
        System.out.println(name + " is " + (isStudent ? "a student" : "not a student"));
    }

}
