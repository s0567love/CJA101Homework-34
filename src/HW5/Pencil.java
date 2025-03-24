package HW5;

public class Pencil extends Pen{

	@Override
	public void write() {
		System.out.println("削鉛筆再寫");		
	}
	
	public int getPrice() {
		return (int) (super.getPrice()*0.8);
	}
	
	public Pencil(String brand, int price) {
		super(brand,price);
	}

}
