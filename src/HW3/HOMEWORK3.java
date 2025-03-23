//package HW3;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class HOMEWORK3 {
//	
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System .in);
//		System.out.println("Input a number");
//
//		int date[] = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
//		
//		Arrays.sort(date);
//		
//		if(date[0]==date[1] && date[1]==date[2]) {
//			System.out.println("正三角形");
//		}else if((date[0]==date[1] && date[1]!=date[2] && date[0]+date[1]>date[2]) || (date[0]!=date[1] && date[1]==date[2] && date[0]+date[1]>date[2])) {
//			System.out.println("等腰三角形");
//		}else if(date[0]!=date[1] && date[1]!=date[2] && date[2]!=date[0]&& date[0]+date[1]>date[2]) {
//			if(date[0]*date[0]+date[1]*date[1]==date[2]*date[2]) {
//				System.out.println("直角三角形");
//			}else {System.out.println("其他三角形");}
//		}else {System.out.println("不是三角形");}
//	}
//}
//作業1


//package HW3;
//
//import java.util.Scanner;
//
//public class HOMEWORK3 {
//	
//	public static void main(String args[]) {
//		int realdate=(int)(Math.random()*10);
//		
//		Scanner sc = new Scanner(System .in);
//		System.out.println("Guess a number");
//        int guessdate = sc.nextInt();
//        
//        do {if(realdate==guessdate) {
//        	}else {System.out.println("猜錯了");
//        		   guessdate = sc.nextInt();}
//        } while(realdate!=guessdate);
//        System.out.println("答對了，答案是: " + realdate);
//	}
//}
//作業2

//package HW3;
//
//import java.util.Scanner;
//
//public class HOMEWORK3 {
//	
//	public static void main(String args[]) {
//		int realdate=(int)(Math.random()*101);
//		
//		Scanner sc = new Scanner(System .in);
//		System.out.println("Guess a number(from 0~100):");
//        int guessdate = sc.nextInt();
//        
//        do {if(realdate==guessdate) {
//        	}else {if(realdate<guessdate) {System.out.println("猜太大了");
//        	       }else {System.out.println("猜太小了");}
//        		   guessdate = sc.nextInt();}
//        } while(realdate!=guessdate);
//        System.out.println("答對了，答案是: " + realdate);
//	}
//}
//作業2進階

package HW3;

import java.util.Random;
import java.util.Scanner;

public class HOMEWORK3 {
	
	public static void main(String args[]) {
	
		System.out.println("請輸入你討厭的數字1~9");
		Scanner sc = new Scanner(System .in);
        int hatedate = sc.nextInt();
        int excludeArrays[];
        int countIn = 0;
        
        while (hatedate < 1 || hatedate > 9) {
 			System.out.println("請輸入1-9之間的數字，再輸入一次");
 			sc.next();
 		}
        
        if(hatedate<4) {
        	excludeArrays = new int[35];
        }else {
        	excludeArrays = new int[44];
        }
        
        for (int i = 1; i < 50; i++) {
 			int tenValue = (int) (i / 10);
 			if (i % 10 != hatedate && tenValue != hatedate) {
 				excludeArrays[countIn] = i;
 				countIn++;
 				System.out.print(i + " ,");
 			}
 		}
        System.out.println();

        Random random = new Random();
        int randomIndex = random.nextInt(excludeArrays.length);
        int randomValue = excludeArrays[randomIndex];
        
        int array[][] = new int[6][];
        
        for(int k=0;k<5;k++) {
    		array[k]=new int[6];
    	}    
        array[5]=new int[5];
        
        for(int i=0;i<5;i++) {   
        	for(int j=0;j<6;j++) {

        		randomIndex = random.nextInt(excludeArrays.length);
        		randomValue = excludeArrays[randomIndex];
        		array[i][j]=randomValue;      			
        		
        		System.out.print(array[i][j]+"\t");
        	}
        	System.out.println();
        }
        
        for(int k=0;k<5;k++) {
        	randomIndex = random.nextInt(excludeArrays.length);
	        randomValue = excludeArrays[randomIndex];
        	array[5][k]=randomValue;
        	System.out.print(array[5][k]+"\t");
        }
        
	}
}
//作業3

