package ifelse;

//write a program to input 3 numbers and check which is the highest

public class program7
{
public static void main(int a,int b,int c)
{   
    if(a>b&&a>c)
    {
        System.out.println("a is the greatest"+a);
    }
    else if(b>a&&b>c)
    {
        System.out.println("b is the greatest"+b);
    }
    else
    {
        System.out.println("c is the greatest"+c);
    }
    }
}
