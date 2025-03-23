package hw4;

public class OneDimensionalArray {
	
	public static int A[]= {29,100,39,41,50,8,66,77,95,15};
	
	public static void printArrayAverge(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];			
		}
		double average=sum/a.length;
		System.out.println("平均值:"+average);
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>average) {
				System.out.println("第"+i+"個陣列元素"+a[i]+"大於平均值");
			}			
		}
		
	}
	
    public static void main(String args[]) {
    	printArrayAverge(A);    	
    }	
}
//作業1


