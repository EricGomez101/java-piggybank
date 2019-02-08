package app.coins;

public abstract class Coin
{
    private double value;

    public Coin(double value)
    {
        this.value = value;
    }

    protected double getValue()
    {
        return value;
    }

    public abstract double getTotal();

}
