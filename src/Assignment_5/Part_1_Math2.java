package Assignment_5;

import java.util.Scanner;

public class Part_1_Math2 {

	public static void main(String[] args) {
		
		UserSelection();
	}

	public static void UserSelection() {
		
		Scanner op1 = new Scanner(System.in);//to take a first number from user
		Scanner op2 = new Scanner(System.in);//to take second number from user
		
		System.out.println("Enter first number: ");
		double x = op1.nextDouble();
		
		System.out.println("Enter second number: ");
		double y = op2.nextDouble();
		
		Scanner operation = new Scanner(System.in);//to enter which operation user want to perform on the numbers
		
		System.out.println("Enter the operation to be performed- choices are add,sub,multi,div: ");
		String op = operation.nextLine();
		
		Part_1_Math choice = new Part_1_Math();//object creation to call non static method in Part_1_Math class
		
		switch(op.toUpperCase()) {//if user enters operation in lower case it get converted into upper case
		
		case "add":
			System.out.println(x+"+"+y+"="+Part_1_Math.add(x, y));
		break;//to end processing of a particular case
		      //without break the program continues to the next case,executing the statements until it reached at a break or the end of the statement
		
		case"sub":
			System.out.println(x+"-"+y+"="+Part_1_Math.subtract(x, y));
		break;
		
		case"multi":
			System.out.println(x+"*"+y+"="+choice.multiply(x, y));//calling non static method multiply()
			 //using object choice of class Part_1_Math in which this method exist
		break;
		
		case"div":
			System.out.println(x+"/"+y+"="+choice.divide(x, y));//calling non static method divide()
		    //using object choice of class Part_1_Math in which this method exist
		break;
		
		default:
			System.out.println("Invalid operation");
		
		
		
		}
		
				
		
		
		
		
		
		
		
		
		
		
	}
}
