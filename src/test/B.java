package test;

abstract class A{
	
	static void lunch() {
		A a = new B(); //A a = find(a.start() ==?)
		a.start();
		
	}
	abstract void start();
	
}
public class B extends A {
	void start() {
		// TODO Auto-generated method stub
		System.out.println("시작");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		lunch();

		
	}

}//JavaFx의 Static 관련 원리


