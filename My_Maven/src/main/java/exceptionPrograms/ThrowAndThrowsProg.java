package exceptionPrograms;

public class ThrowAndThrowsProg {
	
	public void dividemeth()throws ArithmeticException
	{
		try {
		int a=5;
		int b=0;
		int c=a/b;
		throw new ArithmeticException("error");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Do not divide a number by zero");
		}
		
	}

	public static void main(String arg[]) {
		
		ThrowAndThrowsProg t =new ThrowAndThrowsProg();
		t.dividemeth();
	}
}
