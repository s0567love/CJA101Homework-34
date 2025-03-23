package hw4;

public class ScorePrinting {
	
	public static int[][]A= { {10,37,100,77,98,90},
	                          {35,75,70,95,70,80},
	                          {40,77,79,70,89,100},
	                          {100,89,90,89,90,75},
	                          {90,64,75,60,75,50},
	                          {85,75,70,75,90,20},
	                          {75,70,79,85,89,99},
	                          {70,95,90,89,90,75}
	                        };
	
	public static void main(String args[]) {
		
		int[] B = new int[8];
		int tempno=0;
		int tempScore=0;
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<8;j++) {
				if(A[j][i]>tempScore) {
					tempScore=A[j][i];
					tempno=j;
					
				}	
			}
			B[tempno]++;
			tempScore=0;
		}
		
		for(int i=0;i<8;i++) {
			System.out.println("學生"+(i+1)+"號最高"+B[i]+"次");
		}
		
	}

}

