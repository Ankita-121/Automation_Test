package Hometask1;

public class VowelsandConsonants {

	public static void main(String[] args) {
		
//		String s ="Ankita Kumari"; //Number of character in a string
//		 //s.toLowerCase();
//		 //System.out.println(s.toLowerCase());
//	for(int i=0; i<s.length(); i++) {
//	v=v+1; 
//	}
//	System.out.println(v);
//	}

	
//	String s ="Ankita Kumari"; //Number of character in a string and covert all character in lower case
//	 s.toLowerCase();
//	 System.out.println(s.toLowerCase());
//for(int i=0; i<s.length(); i++) {
//v=v+1; 
//}
//System.out.println(v);
//}

	
//	String s ="Ankita Kumari"; //Number of character in a string and covert all character in upper case
//	 s.toUpperCase();
//	 System.out.println(s.toUpperCase());
//for(int i=0; i<s.length(); i++) {
//v=v+1; 
//}
//System.out.println(v);
//}


int v=0; int c=0;
String s ="Ankita Kumari";
s = s.toLowerCase(); //.LowerCase to convert in lower case
System.out.println(s);
for(int i=0; i<s.length(); i++) {
	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
		v++; 
	}
    else if(s.charAt(i) >= 'a' && s.charAt(i)<='z') {
		c++;
}}

System.out.println("Number of vowels in string s:" + v);
System.out.println("Number of conso in string s:" + c);
}
  }
