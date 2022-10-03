package question2.thread;

public class Welcome extends Thread{
	public void run() {
		
		try {
			for(int i=0;i<5;i++) {
			sleep(20000);
			System.out.println("Welcome ");
			}
		  } catch (Exception e) {
			e.printStackTrace();
			
		}
}

}

