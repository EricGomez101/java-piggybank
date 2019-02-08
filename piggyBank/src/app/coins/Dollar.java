package app.coins;

public class Dollar extends Coin
{
    private int quantity;

    public Dollar()
    {
        super(1.00d);
        this.quantity = 1;
    }

    public Dollar(int quantity)
    {
        super(1.00d);
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return  "$" + quantity;
    }

    @Override
    public double getTotal()
    {
        return quantity * getValue();
    }
}
