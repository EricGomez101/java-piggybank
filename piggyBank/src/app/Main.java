package app;

import app.coins.*;
import app.bank.*;
public class Main
{
    public static void main(String[] args)
    {
        PiggyBank piggyBank = new PiggyBank();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickle(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));
        
        piggyBank.printCoins();
        System.out.println("");
        piggyBank.printValue();
        System.out.println("\nFiltering by total value");
        piggyBank.filter((e) -> 
        {
            double total = e.getTotal();
            if (total >= 0.25d)
            {
                System.out.println(e);
            }
        });

    }
}

// 6   + 0.25 + 0.1 + 
