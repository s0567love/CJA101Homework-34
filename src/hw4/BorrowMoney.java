package hw4;

import java.util.Scanner;

public class BorrowMoney {

	
	public static int A[][]= { {25,2500},
			                   {32,800},
			                   {8,500},		
			                   {19,1000},
			                   {27,1200}  };
	
	
	public static void main(String args[]) {
		
		System.out.println("請輸入你要借的金額:");
		Scanner sc=new Scanner(System .in);
		int x=sc.nextInt();
		
		int count =0;
		
		for(int i=0;i<5;i++) {
			if(A[i][1]>=x) {
				count++;
				System.out.print(A[i][0]+"\t");
				}			
		}
		System.out.print("共"+count+"人!");
	}
}
