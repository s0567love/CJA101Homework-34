package HW5;

import java.util.Scanner;

public class GenAuthCode {

	
	public static void main(String args[]) {
		System.out.println("請輸入要產生多少個亂碼:");
		Scanner sc= new Scanner(System .in);
		int i = sc.nextInt();
		genAuthCode(i);

	}
	
	public static void genAuthCode(int i) {
		
		char a[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
			  'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
			  '1','2','3','4','5','6','7','8','9','0'};
		
		char b[]= new char[i];
		
		for(int k=0;k<i;k++) {
			int r=Random();
			b[k]=a[r];			
		}
		for(int k=0;k<i;k++) {
			System.out.print(b[k]);
		}
		
	}
	
	public static int Random() {
		int i=(int)(Math.random()*62)+1;
		return i;
	}

}
