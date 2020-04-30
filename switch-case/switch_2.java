/**write a program to enter the weekdays according to the user's choice (without having sequential order of the case)*/
package switch_case;

import java.util.Scanner;
public class switch_2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("3.monday\n 5.tuesday\n 7.wednesday\n 9.thursday\n 11.friday\n 13.saturday\n 15.sunday\n");
        System.out.println("enter your choice");
        choice=sc.nextInt();
        switch(choice)
        {
            default:
            System.out.println("invalid input");
            break;
            
            case 3:
            System.out.println("monday");
            break;

            case 5:
            System.out.println("tuesday");
            break;

            case 7:
            System.out.println("wednesday");
            break;

            case 9:
            System.out.println("thursday");
            break;

            case 11:
            System.out.println("friday");
            break;
            
            case 13:
            System.out.println("saturday");
            break;
            
            case 15:
            System.out.println("sunday");
            break;
            
            }
    }
}