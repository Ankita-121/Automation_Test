package Hometask1;

public class ReversTheNumber {

	public static void main(String[] args) {
//		First, we find the remainder of the given number by using the modulo (%) operator.
//		Multiply the variable reverse by 10 and add the remainder into it.
//		Divide the number by 10.
//		int a=34567;  a=number
//		int b=a%10;   b=reminder
//		int c=0*10+b; c=reverse reverse initilzed by 0
		// a=a/10
//		
		{  
	        int a=2345;
	        int c=0; //that means it will start from 0  
		    while(a != 0){  //when number is not equal to 0, 2345 !=0
		    	           //234 !=0
		    	           //23 !=0
		    	           //2 !=0
		    	{  
		    int b = a % 10;  //2345%10 = 5 
			                 //234%10 = 4
			                 //23%10 = 3
			                 //2%10 = 0.2 = 0 
			c = 0 * 10 + b;  //0*10+5=5
			                 //0*10+4 = 4
			                 //0*10+3 = 3
			                 //0*10+0 = 0
			a = a/10;        //2345/10 = 234
			                 //234/10 = 23
			                 //23/10 =2
			             
			}  
			System.out.println("The reverse of the given number is: " + c);    //5
			                                                                 //4
			                                                                 //3
			
			}  
	}
}
}


