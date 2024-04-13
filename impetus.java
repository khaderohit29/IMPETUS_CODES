 import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class impetus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    min_max_while_loop();
     
   
       
        
    }
   
        
       
        
    
    
    
    
    
    public static void min_max_while_loop(){
        // find the biggest smallest and average integer accept 10 integer 
        int num;
        int TOTAL_NUM = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE INTEGER ");
        num = sc.nextInt();
        int max_num = num;
        int min_num = num;
        double average;
        int total_sum = num;
        int counter = 2;
        while(counter<=TOTAL_NUM){
            System.out.println("please enter the next integer ");
            num = sc.nextInt();
            if(num>max_num){
                max_num = num;
            }else {
                if( num<min_num){
                    min_num = num;
                }
            } counter++;
            total_sum = total_sum + num;
            
        }System.out.println(" the biggest number is " + max_num);
        System.out.println("the smallest number is "+min_num);
        average = total_sum/num;
        System.out.println(" the average of the number is "+average);
         
        
    }
    
    
}
    
 
 
 
 
 
 
 
 
 
 
 