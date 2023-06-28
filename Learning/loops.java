impoort java.util.Scanner;
public class loops {
 public static void main(String[]args){
   Scanner takeInput = new Scanner(System.in);
//write a program to enter any 10 numbers and display sum and avrage of ALL the numbers using While Loop.

        int value = 1, sum = 1;
        while(value <= 10 ){
        System.out.print("Enter Number: ");
        int num = takeInput.nextInt();
        sum = sum + num;
        value++;

    }
        System.out.println("The Value After Addition Is: " + sum);

        double avg = (double) sum / 10;

        System.out.println("Average Value Of All Numbers Are: " + avg );


   // Wrote this for better understanding 
    
        int count = 0;
        int add = 0;

        System.out.println("Enter 10 numbers:");

        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int number = takeInput.nextInt();
            add += number;
            count++;
        }

        double average = (double) add / 10;

        System.out.println("Sum of all numbers: " + add);
        System.out.println("Average of all numbers: " + average);

       //write a program to enter any number and display its factorial value using for loop
        
        System.out.print("Enter a number: ");
        int number = takeInput.nextInt();

        int factorial = 1;

        if (number >= 0) {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + number + " = " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }










      
    }
}
