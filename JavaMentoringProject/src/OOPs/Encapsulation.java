package OOPs;

public class Encapsulation {
	
	//Encapsulation is also called data hidding \
	//Encapsulation is part of OOP

	//How to implement Encapsulation?
	//1. Initiate private data variables, so these variables can not be accessed directly from outside
	private String name;
	private int age;
	private int ssn;
	

	public static void main(String[] args) {
		Encapsulation emp=new Encapsulation();
		emp.setName("Ahmad");
		emp.setAge(30);
		emp.setSsn(123456789);
		
		System.out.println("Employee name is:   "+emp.getName());
		System.out.println("Employee age is:   "+emp.getAge());
		System.out.println("Employee ssn is:   "+emp.getSsn());
	}
	
	//2. Generate public setter and getter methods to set and get values or the feilds. 
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSsn() {
		return ssn;
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

}
