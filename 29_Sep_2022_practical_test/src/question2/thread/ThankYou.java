package question2.thread;

public class ThankYou extends Thread {
	public void run() {
		try{
			for(int i=0; i<3;i++) {
				sleep(40000);
				System.out.println("Thank you ");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}