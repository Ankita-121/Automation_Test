package Hometask1;

public class UpperLower {

	public static void main(String[] args) {
		String s="ApPLe";
		StringBuffer r = new StringBuffer(s);
		for(int i=0; i<s.length(); i++) {
			if(Character.isLowerCase(s.charAt(i))) 	//.IsLowerCase to check that is it a lower case
			{
				r.setCharAt(i,Character.toUpperCase(s.charAt(i)));
				//.set is used to store the char in new string
			}
			else if(Character.isUpperCase(s.charAt(i))) {
				r.setCharAt(i,Character.toLowerCase(s.charAt(i)));
		}}
	System.out.println(r);	
}
	}

