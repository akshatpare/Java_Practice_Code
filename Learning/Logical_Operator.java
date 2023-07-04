import java.util.Scanner;

public class Logical_Operator {
    public static void main( String[]args){


       Scanner takeInput = new Scanner(System.in);
     
//Write a program to enter any alphabet and check if it is Capital or small letter
System.out.print("Enter Alphabet: ");
char ch = takeInput.next().charAt(0);

if(ch >= 'A' && ch <= 'Z' ){
    System.out.println("The Alphabet Entered "+ ch + " Is A Capital Letter.");
}

else if(ch >= 'a' && ch <= 'z'){
    System.out.println("The Alphabet Entered "+ ch +" Is A Small Letter.");
}

else {
   System.out.println("The Character Entered "+ ch +" Is Not A Part Of Alphabets From Neither (A to Z) Nor From (a to z).");
}
 

//Write a Java program to check if a number is both divisible by 2 and 3

System.out.print("Enter The Number: ");
int num = takeInput.nextInt();

if(num % 2 == 0 && num % 3 == 0){
    System.out.println("The Number "+ num +" Is Divisible By Both 2 & 3");

}
else{
    System.out.println("The Number "+ num + " Is Not Divisible By 2 & 3" );
}


 

//Write a Java program to check if a character is a vowel or a consonant using logical operators.

System.out.print("Enter Alphabet: ");
char alphabet = takeInput.next().charAt(0);
if( alphabet >= 'a' && alphabet <= 'z'){
    if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'  ){
        System.out.println("Entered Alphabet " + alphabet + " Is A Vowel");
    }
    else{
        System.out.println("Entered Alphabet "+ alphabet + " Is A Consonent");
    }
    
}
else{
    System.out.println("Either Entered Character Is An Upper Case Letter Or Entered Character Is Not An Alphabet");
}

 
// Write a Java program to check if a given year is a leap year.
System.out.print("Enter Year : ");
int year = takeInput.nextInt();

    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
        System.out.println("Year "+ year+" Is Leap Year.");
    }
    else{
        System.out.println("Year" + year + " Is Not A Leap Year");
    }

 
//Write a Java program to check if a number is positive and even.

System.out.print("Enter Number: ");
int number = takeInput.nextInt();
    if(number >= 0 && number % 2 == 0){
        System.out.println("Entered Number " + number + " Is A Positive Number And An Even Number");
    }
    else{
        System.out.println("Entered Number " + number + " Is Not A Positive Number Or Is Not An Even Number");
    }

 
//Write a Java program to check if a number is negative or odd.

System.out.print("Enter Number: ");
int number = takeInput.nextInt();
    if(number < 0 || number % 2 != 0 ){
        System.out.println("Entered Number " + number +" Is Negative Or Odd Number");
    }
    else{
        System.out.println("Entered Number " + number +" Is Either Positive Or Even Number ");
    }

 
//Write a Java program to check if a number is divisible by both 5 and 7.

System.out.print("Enter Number: ");
int num = takeInput.nextInt();
 if (num % 5 == 0 && num % 7 == 0){
    System.out.println("The Number " + num +" Is Divisible By Both 5 & 7");
 }
 else{
    System.out.println("The Number " + num + " Is Not Divisible By 5 or 7");
 }

//Write a Java program to check if a given string starts with "Hello" and ends with "World".
//This Problem cannot be solved without using Functions.

 

//Write a Java program to check if a number is a prime number or a multiple of 5.
    System.out.print("Enter Number: ");
    int number = takeInput.nextInt();

    boolean isPrime = number >1 && number % 2 != 0 && number % 3 != 0 && number % 5 != 0 && number % 7 != 0 ;
    boolean isMultiple = number % 5 == 0;
    if(isPrime){
        System.out.println("Number "+ number+ "Is Prime Number.");
    }
    else if(isMultiple){
        System.out.println("Number " + number + " Is Multiple Of 5");
    }
    else{
        System.out.println("Number "+ number + "Is not Neither A Prime Number Nor A Multiple Of 5" );
    }
// I am not sure about this problem.

       





    }


    }
