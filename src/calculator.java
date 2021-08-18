import java.util.Scanner;

public class calculator{

	 public double add(double a, double b){
		 return (a + b);
	 }


	 public double substract(double a, double b){
		 return (a - b);
	 }

	 public double multiply(double a, double b){
		 return (a * b);
	 }

	 public double divide(double a, double b){
		 return (a / b);
	 }

	public static void main(String[] args) {
		calculator c = new calculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Sid's basic arithmetic Calculator....! \nPerform as many calculations as you would like. \nType 'quit' anytime to exit.");
		System.out.println("Enter your expression without any space");
		String expr = "";
		while (!expr.equalsIgnoreCase("quit")){
			expr = scanner.next();
			Boolean found = false;
			for (int i= 0; i<expr.length(); i++) {
			if (expr.charAt(i) == '+' || expr.charAt(i) == '-' || expr.charAt(i) == '*' || expr.charAt(i) == '/')
			{
				found = true;
				String str1 = expr.substring(0, i);
				char oper = expr.charAt(i);
				String str2 = expr.substring(i+1, expr.length());
			try{
				
	            double number1 = Double.parseDouble(str1);
	            double number2 = Double.parseDouble(str2);
	            switch (oper)
	            {
	            case '+':
	            	System.out.println("The output is = " + c.add(number1, number2));
	            	break;
	            case '-':
	            	System.out.println("The output is = " + c.substract(number1, number2));
	            	break;
	            case '*':
	            	System.out.println("The output is = " + c.multiply(number1, number2));
	            	break;
	            case '/':
	            	System.out.println("The output is = " + c.divide(number1, number2));
	            	break;
	            }
	      
	        }
	        catch (NumberFormatException ex){
	        	System.out.println("Invalid input. Try Again");
	        	break;
	        }
			}
			}
		if (!found && !expr.equals("quit")) {
			System.out.println("Invalid input. Try Again");
		}
			
		if (expr.equals("quit"))
		{   
			System.out.println("Thanks for using Sid's Calculator");
		}
		}
		}
	}

