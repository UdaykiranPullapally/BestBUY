package collectionLearning;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ArithmetiExceptionLearning {

	/*
	 * Exception inbuilt : Arithmetic NullPointer NumberFormarException
	 * ArrayIndexOutofBoundException StringIndexOutouBoundException User defined
	 * exception
	 * 
	 * final , finally and finalize 
	 * 
	 * final :
	 * Final is a keyword 
	 * used to apply restriction on variable, class nd methods
	 * class :class cannot be inherited
	 * method: method cannot be overridden
	 * variable : value cannot be changed 
	 * 
	 * 
	 * finally :
	 * block in exception handling 
	 * used to write the imp code
	 * 
	 * 
	 * finalise :
	 * method available in object class
	 * used to clean up the memory ( Garbage collector )
	 */

	// @Test
	public void arithmaticExceptionHandling() {
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		while (flag == false) {
			System.out.println("Enter the input for a :");
			int a = scanner.nextInt();
			System.out.println("Enter the input for b :");
			int b = scanner.nextInt();
			int c = 0;
			try {
				c = a / b;
			} catch (ArithmeticException obj) {
				obj.printStackTrace();
				b = 1;
				System.out.println("Arithmetic Exception Handled");
			}
			System.out.println("Do you want to continue, If yes press 0,If not press 1");
			int flow = scanner.nextInt();
			if (flow == 1) {
				break;
			}
			System.out.println(c);
		}
	}

	@Test
	public void nullPointerException() {
		try {
			String a = null;
			System.out.println(a.length());
		} catch (NullPointerException obj) {
			System.out.println("Null Pointer Exception is handledd ");
		}
	}

	@Test
	public void arrayException() {
		try {
			String[] a = { "hello", "null", "java" };
			System.out.println(a[3]);
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Array Exception is handledd ");

		}
	}

	@Test
	public void numberFormatException() {
		try {
			String a = "Hello";
			int n = Integer.parseInt(a);
			System.out.println(n);
		} catch (NumberFormatException n) {
			System.out.println("Number format Exception is handledd ");

		}
	}

	@Test
	public void twocatchBlocks() {
		try {
			String[] arr = { "hello", "null", "java" };
			System.out.println(arr[3]);
			String a = "Hello";
			int n = Integer.parseInt(a);

		} catch (NumberFormatException n) {
			n.printStackTrace();
			System.out.println("Number format Exception is handledd ");

		}finally {
			System.out.println("Am the most important code who will run despite of exception handled or not ");
			
		}
		
	}
}

}
