import java.util.*;
import java.lang.Math;

public class JavaApplication
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        int number;
        int counter;
        
        counter = 0;
        int sum;
        
        sum = 0;
        boolean even;
        int currentNumber;
        
        currentNumber = 2;
        System.out.println(" please enter the number :");
        number = input.nextInt();
        even = number % 2 == 0;
        while (counter < number)
        {
            if (even)
            {
                sum = sum + currentNumber;
                currentNumber = currentNumber + 2;
                counter = counter + 1;
            }
        }
        System.out.println(sum);
    }
}
