package hw4;

public class StringComparison {
	
	public static String A[]= {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus","neptune"};
	
	public static void stringComparison(String a[]) {
		int k=a.length;
		int count=0;
		for(int i=0;i<k;i++) {
			for(int j=0;j<a[i].length();j++) {
				if(a[i].charAt(j)=='a' || a[i].charAt(j)=='e' || a[i].charAt(j)=='i' || a[i].charAt(j)=='o' || a[i].charAt(j)=='u') {
					count++;
				}
			}			
		}
		System.out.println(count);
		
	}
 
	public static void main(String args[]) {
		
		stringComparison(A);
		
	}
	
}
