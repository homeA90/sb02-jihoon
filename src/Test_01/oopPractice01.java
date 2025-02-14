package src.Test_01;

public class oopPractice01 {
    public static void main(String[] args) {
        System.out.println("Hello, Payment!");

        CreditCardPaymnet creditCardPaymnet = new CreditCardPaymnet();
        creditCardPaymnet.pay(1000);
        creditCardPaymnet.cancel(200);

        AccountTransferPaymnet accountTransferPaymnet = new AccountTransferPaymnet();
        accountTransferPaymnet.pay(3000);
        accountTransferPaymnet.cancel(2000);
    }
}
