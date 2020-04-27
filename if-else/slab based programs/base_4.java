package slab_base;

/**
 * write a program to accept the number of phone calls made in a month
 * use the following slab base to calculate the cost of the total number of phone calls made.
 * number of phone calls      cost (percentage of the number of phone calls)
 * 0-5000                       80%
 * 5001-10000                   90%
 * 10001-20000                  100%
 * >20000                       125%
 * also print an else statemnt showing invalid input if something else is entered.
 * print a final bill which also includes an initial rent of rupees 150 to the bill calculated.
 */

public class base_4
{
    public static void main(int u)
    {
        double bill=0.0;
        int rent=150;
        double fb;
        if(u>=0&&u<=100)
        {
            bill=u*0.80;
        }
        else if(u>100&&u<=200)
        {
            bill=100*0.80+(u-100)*0.90;
        }
        else if(u>200&&u<=500)
        {
            bill=100*0.80+100*0.90+(u-200)*1;
        }
        else if(u>500)
        {
            bill=100*0.80+100*0.90+300*1+(u-500)*1.25;
        }
        else
        {
            System.out.println("invalid input");
        }
        if(u>=0)
        {
            fb=bill+rent;
        System.out.println("bill= "+bill);
        System.out.println("final bill = "+fb);
    }
    }
}
