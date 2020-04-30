//write a program to input a character and find whether it is a vowel or a consonant
package switch_case;

import java.util.Scanner;
public class switch_6
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        char letter;
        System.out.println("enter a letter");
        letter=ob.next().charAt(0);
        switch(letter)
        {
            case 'a':case 'A':case 'e':case 'E':case 'i':case 'I':case 'o':case 'O':case 'u':case 'U':
            System.out.println("It is a vowel");
            break;
            
            default:
            System.out.println("It is a consonant");
            break;
            
            
            }
    }
}