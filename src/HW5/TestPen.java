package HW5;

public class TestPen {
	
   public static void main(String args[]) {


	  Pen p2 = new Pencil("A",10);
	  Pen p3 = new InkBrush("B牌",20);
	  
	  System.out.println(p2.getPrice());
	  p2.write();
	  
	  System.out.println(p3.getPrice());
	  p3.write();
	  
   }
}
