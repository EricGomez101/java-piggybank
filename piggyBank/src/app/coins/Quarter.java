package app.coins;

public class Quarter extends Coin
{
    private int quantity;

    public Quarter()
    {
        super(0.25d);
        this.quantity = 1;
    }

    public Quarter(int quantity)
    {
        super(0.25d);
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return quantity + " Quarter";
    }

    @Override
    public double getTotal()
    {
        return quantity * getValue();
    }
}