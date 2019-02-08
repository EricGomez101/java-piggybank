package app;

public class Dime extends Coin
{
    private int quantity;

    public Dime()
    {
        super(0.10d);
        this.quantity = 1;
    }

    public Dime(int quantity)
    {
        super(0.10d);
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return quantity + (quantity > 1 ? " Dime's" : " Dime");
    }

    @Override
    public double getTotal()
    {
        return quantity * getValue();
    }
}