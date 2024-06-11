package Hometask1;

public class Lcm {

	public static void main(String[] args) {
		int n1=20;
		int n2=28;
		int gcd=1;

	    for(int i = 1; i <= n1 && i <= n2; i++) {
	     
	      if(n1 % i == 0 && n2 % i == 0)
	        gcd = i;
	    }

	    int lcm = (n1 * n2) / gcd;
	    System.out.print("The LCM of two numbers is "+ lcm);

	}

}
