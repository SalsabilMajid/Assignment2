//If we choose an increment of 128, how many calls to the nextValue method from the ArithmeticProgression class of Section 2.2.3 can we make before we cause a long-integer overflow?If we choose an increment of 128, how many calls to the nextValue
//method from the ArithmeticProgressionclass of Section 2.2.3can we make before we cause a long-integer overflow?

public class Q4 {
    public static void main(String[] args) {
        ArithmeticProgression progression = new ArithmeticProgression(128, 0);
        progression.printProgression(10);
    }
}
