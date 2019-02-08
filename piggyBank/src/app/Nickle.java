package app;

public class Nickle extends Coin
{
    private int quantity;

    public Nickle()
    {
        super(0.05d);
        this.quantity = 1;
    }

    public Nickle(int quantity)
    {
        super(0.05d);
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return quantity + (quantity > 1 ? " Nickle's" : " Nickle");
    }

    @Override
    public double getTotal()
    {
        return quantity * getValue();
    }
}