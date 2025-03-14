package HW2;

public class Student {
	
    int score=90;
	
	public void play(int hours) {
		score=score-hours;
	}
	public void study(int hours) {
		score=score+hours;
	}
	public void showinfo() {
		System.out.println("分數為: "+score);}
	
}
