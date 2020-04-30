/**
 * same program as program 2 showing that cases can be names using math functions
   */
package switch_case;

import java.util.Scanner;
public class switch_3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("2.monday\n 5.tuesday\n 7.wednesday\n 9.thursday\n 11.friday\n 13.saturday\n 15.sunday\n");
        System.out.println("enter your choice");
        choice=sc.nextInt();
        switch(choice)
        {
            case 4-2:
            System.out.println("monday");
            break;

            case 2+3:
            System.out.println("tuesday");
            break;

            case 7*1:
            System.out.println("wednesday");
            break;

            case 8+1:
            System.out.println("thursday");
            break;

            case 15-4:
            System.out.println("friday");
            break;
            
            case 17-4:
            System.out.println("saturday");
            break;
            
            case 12+3:
            System.out.println("sunday");
            break;
            
            default:
            System.out.println("invalid input");
            break;
            
            
            }
    }
}