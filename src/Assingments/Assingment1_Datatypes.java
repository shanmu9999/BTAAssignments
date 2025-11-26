package Assingments;

public class Assingment1_Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1. Temperature of a city in degrees Celsius: 25.5
           2. Whether a customer has placed an order: true or false
           3. Person's phone number: "123-456-7890"
           4. Amount of money in a customer's bank account: 1000.50
           5. Person's email address: "john.doe@example.com"
           6. Coordinates of a location (latitude, longitude): 37.7749, -122.4194
           7. Person's marital status: true or false
           8. Person's occupation: "Software Engineer"
           9. Person's favourite colour: "Blue"
           10.Current year: 2023
           11.Number of followers on a social media platform: 1,000,000
           12.Rating of a movie: 7.5
           13.Person's blood type: 'A'
           14.Title of a book: "To Kill a Mockingbird"
           15.Number of employees in a company: 500
           16.Time of an event: 2:30 PM
           17.Name of a country: "United States"
           18.Person's eye color: "Brown"
           19.Person's birthplace: "New York City"
           20.Distance between two cities: 200.5
         */
		
		float temp = 25.5f;
		System.out.println("1. Temperature of a city in degrees Celsius:" +temp);
		
		boolean order = true;
		System.out.println("2. Whether a customer has placed an order"+order);
		boolean order2 = false;
		System.out.println("   Whether a customer has placed an order"+order2);
		
		String num = "123-456-7890";
		System.out.println("3. Person's phone number:"+num);
		
		double bank = 1000.50;
		System.out.println("4. Amount of money in a customer's bank account:"+bank);
		
		String email = "john.doe@example.com";
		System.out.println("5. Persons email address:"+email);

		float latitude = 37.7749f;
		float longitude = -122.4194f;
		System.out.println("6. Coordinates of a location (latitude, longitude:"+latitude+""+longitude);
		
		boolean maritial = true;
		boolean maritial2 = false;
		System.out.println("7. Person's marital status:"+maritial+""+maritial2);
		
		String Occu = "Software Engineer";
		System.out.println("8. Person's Occupation:"+Occu);
		
		String color = "Blue";
		System.out.println("9. Person's fav colour:"+color);
		
		int year = 2023;
		System.out.println("10. Current year:"+year);
		
	    String followers = "1,000,000";
		System.out.println("11. Followers in social media:"+followers);
		
		float rating = 7.5f;
		System.out.println("12. Rating of the movie"+rating);
		
		char blood = 'A';
		System.out.println("13. person blood type:"+blood);
		
		String book = "To Kill a Mockingbird";
		System.out.println("14. Title of the book is:"+book);
		
		int emp = 500;
		System.out.println("15. Number of emp in company"+emp);
		
		String time = "2:30 PM";
		System.out.println("16. Time of the event:"+time);
		
		String state = "United State";
		System.out.println("17. Name of the Country:"+state);
		
		String eye = "Brown";
		System.out.println("18. Person Eye colour:"+eye);
		
		String place = "Newyork city";
		System.out.println("19. Person birth place:"+place);
		
		double dis = 200.0;
		System.out.println("20. Distance between two cities:"+dis);
		
	}

}
