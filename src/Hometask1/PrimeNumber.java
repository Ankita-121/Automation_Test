package Hometask1;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=97;
		int m=n;
		int f=0; //prime
		if(n==0||n==1) {
			System.out.println("is not a prime number");
		}
		else {
		for(int i=2; i<m; i++) {
			if(n%i==0) {
				f=1;
				break;
						}
		}
		if(f==0) {
			System.out.println("is a prime");
		}
		}
	}
}

	


