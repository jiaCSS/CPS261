import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

import java.util.concurrent.TimeUnit;

public class MySumTest {

	public static void main(String[] args) throws InterruptedException {

		//the reason I use executorservice is don't need to manage threads.
		//also most work use this. I learned this from book
		// called"headfirst java" hope this is correct.

		ExecutorService executorService = Executors.newFixedThreadPool(100);

		MySum mySum = new MySum();

		for (int i = 0; i < 100; i++) {
			executorService.execute(() -> mySum.increaseSum());

		}

		executorService.shutdown();
		executorService.awaitTermination(60, TimeUnit.SECONDS);

	}

}