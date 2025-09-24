package Interface;

public class BankTransferPayment implements Payment {
    private String bankAccount;

    public BankTransferPayment(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Bank Transfer to account: " + bankAccount);
    }
}
