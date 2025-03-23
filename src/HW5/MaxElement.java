package HW5;

public class MaxElement {
	
	public static void main(String args[]) {
		
		MaxElement a = new MaxElement();
		int x[][]=a.getRandomIntArray(2,3);
		double y[][]=a.getRandomDoubleArray(2,3);

		a.printIntArray(x);
		maxElement(x);
		System.out.println("---------------------------------------------------------------------");
		
		a.printDoubleArray(y);
		maxElement(y);
		System.out.println("---------------------------------------------------------------------");
	}
	
	public static void maxElement(int array[][]) {
		int temp=0;
		for(int m=0;m<array.length;m++) {
			for(int n=0;n<array[m].length;n++) {
				if(temp<array[m][n]) {
					temp=array[m][n];
				}
			}
		}
		System.out.println(temp);
	}
	//找intArray最大元素
	
	public static void maxElement(double array[][]) {
		double temp=0;
		for(int m=0;m<array.length;m++) {
			for(int n=0;n<array[m].length;n++) {
				if(temp<array[m][n]) {
					temp=array[m][n];
				}
			}
		}
		System.out.printf("%.1f\n", temp);
	}
	//找doubleArray最大元素
	
	public static int intRandom(int k) {
		int i=(int)(Math.random()*k)+1;
		return i;
	}
	//IntRandom方法
	
	public static int[][] getRandomIntArray(int i,int j) {
		int array[][]=new int[i][j];
		for(int m=0;m<array.length;m++) {
			for(int n=0;n<array[m].length;n++) {
				array[m][n]=intRandom(100);
			}
		}
		return array;
	}//getRandomIntArray方法
	
	public static double doubleRandom(int k) {
		double i=(Math.random()*k+1);
		return i;
	}
	//doubleRandom方法
	
	public double[][] getRandomDoubleArray(int i,int j) {
		double array[][]=new double[i][j];
		for(int m=0;m<array.length;m++) {
			for(int n=0;n<array[m].length;n++) {
				array[m][n]=doubleRandom(100);
			}
		}
		return array;
	}//getRandomDoubleArray方法
	
	public void printIntArray(int data[][]) {	
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				System.out.print(data[i][j] +"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------");
		
	}
	//printIntarray方法
	
	public void printDoubleArray(double data[][]) {	
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				System.out.print(data[i][j] +"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------");
		
	}
	//printDoublearray方法
	
	

}
