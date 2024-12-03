//If the parameter to the makePayment method of the CreditCard class (see Code Fragment 1.5)
// were a negative number, that would have the effect of raising the balance on the account.
//Revise the implementation so that it throws an IllegalArgumentException if a negative amount
//is sent as a parameter

public class Q12 {
    public static void main(String[] args) {

        CreditCardQ card = new CreditCardQ("Haitam Maje", "Bank HMQ", "1234 5678 9876 5432", 5000, 1000);
        card.makePayment(-50);
        CreditCardQ.printSummary(card);
    }
}
