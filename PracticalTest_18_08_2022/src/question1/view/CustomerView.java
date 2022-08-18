package question1.view;
import question1.model.Customer;
import question1.service.CustomerService;
public class CustomerView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CustomerService csObj =new CustomerService();
     csObj.checkEligibility();
     // Customer cObj= new Customer(10,"Harry", 11);
		//int a= cObj.getAge();
    /* if (checkEligibility == true) {
    	 System.out.println("You are eligible to vote.");
    	 
    }else {
    	 System.out.println("You are not eligible to vote.");
     }
    */	
     }
	}


