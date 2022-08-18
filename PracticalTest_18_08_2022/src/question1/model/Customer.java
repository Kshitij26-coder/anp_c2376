package question1.model;

public class Customer {
	private int id;
	private String name;
	private int age;
	
	Customer(){
		
	}
   public Customer(int customerId,String customerName,int customerAge){
    	id=customerId;
    	name=customerName;
    	age= customerAge;
	}
    public int getId() {
    	return id;
    	    }
    public void setID(int customerId) {
    	id=customerId;
    }
    public String getName() {
    	return name;
    	    }
    public void setName(String customerName) {
    	name=customerName;
    }
    public int getAge() {
    	    return  age;
    	    }
    public void setAge(int customerPrice) {
    	age = customerPrice;//initializing
    	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
		

	}

}
