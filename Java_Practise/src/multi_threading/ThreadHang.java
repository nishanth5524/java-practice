package multi_threading;

public class ThreadHang {

	public static Even even;
	public static Odd odd;

	public static void main(String[] args) throws InterruptedException {
		even = new Even();
		odd = new Odd();

		Thread a = new Thread(even);
		Thread b = new Thread(odd);
		a.start();
		b.start();
	}

	public static class Odd implements Runnable {

		public boolean running;

		public void run() {
			odd.pauseThread();
			while (!running) {
			}
			for (int i = 1; i <= 500; i += 2) {
				System.out.println(i);

				odd.pauseThread();

				while (!running) {
					even.resumeThread();

					if (i > 500) {
						return;
					}
				}
			}
		}

		public void pauseThread() {
			running = false;
		}

		public void resumeThread() {
			running = true;
		}
	}

	public static class Even implements Runnable {

		public boolean running;

		public void run() {
			System.out.println("Hello World");
			for (int i = 0; i <= 500; i += 2) {
				System.out.println(i);
				even.pauseThread();

				while (!running) {
					odd.resumeThread();

					if (i > 500) {
						return;
					}
				}
			}
		}

		public void pauseThread() {
			running = false;
		}

		public void resumeThread() {
			running = true;
		}
	}
}
