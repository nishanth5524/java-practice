package Thread_project;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) throws Exception {

		ExecutorService es = Executors.newFixedThreadPool(6);
		int Loan_fee = 50;

		Queue<Loan> q = new LinkedList<>();

		for (int i = 1; i <= 100; i++) {

			Runnable obj = new Loan(i, i);
			q.add((Loan) obj);
			System.out.println(Thread.activeCount());
			es.execute(obj);

		}

		System.out.println("");

		es.shutdown();
	}

}