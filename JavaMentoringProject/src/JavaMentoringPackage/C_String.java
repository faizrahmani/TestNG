package JavaMentoringPackage;

public class C_String {

	public static void main(String[] args) {

		String name="Ahmad";
		String lastName="Mahmood";
		int bonus=30;
		int salary=100000;
		
		System.out.println("How String concatenation works: ");
		System.out.println(name+"   "  +lastName+"   "+bonus+salary);
		System.out.println(name+lastName+(bonus+salary));
		System.out.println(bonus+salary+name+lastName);
		
		System.out.println("How to find a character from a string: ");
		System.out.println(name.charAt(3));
		
		System.out.println("How String comparison works: ");
		System.out.println(name.equals("Ahmad"));
		System.out.println(name.equals("Ahmad "));
		System.out.println(name.equals("AHMAD"));
		
		System.out.println("How can we ignore case sensitivity in String:  ");
		System.out.println(name.equalsIgnoreCase("AHMAD"));
		
		System.out.println("How contains keyword works in String:  ");
		System.out.println(name.contains("mad"));
		
		System.out.println("How can we convert String to upperCase:  ");
		System.out.println(name.toUpperCase());
		
		System.out.println("Length of the string is: " +lastName.length()); //How we can find length of String. 
		
		System.out.println("How can we join two Strings together:  ");
		System.out.println(name.concat(lastName)); 
		
		System.out.println("How can we substract characters from String:  ");
		System.out.println(name.substring(0,4));
		
		System.out.println("How can we replace a character or word of a String:  ");
		System.out.println(name.replace('A', 'E'));
		System.out.println(lastName.replace("Mahmood", "Rishad"));
		
		System.out.println("How can we remove spaces from a String ");
		String sel="                   Selenium                      ";
		
			System.out.println("Before Triming string is: " +sel);
			System.out.println("After Triming string is:" + sel.trim());
		
	}

}
