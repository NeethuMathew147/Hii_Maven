package exceptionPrograms;

public class ArithmeticExceptionProgram {

	public static void main(String[] args) {
		
		try {
		int a=3;
		int b=0;
		int c= a/b;
	System.out.println(c);
	
		}
		catch (ArithmeticException ae)
		{
			System.out.println("You cannot divide a number by 0");
		}

	}

}
