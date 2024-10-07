package Basic;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;


public class Practice1 {
    public static void main(String[] args) {
        System.out.println("This is the first Program in Java");
        System.out.println("Odd or Even Program");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}
