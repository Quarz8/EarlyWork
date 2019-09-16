/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Practice:	2
 */
public class Practice_02_Test
{

	// Tests all methods in Practice_02 (student object)
	public static void main(String[] args)
	{
		// Test default constructor and toString() method
		Practice_02 s1 = new Practice_02();
		System.out.println(s1.toString());

		// Test parameterized constructor (name, id, gpa) and toString() method
		Practice_02 s2 = new Practice_02("Pithy Zafoo", 100069420, 3.2);
		System.out.println(s2.toString());
		
		// Test setter methods
		s2.setName("Supa Hakka");
		s2.setId(999999999);
		s2.setGpa(4.0);
		
		// Test getter and above setter methods
		System.out.println("Name:\t"+s2.getName());
		System.out.println("ID:\t"+s2.getId());
		System.out.println("GPA:\t"+s2.getGpa());
		
		// Test equals method
		Practice_02 s3= new Practice_02();
		System.out.println("s1==s2?\t"+s1.equals(s2));
		System.out.println("s1==s3?\t"+s1.equals(s3));
	}

}
