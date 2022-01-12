package memory_practice;

public class NativeThread {

	static int count = 0;
	
	public static void main(String[] args) throws InterruptedException {

		while (true) {
			//Thread.sleep(1);
			new Thread(new Runnable() {
				public void run() {
					try {
						count++;
						System.out.println(count);
						Thread.sleep(10000000);
					} catch (InterruptedException e) {
					}
				}
			}).start();
		}

	}

}
