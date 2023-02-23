package exceptionPrograms;

public class ArrayOutOfBoundExp {


	public static void main(String[] args) {
		
		try {
			int a[] = new int[5];
			a[7]=12;
			System.out.println(a[7]);
		}
		 catch(ArrayIndexOutOfBoundsException ae)  
		{
			System.out.println("Array out of Bound");
			
		}
	}
}
