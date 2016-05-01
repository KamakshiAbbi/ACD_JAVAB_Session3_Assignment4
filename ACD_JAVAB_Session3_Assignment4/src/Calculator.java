//Session3_Assignment4: 30.4.2016
//Author: Kamakshi Abbi
import java.util.Scanner;
public class Calculator {
double num1;
double num2;
String operator;
double res;
public Calculator(double num1, double num2, String operator){
	this.num1 = num1;
	this.num2 = num2;
	this.operator = operator;
}
//Instead of making separate functions for each operation, all are combined in one.
//this is so that the manipulation of calling the different functions is prevented from being part of 
//main function.
public double Calculate(){
	double res =0.0;
	switch(operator){
		case "+": res = num1 + num2;
		break;
		case "-": res = num1 - num2;
		break;
		case "/" : res = num1 / num2;
		break;
		case "*" : res = num1*num2;
		break;
	}
	return res;	
}
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first number");
	double number1 = input.nextDouble();
	System.out.println("Enter the second number");
	double number2 = input.nextDouble();
	System.out.println("Enter the operator");
	String op = input.next();
	input.close();
	Calculator obj = new Calculator(number1,number2,op);
	double res = obj.Calculate();
	System.out.println("The result is "+res);
}

}
