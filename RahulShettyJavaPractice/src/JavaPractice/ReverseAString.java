package JavaPractice;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="RAHMANI";
		String p="";
		
		for(int i=s.length()-1;i>=0;i--) {
			p=p+s.charAt(i);
		}
		System.out.println(p);
			
		
		

	}

}
