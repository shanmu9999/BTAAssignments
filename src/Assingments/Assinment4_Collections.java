package Assingments;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assinment4_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create Lists with place and area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		
		Map <String,Integer> cities  = new HashMap<String,Integer>();
		cities.put("Hyderabad",1200);
		cities.put("Chennai",1300);
		cities.put("Banglore",1400);
		cities.put("Tenali",1500);
		cities.put("Mumbai",1600);
		
		System.out.println("total area of the 3rd and 4th cities:"+cities.get("Tenali")+" and "+cities.get("Mumbai"));
		
	// Create a set of the top 5 most visited tourist attractions in the world and print out all of them and its size.
		
		List <String> tour = new LinkedList<String>();
		tour.add("Goa");
		tour.add("Thai");
		tour.add("Goa");
		tour.add("Punjab");
		tour.add("Kerala");
		
		System.out.println("Print out all of them:"+tour);
		System.out.println("Print out all of them:"+tour.size());
		
		// 3. Create an array of 10 numbers and print out the Average of 5th and 6th Value
		
		int [] num = {1,2,3,4,5,6,7,8,9,10};
		double average = (num[4] + num[5]) / 2.0;
        System.out.println("Average of 5th and 6th Values: " + average);
        
        // Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
        
        List <String> movie = new LinkedList<String>();
        movie.add("Pushpa");
        movie.add("Pushpa2");
        movie.add("KGF");
        movie.add("KGF2");
        movie.add("Sampoo");
        System.out.println("print out the third movie on the list"+ movie.get(3));
        

		
	}
	

	
}
