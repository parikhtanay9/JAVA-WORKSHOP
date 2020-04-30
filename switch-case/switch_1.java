package switch_case;
//ask the user to chose one option of the following:
//1. good morning
//2. good afternoon
//3. good evening
//4. good night
// each on different lines. use scanner to ask for input.
import java.util.Scanner;
public class switch_1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("1.good morning\n 2.good afternoon\n 3.good evening\n 4.good night\n");
        System.out.println("enter your choice");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("good morning");
            break;

            case 2:
            System.out.println("good afternoon");
            break;

            case 3:
            System.out.println("good evening");
            break;

            case 4:
            System.out.println("good night");
            break;

            default:
            System.out.println("invalid input");
        }
    }
}