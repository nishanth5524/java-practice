package Callable;

public class SumOfN_2 implements Runnable {

	int num;

	SumOfN_2(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int sum = 0;

		System.out.println("Calculating by Thread -> " + Thread.currentThread().getName());

		for (int i = 0; i < num; i++) {
			sum = sum + i;
			
		}
		
		//System.out.println(sum);

	}

}
