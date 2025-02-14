package src.Test_00;

public class oopPractice00 {
    public static void main(String[] args) {
        System.out.println("Hello, Payment!");

        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.pay(40);
        creditCardPayment.cancel(50);

        AccountTransferPayment accountTransferPaymnet = new AccountTransferPayment();
        accountTransferPaymnet.pay(3000);
        accountTransferPaymnet.cancel(2000);
    }
}
