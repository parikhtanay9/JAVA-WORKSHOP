package slab_base;



public class base_3
{
    public static void main(int c)
    {
        double bill=0.0;
        double fb;
        double st;
        if(c>=0&&c<=100)
        {
            bill=c*0;
        }
        else if(c>100&&c<=200)
        {
            bill=100*0+(c-100)*0.80;
        }
        else if(c>200&&c<=500)
        {
            bill=100*0+100*0.80+(c-200)*1;
        }
        else if(c>500)
        {
            bill=100*0+100*0.80+300*1+(c-500)*1.25;
        }
        else
        {
            System.out.println("invalid input");
        }
        if(c>=0)
        {
            st=c*0.10;
            fb=st+bill;
        System.out.println("calls"+bill);
        System.out.println("service tax= "+st);
        System.out.println("final bill = "+fb);
        System.out.println("bill = "+bill);
        System.out.println("service tax= "+st);
    }
    }
}
