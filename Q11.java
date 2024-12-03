//Give an example of a Java code fragment that performs an array
// reference that is possibly out of bounds, and if it is out of bounds,
// the program catches that exception and prints the following error message:
// “Don’t try buffer overflow attacks in Java!”

import java.util.Scanner;
public class Q11 {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the index number you want to access: ");
            int index = scanner.nextInt();

            try {

                int value = numbers[index];
                System.out.println("Value at index " + index + " is: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Don’t try buffer overflow attacks in Java!");
            }

        }
    }


