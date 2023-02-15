package model.entities;
import model.exceptions.InvalidWithDrawn;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawnLimit;
    
    public Account(Integer number, String holder, Double balance, Double withDrawnLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawnLimit = withDrawnLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithDrawnLimit() {
        return withDrawnLimit;
    }

    public void setWithDrawnLimit(Double withDrawnLimit) {
        this.withDrawnLimit = withDrawnLimit;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    public void withDrawn(Double amount) throws InvalidWithDrawn{
        if (amount > withDrawnLimit){
            throw new InvalidWithDrawn("The amount exceeds withDrawnLimit");
        }
        if (amount > balance){
            throw new InvalidWithDrawn("Not enough balance");
        }
        balance -= amount;
    }
}
