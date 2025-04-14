import java.util.*;


public class Set_All_Imple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet -Order not guaranteed — Unique Hashtags on a Post (Fast Lookup, No Order)
				
		Set<String> hashtags = new HashSet<>();
		hashtags.add("AI");
		hashtags.add("Java");
		hashtags.add("MLDL");
		hashtags.add("Java");  // Duplicate &

		System.out.println("Hashtags (HashSet): " + hashtags);
		
//LinkedHashSet — Attendee Names in Order of Arrival
		Set<String> attendees = new LinkedHashSet<>();
		attendees.add("Aruna");
		attendees.add("BINA");
		attendees.add("MINA");
		attendees.add("Ciya");
		attendees.add("BINA"); // Duplicate

		System.out.println("Attendees (LinkedHashSet): " + attendees);
//TreeSet — Sorted List of Unique City Names for a Report
		Set<String> cities = new TreeSet<>();
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Chennai");
		cities.add("Delhi"); // Duplicate

		System.out.println("Cities (TreeSet): " + cities);
	}

}
