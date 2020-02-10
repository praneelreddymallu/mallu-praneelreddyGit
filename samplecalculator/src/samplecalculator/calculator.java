package samplecalculator;
import java.util.Scanner;
class Operations
{
	 void op()
	 {
       double n1, n2;
       String operation;
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter first number");
       n1 = sc. nextDouble();
       System.out.println("Enter second number");
       n2 = sc. nextDouble();
       System.out.println("Enter your operation");
       operation = sc.next();
       switch (operation)  
       {
       case "+":
           System.out.println("Your answer is " + (n1 + n2));
           break;
       case "-":
           System.out.println("Your answer is " + (n1 - n2));
           break;
       case "/":
           System.out.println("Your answer is " + (n1 / n2));
           break;
       case "*":
           System.out.println("Your answer is " + (n1 * n2));
           break;
       default:
           System.out.println("Enter valid input");

       }
	 }
}
public class calculator
{
	public static void main(String args[])
	{
    Operations n=new Operations();
    n.op();
	}
}

