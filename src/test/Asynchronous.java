package test;



public class Asynchronous extends Thread{

	void f1() {
		System.out.println(1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비동기화 문제; 다른 아이들도 블로킹 함수 실행 중에 출력이 되는지
	}

}
