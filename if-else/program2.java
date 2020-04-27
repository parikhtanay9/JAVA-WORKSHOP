package ifelse;
//write a program using scanner class to input the age of the user and check whether the user is eligible to vote. 
import java .util.Scanner;


public class program2
{
public static void main()
{   
    Scanner ob = new Scanner (System.in);
    int age;
    System.out.println("enter your age");
    age= ob.nextInt();
    if(age>=18)
    {
        System.out.println("you can vote");
    }
    else
    {
        System.out.println("you cannot vote");
    }
    }
}
