package memory_practice;

public class TwoRef {

	public static void main(String[] args) throws InterruptedException {
		
		TwoRef a = new TwoRef();
		TwoRef b = a;	
		TwoRef c = a;
		
		Thread.sleep(100000);
	}
	
}
