package collectionLearning;


import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ArrayListLearning {
//List is an interface 
	// ArrayList is a class that imlements List
	@Test
	public void ArrayListLearning() {

		// List list = new ArrayList();
		// List<datatype> list = new ArrayList<datatType>();

		/*
		 * Wrappers Class
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		// Create
		List<String> carNames = new ArrayList<String>();

		carNames.add("swift");
		carNames.add("Nexon");
		carNames.add("audi");
		carNames.add("santro");
		carNames.add("ferrai");

		System.out.println("Car Names : " + carNames);

		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(89);
		numbers.add(894);
		numbers.add(77);
		numbers.add(87);

		// System.out.println("Car Names : " + numbers);

		int a = 100;
		char b = 't';
		boolean rs = true;

		Integer x = 100;
		Character y = 's';
		Boolean result = false;

		// Read the data
		// System.out.println( carNames.get(1));

		for (int i = 0; i < carNames.size(); i++) {

			// System.out.println(carNames.get(i));
		}

		// Foreachloop

		for (String s : carNames) {
			// System.out.println(s);
		}
		
		//modify / update 
		carNames.set(4, "ferrai");
		
		
		
		
 //delete
		carNames.remove(4);
		System.out.println("Car Names : " + carNames);
carNames.remove(2);
System.out.println("car : "+ carNames);
	}

}
