package Interface;

import java.util.*;  // untuk List dan Arrays

public class PaymentApp {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment("1234-5678-9876");
        Payment p2 = new BankTransferPayment("ID123456789");

        // Polymorphism in action
        p1.pay(100.0);
        p2.pay(250.0);

        // Collection of payments
        List<Payment> payments = Arrays.asList(p1, p2);
        for (Payment payment : payments) {
            payment.pay(50.0);
        }
    }
}
