import java.lang.Math;
public class ThreadEx extends Thread {
	public static void main(String[] args) {
		try {
			Thread t1 = new Thread();
			int num =Math.round((int)(Math.random()*100));
			System.out.println("The random number : "+num);
			t1.sleep(1000);
			if(num%2==0) {
				Even obj = new Even(num);
				Thread  t2 = new Thread(obj);
				t2.start();
			}else {
				Odd obj = new Odd(num);
				Thread  t3 = new Thread(obj);
				t3.start();
			}
		}catch(InterruptedException e) {}
	}

}
class Even extends Thread{
	int num;
	Even(int num){
		this.num = num;
	}
	public void run() {
		System.out.println("The square of "+num+" : "+(int)Math.pow(this.num, 2 ));
	}
}
class Odd extends Thread{
	int num;
	Odd(int num){
		this.num = num;
	}
	public void run() {
		System.out.println("The cube of "+num+" : "+(int)Math.pow(this.num, 3 ));
	}
}