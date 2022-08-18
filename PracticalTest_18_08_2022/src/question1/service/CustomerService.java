package question1.service;
import question1.model.Customer;
public class CustomerService {
	public void checkEligibility(){
		
		Customer cObj= new Customer(10,"Harry", 11);
		int a= cObj.getAge();
		//System.out.println(a);
		boolean bool =(a>=18);
		System.out.println(bool);
		
						 	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
