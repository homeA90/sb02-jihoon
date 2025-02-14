package src.Test_01;

public class CreditCardPaymnet implements Payment {

    public CreditCardPaymnet(){}

    @Override
    public void pay (double amount){
        if (amount<=0){
            throw new IllegalArgumentException("결제 금액이 0원이 안되는게 말이되냐?");
        }
        System.out.println("신용카드로 " + amount + "원 결제합니다.");
    }

    @Override
    public void cancel (double amount){
        if (amount<=0){
            throw new IllegalArgumentException("취소 금액이 0원이 안되는게 말이되냐?");
        }
        System.out.println("신용카드로 " + amount + "원 취소합니다.");
    }

}
