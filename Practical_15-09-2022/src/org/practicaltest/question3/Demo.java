package org.practicaltest.question3;
abstract class Demo2{
	 String name;
	 Demo2() {
		
	}
	 public Demo2(String name) {
		this.name=name; 
	 }
	 
	 public abstract boolean start();
	 
}
class Demo3 extends Demo2{
	public Demo3(String name) {
		super(name);
	}

	@Override
	public boolean start() {
		System.out.println(this.name);
		return true;
	}
}
public class Demo {

	

}
