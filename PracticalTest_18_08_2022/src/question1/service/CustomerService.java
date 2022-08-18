package question1.service;
import question1.model.Customer;
public class CustomerService {
	public static boolean checkEligibility(int id, String name,int age){
		
		return (age>=18);
						
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
//Customer cObj= new Customer(10,"Harry", 18);
		//int a= cObj.getAge();
		//System.out.println(a);
		//boolean bool =(a>=18);
		//System.out.println(bool);
		