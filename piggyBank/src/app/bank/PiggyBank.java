package app.bank;

import java.util.ArrayList;
import app.coins.Coin;

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

    public void filter(Filter f)
    {
        list.forEach((e) -> f.filter(e));
    }


}
