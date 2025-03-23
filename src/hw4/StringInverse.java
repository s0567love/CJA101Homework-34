package hw4;

import java.util.Scanner;

public class StringInverse {
	
	public static void main(String args[]) {
		
		System.out.println("請輸入你要反轉的字串:");
		Scanner sc = new Scanner(System .in);
		String str= sc.nextLine();
		
		char[] charArray = str.toCharArray();
		
		for(int k=charArray.length-1;k>=0;k--) {
			System.out.print(charArray[k]);			
		}
		
	}
	
}
