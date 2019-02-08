package app;

import java.util.ArrayList;

public class PiggyBank
{
    private ArrayList<Coin> list = new ArrayList<Coin>();


    public <E extends Coin> void add(E coin)
    {
        list.add(coin);
    }

    public void printCoins()
    {
        list.forEach((e) -> System.out.println(e));
    }

    public void printValue()
    {
        double value = 0;

        for(Coin coin: list)
        {
            value += coin.getTotal();
        }

        System.out.println("The piggy bank holds $" + value);
    }
}
