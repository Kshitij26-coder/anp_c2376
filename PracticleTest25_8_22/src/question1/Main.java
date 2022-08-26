package question1;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Degree degreeObj=new Degree();
		Undergraduate undergraduateObj= new Undergraduate();
		Postgraduate postgraduateObj=new Postgraduate ();
		degreeObj.getDegree();
		undergraduateObj.getDegree();
		postgraduateObj.getDegree();
		
		degreeObj.countObject(5);
		undergraduateObj.countObject(2);
		postgraduateObj.countObject(3);
	}

}















