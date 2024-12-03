//Give a short fragment of Java code that uses the progression classes from Section 2.2.3 to
// find the eighth value of a Fibonacci progression that starts with 2 and 2 as its first two values.

public class Q3 {
        public static void main(String[] args) {

            FibonacciProgression fib = new FibonacciProgression(2, 2);


            for (int i = 1; i < 8; i++) {
                fib.nextValue();
            }

            System.out.println("The eighth value is: " + fib.getCurrent());
        }
    }


