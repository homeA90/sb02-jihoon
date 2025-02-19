package src.transactionapp;

public class Transaction {

    // 필드 생성
    private int id;
    private String type;
    private double amount;

    // 생성자 생성
    public Transaction(int id, String type, double amount){
        this.id = id;
        this.type = type;
        this.amount = amount;
    }

    // getter
    int getId(){
        return id;
    }
    String getType(){
        return type;
    }
    double getAmount(){
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", amonut=" + amount +
                '}';
    }
}
