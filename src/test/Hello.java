//상속 테스트
package test;


class Aaa{
	void f1() {};
}

class Bbb extends Aaa{
	void f2() {};
	void f1() {System.out.println("안녕하세요");}
}

public class Hello {
	public static void main(String[] args) {
		
		// 상속하고 아무 관계가 없다.
		Aaa t1 = new Aaa(); // 부 = 부
		t1.f1();
		
		
		// 업캐스팅(UpCasting)
		Aaa t2 = new Bbb(); // 부 = 자 => 부자 관계
		t2.f1();// f2()메모리가 있는데 사용을 못 할 뿐이다.
		
		
		
		// 다운캐스팅(자바에서 지원하지 않음) => 다른 언어에서 지원된다.
		//Bbb t3 = new Aaa(); // 자 = 부
		
		
		Bbb t4 = new Bbb(); // 자 = 자
		t4.f1();
		t4.f2();
		}
}


/*package test;

class a{
	void aa() {
		
	}
	void bb() {
		cc();
	}
	void cc() {
		System.out.println(1);
	}
}

class b extends a{
	void aa() {
		cc();
	}
	void cc() {
		System.out.println(2);
	}
	
}
//와서 실험해보기
//업캐스팅과 헷갈림
public class Hello {
	public static void main(String[] args) {
		a g= new a();
		g.aa();
		g.bb();
		g.cc();
	}
}

*/