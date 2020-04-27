package slab_base;

/** 
 * write a program to accept the purchase amount from the user and calculate the discount on the bases of the purchase amount
 * also add a 10% service tax to the original purchase amount
 * purchase amount      discount
 * 0-5000                5%
 * 5001-10000            10%
 * 10001-20000           20%
 * >20000                25%
 * also print an else statement showing invalid input if something else is entered.
*/


public class base_1
{
    public static void main(int pa)
    {
        double dis=0.0;
        double fb;
        double st;
        if(pa>=0&&pa<=5000)
        {
            dis=pa*0.05;
        }
        else if(pa>5000&&pa<=10000)
        {
            dis=pa*0.10;
        }
        else if(pa>10000&&pa<=20000)
        {
            dis=pa*0.20;
        }
        else if(pa>20000)
        {
            dis=pa*0.25;
        }
        else
        {
            System.out.println("invalid input");
        }
        if(pa>0)
        {
        st=pa*0.10;
        fb=(pa-dis)+st;
        System.out.println("purchase amount= "+pa);
        System.out.println("service tax= "+st);
        System.out.println("dicount = "+dis);
        System.out.println("final bill= "+fb);
    }
    }
}
