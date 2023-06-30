/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int sum=0;
        int i;

        System.out.println("Enter your number!");
        number = input.nextInt(); //reading number from scanner

        for (i = 1; i <= number; i++) { //this starts counting at 1 and stop when it reaches 'number' and adds by 1

            sum += i; //this adds i to sum as it increases by 1

        }
        System.out.println(sum);
    }

}


    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6


    
