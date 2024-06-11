package Hometask1;

public class Palindorme {

	public static void main(String[] args) {
			  int a = 123;
			  int reminder = 0;
			  int r;
			  int t=a;
			  while(a>0) {
				  r=a%10; // to get the reminder
				  reminder = reminder*10 + r;
				  a=a/10;
			  }
				if(reminder==t) 
				System.out.println("Number is a palindrome");
				else
		System.out.println("Number is not a palindrome");		    
			}  
}

	


