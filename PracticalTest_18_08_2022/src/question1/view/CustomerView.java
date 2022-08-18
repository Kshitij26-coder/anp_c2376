package question1.view;
import question1.model.Customer;
import question1.service.CustomerService;
public class CustomerView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CustomerService csaObj =new CustomerService();
    boolean b= csaObj.checkEligibility(10,"harry", 18);
     System.out.println(b);
    
     if ( b==true) {
    	 System.out.println("You are eligible for voting");
    	   	 
     }else {
    	 System.out.println("You are not eligible for voting");
     }
     
     }
	}

//Customer cObj=new Customer(10,"harry",14);
//  int a =cObj.getAge();
 // if(a>=18);
 // else {
 	// System.out.println(false);
  //}
