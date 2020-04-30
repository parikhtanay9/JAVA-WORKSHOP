//write a program to input a number and find out 
//1. logarithm
//2. absolute value
//3. square root
//4. cube root 
//5. random number
package switch_case;

import java.util.Scanner;
public class switch_8
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int choice;
        int a;
        double log=0.0d;
        double abs=0.0d;
        double sqrt=0.0d;
        double cbrt=0.0d;
        double random=0.0d;
        System.out.println("enter the number");
        a=ob.nextInt();
        System.out.println("enter 1:logarithm\n  2 absolute value\n  3 Square root\n  4 cube root\n  5 random number\n");
        choice=ob.nextInt();
        
        switch(choice)
        {
            case 1:
            log=Math.log(a);
            System.out.println("logarithm = "+log );         
            break;
            case 2:
            abs=Math.abs(a);
            System.out.println("perimeter = "+abs);
            break;
            case 3:
            sqrt=Math.sqrt(a);
            System.out.println("Square root"+sqrt);
            break;
            case 4:
            cbrt=Math.cbrt(a);
            System.out.println("cube root"+cbrt);
            break;
            
            case 5:
            random=(1+(int)(Math.random()*(10-0)));
            System.out.println("random number"+random);
            break;
            
            default:
            System.out.println("invalid input");
            break;
            
            
            }
    }
}