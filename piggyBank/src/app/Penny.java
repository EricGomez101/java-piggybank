package app;

public class Penny extends Coin
{
    private int quantity;

    public Penny()
    {
        super(0.01d);
        this.quantity = 1;
    }

    public Penny(int quantity)
    {
        super(0.01d);
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return quantity + (quantity > 1 ? " Penny's" : " Penny");
    }

    @Override
    public double getTotal()
    {
        return quantity * getValue();
    }
}