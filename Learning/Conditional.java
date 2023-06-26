import java.util.Scanner;

public class Conditional {
    public static void main(String[]args){
        Scanner condit = new Scanner(System.in);
         
        System.out.println("Enter age: ");
        int age=condition.nextInt();
        if (age>=50)
        {
            System.out.println("Age is above 50 ");
        }
        
// In this file I have just created one object and I called it again and again for different questions

//Write a program to enter 2 numbers and display the greater number between them
System.out.print("Enter first number:");
double firstNumber = condit.nextDouble();
System.out.print("Enter Second Number:");
double secondNumber = condit.nextDouble();
if ((firstNumber >secondNumber)){
    System.out.println("First Number is bigger than Second Number");
}
else{
    System.out.println("Second Number is bigger than First number ");
}

 

// Write a program to enter any number and check the number is even or odd.

System.out.print("Enter number: ");
double num = condit.nextDouble();
if( num%2==0 ){
    System.out.print("The given number "+ num +"is Even.");
}
else{
    System.out.println("The Given number is Odd ");
}


 
// Write a program to enter any number and check the number is positive number or negative number

System.out.println("Enter the number: ");
double firstNum = condit.nextDouble();
if(firstNum>=0){
    System.out.println("Given number is Positive");
}
else{
    System.out.println("Given number is Negative");
}


 
System.out.print("Enter First number: ");
int numb = condit.nextInt();
System.out.print("Enter Second number: ");
int numb2 = condit.nextInt();
if (numb>numb2){
    System.out.println("First Number " + numb + " Is Greater Than The Second Number " + numb2);
}
else{
    System.out.println("Second Number " + numb2 + " Is Greater Than The First Number " + numb);
}

 
 
// Write a program to enter any number and check if the number is positive, negative or 0 ?

System.out.print("Enter The Number: ");
double number1 = condit.nextDouble();

if(number1 >= 0){
    System.out.println("Entered number is Positive " + number1 );
}
else{
    System.out.println("Entered number is Negative " + number1);
}


//Write a program to enter cost price, selling price of a product and display profit or loss   

System.out.print("Enter Cost Price: ");
Double costPrice = condit.nextDouble();
System.out.println("Enter Selling Price: ");
Double sellingPrice = condit.nextDouble();

if(costPrice > sellingPrice){
    System.out.print("We are in loss");
}
else if (costPrice == sellingPrice ){
    System.out.println("We Didnt Get Any Profit Or Loss");
}
else{
    System.out.println("We are in Profit");
}

//Write a program to enter percentage of a student and display the grade according to the percentage(if the percent is above 80 or 80 then A) 
//(If the percent is above 60 or 60 then B)(If the percent is above 50 or 50 then C)(If the percent is 40 or above 40 then D ) (less then 40 then Fail) 
 
System.out.print("Enter Percentage: ");
Double percentage = condit.nextDouble();
if(percentage >= 80){
    System.out.println("You Passed With A Grade");
}
else if (percentage >= 60){
    System.out.println("You Passed With B Grade");
}
else if (percentage >= 50){
    System.out.println("You Passed With C Grade");
}
else if(percentage >= 40){
    System.out.println("You Passed With D Grade");
}
else{
    System.out.println("Sorry, You Failed");
}


 
int age = 0;

if (age >0){
    System.out.println("Age is greater then 0");
    if(age <20){
        System.out.println("Age is not 0 and less then 20");
    }
    else{
        System.out.println("age is above 20");
    }
}
else{
    System.out.println("age is 0 or less then 0");
}


 
System.out.print("Enter Age: ");
int ageOfPerson = condit.nextInt();
System.out.print("Enter Weight");
double weightOfPerson  = condit.nextDouble();
if(ageOfPerson >= 18){

    if(weightOfPerson >= 50){
        System.out.println("Candidate is Elegible by age & Weight");
    }
    else{
        System.out.println("Weight is less then 50");
    }
}

else{
    System.out.println("Candidate is not Elegible");
}

//Write a Java program to check if a number is positive or negative.
        
System.out.print("Enter Digit: ");
int digit = takeInput.nextInt();
if(digit > 0){
    System.out.println("Entered Number " + digit + " Is Positive");
}

else if( digit < 0){
    System.out.println("Entered Number " + digit + " Is Negative");
}
else if( digit == 0){
    System.out.println("Entered Number Is 0");
}

 

//Write a program to display week days name according to the given alphabet by the user
System.out.print("Enter Alphabet: ");
char alphabet = condit.nextLine().toUpperCase().charAt(0); 
switch(alphabet){
    case 'M' : 
    System.out.print("Monday");
    break;

    case 'T':
    System.out.print("Tuesday");
    break;

    case 'W':
    System.out.print("Wednesday");
    break;

    default: System.out.println("The Alphabet Entered Is Not a Part of any days ");
}

 




}
    
}
