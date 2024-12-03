public class CreditCardQ {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;


    public CreditCardQ(String cust, String bk, String acct, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acct;
        limit = lim;
        balance = initialBal;
    }

    public CreditCardQ(String cust, String bk, String acct, int lim) {
        this(cust, bk, acct, lim, 0.0); // use a balance of zero as default
    }


    public String getCustomer() { return customer; }
    public String getBank() { return bank; }
    public String getAccount() { return account; }
    public int getLimit() { return limit; }
    public double getBalance() { return balance; }


    public boolean charge(double price) {
        if (price + balance > limit) {
            return false;
        }
        balance += price;
        return true;
    }


    public void makePayment(double amount) {
        if(amount<0)
            throw new IllegalArgumentException("Negative Amount is not Allowed");
        balance -= amount;
    }



    public static void printSummary(CreditCardQ card) {
        System.out.println("Customer: " + card.customer);
        System.out.println("Bank: " + card.bank);
        System.out.println("Account: " + card.account);
        System.out.println("Balance: " + card.balance);
        System.out.println("Limit: " + card.limit);
    }
}

