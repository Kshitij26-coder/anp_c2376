package question1;

public class Main {
	int cObj;
	public int countObject(int cObj) {
    	this.cObj=cObj;
    	return cObj;
    	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Degree degreeObj=new Degree(5);
		Undergraduate undergraduateObj= new Undergraduate(3);
		Postgraduate postgraduateObj=new Postgraduate (2);
		degreeObj.getDegree();
		undergraduateObj.getDegree();
		postgraduateObj.getDegree();
		
		/*degreeObj.countObject();
		undergraduateObj.countObject();
		postgraduateObj.countObject();
		//System.out.println(countObject);*/
		
	}

}















