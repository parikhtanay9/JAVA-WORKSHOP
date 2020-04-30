//write a program to greet according to the user's choice
package switch_case;

import java.util.Scanner;
public class switch_5
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int choice;
        System.out.println("enter 1 for good morning  2 for good afternoon 3 for good evening and 4 for good night");
        System.out.println("enter the greeting");
        choice=ob.nextInt();
        switch(choice)
        {
            case 5-4:
            System.out.println("good morning");
            break;

            case 6%4:
            System.out.println("good afternoon");
            break;

            case 9/3:
            System.out.println("good evening");
            break;

            case 16/4:
            System.out.println("good night");
            break;
            
            default:
            System.out.println("invalid input");
            break;
            
            
            }
    }
}