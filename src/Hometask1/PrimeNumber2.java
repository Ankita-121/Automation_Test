package Hometask1;

public class PrimeNumber2 {

	public static void main(String[] args) {
				int n1=1;
				int n2=17;
				int i=0;
				int j=0;
				
				for(i=n1; i<=n2; i++)
				{
					for( j=2; j<=i; j++)
					{
						if(i%j==0)
						break;
					}
					if(i==j)
						System.out.println(j);
								}
			}}