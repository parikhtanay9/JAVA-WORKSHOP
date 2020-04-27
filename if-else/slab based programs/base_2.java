package slab_base;
/**
 * write a program to accept the purchase amount and calculate the commission of the employee after which also calculate the final bill with the service tax excluding the commission
 * purchase amount      commission
 * 0-15000                 5%
 * 15001-50000            10%
 * 50001-100000           20%
 * 100000                 30%
 * also print an else statemnt showing invalid input if something else is entered.
 */


public class base_2
{
    public static void main(int s)
    {
        double bill=0.0;
        double comm=0.0;
        double st;
        if(s>0&&s<=15000)
        {
            comm=s*0.05;
        }
        else if(s>15000&&s<=50000)
        {
            comm=s*0.10;
        }
        else if(s>50000&&s<=100000)
        {
            comm=s*0.20;
        }
        else if(s>100000)
        {
            comm=s*0.30;
        }
        else
        {
            System.out.println("invalid input");
        }
        if(s>0)
        {
        st=s*0.10;
        bill=(s-comm)+st;
        System.out.println("sales= "+s);
        System.out.println("commision = "+comm);
        System.out.println("bill = "+bill);
        System.out.println("service tax= "+st);
    }
    }
}
