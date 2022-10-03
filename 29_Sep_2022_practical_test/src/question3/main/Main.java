package question3.main;

public class Main {

	public static void main(String[] args) {
		
		Runnable myThread =() ->{
			String threadName = Thread.currentThread().getName();
			System.out.println("Welcome to Lambda expression thread");
			
		};
		
		Thread thread =new Thread (myThread);
		thread.start();

	}

}
