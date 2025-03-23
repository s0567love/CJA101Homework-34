package HW5;

import java.util.Scanner;

public class RandAvg {
	
	public static void main(String args[]) {
		System.out.println("請輸入要計算多少個隨機數字:");
		Scanner sc=new Scanner(System .in);
		int a=sc.nextInt();
		
		System.out.println(randAvg(a));
	
	}
	
	
	public static double randAvg(int i) {
		
		int radarray[]=new int[i];
		
		for(int k=0;k<i;k++) {
			radarray[k]=(int)(Math.random()*101);			
		}
		
		int sum=0;
		for(int k=0;k<i;k++) {
			sum=radarray[k]+sum;			
		}
		
		return sum/i;
	}

}
