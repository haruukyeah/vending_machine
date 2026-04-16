package model;

public class CoinAcceptor implements TotalPaymentAccepter{
    private int amount;

    @Override
    public void addMoney(int amount) {
        this.amount += amount;
    }

    @Override
    public int getBalance() {
        return amount;
    }

    @Override
    public void reset() {
        amount = 0;

    }
}
