package HW5;

public abstract class Pen {
	
	private String brand;
	private int price;
	
	public Pen() {}
	
	public Pen(String brand, int price) {
		this.brand=brand;
		this.price=price;
	}
	
	public int getPrice() {
		return this.price;	
	}
	
	public String getBrand() {
		return this.brand;	
	}
	
	public void setPrice(int i) {
		
		if(i>0) {
			this.price= i;
		}else {System.out.println("請輸入大於0的值");}		
	}
	
	public void setBrand(String k) {
		this.brand=k;
		
	}
	
	public abstract void write();
	

}
