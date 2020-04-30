//write a program to input the user's choice to find
//1.area
//2.perimeter
//3.diagonal   math.sqrt(l*b+l*b)
package switch_case;

import java.util.Scanner;
public class switch_7
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int letter;
        int l;
        int b;
        double area=0.0d;
        double peri=0.0d;
        double diag=0.0d;
        
        System.out.println("enter the length");
        l=ob.nextInt();
        System.out.println("enter the breadth");
        b=ob.nextInt();
        System.out.println("enter 1 for area  2 for perimeter  3 for diagonal");
        letter=ob.nextInt();
        
        switch(letter)
        {
            case 1:
            area=l*b;
            System.out.println("area = "+area+ "sq.cm");
            break;
            case 2:
            peri=2*(l+b);
            System.out.println("perimeter = "+peri+"cm");
            break;
            case 3:
            diag=Math.sqrt(l*b+l*b);
            System.out.println("diagonal = "+diag+"cm");
            break;
            default:
            System.out.println("invalid input");
            break;
            
            
            }
    }
}