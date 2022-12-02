public class MySum {

	private int sum = 0;

	//synchronized block
	public void increaseSum() {

		synchronized (this){

			try {
			Thread.sleep(100);
			this.sum += 1;
			}
			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
			System.out.println("Thread-" +Thread.currentThread().getId() + " " +
					"sum " +
					"is: " + sum);
	}
	//synchronized method
//	public synchronized  void  increaseSum() {

//		Thread t = Thread.currentThread();
//		String name = "Thread-" + t.getId();
//		try {
//			Thread.sleep(100);
//			this.sum += 1;
//			System.out.println(name + " sum is: " + sum);
//		} catch (InterruptedException ex) {
//			System.out.println(ex.getMessage());
//		}
//
//	}

	//without synchronized
//	public  void  increaseSum() {
//
//		Thread t = Thread.currentThread();
//
//		String name = "Thread-" + t.getId();
//
//		try {
//
//			Thread.sleep(100);
//
//			this.sum += 1;
//
//			System.out.println(name + " sum is: " + sum);
//
//		} catch (Exception ex) {
//
//			System.out.println(ex.getMessage());
//
//		}
//
//	}

}