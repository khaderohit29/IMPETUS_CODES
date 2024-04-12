import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int number;
        int counter;
        
        counter = 1;
        int result;
        
        System.out.println(" please enter the number :");
        number = input.nextInt();
        for (counter = 1; counter <= 10; counter++) {
            result = number * counter;
            System.out.println(result);
        }
    }
}
