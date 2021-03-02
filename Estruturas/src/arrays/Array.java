package arrays;

import java.util.ArrayList;
import java.util.List;

public class Array {
	
	public void build() {
		//Arrays in java are built in structures
		//They are index and not dynamic
		
		int [] nums = new int[5];
		
		for(int i=0; i < 5; i++) 
			nums[i] = i;
		
		//The search can be make by index of the elements
		//But if we don't know the index of some element. 
		//A linear search can be made O(N)
		
		for(int i=0; i < 5; i++) 
			if(nums[i] == 6) 
				System.out.println("FInded");
		
		//ArrayList
		//Java class that uses Arrays implementations, but with advantage to be resizeble
		// The ArrayList is dynamic
		// But the resizeable operation cost performance, because the java nedds to copy new array with new size
		// The ArrayList does not accept primitive types (int float) just objects of these types (Integer, Float, etc)
		
		List<String> names = new ArrayList();
		
		//We can add elements
		names.add("teste");
		
		//Get an item by index
		names.get(0);
		
		//Remove by index
		names.remove(2);
		
		//OBS: It is interesting to think that removes the first element
		//of an array is costly then last element, because with first element
		//The array needs to rearrange the others elements
	}
}
