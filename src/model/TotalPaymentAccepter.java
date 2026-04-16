package model;

public interface TotalPaymentAccepter {

    void addMoney(int amount);

    int getBalance();

    void reset();


}
