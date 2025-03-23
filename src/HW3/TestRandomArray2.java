package HW3;

public class TestRandomArray2 {
	
	public static int random(int k) {
		int i=(int)(Math.random()*(k+1));
		return i;
	}
	//random方法
	
	public int[][] getrandomarray(int i,int j) {
		int array[][]=new int[i][j];
		for(int m=0;m<array.length;m++) {
			for(int n=0;n<array[m].length;n++) {
				array[m][n]=random(30);
			}
		}
		return array;
	}
	//getrandomarray方法
	
	public void printarray(int data[][]) {	
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				data[i][j]=data[i][j]+data[i][j];
				System.out.print(data[i][j] +"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------");
		
	}
	//printarray方法
	
	
	public static void main(String args[]) {
		TestRandomArray2 a = new TestRandomArray2();
		int x[][]=a.getrandomarray(3,3);
		int y[][]=a.getrandomarray(3,3);

		int z[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				z[i][j]=x[i][j]+y[i][j];
			}
		}
       
		a.printarray(x);
		System.out.println("---------------------------------------------------------------------");
		
		a.printarray(y);
		System.out.println("---------------------------------------------------------------------");
		
		a.printarray(z);
		System.out.println("---------------------------------------------------------------------");
		
	}


}
