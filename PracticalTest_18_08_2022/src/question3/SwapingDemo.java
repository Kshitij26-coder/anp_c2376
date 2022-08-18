package question3;

public class SwapingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before swapping");
      int x =20;
      int y= 30;
      System.out.println("value of x:" +x);
      System.out.println("value of y:" +y);
      System.out.println("after swapping");
      
      x = x+y;
      y= x-y;
      x= x-y;
      System.out.println("value of x:" +x);
      System.out.println("value of y:" +y);
      
      }

}
