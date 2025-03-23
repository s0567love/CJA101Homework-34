package HW5;

import java.util.Scanner;

public class CalculateStar {
	
	public static void main(String args[]) {
		System.out.println("請輸入長與寬:");
		Scanner sc=new Scanner(System .in);
		int data[]= {sc.nextInt(),sc.nextInt()};
		
		starSquare(data[0],data[1]);
	}
	
	
	public static void starSquare(int i,int j) {
		for(int k=0;k<i;k++) {
			for(int n =0;n<j;n++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
	}

}
