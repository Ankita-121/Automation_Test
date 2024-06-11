package Hometask1;

public class NoO {

	public static void occur(String a) {
		int[] charCountArray = new int[256];
		for (int i=0; i<a.length(); i++) {
			charCountArray[a.charAt(i)]++;
		}
		for (int i=0; i<charCountArray.length; i++) {
			if(charCountArray[i]>0);
			System.out.println("occurance" +(char) i + charCountArray[i]);
		}
	}
public static void main(String[] args) {
	occur("My name is saloni");
		}
}
 
