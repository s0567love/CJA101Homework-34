package HW3;

public class HW3 {
	
	
	
	public static void main(String args[]) {
		int intarrayx[][]=new int[3][3];
		
		for(int i=0;i<intarrayx.length;i++) {
			for(int j=0;j<intarrayx[i].length;j++) {
				intarrayx[i][j]=(int)(Math.random()*31);
				System.out.print("intarrayx["+i+"]["+j+"] = " + intarrayx[i][j] +"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------");
		
        int intarrayy[][]=new int[3][3];
		
		for(int i=0;i<intarrayy.length;i++) {
			for(int j=0;j<intarrayy[i].length;j++) {
				intarrayy[i][j]=(int)(Math.random()*31);
				System.out.print("intarrayy["+i+"]["+j+"] = " + intarrayy[i][j] +"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------");
		
		int intarrayz[][]=new int[3][3];
       
		for(int i=0;i<intarrayz.length;i++) {
			for(int j=0;j<intarrayz[i].length;j++) {
				intarrayz[i][j]=intarrayx[i][j]+intarrayy[i][j];
				System.out.print("intarrayZ["+i+"]["+j+"] = " + intarrayz[i][j] +"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------");
	}

}



