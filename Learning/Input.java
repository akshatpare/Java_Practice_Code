import java.util.Scanner;

public class Input {
    public static void main(String[]args){

// TO take input in java 
// import java.util.Scanner; is the package to take input in java.
 
Scanner takeInput = new Scanner(System.in);
System.out.println("Enter number");
int num = takeInput.nextInt(); 
System.out.println("Entered Number is " + num);



// Write a program to enter name age and percentage of a student and display them.
 
Scanner takeInput = new Scanner (System.in); 
System.out.print("Enter Name: ");
String name = takeInput.nextLine(); 

System.out.print("Enter Age: ");
int age = takeInput.nextInt(); 
 
System.out.print("Enter Percentage: ");
int percentage = takeInput.nextInt(); 

System.out.println("Name is "  + name);
System.out.println("Age is "  + age);
System.out.println("Percentage is "  + percentage);



// We create object only once and we can take as many inputs we want just we have to store them in different variables and also there are different keywords
//for different data types to store like for String variable we have to use .nextLine in 82nd line and for int we have to use .nextInt.
 
 
// Write a program to enter 2 numbers and display remainedr and questiont
Scanner takeInput = new Scanner (System.in);
System.out.print("Enter First Value: ");
int firstValue = takeInput.nextInt();

System.out.print("Enter Second Value: ");
int secondValue = takeInput.nextInt();

int resultValue = firstValue / secondValue;
int remainedrValue = firstValue % secondValue;

System.out.println("The Quotient Value is:  " + resultValue);

System.out.println("The Remainder Value is: " + remainedrValue);


 
// Write a program to enter length and width of a rectangle and display area.
Scanner takeValue = new Scanner(System.in);
System.out.print("Enter Length :");
double l = takeValue.nextDouble();
System.out.print("Enter Width:");
double w = takeValue.nextDouble();
double areaOfRectangle = l * w;
System.out.println("The Area of Rectangle is: " + areaOfRectangle);

// Write a program to enter 3 subjects marks of a student and display total marks and percentage.


System.out.print("Enter the Marks of First Subject:");
double firstSubject = takeValue.nextDouble();
System.out.print("Enter The Marks of Second Subject:");
double secondSubject = takeValue.nextDouble();
System.out.print("Enter the Marks of Third Subject:");
double thirdSubject = takeValue.nextDouble();

double totalMarks = (firstSubject + secondSubject + thirdSubject);
double percentage = totalMarks/3;
System.out.println("Total Marks of All Three Subjects are: " + totalMarks + " Out Of 300");
System.out.println("The Percentage is: " + percentage);






    }
    
}
