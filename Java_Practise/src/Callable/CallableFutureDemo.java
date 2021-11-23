package Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableFutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

		ExecutorService es = Executors.newFixedThreadPool(10);

		List<Future<Integer>> list = new ArrayList();

		for (int i = 1; i <= 100; i++) {
			Future<Integer> f = es.submit(new SumOfN(i));
			// es.execute(new SumOfN_2(i));
			//Thread.sleep(1000);
			list.add(f);
		}

		for (Future f : list) {

			System.out.println(f.get(1, TimeUnit.SECONDS));

		}

		es.shutdown();

	}

}
