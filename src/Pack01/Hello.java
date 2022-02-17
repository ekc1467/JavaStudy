package Pack01;

import java.util.Random;

//crtl + shift + / => 전체 주석, crtl+shift+\ => 전체주석 풀기
//crtl + 마우스휠 => 빠르게 내리기, crtl+(+,-) 크기 조절
/*컨트롤 시프트 방향키 , for 컨트롤 스페이스 한번 밑으로 그 이후 탭으로 이동
 window에 show view => other에 dubug를 킨다.
 무한 반복하면 빨간 색 버튼이 뜬다. 이 빨간 색 버튼은 프로그램이 실행 중이라는 뜻이다.
debug에 보면 프로그램 실행 중에 실행이 안되는 줄 알고 한번 더 누르면 2개가 떠서 알 수 있다.
이 중 하나만 종료 시켜버리면 1개가 남는데 그 또한 디버그로 알 수있다.
디버그 창에 terminate remove로 다 꺼버리면 된다.

스태틱 클래스 메소드가 아닌 이상 인스턴스로 선언해서 사용을 해야함.

프리미어 타입은 클래스가 아니며 만들어진 값도 객체가 아닌 변수이다. 그 증거로 .으로 내부 메소드 호출이 불가능하다.

new + crtl + space로 하면 객체 생성 시 좋음 그 이후 air 치고 컨트롤 스페이스바로 완성

crtl+alt+j 는 한 줄 만들기

//f4번을 누르면 상속 계층도가 나온다.
//-----------------------------------------------------

class Tiger{

}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
	}
}
*/

interface Tiger{
	void f1();
}
interface Aaa{
	void f1();
}
interface Bbb{
	void f1(int num);
}
interface Ccc{
	int f1();
}
interface Ddd{
	String f1(String s, int n);
}


public class Hello {
	public static void main(String[] args) {
//		Tiger t1 = Tiger(){
//			void f1() {}
//		};
		
		Tiger t1 = ()-> {System.out.println(1);};
		t1.f1();

		Bbb t2 = (n)->{ //어째서 n 타입을 안지정해줘도 되지?
			System.out.println(1);
		};
		
		t2.f1(100);
		
		Ccc t3 = ()-> {
			return 200;
		};
		System.out.println(t3.f1());
		
		Ddd t4 = (s,n)->{return s+n;};
		System.out.println(t4.f1("호랑이",3000));
		
		// 리턴 코드 1줄만 있는 경우
		// return 과 {} 를 생략할 수 있다. (둘이 애초에 같이 생략해야한다. 중괄호 삭제가 아마 리턴 값만 쓴다는 구별법인 듯) 이 코드는 t3와 같다.
		Ccc t5 = ()-> 200;
		System.out.println(t5.f1());
		
		//t4와 같다.
		Ddd t6 = (s,n)-> s+n;
		System.out.println(t6.f1("맘모스", 4000));
		//단독 문법 아님. 복합적인 문법이다. 받아 주는 쪽 문법도 생각하자.
	}
}




/*
	//ex69)
	//약식문법 만큼 좋은 것도 없다.
	interface Tiger{
	void f1();
	}
	
	class Cat{
	void f1() {}
	}
	
	class Lion{
	void f1(Tiger t) {
		t.f1(); // 생성해서 구현이 안됐는데도 사용이 된다. 즉 호출 될 때 코드가 만들어져 받겠다는 뜻이다.
	}
	void f2(Cat c) {
		c.f1();
	}
	}
	
	public class Hello {
	public static void main(String[] args) {
		Lion lion = new Lion();
		//lion.f1();
		//lion.f1(new Tiger()); //인터페이스라 new가 불가능하다.
		lion.f1(new Tiger() {// 익명함수를 이용해 호출될 때 정의하여 보내버린다.
			
			@Override
			public void f1() {
				System.out.println("호랑이");
				
			}
		});
		
		lion.f1(new Tiger() {// 익명함수로 이용한다.
			
			@Override
			public void f1() {
				System.out.println("독수리");
				
			}
		});
		
		Tiger t1 = new Tiger() {
			//이것이 약식이 아닌 그냥 했던 코드
			@Override
			public void f1() {
				// TODO Auto-generated method stub
				System.out.println("앵무새");	
			}
		};
		
		//람다 함수.
		Tiger t2 =()->{ //애로우라고 한다
			//이것이 약식이 아닌 그냥 했던 코드		
			System.out.println("앵무새1");		
		};
		
		Tiger t3 = ()->{
			System.out.println("앵무새2");
		};
		
		//위의 문장을 람다로 만들자
		lion.f1( ()-> {
			System.out.println("앵무새3");
		}); //람다를 너무 쓰면 위를 잊고 위를 너무 외우면 람다를 잊는다.
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex69)

interface Tiger{
	void f1();
}

class Cat{
	void f1() {}
}

class Lion{
	void f1(Tiger t) {
		t.f1(); // 생성해서 구현이 안됐는데도 사용이 된다. 즉 호출 될 때 코드가 만들어져 받겠다는 뜻이다.
	}
	void f2(Cat c) {
		c.f1();
	}
}

public class Hello {
	public static void main(String[] args) {
		Lion lion = new Lion();
		//lion.f1();
		//lion.f1(new Tiger()); //인터페이스라 new가 불가능하다.
		lion.f1(new Tiger() {// 익명함수를 이용해 호출될 때 정의하여 보내버린다.
			
			@Override
			public void f1() {
				System.out.println("호랑이");
				
			}
		});
		lion.f1(new Tiger() {// 익명함수로 이용한다.
			
			@Override
			public void f1() {
				System.out.println("독수리");
				
			}
		});
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex68)

interface Tiger{
	void f1();
}

class Lion implements Tiger{
	public void f1() {}
}

public class Hello {
	public static void main(String[] args) {
		// 기준 : 객체를 생성 시킬 수가 없다.
		// Tiger t1 = new Tiger();
	
		// 인터페이스 사용1
		Lion t1 = new Lion();
		Tiger t2 = new Lion();
		
		// 인터페익스 사용2
		//인터페이스라서 사용 못하지만 쓸 수 있다.
		//Tiger t3 = new Tiger() {} 
		//이것을 익명 클래스라고 이야기한다. 즉석에서 만들고 써버린다.
		Tiger t3 = new Tiger() {
			@Override
			public void f1() {
				// TODO Auto-generated method stub
				System.out.println("호랑이");
			}
		};
		t3.f1();
		
		//인터페이스 사용3. 만들어진 객체가 없는데 어떻게 쓸가? 뒤에 .로 바로 사용한다 (즉시실행함수)
		//이것을 익명 객체라고 한다.(이름이 없다는 의미)
		 new Tiger() {
			@Override
			public void f1() {
				// TODO Auto-generated method stub
				System.out.println("앵무새");
			}
		}.f1();
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex67-7)
//이것이 제일 DI 기본 문법으로 구현된 버젼
class Aaa{
	Bbb bbb;
	Aaa(Bbb bbb){
		this.bbb = bbb;
	}
}

interface Bbb{
	
}

public class Hello {
	public static void main(String[] args) {
		
	}
}
//풀로 구현한 버젼
// 생성자를 이용해서 의존 주입 관계를 만든다.
class Aaa{
	Bbb bbb;
	Aaa(Bbb bbb){
		this.bbb = bbb;
	}
	void f2() {
		bbb.f1();
	}
}

interface Bbb{
	void f1();
}
class Ccc implements Bbb{
	public void f1() {System.out.println("의존 주입");}
}

public class Hello {
	public static void main(String[] args) {
		Aaa t = new Aaa(new Ccc());
		t.f2();
	}
}
*/


//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
// 비행기가 받을 때 기름을 넣으면 기름을 넣었다고 하고 가스를 넣으면 가스를 넣었다고 하고 할 필요없이 연료라는 클래스를 만들어놓고 인터페이스 한다라는 뜻이다.
// 그래서 비행기가 받을 때 연료를 받고 대입 연산으로 기름 가스 메탄을 넣고 이것이 업캐스팅이다.
// 여러 기름 구멍에 넣는 것을 할 때마 하지말고 생성자에서 한번 받아놓고 그 데이터를 시스템에서 다 적용하자 => 생성자에서 기름을 연로라는 곳에 주입을 하는 것을 Injection이라고 한다.
// 바둑이 ai 인터페이스 없이 안돌아가는 거 처럼 비행기는 연료의 주입없이 못돌아간다. 이것을 의존적(dependency라고 한다) 의존적인 관계이면서 주입한다라는 것을 의존 주입이라고 하며
// 이것을 DI (dependency Injection)이라고 한다. => 전부 이 범위안에서 사용된다.

// ex 67-6) 스탑은 알파고가 하는데 멈추는 건 베타고가 해버릴 수 인는 문제와
// 인수전달을 해서 일어나는 결과와 하지 않아도 일어나는 결과가 같다면 안하는 것이 좋다.
// void play가 문제인 듯 하다. =>필드를 만든다.

class Baduk{
//인터페이스(Ai)를 상속받은 객체를 주입받을 수 있게 Ai ai를 만들어주고 주입받을 생성자(1번만 실행 가능)를 만들어두고 주입 받아서 주입 받은 클래스만의 객체를 만든다. 
//=> 내가 생각한 Di(의존 주입 관계) 
	
//	Baduk(){
//		System.out.println("대국을 시작합니다.");
//	}
//	void play(Ai ai) {
//		ai.play();
//	}
//	void stop(Ai ai) {
//		ai.stop();
//	} 이것을 밑으로 바꾼다.
	
	Ai ai;
	
	// 생성자는 주입(injection)을 받는다.
	Baduk(Ai ai){
		this.ai = ai;
		System.out.println("대국을 시작합니다.");
	}
	
	void play() {
		ai.play();
	}
	void stop() {
		ai.stop();
	}
}


//67-5 d인터페이스화 시킴
interface Ai{
	 void play();
	 void stop();
}


//아마존
class AlphaGo implements Ai{ //Ai를 AI라고 해도 된다. 약자이기 때문에
	 public  void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
	 public void stop() {
		 System.out.println("알파고가 점수를 계산합니다.");
	 }
}

//MS
class BetaGo implements Ai{
	public void  play() {
		System.out.println("인공지능은 베타고입니다.");
	}
	public void stop() {
		 System.out.println("베타고가 점수를 계산합니다.");
	 }
}



public class Hello {
	public static void main(String[] args) {
		
		Baduk baduk = new Baduk(new AlphaGo());
		baduk.play();
		baduk.stop();
		Baduk baduk2 = new Baduk(new BetaGo());
		baduk2.play();
		baduk2.stop();
	}
}


*/
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*//ex 67-4)
class Baduk{
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	void play(Ai alphaGo) {
		alphaGo.play();
	}
}

//추상 클래스화 시킴
abstract class Ai{
	abstract void play() {}
}

//67-5 d인터페이스화 시킴
interface Ai{
	void play();
}


//아마존
class AlphaGo implements Ai{ //Ai를 AI라고 해도 된다. 약자이기 때문에
	 public  void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
}

//MS
class BetaGo implements Ai{
	public void  play() {
		System.out.println("인공지능은 베타고입니다.");
	}
}



public class Hello {
	public static void main(String[] args) {
		Baduk baduk = new Baduk();
		baduk.play(new AlphaGo());
		baduk.play(new BetaGo());
	}
}*/

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//67-3) 미구현 클래스가 굳이 존재하는 문제는 67-4로
class Baduk{
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	void play(Ai alphaGo) {
		alphaGo.play();
	}
}

class Ai{
	void play() {
		
	}
}

//아마존
class AlphaGo extends Ai{ //Ai를 AI라고 해도 된다. 약자이기 때문에
	void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
}

//MS
class BetaGo extends Ai{
	void play() {
		System.out.println("인공지능은 베타고입니다.");
	}
}


public class Hello {
	public static void main(String[] args) {
		Baduk baduk = new Baduk();
		baduk.play(new AlphaGo());
		baduk.play(new BetaGo());
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//67-2) 다른 인공지능으로 수정될 때 마다 클래스에 함수를 추가 해야하는 문제는 67-3에
class Baduk{
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	void play(AlphaGo alphaGo) {
		//System.out.println("인공지능은 알파고입니다.");
		alphaGo.play();
	}
	void play(BetaGo betaGo) {
		betaGo.play();
	}
}


// 아마존
class AlphaGo{
	void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
}

// MS
class BetaGo{
	void play() {
		System.out.println("인공지능은 베타고입니다.");
	}
}



public class Hello {
	public static void main(String[] args) {
		Baduk baduk = new Baduk();
		baduk.play(new AlphaGo());
		baduk.play(new BetaGo());
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//67-1) 인공지능이 수정된 경우는 67-2로
//class ConstantDesc{
class Baduk{
	Baduk(){
		System.out.println("대국을 시작합니다.");
	}
	void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
}

public class Hello {
	public static void main(String[] args) {
		Baduk baduk = new Baduk();
		baduk.play();
	}
}*/



//-------------------------------------------------------------------------------------------
/*
//66) final( 마지막 )
// 1. 변수
// 2. 클래스
// 3. 함수
// 3개의 용도가 있다ㅣ.
class Tiger{
	// 1. 필드 final( 값을 초기화 하는 것이 여기가 마지막이다. )
	// 상수화 되어 버린다. ( 한번 초기화한 이후로 대입을 못받으면 상수이다.)
	// const
	// 
	//final int num = 10;
	//다만 이렇게 초기화를 안시켰을 경우 딱 1번 생성자로(만) 대입 연산이 가능하다. 그러나 보통 위처럼 바로 초기화 시킨다.
	final int NUM;
	Tiger(){
		NUM=30;
	}

	void f1() {
		//this.NUM = 20; 불가능
	}
}

//2. 클래스 final
class Aaa{}
final class Bbb extends Aaa{} //class 이름 앞에 final이 붙으면 상속 사용이 불가능하다.
//class Ccc extends Bbb{}

class Ddd extends String{} //=> 상속이 불가능. String이 final이라서  더 이상 확장할 것이 없으니 있는 것을 쓰라는 자신감이 있는 부분이다.
class Eee extends Thread{} //=> 파이널을 해놓지 않아서 상속 가능. 애초에 스레드가 상속 가능하게 해서 기능을 쓰게 하기 위한 

//3. 함수 final. 상속 받고 쓰고 있는데 내가 그냥 정의한 함수가 부모 클래스의 함수 이름과 같은 바람에 실수로 함수를 오버라이딩 해버릴 수 있으니 오버라이딩 불가능하게 하고 싶은 함수에 final로 막아버리는 경우에 사용하는 것이다. 
class Fff{
	final void f1() {}
	void f2() {
		f1();
	}
}

class Ggg extends Fff{
	void f1() {}
}

public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		//t1.NUM = 20; 불가능
		//math PI 같은 경우도 진리이기 때문에 3.14~로 상수 지정 되어있다.
		
		
		String s; //들어가보면 String도 final이라 상속해서 불가능하다.( 표준 라이브러리에 final이 아니여서 상속 가능한 경우들도 많다.)
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex65) 업캐스팅과 관련 되어있어서 무지성 인터페이스 추가를 권장한다.
interface ParentTiger{
	void f1();
}

class Tiger implements ParentTiger{
	public void f1() {
		
	}
}

class Lion implements ParentTiger{
	public void f1() {
		
	}
}
public class Hello {
	public static void main(String[] args) {
		//구태여 함수가 하나 밖에 없으면서 implements를 이용하는 이유가 무엇인가?는 분명 업캐스팅 관련해서 더 편하게 문법을 구사하기 위해서 이다. 후에 이런 경우를 보게 될 것이다.
		ParentTiger t1 = new Tiger();
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex64)
class Aaa{
	void f1() {}
}

interface Bbb{
	void f2();
}

interface Ccc{
	void f3();
}

class Ddd extends Aaa implements Bbb, Ccc{
	public void f2() {
		
	}
	public void f3() {
		
	}
}

//@FunctionalInterface 풀어도 에러가 안뜬다. 함수가 1개를 초과하면 에러가 뜨게 만들어 놓은 것이기 때문이다. 누군가 실수로 1개를 더 만드는 것을 막는 어노테이션인 것이다.
//컴파일하기 일보직전에 약속된 것과 약속된 것을 어긴 것이 있는지 알아보는 것이 어노테이션의 역할 중 하나
interface Eee{
	void f1();
}

public class Hello {
	public static void main(String[] args) {
		String s;
		Thread t;
		StringBuffer sb; //f3으로 들어가면     implements Serializable를 볼 수 있는데 f3로 봐도 안에 아무것도 없는 이유는 업데이트 후에 추가 될 수 있어서 그냥 추가해놓은 것이다. 
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex63)

// 밑의 추상 클래스는 전부 추상함수이기 때문에 전부 강제로 구현하라는 뜻이다. 안의 내용은 없는데 상속받을 당신이 코딩하세요=> 인터페이스(참고할)이다. 즉 명세서 같은 기능.
/*abstract class 스마트폰{
	abstract void 메시지(); // interface
	abstract void 전화기(); 
	abstract void 앱스토어();
	abstract void 접는기능();
	abstract void 충전();
}

class 안드로이드 extends 스마트폰{
	
}

class 아이폰 extends 스마트폰{
	
}

class 윈도우 extends 스마트폰{
	
}*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex63) 기획서보다 정확한 것이 인터페이스를 제공하는 것이다. 구현해야할 인터페이스를 제공하기 때문이다.
//클래스는 다중 상속이 불가능하다. 인터페이스는 다중 상속이 가능하기 때문이다.(인터페이스는 가이드이다.)
abstract class Aaa{
	abstract void f1();
	abstract void f2();
}

//Aaa에 하나도 구현 되어있지 않으면서 extends라고 부르는 것은 이상하다. 
class Bbb extends Aaa{

	@Override
	void f1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void f2() {
		// TODO Auto-generated method stub
		
	} 
	
}

interface Ccc{// 디폴트로 abstract를 붙이기 때문에 생략 가능하다. 
	abstract void f1();
	void f2();
}

class Ddd implements Ccc{ // 상속되었다가 아니라 구현한다의 뜻으로 implements를 사용한다.

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		
	}
	
}


public class Hello {
	public static void main(String[] args) {
		
	}
}

*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex62)
class Tiger{

}
public class Hello {
	public static void main(String[] args) {
		int num = 1;
		
//		//이 둘의 차이가 크다.
//		int r1 = 100 * 3; // num + num + num
//		int r2 = 3 * 100; // 3 + 3 + ~
//		//위의 방식이기 때문에 당연히 성능 차이가 심하다. 당연히 첫번 째 방식으로 사용해야한다.
		int r1 = num* 50;
		int r2 = 50 *num;
		//위의 방식은 num이 1이냐 100이냐에 따라 앞이 좋은지 뒤가 좋은 지 나눠진다.
		
		System.out.println(r1);
		System.out.println(r2);
		
		
		//800*x => 성능상의 이득을 위해 사실은 비트 연산 방식으로 구한다. (512+256+32)*x => 512*x + 256*x + 32*x => 2^9*x+2^8*x+2^5*x
		
		int test = 6;
					//     0110(6)
					//   01100(12) test << 1
					//  011000(24) test << 2
		System.out.println(test << 1); // 6 * 2의 1
		System.out.println(test << 2); // 6 * 2의 2
		System.out.println(test << 3); // 6 * 2의 3
		System.out.println(test << 4); // 6 * 2의 4
		//System.out.println(test * 2의 4승); // 6 * 2의 4
		
		// 즉
		// (512+256+32)*x => 512*x + 256*x + 32*x => 2^9*x+2^8*x+2^5*x =>  2<<9*x+2<<8*x+2<<5*x
		// 
		
		int a = 23;
		System.out.println(800 * a); //이것 보다는
		System.out.println(a * 800); //이게 좋다. a가 800이상일 확률 백만까지도 갈 확률을 생각해봐야하니
		System.out.println( (a<<9) + (a<<8) + (a<<5) );
		
		for (int i = 0; i < 600; i++) {
			for(int j=0 ; j <800; j++) {
				System.out.println(a * 800);
				System.out.println( (a<<9) + (a<<8) + (a<<5) );
				//이번에는 위의 2개를 비교할 때 이런 경우 이 중 for문을 사용하고 이것을 옛날 TV해상도를 고려해 생각해서 사용했을 때 일어나는 결과는 거의 800*600배의 차이가 난다는 것이다. 최소
				//겹치는 비트가 없을 경우 +연산도 빼버리고 |를 써버리면 훨씬 빠르다. 위의 이유들로 Integer 함수들을 보면 비트 연산자들이 많다.
			}
		}
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
// ex58) 진법( bit 연산 ): 2(컴), 10(인), 16(절충) = > 0~9 + a, b, c, d, e, f 진법
// 2진법: 0,1,10,11,100 ; 10진법: 0~9,10,11,12 ; 16진법: 0~f,10~1f,20~2f
// 10 진수에서 2진수 16진수를 를 구하는 방법: 10진수로 나타낸 숫자 17을 2진수로 나타내려면 2로 계속 나누다가 남은 나머지를 1번째 자리에 쓰고 16진수로 바꾸려면 16으로 계속 나누면서 나머지를 1자리에..그냥 검색하면 다 나온다.
// 진수 표기법=> 십진법:(236)10(작은크기) => 걍 검색하자..
// 10진수에서 10진수를 구하는 방벙: 236은 10의 2승을 2번 10의 1승을 3번 10의 0승을 6번 곱한 것.
// 2진수에서 10진수를 구하는 방법: 2진번 10100을 10진법으로 바꾸려면 2의 0승을 0번 곱해서 더하고 2의 1승을 0번 곱해서 더하고 2의 2승을 1번 곱하고 ~해서 구한다. (큰 진수에서 작은 진수를 구할 때의 반대인가?)
// 2진수에서 16진수를 구하는 방법: 그냥 인터넷 검색하면 위에 것들 전부 나온다. 16진법이 절충진법이라고 말하는 이유는 10진법과 달리 10진법과 가까운 16진법으로 2진법의 4자리를 끊어서 표현하면 16진수로 바로 바꿀 수 있기 때문이다.
// 2와 8, 16진수끼리의 진수 변환은 2의 제곱들의 계산이라 방식이 같지만 10진수는 2의 제곱이 아니기 때문에 다르다.

//ex61)
class Tiger{

}
//내가 필요한 정보만을 뽑아낼 수 있는 방법이 비트&을 사용하는 것이다. FF FF FF FF => 전부 F라 전부 출력 , F0 F0 F0 F0 => F인 부분만 출력
public class Hello {
	static String hexaToBinary(int n) {
		 String s = Integer.toBinaryString(n);

		 while(s.length() < 32) {
			 s = "0" + s;
		 }

		 StringBuffer sb = new StringBuffer(s);
		 //System.out.println(sb);

		 for (int i = 0; i <7 ; i++)
			 sb.insert((7-i)*4, " ");
		 
		 return sb.toString();
	 }

	public static void main(String[] args) {
		int n1 = 0x1234abcd;
		//System.out.println(n1 & 0xffff0000);
		
		System.out.println(hexaToBinary(n1));
		System.out.println(hexaToBinary(0xffff0000)); // mask데이터(걸러내 줄 수 있게 하는 데이터)
		System.out.println(hexaToBinary(n1 & 0xffff0000));
		
		//데이터 합성을 할 때 많이 사용한다.
		System.out.println(hexaToBinary(n1 | 0xffff0000));
		
		int a = 0xf3;
		int b = 0x3600;
		int c = 0xEC0000;
//		위를 풀어쓰면 밑의 값이다.
//		int a = 0x 00 00 f3;
//		int b = 0x 00 36 00;
//		int c = 0x EC 00 00;
		
		int d = a | b| c;
		System.out.println(hexaToBinary(d)); //=> 해석하면 EC36F3
		System.out.println("------------------------------------");
		
		//비트연산 => 전체 쪽으로 한쪽으로 이동하고 틩겨져 나간 한명은 Loss가 잃어난다. 새로 들어온 경우는 0으로 전부 들어온다.
		int e = 0xf09;
		System.out.println(hexaToBinary(e));
		System.out.println(hexaToBinary(e<<1));
		System.out.println(hexaToBinary(e>>1));
		
		System.out.println("------------------------------------");
		
		int data = 0xabcd;
		// 		 21(5개) 30(6개) 13(5개)=> 이렇게 출력하고 싶다. => 원하는 비트만을 갖고 싶다. => 비트& 연산
		// 0000 0000 0000 0000 1010 1011 1100 1101		
		System.out.println(hexaToBinary(data));
		
		// 0000 0000 0000 0000 1010 1011 1100 1101
		// 0000 0000 0000 0000 0000 0000 0001 1111 => 0x1f
		System.out.println(data & 0x1f);
		// 0000 0000 0000 0000 1010 1011 1100 1101
		// 0000 0000 0000 0000 0000 0111 1110 0000
		System.out.println(data & 0x7e0);//=> 앞의 5비트 때문에 원하는 6자리를 마스킹 실패
		
		System.out.println((data & 0x7e0)>>5); //5자리 처리해버리기
		// 0000 0000 0000 0000 1010 1011 1100 1101
		// 0000 0000 0000 0000 1111 1000 0000 0000
		System.out.println((data & 0xf800)>>11); //11자리 처리해버리기
		System.out.println((data & 0x0000f800)>>11); //11자리 처리해버리기 => 제일 가독성이 높다.
		//먼저 비트연산으로 밀어버리고 연산하면  가독성이 떨어진다
		
		System.out.println( (data >> 11) & 0x1f );
		System.out.println("------------------------------------");
		//비트 반전 => 이미지 반전도 이런 식으로
		System.out.println(hexaToBinary(data));
		System.out.println(hexaToBinary(~data));
		
		//exclusive or
		System.out.println("------------------------------------");
		System.out.println(hexaToBinary(data));
		System.out.println(hexaToBinary(0x0000ffff));
		System.out.println(hexaToBinary(data^0x0000ffff));
		
		// & | >> << | ^
		// Integer 클래스만 봐도 위의 연산들이 많이 사용된다.
		
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex60
class Tiger{

}
public class Hello {
	 void f0() {
		
	 }
	 //데이터를 갱신 못시키게 해서 보내주고 싶으면 의도적으로 String을 아니면 StringBuffer를 번환형으로 정한다.
	 static String hexaToBinary(int n) {
		 //원래는 배열을 이용해 2로 계속나누어서 2진법을 구하는 방식을 구현하는 이런 원시적인 코딩을 하지만 이미 제공된 방식을 이용하는 것이 좋다.
		 String s = Integer.toBinaryString(n);
		 System.out.println(s);
		 System.out.println(s.length()); 
		 
		 //32bit에 해당하는 문자열을 만든다.
		 while(s.length() < 32) {
			 //
			 s = "0" + s; //=> string은 갱신이 되는 것이 아니라 새로 계속 대입하는 것이다 =>  비용이 많이든다.
		 }
		 System.out.println(s.length());
		 System.out.println(s);
		 
		 StringBuffer sb = new StringBuffer(s);
		 System.out.println(sb);
		 // StringBuffer는 insert(" ")를 가지고 있다. 000000000000에서 0000 00000000로 띄어 놓으면 다음은 0000 000 00000이런식으로 끊기기 때문에
		 //뒤에서부터 000000000000 0000 => 00000000 0000 0000 이렇게 끊는 것이 맞다.
		 for (int i = 0; i <7 ; i++) {
			 sb.insert((7-i)*4, " ");
			 System.out.println((7-i)*4);// => 위치 설정
		 }
		 System.out.println(sb);
		 return sb.toString();
	 }
	 
	public static void main(String[] args) {
		// >> 내가 원하는 포맷으로 2진수 출력을 하고 싶다.
		int num = 0x63ce7bcd;
		
		System.out.println(hexaToBinary(num));
		//f();=> 불가능 static안에서 사용할 함수는 static이여야만 함
		
		System.out.println(hexaToBinary(0xab));
		System.out.println(hexaToBinary(123456));
		
		int num2 = 100;
		System.out.println(hexaToBinary(num2)); //전구의 상태를 알 수 있다.
		
		System.out.println(hexaToBinary(0x7fffffff)); //80 00 00 00 이 딱 절반이다. 즉 절반을 뛰어넘기 일보직전이다. (음수에게 절반을 넘겨주고 0을 사용해야되기때문에 1을 빼서 int로 표현할 수 있는 MAX 값이다.)
		//00 -> 0000 0000
		//1f
		//7f == 7f ff ff ff -> 0111 1111 1111 1111 1111 1111 1111 1111
		//80 == 80 00 00 00 -> 1000 0000 0000 0000 0000 0000 0000 0000
		//af
		//ff -> 1111 1111
		
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex59)
class Tiger{

}
public class Hello {
	public static void main(String[] args) {
		int num1 = 100;
		System.out.println(num1);
		
		//0x는 16진수를 뜻한다.
		//출력은 10진수로 한다.
		int num2 = 0x100;
		System.out.println(num2);
		
		int num3 = 0xABCD;
		System.out.println(num3);
		
		int num4 = 0x63ce7bcd; // 한자리당 4비트를 차지한다. 숫자 2개는 8비트(1byte)를 차지한다. 8자리는 4바이트(4byte==int)를 차지한다. 즉 int로 선언하면 이 이상 넘을 수는 없다.( FF FF FF FF ) => 아 F는 15이니깐 이건 최대 값을 이야기 하는 거구나
		System.out.println(num4);
		// 0110 0011 1100 1110 0111 1111
		
		// 0x7fffffff >> 0 ~~ 80 00 00 00 ~~ FF FF FF FF =>왜 절반만 MAX VALUE로 지정한 것일까? 그것은 음수 값도 존재하기 때문이다. => 내 생각
		int num;
		//Integer
		boolean
		Boolean;
		System.out.println(Integer.toBinaryString(num4)); => 출력이 다른데?
		
		
		int num5 =0xab;
		// 10101011 => 이런 결과를 원하는 것이 아니라 0000 0000 0000 0000 0000 0000 1010 1011 같은 32bit로 된 것을 원하는 것이다.

		// 0이 생략된 것이 아니라 4자리씩 잘린 문자열 풀로 보면서 작업하는 경우가 많다. 그러나 이렇게 출력하는 함수는 없다.
		System.out.println(Integer.toBinaryString(num5));
		
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex58)
class Tiger{
				// 9 > a
				// 1F > 20
				// 9f > AF
				// fff > 1000
				// cf > d0
				
				// A 10
				// B 11
				// C 12
				// D 13
				// E 14
				// F 15
	
				//2진법 : 0001 0101 0101 1110 1111
				//16진법: 1	  5	   5	E	 F
}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
	}
}
*/



//-------------------------------------------------------------------------------------------
/*
//ex57)
public class Hello {
	public static void main(String[] args) {
			   //인덱스  012 = 무궁화
		String s1 = " 무궁화 꽃이 피었습니다. ";
		//커서를 올려 읽어본다. int java.lang.String.length() => 자바 안에 랭 안의 스트링 안의 렝스 함수
		s1.length();
		// ex1)
		//리턴을 하는 int 라는 반환 형이 있으므로 리턴 가능
		//문자열의 길이 반환
		System.out.println(s1.length());
		
		// ex2)
		// char String.charAt(int index)
		// 인덱스에 있는 글자 탐색
		System.out.println( s1.charAt(3));
		s1.charAt(0);
		
		// ex3)
		// String s1 = "무궁화 꽃이 피었습니다"
		// 위치 탐색
		System.out.println(s1.indexOf("이 피었"));
		
		//검색에 실패하면 음수 또는 -1을 리턴합니다. => 예제 30번
		System.out.println(s1.indexOf("섭니다."));
		// 이런 식으로 -1리턴되는 것을 이용해 쉽게 코딩 가능.
		if(s1.indexOf("섭니다") == -1){
			System.out.println("검색실패");
		}
		else {
			System.out.println("검색성공");
		}
		
		// ex4)
		// Stirng s1 = "무궁화 꽃이 피었습니다."
		// String java.lang.String.replace(
		//	CharSequence target
		//	CharSequence replacement)
		s1.replace("꽃이", "나무가");
		// 주의.. 원본 데이터를 변경하지 않는다. 원본 데이터를 변경하는가 하지 않는가? 하기도 하고 안하기도 하는가? 의문을 가져야 한다.
		// String 클래스는 절대로 원본을 변경하지 않는다.
		// StringBuffer 클래스는 원본 데이타를 변경할 수 있다. => 목적 자체가 원본 데이터를 변경할 목적으로 사용.
		System.out.println(s1);
		
		
		// 밑의 경우는 원본 데이터가 변경 된 것이 아니라
		// 1. s1의 메모리가 삭제된다.(객체가 사라지고)
		// 2. s1의 메모리를 재 할당 받는다.(새로운 객체가 만들어 진 것)
		//s1 = "호랑이";
		//System.out.println(s1);
		
		// ex5)
		String s2 = s1.replace("꽃이", "나무가");
		System.out.println(s2);
		//리턴 값이 있으므로 그냥 출력 가능하다.
		System.out.println(s1.replace("꽃이", "나무가"));
		
		// String s1 = " 무궁화 꽃이 피었습니다"
		// ex5) sub string
		// 3까지 다 잘라버린다.
		System.out.println(s1.substring(3));
		
		// 인자 개수에 따라 기능이 달라지는 경우가 있다. 그래서 3번부터 5번까지 잘라내는지 3번부터 5개의 글자를 잘라내는지 헷갈려 할 수도 있다.
		// start ~ end-1
		// end - start +1 => 부가적인 +연산을 제거하기 위해 end - start 만큼 자른다.(뒷 숫자 바로 앞까지)
		System.out.println(s1.substring(3,5));
		
		// ex6)
		s1 = "Apple";
		// Apple apple aPPLe = > 모두 소문자나 대문자로 바꿔놓고 찾아야 소문자 대문자로 인해 생기는 여러가지 경우의 수를 고려않고 찾을 수 있다.
		// 즉 데이터를 다룰 때 유용하게 사용될 수 있다.
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		// ex7)
		s1 = "  A p p l e  ";
		System.out.println(s1);
		System.out.println(1000);
		
		// 공백(띄어쓰기)을 삭제하는 역할을 한다.
		//id : 12234	 //복붙해올 때 이런 식으로 space바를 눌러서 띄어쓰기까지 같이 복붙해오는 경우가 있다.
		System.out.println(s1.trim());
		System.out.println(2000);
		
	}
}
*/

//-------------------------------------------------------------------------------------------


/*
//=-------------------------------------------------------
	//ex56)
	// 4. 추상함수를 가지는 클래스는 반드시 추상클래스 이어야한다.
	abstract class Aaa{
	//본인이 하고 싶은 역할은 없다. 코드를 비어버린다.
	//즉	1. 오버라이딩을 목표로 한다.
	//	2. 정작 본인은 코드를 작성할 생각이 없다.
	//	3. 그래서 {}를 없애고 세미콜론을 찍는다. => 미완성 코드가 된다. => 이것을 추상 코드 라고 한다. => 미완성=추상
	// 사랑이 추상 명사인 이유는 기준과 의미 및 해석을 완전히 정의하지 못하기 때문이다.=> abstract를 붙임으로서 미완성(추상)임을 알린다.
	// 코드가 미완성이기 때문에 객체를 생성시킬 수 없다.
	abstract void f1();
	}
	//추상 클래스를 상속받는 순간 반드시 코드를 구현해야한다.
	class Bbb extends Aaa{
	// 상속받은 추상 클래스의 추상 함수를 오버라이딩해서 반드시 완성 시켜야 한다. crtl + space를 누르면 구현 안되면 안되어서 바로 뜬다.
	void f1() {
		System.out.println();
	}
	}
	public class Hello {
	public static void main(String[] args) {
		Aaa a = new Bbb();
		a.f1();
		
		// 추상클래스(미완성 클래스)는 코드가 미완성이기 때문에 객체를 생성시킬 수 없다.
		// Aaa t =new Aaa();
	}
}
*/



//-------------------------------------------------------------------------------------------
/*
//ex55)
//업캐스팅~>다형성 -> 모르면 디자인 패턴이 성립이 안된다.
//Design Pattern -> 23가지 형태 -> 회사들의 권고사항
//1권 => GoF의 DP(원서 번역된 책, 각각의 성 이름) -> 추천하지 않는다.
//검색 후 1개의 패턴 골라서 일주일 간 이 패턴만 파는 것을 집중한다. 실무 적용은 불가능하다.
//다만 소스코드 재료(디자인 패턴 종류)가 뭔지를 알고 소스코드를 볼 때 편하다.
//헤드 퍼스트 디자인 패턴 책 추천 (호불호 갈림)

class Animal{
	void cry() {
		System.out.println("소리 내지 못함");
	}
}
class Tiger extends Animal{
	void cry() { System.out.println("어흥");}
}
class Cat extends Animal{
	void cry() { System.out.println("야옹");}
}
class Dog extends Animal{
	void cry() { System.out.println("멍멍");}
}

class Snake extends Animal{
	
}
class Lion extends Animal{
	void cry() { System.out.println("어흥");}
}

class Zoo{
	//오버로딩의 법칙
//	void sound(Tiger t) {
//		t.cry();
//	}
//	void sound(Cat t) {
//		t.cry();
//	}
//	void sound(Dog t) {
//		t.cry();
//	}
//	void sound(Snake t) {
//		t.cry();
//	}
	//동물이 한마리 더 생기면 또 위에 출 하나를 더 써야한다. 이걸 외부 변화가 와도 자동으로 해줄 수 있도록 자동화 기능을 만드는 것이 최고다. 개방 폐쇄 방식 중 폐쇄 방식.
	//이렇게 업캐스트로 해결할 뿐이다. 이것이 디자인 패턴에서도 많이 사용된다.
	//이것이 SOLID 원칙 중 O에 속한다.
	void sound(Animal t) {
		t.cry(); //넣는 사람(사용자) 입장에서 넣기 때문에 만든 사람도 모른다. 다양한 형태의 결과가 나온다. => 이것을 다형성 프로그램이라고 한다.
	}
	
}

public class Hello {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.sound(new Tiger());
		zoo.sound(new Cat());
		zoo.sound(new Dog());
		zoo.sound(new Snake());
		zoo.sound(new Lion()); //이렇게 쉽게 사자를 추가할 수 있다.
	}
}
*/


//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex54)
class Animal{
	void cry() {
		System.out.println("소리를 낼 수 없음");
	}
}
class Tiger extends Animal{
	@Override
	void cry() {
		System.out.println("어흥");
	}
}

class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("야옹");
	}
}

class Snake extends Animal{
	
}

public class Hello  {
	public static void main(String[] args) {
		Random rnd = new Random();
		Tiger t0 = new Tiger();
		Cat t1 = new Cat();
		Snake t2 = new Snake();
		for (int i = 0; i < 6; i++) {
			switch (rnd.nextInt(3)) {
			case 0:
				t0.cry();
				break;
			case 1:
				t1.cry();
				break;
			case 2:
				t2.cry();
				break;
			}
		}
		System.out.println(" --------------- ");
		Animal[] ani = new Animal[] { new Tiger(), new Cat(), new Snake()};
		
		ani[rnd.nextInt(3)].cry();
		
		for (int i = 0; i < 6; i++) {
			ani[rnd.nextInt(3)].cry(); //업캐스팅이 있을 때 다룰 수 있는 테크닉.
		}
//		ani[0] = new Tiger();
//		ani[1] = new Cat();
//		ani[2] = new Snake();
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//53번)
class Animal{
	void cry() {
		System.out.println("소리를 낼 수 없음");
	}
}
class Tiger extends Animal{
	@Override
	void cry() {
		System.out.println("어흥");
	}
}

class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("야옹");
	}
}

class Snake extends Animal{
	
}

public class Hello  {
	public static void main(String[] args) {
			
		System.out.println("-----------------------------------");
		Animal t1 = new Tiger();
		t1.cry();
		Animal t2 = new Cat();
		t2.cry();
		Animal t3 = new Snake();
		t3.cry();
		
		//밑처럼 해도 결과 값은 동일한데 왜 위처럼 업캐스트를 이용할까?
		Tiger t4 = new Tiger();
		t4.cry();
		Cat t5 = new Cat();
		t5.cry();
		Snake t6 = new Snake();
		t6.cry();
		
//		String s0, s1, s2, s3;
//		s0 = "호랑이";
//		s1 = "호랑이";
//		s2 = "호랑이";
//		s3 = "호랑이";
		String[] ar2 = new String[4];
		// 문자열 객체가 만들어진 것이 아니라 객체를 넣을 수 있는 것 4개를 만들었다.
		ar2[0] = "호랑이0";
		ar2[1] = "호랑이1";
		ar2[2] = "호랑이2";
		ar2[3] = "호랑이3";
		
		String[] ar = new String[] {new String("호랑이0"),"호랑이1","호랑이2","호랑이3"};
		for (int i =0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		Test a0, a1, a2, a3, a4;
		Test[] br = new Test[4];
		//br[0] = new Test();
		Test[] br2 = new Test[]{new Test(), new Test(),new Test(),new Test()};
		for (int i = 0; i < br2.length; i++) {
			br2[i];	
		}
	}
}

class Test{
	void f1() {System.out.println(1);}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex52)
class Aaa{
	void f1() {};
	void f3() {
		System.out.println(10);
	};
	void f4() {
		System.out.println(20);
	}	
}

class Bbb extends Aaa{
	void f2() {};
	void f4() {
		System.out.println(40);
	};
}

public class Hello {
	public static void main(String[] args) {
		Aaa t = new Bbb(); //업캐스트
		
		//1.자식 것을 찾아보고 오버라이딩이 되어있는지 확인 후 되었으면 자식 것을 실행 아니면 자신의 것을 실행.
		t.f3();	// 30
		t.f4(); // 40
		
		Bbb t2 = new Bbb(); //이렇게 만들면 되는 데 왜 위처럼 업캐스트를 사용할까? 그건 다음에..
		t2.f3(); // 10
		t2.f4(); // 40
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex52)	별이 다섯개!***** => 다형성, 업캐스팅
class Aaa{
	void f1() {};
}

class Bbb extends Aaa{
	void f2() {};
	void f1() {
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
		
		
		
		//왼쪽은 문법이고 오른쪽은 사용 메모리.
		//즉 문법은 정의이기에 늘릴 수 있지만 사용 메로리를 늘릴 수 없다.
		
//				Aaa t1 = new Aaa(); //문법적으로 t1은 Aaa까지 메모리도 Aaa까지
//				
//				//왜 쓸까? 문법을 사용 전부 못하는데? 이것을 해결하는 것이 다형성이다.
//				Aaa t2 = new Bbb(); //문법적으로 t2는 Aaa까지 메모리는 Bbb까지
//				
//				//애초에 컴파일이 안되서 문제가 안일어난다.
//				Bbb t3 = new Aaa(); //문법적으로 t3는 Bbb까지 메모리는 Aaa까지 => 불가능하다. 터진다. => 다운캐스팅 => 위험하다.
//				                                                                                                                                                     
//				Bbb t4 = new Bbb(); //문법적으로 t4는 Bbb까지 메모리는 Bbb까지
			}
}

*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex51) 4번째 this. 다른 자신의 생성자를 호출하는 것.
class Tiger{
	int num;
	int age;
	Tiger(){
		age = 10000; // 반드시 무엇을 초기화시킬지 확실할 경우 이렇게.
		System.out.println(1);
	}
	Tiger(int a){
		this(); //생성자를 위한 this 코드는 반듯이 첫줄에 있어야한다.
		num = a;
		System.out.println(2);
	}
	Tiger(int b, int c){
		this(b*c);// 다른 조건으로 초기화시길 경우 이렇게 생성자용 this로.
		System.out.println(3);
	}
}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger(10);
		Tiger t2 = new Tiger(2, 3);
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex50)
//Aaa를 f4를 눌러보면 상속 계층도가 나오는데 맨 위에 Object라는 클래스를 자동으로 상속받아져있다.
//즉 애초에 모든 클래스는 Object를 상속받은 것이다. hashcode()도 있고, toString을 가지고 있다.
//즉 우리가 이전의 예제에서 사용한 toString은 object의 toString을 상속받은 것이다.
class Aaa extends Object{
	
	void f1() {}
}
class Bbb extends Aaa{
	void f2() {}
}
class Ccc extends Bbb{
	void f3() {}
	void f4() {}
}
public class Hello {
	public static void main(String[] args) {
		Ccc t1 = new Ccc(); //f4번을 누르면 상속 계층도가 나온다. 클래스들을 누르면 그 안에 있는 멤버들을 알려준다.
		//f4번을 누르면 상속 계층도가 나온다. 클래스들을 누르면 그 안에 있는 멤버들을 알려준다.
		StringBuffer sb; // 멤버들 중 메소드 눌러보면 그 의미를 알 수 있다. 즉 찾아가기 쉽다.
	}
}
*/


//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
// ex49)
// 생성자가 호출되는 실행 순서:
// 부모 >> 자식 : <-------------잘못된 해석.
class Aaa{
	Aaa(){}
	
	Aaa(int a){
		System.out.println(1);
	}
	Aaa(int a, int b){
		System.out.println(3);
	}
}
class Bbb extends Aaa{
	Bbb(){
		// 부모 생성자를 콜하는 코드가 생략되어 있다.
		//super();// 이 코드가 생략되어 있다. 이렇게 해놓아도 결과는 똑같이 부모 생성자 실행 후 아들 생성자 실행
		super(3,4);
		super(2);//인자가 있는 생성자를 부르기 원하면 이렇게 인수 전달 개수를 선택하면 된다. 
		//생성자를 호출할 때 new할 때 한번만 호출하는 것 처럼 super도 여기서 한번만 호출가능
		System.out.println(2);
		//손자가 부모를 재끼고 호출 불가능
	}
	
}

public class Hello {
	public static void main(String[] args) {
		Bbb b = new Bbb();
		Bbb c = new Bbb(3,4);
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex48)
class Aaa{ // 조부
	void f1() {System.out.println(1);}
}
class Bbb extends Aaa{ // 부모
	
}
class Ccc extends Bbb{
	
}
class Ddd extends Bbb{
	//Ccc와 남남이다. 상위로만의 관계로만 봐서 형제 같이 옆으로 보는 경우는 없다.(연동관계X)
	//Bbb를 상속받을 클래스(나)를 만들면 Aaa도 자연스럽게 내 조부가 되고 조부가 부모를 만들면 나의 조상이된다.
	//다만 두 클래스를 동시에 상속 받는 것은 자바에서는 안된다. 상속 계층도라는 것이 존재한다.
	//*화살표는 부모쪽으로 가르키고 있는다.
	//대입도 부모쪽으로 대입된다.
}

public class Hello {
	public static void main(String[] args) {
		Ccc t1 = new Ccc();
		t1.f1(); //조부의 f1()을 사용한다.
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex47) 상속
//상속의 형태: 
//1. 기본 + 확장(extend) ( 부모를 확장시킨다.)
//2. 중복된 코드를 뽑아낸다.(중복된 코드를 뽑아 부모로 만든다.)

// 어떠한 주체가 자식에게 멤버를 요구할 때 있으면 사용하고 없으면 부모까지 찾아서 있는 지 확인하고 있으면 멤버를 사용한다.

// 상속 관계 종류
// 1. is a: 자식은 부모이다. (호랑이는 동물이다., 식빵은 음식이다.) => 상속관계를 제대로 지었다.
// 2. has a: 경찰은 돈이다는 안되지만 경찰은 돈을 가지고 있다는 성립이 된다. => 상속관계이다.
// 예시에 고양이와 강아지가 상속관계가 되어있으면 원래 안되지만 예시를 위해 사용했다는 것을 이해
/*
//ex47)
 * class Aaa{ // 부모
	void f1() {
		System.out.println(1);
	}
	void f3() {
		System.out.println(31);
		
	}
	String f5(int a, int b, String t)
	{
		return null;
	}
} //함수 중 스코프를 제외한 부분을 함수 원형이라고 한다.
class Bbb extends Aaa{ // 자식
	void f2() {
		System.out.println(2);
	}
	void f3() {
		System.out.println(32);
	}
	void f4() {
		f3();//this.f3() // 클래스 안에 우선 f3이 있는 지 살펴본다.
		super.f3(); //  부모의 f3을 이용한다.
	}
	
	@Override //오버라이딩 된 것은 이렇게 알린다. - 어노테이션
	//이렇게 하는 것의 장점은 어노테이션 달아놓으면 오타가 나타나거나 모종의 이유로 @조건 을 만족못하면 오류를 내주세요 라는 의미이다.
	//이 같은 경우는 오버라이딩이 제대로 안되면 오류가 뜬다(인자, 오타, 타입 오류 등) => 타입이나 인자 개수가 틀려도 어노테이션이 없으면 오류가
	//안뜨는 이유는 생성자처럼 인자를 여러개에 따라 받을 수 있거나 여러타입을 받을 수 있는 등의 예외조건이 있다.
	String f5(int a, int b, String t) {
		return null;
	}
}

public class Hello {
	public static void main(String[] args) {
		Bbb t1 = new Bbb();
		t1.f1();
		t1.f2();
		//오버라이딩(overriding)
		t1.f3();
		System.out.println("------------------------------=-----=-=-================");
		t1.f4();// 자기 자신 호출
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex46-3)) this의 3번째 용법. 나를 보내어서 사용하게 만들 수 있게 해준다.(나를 너에게 보낸다.)
class Man{
	void f1() {
		Women w = new Women();
		boolean result = w.marry(this);
		System.out.println(result ? "^^" : "ㅠㅜ");
	}
	String 성격() {
		return "포악";
	}
}
class Women{
	boolean marry(Man info) {
		String str = info.성격();
		return str == "포악" ? false :true;
	}
}
public class Hello {
	public static void main(String[] args) {
		Man t1 = new Man();
		t1.f1();
		
//		Control con = new Control();
//		//여기서의 this는 나(Hello class)를 던지겠다는 의미이다.
//		con.makeButton(this, "텍스트", "색상");
////아마 con안에는 칠하다 같은 함수가 없어서 밑의 방식으로 날린 this의 칠하다를 사용하다는 식일 것이다.
//// 즉 내가 상대방에게 필요하다. 내가 없으면 작업이 안된다 라는 뜻으로 this를 던져 나를 사용할 수 있게 해주는 것이다.
////		makeButton{
////			this.칠하다
////		}
	}
	
	void 칠하다() {	
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex46-2) this 용법2
//channing을 목적으로 한다.
class Tiger{
	//Tiger this;
	Tiger f1() {
		//System.out.println("아침");
		System.out.println("아이디 확인");
		//return null;
		//return new Tiger();
		return this;
	}
	
	Tiger f2() {
		//System.out.println("점심");
		System.out.println("패스워드 확인");
		return this;
	}
	
	void f3() {
		//ystem.out.println("저녁");
		System.out.println("유효성 검사");
	}
}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.f1().f2().f3();// 이 상태는 this가 리턴이 된 것인데 외면한 것이다. 즉 this가 리턴되어있는 상태라 .을 찍을 수 있다(chaining).
		System.out.println("----------------------------------");
		t1.
		f1().
		f1().
		f1().
		f2().
		f1().
		f3();//f3은 return이 없어서 chaining이 불가능하다. 이런 식의 코드스타일로 한다.
		
		t1.f1();
		t1.f2();
		t1.f3();
		//위의 둘 차이는 없는데 왜 이렇게 하는가?
		System.out.println("----------------------------------");
		
		//이질감 있는 코드를 끼어들기가 밑처럼 되어버리기 때문이다.
		t1.f1();
		System.out.println("끼어들기");
		t1.f2();
		t1.f3();
		
		System.out.println("----------------------------------");
		//밑의 코드는 끼어들기가 불가능하다.
		t1.
		f1().
		f2().
		f3();
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex46-1) this 용법1
//함수의 전달인수와 필드를 구분하기 위한 용도
//-----------------------------------------------------

class Tiger{
	String name;
	int 	age;

// 자동으로 제너레이트로 만들면 좋은 경우: 생성자, setter, getter, toString	
public Tiger(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	Tiger(String name, int age){
//		this.name = name; // 필드 <= 인수;
//		this.age = age;
//	}
	
	void f1() {
		System.out.println(name + " " + age);
		// System.out.println(this.name + " " + this.age) 컴파일이 되면 이렇게 바뀐다.
		System.out.println(this.name + " " + this.age);
	}
	
	void f2() {
		f1();
		this.f1();//정석 방법. 사실은 컴파일 될 때 다 이렇게 사용했다.
	}
	
	void f3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Tiger [name=" + name + ", age=" + age + "]";
	}
}

public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger("호랑이", 10);
		System.out.println(t1);
		t1.f3("독수리", 20);
		System.out.println(t1);
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex45)
class Lion{}
class Tiger{
//	Lion lion;
//	Tiger t;
	Tiger() {
		//this = ????????; // 이 코드도 생략되어 있다. new를 만나면 풀려버린다.
		//this = t1; , this = t2 // new를 만나서 생성되는 순간 이렇게 바뀐다. 
		// 위에 말고도 생략된 것이 있고 그렇기에 비용이 많이든다는 것이다.
		System.out.println(this.hashCode());
	}
	// 아무 코드가 없어도 디폴트 생성 코드가 있다.
	//Tiger this 모든 클래스에 이 코드가 존재하지만 생략되어 있다. 
	}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		System.out.println(t1.hashCode());
		
		Tiger t2 = new Tiger();
		System.out.println(t2.hashCode());
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex44
class Tiger{
	private Tiger(){ 
		// 디폴트인 Tiger 생성자를 막아 인자없는 Tiger 인스턴스를 new하는 것을 막기.
		
		
	}
}
public class Hello {
	public static void main(String[] args) {
		
		//표준 클래스
		//Math m = new Math(); //사용이 불가능
		//m.abs();
		Math.abs(-10); //이렇게 클래스 이름 자체로 해서 .을 써서 사용할 수 있다는 것이 static이며 abs를 했을 때 여러개 나오는 것은 인자가 다른 오버로딩으로 여러개라는 것이다. 
		System.out.println(Math.abs(-10)); 
		//F3으로 보면 static을 이용한 3항 연산자이다. 그리고 return으로 바로 해결 가능한데 if else 또는 삼항을 쓰는 이유는 일정한 속도를 위해서 이다.(수학 관련은 전부 그렇다.)
		//new를 막아놓고 함수들을 Static으로 이용하는 이유는 1. Math 생성 자체의 객체 생성 비용 때문이다. 
		//new로 안되는 이유가 생성자를 막아놓기 때문이다.(private 방식으로)
		
		//Thread.sleep(0) 여지없이 static.
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex43-3)
	class Tiger{
	static int count = 0;
	int num = 0;
	Tiger(){
		count++;
		num++;
		}
	}
	public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		Tiger t3 = new Tiger();
		System.out.println(Tiger.count); 
		System.out.println(t1.num);
		System.out.println(t2.num);
		System.out.println(t3.num); //공용으로 쓰는 static과 일반의 차이.
		
		System.out.println("생성된 객체수는 : " + Tiger.count );
		//프로그램이 끝날 때 Count는 0이 되어야 한다.
		}
	}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
	//ex43-2)
	class Tiger{
	void f1() {
		Tiger t = new Tiger();
	}
	}
	public class Hello {
	int n1;
	static int n2;
	void f1() {}
	static void f2() {}
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		//f1()
		f2();
		//n1 = 10;
		n2 = 10;
		Hello h = new Hello();
		h.n1 = 10;
		h.n2 = 20;
		h.f1();
		h.f2();
	}
	}
	//OS가 생성한 Hello와 new 로 생성된 Hello 총 2개의 Hello가 생성된 것이다.
	*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex43-1)
class Tiger{
	int n1;
	static int n2;
	static void f1() {
		//n1 = 100; // 에러가 잡힌다. 왜냐하면 n1은 아직 정의만 되고 생성 되지 않았기 때문이다.
		n2 = 100; //그래서 n2는 생성이 되는 것이다.
		//f2() 당연히 호출이 불가능하다. 정의만 되고 메모리 생성은 되지 않았기 때문이다.
		f3(); // 즉 스태틱 안에서는 스태틱만 사용 가능하다.
		//****f3()가 뒤에 있는데도 선언이 가능한 이유는 한번 전부 정의한 후에 static이 만들어진다는 것이다.
	}
	void f2() {
		f1(); // 다른 함수에서는 당연히 static 사용 가능하다. 다른 함수를 사용할 수 있듯이.. static이 아니므로 정의만 하기 때문이다.
	}
	static void f3() {}
}

public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex42-2
	class Tiger{
	// 필드와 달리 메소드는 정의하는 것이라 어차피 한번 밖에 안만드는 건데 왜 붙이는가?
	// 객체 생성 비용이 굉장히 많이 들기 때문이다. 그래서 여러 분야에서 시스템의 속도를 요구하는 부분에 static을 거의 사용한다.
	static void f1() {
		
	}
	void f2() {
		
	}
	}
	public class Hello {
	//진입점(Entry Point)
	//Hello도 클래스이다. 그래서 필드 메소드 생성자 다 만들 수 있다.
	int age;
	Hello(){
		
	}
	void f1() {
		
	}
	public static void main(String[] args) {
		// main이 바로 호출되는 이유가 static이기 때문이다.
		// main의 호출은 OS가 하는 것이다.
		// Hello h = new Hello();
		// h.main();
		// Hello.main()
		
		// 필드와 달리 메소드는 정의하는 것이라 어차피 한번 밖에 안만드는 건데 왜 붙이는가?
		// 객체 생성 비용이 굉장히 많이 들기 때문이다.
		// Tiger t1 = new Tiger();
		// Tiger t2 = new Tiger();
	}
	void f2() {
		
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex42-1)
//비행기를 만들 설계도에 1개의 관제탑만 미리 만들어 놓는다. static.
class Tiger{
	//컴파일 되는 순간 이 스태틱 변수와 스태틱 함수가 밖으로 나간다. 즉 메모리로 이미 존재 시켜 놓는다.
	//그러므로 객체로 생성하지 않아도 사용이 가능하다.
	//객체 생성을 하지 않았을 때 체이닝이 불가능 하기 때문에 스태틱 필드 및 메소드는 class 이름 자체로 접근한다. Tiger.관제탑()
	//물론 객체를 생성하면 접근이 가능하다.
	
	static int n1;
	int n2;
	
	static void 관제탑() {
		System.out.println("콜");
	}

	void 날다() {
		System.out.println("날다");
	}
}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		Tiger.관제탑();
		t1.날다();
		t1.관제탑();
		
		System.out.println(t1.n1);
		System.out.println(t1.n2);
		//static 장점 1. 공용으로 사용할거면 굳이 객체가 생성될 때마다 생성 시킬 필요없이 static으로 지정하면된다.
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex)
class Tiger{ // Generate 기능을 이용해서 Getter, Setter를 알아서 만들 수 있다.
	// 보통 Getter, Setter는 한 줄 처리를 해버린다.
	private String name;
	private int age;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex42)
//멤버필드는 객체를 생성시켜서 직접 초기화해서 사용하는 것은 거의 불법이다(금기 시 되어있다.)
// 즉 클래스에서 알아서 초기화를 시키게 제작하여햐 한다는 뜻이다. 클래스와의 일과 Main에서의 일은 정확히 나누어져 있다.
// 즉 클래스 입장에서 외부에서 데이터를 변경하게 만들어서 자신의 변수를 건들여서 함수 식 등등에 영향을 미치는 것을 불편하게 여긴다.
// 그래서 private를 이용해 클래스의 변수를 초기화 시켜놓고 (은닉) 함수를 이용해 출력 및 세팅한다.(get, set) 
class Tiger{// 부품으로 생각해야한다.
	
	int age2;
	int money2;
	Tiger(){
		age2 = 100;
	}
	
	void fMoney() {
		int sum = money2*10;
		System.out.println(money2);
	}
	
	
	
	//외부에서 사용할 수 없다. 은닉성. 멤버 변수 필드는 전부 private로 하는 것이 좋다.
	//디폴트는 public으로 선언되어 있다.
	private int age;
	private int money;
	private String name;
	void setName(String n) {
		name = n;
	}
	String getName() {
		return name;
	}
	
	//  getter, setter 함수
	//  private 와 get, set 함수의 장점
	// 1. 출력과 입력을 막을 수 있다. (get, set을 제공하지 않는 방식으로)
	// 2. 출력과 입력 중 원하는 것만 제공할 수 있다.
	int getAge() {
		return age;
	}
	void setAge(int data) {
		age = data;
	}
	
	// f3번을 위해 만들어진 f1, f2는 private를 해야한다.
	private void f1() {
		
	}
	private void f2() {
		
	}
	private void f3() {
		f1();
		f2();
	}
}

public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		
// 멤버필드는 객체를 생성시켜서 직접 초기화해서 사용하는 것은 거의 불법이다(금기 시 되어있다.)
// 즉 클래스에서 알아서 초기화를 시키게 제작하여햐 한다는 뜻이다. 클래스와의 일과 Main에서의 일은 정확히 나누어져 있다.
// 즉 클래스 입장에서 외부에서 데이터를 변경하게 만들어서 자신의 변수를 건들여서 함수 식 등등에 영향을 미치는 것을 불편하게 여긴다.
// 그래서 private를 이용해 클래스의 변수를 초기화 시켜놓고 (은닉) 함수를 이용해 출력 및 세팅한다.(get, set) 
		System.out.println(t1.age2);// 잘못된 출력 방법. 직접 출력하고 있다.
		t1.money2 = 200; // 잘못된 초기화 방법. 메인에서 직접 조작하고 있다.
		
		//값을 출력하고 싶다면
		t1.setAge(1000);
		System.out.println(t1.getAge());//올바른 출력 방법. 필드를 직접 건들이지 않고 출력하고 있다.
		
	}
}
*/


//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex)41
//생성자는 무조건 단 1번 생성된다.
class Tiger{
//	//디폴트로 넣어진다. 무조건 생성자는 1번 만들어져야 하기 때문이다. 그래서 밑의 생성자는 우리가 안만들어도 만들어진다.
//	Tiger(){
//	
//			}; 
	
//	// 일반적으로 이렇게 만들어 놓는다. 다른 생성자를 생성하면 이 디폴트 생성자가 사라지기 때문에 미리 정의해놓는다.
	String name;
	int age;
	
	Tiger(){};
	
	
	Tiger(int data){ // 이렇게 숫자만 들어오게 하면 이름을 익명으로 지정해주는 식으로 상황에 따라 정의할 수 있게 만들 수 있다.
		name = "익명";
		age = data;
	}
	
	Tiger(String n, int data){
		name = n;
		age = data;
	}
	void showData() {
		System.out.println(name + " " + age);
	}

	//우클릭 => 소스 => 밑에서 3번째 autogenerater를 이용하면 이렇게 쉽고 이쁘게 원하는 변수를 이용한 문장 출력 코드를 제작할 수 있다.
	@Override
	public String toString() {
		return "Tiger [name=" + name + ", age=" + age + "]";
	}
	

}

public class Hello {
	public static void main(String[] args) {
		
		Tiger t1 = new Tiger(100); // 생성자를 만드는 순간 디폴트 생성자가 사라져서 인수가 없는 형식으로 만들 수 없다. 그래서 위에 언급했듯이 디폴트 생성자를 만들어 놓는다.
		System.out.println(t1.name + " " + t1.age);
		Tiger t2 = new Tiger("홍길동", 200);
		t2.showData();
		
		System.out.println(t1.toString());
		System.out.println(t1);
	}
}

*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
ex40-2)

class Tiger{
	int age = 10;
	Tiger(int data){
		System.out.println(age);
		age = 20;
	}
}
public class Hello {
	public static void main(String[] args) {
		//디폴트 생성자는 인자를 받을 수 없어 상황에 따라 초기화를 시킬 수 없어서 의미가 없다.
//		Tiger t1 = new Tiger();
//		Tiger t2 = new Tiger();
//		System.out.println(t1.age);
//		System.out.println(t2.age);
		Tiger t1 = new Tiger(100);
		Tiger t2 = new Tiger(200);
		System.out.println(t1.age);
		System.out.println(t2.age);
	}
}
*/



/*
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex40-1)

class Tiger{
	
	int age; // 1. 초기화 방식1(먼저 실행) 
	
	Tiger(){ // 2. 초기화 방식2(나중 실행)
		System.out.println(1);
		age = 100;
	}
	
	Tiger(int data){ // 인자를 대입 값으로 세팅해서 원하는 값으로 초기화 시킬 수 있다.
		System.out.println(2);
		age = data;
	}
}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		System.out.println(t1.age);
		Tiger t2 = new Tiger(200);
		System.out.println(t2.age);
	}
}

*/



/*
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex39)
//생성자
// 1. 사용 목적 : 필드 초기화
// 2. 생성자 메소드라고 한다.(함수이다.)
// 3. 함수의 이름은 반드시 클래스 이름과 동일
// 4. 생성자 함수는 인수를 전달받을 수는 있지만, return을 가질 수는 없다. 그래서 void도 붙지 않는다.
// 5. 인수의 전달이 없는 생성자를 디폴트 생성자라고 한다.
// 6. 호출은 new키워드를 사용할 때 딱 1번 호출된다. 프로그래머가 임의로 호출하는 것은 불가능하다.
// 7. 함수이기 때문에 오버로딩을 할 수 있다.
// 8. 생성자 코드를 작성하지 않으면 자동으로 디폴트 생성자가 만들어 진다. -생성자 코드를 작성하면 자동으로 생성자가 만들어 지지 않는다.
// 생성자는 비행기가 제작되는 시점에 세팅을 시켜놓는 게 좋다(set)
class Tiger{
	// 필드
	int age;
	
	// 생성자: 클래스 이름과 동일하다.
	// 이렇게 인수 전달이 없는 경우 디폴트 생성자라고 한다.
	Tiger() {
		System.out.println("생성자 콜");
		age = 100;
	};
	// 메소드
	
}
public class Hello {
	public static void main(String[] args) {
		System.out.println(1);
		Tiger t1 = new Tiger(); //new로 인하여 자동으로 호출되었다.
		System.out.println(2);
		Tiger t2 = new Tiger();
		System.out.println(3);
		System.out.println("-----------------------------------------");
		for (int i = 0; i <3 ; i++) {
			Tiger temp = new Tiger(); //새로운 객체가 3번 만들어지고 3번 사라진다.
			System.out.println(temp.hashCode());
		}
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
package Pack01;
//ex38-2)
class Tiger{
	int getReangle(int w, int h) { 
		return w * h;
	}

	int getReangle2(int x1, int y1, int x2, int y2)
	{
		int width = x2-x1;
		int height = y2-y1;
		return width-height;
	}
	String s = "aaa";
	int getReangle3(int x) {
		return x*x;
	} //이전에 오버로딩(overloading)을 하기 전에는 이런 식으로 이용했다.
	//요즘에 2, 3 이렇게 붙은 경우는 버젼을 뜻하는 것이다.
	
	//오버로딩(overloading) 방식
	int getReangle(int x1, int y1, int x2, int y2)
	{
		int width = x2-x1;
		int height = y2-y1;
		return width-height;
	}
	
	int getReangle(int x) {
		return x*x;
	}

	
// 리턴값으로 구별은 불가능해서 오류가 뜬다.
//	int test() {
//		return 0;
//	}
//	float test() {
//		return 0.0f;
//	}
	
	
}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		System.out.println(t1.getReangle(10, 5));
		//옛날 방식. 
		System.out.println(t1.getReangle2(10, 5, 20 ,15));
		System.out.println(t1.getReangle3(25));
		//오버로딩 방식
		System.out.println(t1.getReangle(10, 5, 20 ,15));
		System.out.println(t1.getReangle(25));
		
		String s;
	}
}
*/



/*
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex38-1)
//함수 이름을 동일하게 작명이 가능한 경우
//함수 이름을 동일하게 사용x이지만 가능한 2가지 방법이 있다.
//오버로딩(Overloading) - 보통 회사들의 입사 1번 문제로 묻는다.
class Tiger{
	//1. 인수 전달 개수가 다른 경우
	void showMeTheMoney() {
		System.out.println(1);
	}
	void showMeTheMoney(int a) {
		System.out.println(2);
	}
	void showMeTheMoney(int a, int b) {
		System.out.println(3);
	}
	//2. 인수 전달 개수가 같더라도 타입이 다른 경우
	void showMeTheMoney(float a) {
		System.out.println(4);
	}
	void showMeTheMoney(Tiger t) {
		System.out.println(5);
	}
	void showMeTheMoney(short a) {
		System.out.println(2);
	}

	
}


public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.showMeTheMoney();
		t1.showMeTheMoney(10);		
		t1.showMeTheMoney(10, 20);
		t1.showMeTheMoney(3.14f);
		t1.showMeTheMoney(new Tiger());
		float f = 3;
		t1.showMeTheMoney(3);
		t1.showMeTheMoney(f);
		t1.showMeTheMoney(3.0f);
		t1.showMeTheMoney((float)3);
		
		t1.showMeTheMoney((short)10);//short로 갈지 int로 갈지 모르기 때문에 타입 캐스팅을 해야한다. 이것을 애매모호한 상황이라고 한다.
	}
}
*/



//-----------------------------------------------------
/*

//ex37)
class Tiger{
	int number;
}

class Lion{
	///Tiger bbb = aaa; // 공유
	Tiger m1(Tiger bbb) {
	System.out.println(bbb.number);
	System.out.println(bbb.hashCode());
		return bbb;
	}
}

public class Hello {
	public static void main(String[] args) {
		Lion t1 = new Lion();
		Tiger aaa = new Tiger();
		aaa.number = 999;
		System.out.println(aaa.hashCode());
		
		Tiger ccc = t1.m1(aaa); // new 로 만들어진 비행기 하나를 공유한 것이다. 애초에 new로 하나 만들어져서..
		System.out.println(ccc.hashCode());
		System.out.println(ccc.number);
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex36)
class Tiger{
	int num = 100;
}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		System.out.println(t1.hashCode());//식별 번호를 받는다.
		Tiger t2 = new Tiger();
		System.out.println(t2.hashCode());//식별 번호를 받는다.
		Tiger t3 = null;
		//System.out.println(t3.hashCode());//에러가 뜬다. Null Pointer Exception
		t3 = t1;
		System.out.println(t3.hashCode());// 같은 해쉬코드가 뜬다. 같은 new Tiger 주소를 공유하는 참조형이라서.
		System.out.println(t1.num);
		t1.num = 200;
		System.out.println(t3.num);
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
 * 
 * ex35)
class Tiger{

}

class Lion{
	//Tiger t = new Tiger();
	void m1(int a, String s, Tiger t, Lion l) {//자기 클래스의 객체를 넣는 것도 가능하다.
		//null을 인자로 받아도 사용하지 않으면 오류가 뜨지 않는다.
		if( s != null) { //null을 인자로 받을 수 있는 확률이 있으면 이런 방어적인 코드가 들어간다. 이것을 방어적인 프로그램이라고 한다.
			
		}
	}
	
	Tiger m2() { // 만든 클래스도 리턴 가능하다.
		return null;
	}
	
	Tiger m3() {
		return new Tiger();
	}
	Tiger m4() {
		Tiger t = new Tiger();
		return t;
	}
	Tiger m5(Tiger t) {
		return t;
	}
}

public class Hello {
	public static void main(String[] args) {
		Tiger t2 = new Tiger();
		Lion t1 = new Lion();
		t1.m1(10, "호랑이", new Tiger(), new Lion());
		t1.m1(10, null, null, null);
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex34)

class Tiger{
	//8가지 프리미티브 타입 + class
	void m1(float a, String s) { 
	// 클래스를 인수로 전달받을 수 있다는 뜻은 수백만 개의 클래스를 인수로 받을 수 있다는 것이다.
		//System.err.println(a);//에러처럼 출력해주세요
		System.out.println(a+ " " +s);
		
		System.out.println(s.length());
		
	}
	
	String m2() {
		// 방법 1
		//return "호랑이";
		// 방법 2
		String s = "독수리";
		return s;
	}
}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.m1(3.14f, "호랑이");
		//1.
		t1.m2();
		String s = t1.m2();
		//2.
		System.out.println(s);
		//3.
		System.out.println(t1.m2());
		
		//String s2; // 앞으로 객체가 생성 된다면 사용될 이름을 정의했을 뿐이다.
		//ex) 비행기가 만들어지면 이름을 보잉 747로 하겠다.
		//s2.length(); //당연히 비행기가 만들어진 것이 아니므로 오류가 뜬다.
		
		// null을 이용해아직 s2는 객체가 아니다라는 것을 명시적으로 표시한다.
		String s2 = null;
		String s3 = "코끼리";
		s3 = null;
	}
	String m3() {
		return null;// 에러를 피하기 위해서 일단 null로 제작
	}
}



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex33)
class Tiger{

}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		
		// 문자열을 전문적으로 관리한다.
		// 첫자가 대문자라는 뜻은 클래스라는 
		// 내가 만든 적이 없다.
		// 자바에서 표준으로 제공되고 있는 표준 클래스이다.
		// 도움을 줄만한 method가 뭐가 있는 지 궁금(String도 클래스이니깐) 내가 String을 만들 수도 있다.
		String s1 = new String(); //String 위에 마우스 커서를 가져다 놓고 f3을 누르면 설명을 볼 수 있다.
		s1 = "호랑이";
		System.out.println(s1);
		System.out.println(s1.length());//도트를 걸면 쓸 수 있는 함수를 볼 수 있다. 프리미어 타입은 안된다.
		
		// 약식 표현이다.
		String s2 = "앵무새";
		System.out.println(s2);
		
		Thread t; // Thread를 상속받거나 Runnable을 인터페이스 추가하라는 이유가 들어가보면 Runnable을 인터페이스로 추가 해놓았다.
		
		Math m;
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex32)
class Tiger{
	int a, b;
	
	void showData() {
		System.out.println(a + " " + b);
	}
	
	int add() {
		return a + b;
	}
	
	void m1(int x, int y) {
		// 이름이 중첩될 경우 우선 순위.
		// 1. 일단은 지역 변수를 먼저 사용한다.
		// 인수 값이 먼저 사용된다.
		int result = a+ b;
		System.out.println(result);
		// 필드의 a, b를 사용하고 싶다면....
		// this >> 키워드를 사용한다.
	}
}

public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.a = 10;
		t1.b = 20;
		t1.showData();
		System.out.println(t1.add());
		t1.m1(100, 400);
	}//기본적인 사용 형태
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex31

import java.util.Iterator;
import java.util.Random;



class Tiger{//순서는 절차대로
	void f1() {
		System.out.println(1);
		
	}
	void f2() {
		f1();//내부의 멤버를 사용 가능하다. 함수 안에서는 함수를 선언할 수 없다. 클래스 밖에서 선언할 수 없다.
		System.out.println(2);
	}
	void f3() {
		f2();
		System.out.println(3);
	}
	
	//상호 호출
	void f4() {
		System.out.println(4);
		f5();
	}
	void f5() {
		System.out.println(5);
		f4();
	}//오류 뜬다.
	
	// 재귀호출(recursive call)
	void f6() {
		System.out.println(6);
		f6();//재귀 호출 (고난이도 프로그램) 그러나 잘 사용하면 굉장히 유용하다.
	}
	//옥트리 . 면적 구하는 공식이 같기 때문에 똑같은 기능을 재호출을 계속 하는 것으로 풀 수 있다.(재귀호출)
}
public class Hello {
	public static void main(String[] args) {
		
		Tiger t1 = new Tiger();
		t1.f3();
		System.out.println(4);
		//t1.f4();
		t1.f6();
		
	}
}


*/

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*//**************************중요***************************
//ex)30
class Tiger{
	//1.외면(x)
	//2 =
	//3 출력연결
	//인자는 여러개 받아도 1 개만 리턴 가능(여러개 보낼 대안은 있음)
	// 리턴이 있다. FuncName(){}
	// void: ~가 없다. 함수에서는 리턴값이 없다로 표현
	void func01() {
		
	}
	int func02() {//void가 아닐 때는 반드시 return이라는 키워드가 있어야 한다.
		//리턴은 프리미어 타입 뭘 적어도 상관없다.
		//return 0;//우선은 에러를 피하기 위해 return 0;를 하는 것이다.
		System.out.println(1);
		return 100;
	}
	
	int fun03() {
		if(3<2) {
			return 100;
		}
		else if(false){
			return 200;
		}
		else {
			System.out.println();
			//return 300;
		}
		
		return 2000;
//		return 100;// return은 함수 실행 종료
//		//System.out.println(1000);
		
		//print 문도 실행 불가능하다.
	}
	//리턴 키보드 사용 중이다.
	
	//void지만 return 키워드 사용가능하다.
	void func04() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i==5) {
				//break;
				return; // 리턴만 사용이 가능하다.
			}
		}
		System.out.println("for 문 중단됨"); // 이 문장 자체가 안뜬다.
//		System.out.println(1);
//		return;
		//System.out.println(1);
	}
	
	// 4번째 형태 , 인자도 있고 리턴도 있다.
	int func05(int num) {
		
		//return num* num; // 우선 return 0를 설정해놓고 생각한다.
		int result = num* num;
		System.out.println(result);
		return result;//위와 같다. 이렇게 받아 쓰는 경우는 분명 한번 결과값을 본다든지 값을 다르게 또 이용해야한다는지  이유가 있다.
	}
	
	int func06(int num) {
		return num*num; //여기서 바로 println을 사용하지 않는 이유는 이것을 출력 외에 다른 것을 이용할 수 있기 때문.
	}
	
	// 규칙을 만든다. -1이 리턴된 경우 음수, +1...설명..이런 식의 함수는 if문으로 거의 쓴다. 밑에 이용한 메인 클래스에 사용 예가 있다.
	int func07(int num) {
		if(num<0) {
			//System.out.println("음수임"); 사실 표준 라이브러리에서는 알리지도 않고 틀릴 경우 에러가 아니라 -1 같은 값을 리턴시킨다.
			//즉 규칙을 만든다. -1이 리턴 된 경우는 음수인 경우이다 같은...
			return -1;//더 이상 프로그램이 진행되어서는 안된다는 논리를 주입함.
		}
		
		if (num%2 == 0) {
			System.out.println("짝");
		}else {
			System.out.println("홀");
		}
		
		return 1;
	}
}

public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		// 1. 외면
		t1.func02();
		//2. 받은 값 사용
		int num = t1.func02();
		//int num = 100;
		System.out.println(num);
		//3
		System.out.println(t1.func02()); // t1.func02가 100으로 남는다고 생각하면 된다.
		
		System.out.println(t1.fun03());
		
		//에러 원인을 못찾는다.
		//System.out.println(t1.func01());
		
		//메소드에서 return 키워드를 만나면 함수가 중단된다.
		//어떤 식으로 코드가 진행이 되더라도 return을 만나야 한다. 조건문에서 조심해야 한다. return을 못만나는 경우가 있기 때문이다.
		
		
		t1.func04();
		
		System.out.println(t1.func05(3));
		System.out.println(t1.func06(5));
		System.out.println(t1.func06(3)+t1.func06(5));
		
		if(t1.func07(-4)== -1) {
			System.out.println("음수 라서 다시 시도해주세요"); //이런 식으로 if문과 return값 규칙으로 원하는 방식의 사용이 가능하다.
		};
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex29)
// 메리라는 강아지를 부르는 것올 호출한다고 한다. (memory 호출(call))
// 메리 3이라 할 때 메리가 3번 짖개 한다. 3을 인수라고 한다. 대입 연산자는 눈에 보이지 않는다.
/*
class Tiger{
	void m1() {
		System.out.println("멍");
	}
	void m2(int num) { // =이라는 대입 연산이 일어난다.
		System.out.println("멍" + "*" + num);
	}
	void m3(int num) { // num은 지역변수라서 스코프 안에서만 이용 가능하다
		for(int i = 0; i<num;i++) {//이런 식으로 인자를 잘 이용해보자
			System.out.print("멍");
		}System.out.println();// ln을 제거하려면 안에 글자가 있어야한다. ln이 있는 경우 줄넘기기가 있기 때문.
	}
	//void m4(int num,b)//안된다..
	void m4(int a, int b) {
		System.out.println(a+b);
		System.out.println(a*b);
	}
	
	
	
	void m5(int w, int h, char ch, boolean b) {// a, b로 넣지않고 가로 세로 느낌으로 넣는다. ~4,5개까지가 적당한 이수 개수
		for (int i = 0; i < h; i++) {
			for (int j = 0; j< w; j++) {
				System.out.print(ch+ " ");
			}System.out.println();
		}
	}
	void m6(int n) {
		for (int i= 0; i<10;i++) {
			System.out.println(5 + " * " + i + " = " + i*5);
			System.out.println(n + " * " + i + " = " + i*5);
			// n을 받음으로서 5단만 나올 것을 5를 바꾸고 싶은 마음에 활용도를 굉장히 높였다.
		}
	}
	void m7(int n) {
		int sum = 0;
		for (int i= 1; i<=n;i++) {
			sum += i;
			}
		System.out.println(sum);
		}
	// 시간과 메모리가 많이 드는 것을 비용이 든다고 한다. 함수를 제작할 때 마다, 인수가 늘어날 때마다 비용이 든다.
	// 잃는 것 보다 얻는 것이 많기 때문에 조각화를 시켜서 함수화를 많이 한다.
	void m8(int w, int h, char ch1, char ch2) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
//				if((i+j)%2 ==0) {
//					System.out.print(ch1+" ");
//				}else {
//					System.out.print(ch2+" ");
//				}
				System.out.print(
						((i+j)%2 == 0 ? ch1 : ch2) + " "
						);
			}System.out.println();
		}
	}
}

public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.m8(8, 7, '한', '글');
		t1.m1();
		t1.m2(3);
		t1.m3(8);
		t1.m3(14);
		t1.m4(3, 4);
		// 첫번재 인수를 가로, 두번째 인수를 세로 개념으로 많이 쓴다.
		t1.m5(5, 4, '*', true); //안사용하는 인자도 채워넣어야한다.
		t1.m6(19);
		t1.m7(100);
		
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex28)
/*class Tiger{
	// 1. void f1() {} 
	// 2. void f1(int a) {}
	// 3. int f1() {}
	// 4. int f1(int a) {}
	
	// 1. 리턴없다 f1(인수전달 없음) {} 
	// 2. 리턴없다 f1(인수전달 있음) {}
	// 3. 리턴있다 f1(인수전달 없음) {}
	// 4. 리턴있다 f1(인수전달 있음) {}
	
	// 1. x f1(x) {} 
	// 2. x f1(o) {}
	// 3. o f1(x) {}
	// 4. o f1(o) {}

	// 1
	
	void method01() {
		System.out.println("method01");
		System.out.println("method01");
		System.out.println("method01");
		System.out.println("method01");
	}
	
	void method02() {
		System.out.println("method02");
	}
	
}



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
public class Hello {
	public static void main(String[] args) {
		//코드의 재활용
		//함수(메소드) : 자주 사용되는 코드를 저장해서 재활용한다.
		
		Tiger t1 = new Tiger();
		System.out.println(1000);
		t1.method01(); // 함수를 호출한다.
		//프로그램에서 점프(분기)가 일어나서 클래스 내부의 메소드로 점프한다. 그 이후 그 내용을 쭉 실행한다.
		//그 이후 자기 자리로 돌아온 후 다시 절차적으로 이동한다.
		System.out.println(2000);
		t1.method01();
		
		Tiger t2 = new Tiger();
		t2.method01();
		System.out.println("-----------------");
		// 함수 같은 경우는 아무리 많이 제작되어도 공용으로 한번 밖에 안만들어진다.(필드는 만들때마다 만들어짐)
		t1.method02();
		t2.method02();
	}
}
*/



/*
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex)27
//관례적으로 클래스 이름의 첫글자는 대문자.
//설계도
class Airplane{ 
	//내용이 없어도 선언한 순간 상당히 많은 메모리를 소모하고 있는 상황이다.
	
	// 1. 필드(변수) >> 속성
	int a; // int fuel;
	float b;
	int seat;
	int[] ar = new int[4]; // 클래스는 선언만 해둘 수 있다. 밖에서 초기화 가능.
	
	int num = 99;
	// 2. 생성자
	// 3. 메소드(함수) 실제로 전부 다 존재한다면 1, 2, 3 순으로 제작.
}

public class Hello {
	public static void main(String[] args) {
		//설계도 = 클래스
		//내용 
		// 1. 생성자
		// 2. 속성(쇠, 유리)  => 변수, 필드
		// 3. 동작(동사) = 기름 주입, 날다, 바퀴를 접어올리다.
		// => 메소드(함수라는 말은 쓰지 않는다. 애초에 클래스 밖에 메소드(함수)를 만들수 없다)
		// 필수 조건은 2번 3번. 만들어진 비행기를 객체라고 한다.
		// 객체를 만드는 과정을 인스턴스라고 한다.(즉석에서 만들다.) => 만들어지는 과정을 인스턴스라고 하고 만들어진 것은 객체이다
		// 바퀴 객체를 위한 설계도, 창문 객체를 위한 설계도 등 설계도 3만가지를 잘 이용해서 비행기를 만들었다.(이것을 객체 지향 프로그램이라고 한다.)
		// 절차보다 개발 기간과 안정성 면에서 훨씬 높다. 다만 속도면은 절차가 더 빠르다.
		// 요약 클래스(설계도)를 필드와 메소드로 제작하고 만들어 낸 것이 오브젝트(객체)
		
		// Airplane a = new Airplane(); // new는 주소값 생성?
		//Airplane airplane = new Airplane(); 한 개 만들 때 네이밍
		//Airplane air // 여러 개를 만들 때 네이밍. 1번째는 1 안붙이고 그 뒤 바로 air2로 네이밍.
		//실제 비행기가 만들어졌다.
		Airplane air = new Airplane();// new에서 실제 메모리 공간 생성
		//air.a = 10;
		air.b = 20.0f; //dot(chaining)으로 멤버에 접근 가능
		air.seat = 30;
		System.out.println(air.a);// 입력이 되어있지 않으면 0으로 초기화 되어 나옴.
		System.out.println(air.b);// 필드(멤버)를 사용하고 있다. 필드 =멤버(필드 메소드 생성자 전부를 포함) 변수, 멤버 메소드말고 멤버 함수라고 씀.
		//당연히 같은 클래스에서 나온 객체들이더라도 객제 자체와 멤버는 주소 값이 다른 값이다. 
		Airplane air2 = new Airplane();
		air2.seat = 40;
		System.out.println(air.seat+ " " + air2.seat); //둘의 값은 다르다.
		
		System.out.println(air.ar.length);
		for (int  i = 0; i <air.ar.length; i++) {
			air.ar[i] = i * 10;
		}
		for (int  i = 0; i <air.ar.length; i++) {
			System.out.print(air.ar[i] + " ");
		}System.out.println();
		
		System.out.println(air2.ar.length);
		for (int  i = 0; i <air2.ar.length; i++) {
			air2.ar[i] = i * 10;
		}
		for (int  i = 0; i <air2.ar.length; i++) {
			System.out.print(air2.ar[i]+ " ");
		}System.out.println();
		
		air.ar = new int[8]; // 기존의 값 전부 삭제
		for (int  i = 0; i <air.ar.length; i++) {
			System.out.print(air.ar[i]+ " ");
		}System.out.println();
		
		
		System.out.println(air.num);
		System.out.println(air2.num);
		air.num = 1000;
		System.out.println(air.num);
		System.out.println(air2.num);
		
//		int[] ar;
//		System.out.println("-----");
//		ar = new int[10];
//		// ar을 사용했다고 치고
//		// 이전의 10개는 사라진다.
//		// 그리고 새로운 20개가 생성된다.
//		ar = new int[20]; //new는 메모리 요청
//		// 메모리 반납 코드 => C에서는 delete ar;로 반납을 요청해야하지만 자바에서는 알아서 자동으로 반납시켜준다.
//		
	}
}
//원래는 클래스 1개당 파일 1개
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex26)
/*
public class Hello {
	public static void main(String[] args) {
		// 0 0 0 0 0 0 앞과 뒤의 데이터의 합, 교환은 연속적으로 데이터를 저장해놓고 해결해야한다.
		Random rnd = new Random();
		int num = 50;
		int[] ar = new int[num];
		for (int i = 0; i < ar.length; i++) {
			// 데이터 갱신(초기화)
			ar[i] = rnd.nextInt(20);
		}
		//이 사이에 많은 추가 코드가 많이 입력되어 있는 것이 정상이므로 데이터 갱신과 출력은 같이 놓지 않는다.
		for (int i = 0;i<ar.length;i++) {
			// 데이터 출력
			System.out.print(ar[i] + " ");
		}System.out.println();// 규칙을 알아내기 위해 데이터의 나열은 의미 있는 행동이다.
		
		for (int i = 0; i < ar.length/2; i++) {
			System.out.print(ar[i] + ar[num-1-i] + " ");
		}
		System.out.println();
		//ar[0]+ ar[9]
		//ar[1]+ ar[8]
		//ar[2]+ ar[7]
		//ar[3]+ ar[6]
		//ar[4]+ ar[5]
	}
}*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex25) 배열(array)
/*
import java.util.Random;

public class Hello {
	public static void main(String[] args) {
		//2차원 배열은 잘 사용하지 않는다.
		// 1. 정석, new를 할 때 같은 형이여야 한다.
		int[] arr = new int[4]; //(4*4)byte 메모리. 디폴트로 0이 삽입이 되어있다.
		int arr0, arr1, arr2, arr3; // 위의 경우와 같다.
		// 2. 초기화한 만큼 메모리 확보. 예제 샘플에서나 쓰는 경우이다.
		//작으면 백만 단위 많으면 억 단위로 메모리 확보를 하기 때문에 거의 사용 x
		int[] brr = new int[] {10, 20, 30}; // 자동으로 3개의 메모리가 만들어진다.
		// 3. 제외.
		int[] crr = {10, 20, 30}; // int를 상속받아서 가능한건가? 
		//웬만해서는 1번 방법만 쓴다.
		
		// arr은 변수가 10개 있다.
		// ex)1
		arr = new int[10]; //arr은 4byte값의 주소를 저장하는 값일 뿐이다. (스택에 있는?)
		arr[0] = 10;
		System.out.println(arr[0]);
		System.out.println(arr[1]); // 초기값
		//메모리 초기화를 안시키고 주기 때문에 C가 JAVA보다 더 빠르다.
		//그러나 JAVA가 C 보다 안정화 되어있다.
		arr[9] = 20; // 사용할 수 있는 수는 선언한 n의 -1개
		System.out.println(arr[9]);
		
		//ex2)
		//0-9
		//arr[-5] = 100; //중단됨
		//arr[10] = 100;
		//ArrayIndexOutOf~ 프로그램이 중단되어 호랑이 출력 불가능
		System.out.println("호랑이");
		
		//ex3) 변수 사용 및 산술연산 가능
		int num = 4;
		arr[num*2-7] = 999;
		System.out.println(arr[1]);
		
		//ex4)
		arr[5] = 7;
		arr[arr[5]] = 888; // 배열번호 7번에 넣겠다는 의미.
		System.out.println(arr[7]);
		arr[arr[5]*2-7] = 777;
		System.out.println(arr[7]);
		
		//ex5
		System.out.println("-----------------------");
		System.out.println(arr.length);
		
		//ex6)
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " "); //보통 ln을 쓰지 않고 띄어쓰기로
		}System.out.println(); // 줄바꿈을 이런 식으로 스코프 뒤에 넣는다.
		System.out.println("독수리");
	}
}*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex24
/*
public class Hello {
	public static void main(String[] args) {
		Random rnd = new Random();
		for(int i =0;i<10;i++) {
			System.out.println(rnd.nextInt(10));
		}
		
		int num = rnd.nextInt(30);
		switch (num%2) {
		case 0:{//한 줄 이상일 경우 이렇게 작성한다.
			for (int i = 0; i < 10; i++) {
				System.out.println("구구단 " + num+" * "+i+" = " + num*i);
			}
			
		}break;
		
		case 1: {
			int sum = 0;
			for (int i = 0; i <= num; i++) {
				sum += i;
				
			}
			System.out.println(num+ "까지 합은 " + sum);
		}break;
		
		default: break;
		}
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex23
public class Hello {
	public static void main(String[] args) {
		int score = 87;
		switch (score/ 10) {
		case 10://break
			//10이나 9나 A로 출력하기 위해 break생략.
			//의도인지 아닌지 알기 위해 break 주석 단다.
		case 9:
			System.out.println("A");
		case 8:
			System.out.println("B");
		case 7:
			System.out.println("C");
		case 6:
			System.out.println("D");
		case 5:
			System.out.println("F");
		default:
			
		}
	}
}*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex22
public class Hello {
	public static void main(String[] args) {
		//1. switch 안에 변수를 사용할 수 있다.
		//2. case 뒤에 변수를 사용할 수 없다.
		//3. break를 생략하면 switch를 빠져나오지 않는다. 생략하면 break 나올 때까지 갈긴다.
		//4. 만족하는 분기문이 없을 때는 default로 이동한다. 안넣어도 상관X
		//5. 정수, 문자, 문자열 모두 분기가 가능하다.
		//6. 의도적으로 break를 생략하기도 한다.
		int num = 90;
		int nn = 10;
		char ch = '한';
		switch (ch) {
		//case nn: >> 사용할 수 없다.
		case '한': {
			System.out.println(1);
			//break; 이렇게 생략하면 20까지 나온다. 
		}
		case '만': {
			System.out.println(2);
			break;
		}
		case 30: {
			System.out.println(3);
			break;
		}
		default:
			System.out.println("호랑이");
			break;
		}
	}
}*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex21)
public class Hello {
	public static void main(String[] args) {
		Random rnd = new Random(); // 표준 제공 외부 클래스

		int num = rnd.nextInt();

		if (num < 0) {// for문을 쓸 수 없다.
			num = -num;// -값이 나올 수 있으므로.
		}
		System.out.println(num);
		int count = 0;
		while (true) {
			count += num % 10;
			num = num / 10;
			if (num == 0) {
				break;
			}
		}
		System.out.println(count);
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex20)
/*
public class Hello {// 우박수
	public static void main(String[] args) {
		int num = 12312;
		
		while(true) {
			System.out.println(num);
			if(num % 2 == 0) {
				num = num /2;
			}
			else {
				num = num*3+1;
			}// 전형적인 3항 연산 코드
			
			System.out.println(num);
			num = (num % 2 == 0) ? num / 2:num * 3 + 1;
			if( num == 1) {
				System.out.println(num);
				break;
			}
		}
	}
}*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex19) while( 비슷하게 사용: for)
public class Hello {
	public static void main(String[] args) {
		int num = 0;
		while( true ) {
			// 무한 반복하면 빨간 색 버튼이 뜬다. 이 빨간 색 버튼은 프로그램이 실행 중이라는 뜻이다.
			// debug에 보면 프로그램 실행 중에 실행이 안되는 줄 알고 한번 더 누르면 2개가 떠서 알 수 있다.
			// 이 중 하나만 종료 시켜버리면 1개가 남는데 그 또한 디버그로 알 수있다.
			// 디버그 창에 terminate remove로 다 꺼버리면 된다.
			num++;
			System.out.println(num);
			
		}
	//System.out.println("호랑이");//에러가 뜬다. while문에 true가 있어 벗어나지 않기 때문에
	
		int num2 = 0;
		while(num2<4) { // 반복회수를 아는 데 while문을 쓰는 것은 권장하지 않는다.
			System.out.println(num2);
			num2++;
		}
		int num3 = 0;
		while(true) {
			//이렇게 조건문을 걸어서 안에서 빠져나오게 하는 것이 정석
			if(num3 == 4) { //그러나 이렇게 반복횟수를 알면 while문 사용은..권장되지 않는다.
				System.out.println("탈출 전");
				break;
				//System.out.println("unreach code");
			}
			System.out.println(num3);//출력이 안된다. 바로 break 만나서 빠져버리기 때문에
			num3++;
		}
		
	}
	// even 일 때 n = n*3+1 , odd 일 때 n = n/2 우박수(우박떨어지는 그래프 형태로). 결국 1로 떨어진다.
	// 이것의 반복 회수를 알 수 있는가? 이것을 모른다 할 수 있으므로 while문을 써야한다.
	// 패스워드 맞을 때 까지 입력받을 때 같은 경우 while문.(입력 제한 제외하고)
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex18-2
/*public class Hello {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {//항상 세로와 관련
			for (int j = 0; j < 4; j++) {//항상 가로와 관련
				//가로를 반복하는 것을 세로만큼.
				System.out.print("* ");//ln을 빼서 줄바꿈을 하지 않는다.
			}
			System.out.println();// 이중 for문은 알고리즘의 대표적인
		}
		System.out.println();
		System.out.println("------------------------");
		for (int i = 0; i < 3; i++) {//항상 세로와 관련
			for (int j = 0; j < 4; j++) {//항상 가로와 관련
				//가로를 반복하는 것을 세로만큼.
				System.out.print("["+i+" "+j+"]");//ln을 빼서 줄바꿈을 하지 않는다.
				//규칙만 파악하면 쉽다. 이 규칙을 볼 때 둘이 더해서 짝수만 파악하면 체스판을 만들 수 있다.
			} 
			System.out.println();// 이중 for문은 알고리즘의 대표적인
		}
		System.out.println("------------------------");
		int width =8;
		int height = 3;
		for (int i = 0; i < height; i++) {//항상 세로와 관련
			for (int j = 0; j < width; j++) {//항상 가로와 관련
				if((i+j)%2 == 0) {// 위의 예시로 규칙을 파악해서 if문 작성
					System.out.print(" O ");
				}
				else {
					System.out.print(" X ");
				}
				
				system.out.print((i+j)%2 == 0?" 0 ":" x ");
				//이것도 이렇게 삼항연산으로 줄일 수 있다.
			} 
			System.out.println();// 이중 for문은 알고리즘의 대표적인
		}
		
		System.out.println("-----------");
		int result;
		if(3>2) {
			result = 10;
		}
		else {
			result = 20;
		}
		// 항상 if else는 받는 값이 동일하다고 생각되는 순간 무조건 삼항연산으로 수정한다.
		result = (3>2) ? 10:20; //위와 동일하다. else가 콜론이라고 생각하며 쉽다.
		//(3>2) ? result = 10: result = 20; 이는 틀리다.
		
		int func() {
			if( 3> 2) {
				return 100;
			}else {
				return 200;
			}
			//(3>2)?return 100: return 200; 잘못된 코드
			return (3>2) ? 100: 200; //이게 맞다.
		}
		
		
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex18-1
public class Hello {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("-----------------------");
			for (int j = 0; j < 4; j++) {
				System.out.println("1");
			}
			System.out.println("**************************");
		}
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex17
/*public class Hello {
	public static void main(String[] args) {
		int num = 5;
		for (int i = 0; i < 10; i++) {
			System.out.println(num +" * " +i + " = " + num*i);
		}//num을 바꿔 구구단 7단으로 바꾸고 for문 자체를 안건들이는 식으로 외부변수의 값을 바꿀때
		//잘 짠 코드이다.
		System.out.println("--------------------------------");
		
		
		int sum = 0;
		int num2 = 1000;
		for(int i = 1; i <= num2; i++) {
			//sum = sum + i;
			sum += i;
			//System.out.println(sum);
			//num2를 넣어서 for문을 건들이지 않고 100까지의 값을 구했다.
		}
		System.out.println(sum);
		
		int sum2 = 1;
		int a = 3, b= 4;
		//2의 8승
		for (int i = 0; i < b; i++) {
			sum2 *= a;
			// ? = 1 * 2
			// ? = (1*2)*2
			// ? = (1*2)*2)*2
		}
		
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex 16
/*public class Hello {
	public static void main(String[] args) {
		//유형 1
		for (int i = 0; i < 4; i++) {
			//첫번째 인자로 , 두번 째 인자는 if문 틀리면 탈주 아니면 실행 후 3번째 인자로 가서 증감
			//break문을 만나면 바로 탈주
			//continue는 그 자리에서 바로 3번째 인자로 다시 가버린다.
			//for문을 봤을 때 바로 몇번 돌 지 알 수 있어야한다.
		}
		//유형2
		for (int i = 1; i<= 4; i++) {
			System.out.println(i);
			//두번째가 무조건 눈으로 딱 봤을 때 반복 횟수여야 한다.
		}
		//유형3
		for (int i = -3; i<= 3; i++) {
			System.out.println(i);
			//원점을 기준으로 좌표축 계산을 할 때 사용
			//또는 이 경우가 위 두 경우보다 최적화에서 훨씬 유리해서 바꾸는 경우가 있다.
		}
		//위의 3개의 경우 말고는 조건문 쓰이는 방식은 별로다.
		
		for (int i = 32; i<= 100; i+=18) {
			
		}
		for (int i = 32; i> 2; i--) {
			//이렇게 알 수 없는 for문 조건문이 나오는 이유는 블록안에 로직을 만들어놓고
			//for문의 조건을 만들기 때문이다.
		}
	}
}*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*ex15
public class Hello {
	public static void main(String[] args) {
		int score = 87;
		if(score >= 90) {
			System.out.println(1);
		} else if(score >= 80) {
			System.out.println(2);
		} else if(score >= 70) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}// swich로 바꾸는 것이 원칙이다.(swich가 원하는 라인으로 바로 점프해서 안정적인 속도를 낸다.)
		//else if는 순차적으로 다 물어봐서 느린 면이 있다. 그래서 이걸 이용하는 프로그램이 많지 않다.
		
		if(false) {
			System.out.println(1);
		} else if(false) {
			System.out.println(2);
		} else if(false) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}// 여러 if 중 1개의 if만 사용 가능
	}
}*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex14
public class Hello {
	public static void main(String[] args) {
		// 1. if() {}
		// 2. if() {} else {}
		// 3. if() {} else if() else if() {}
		int num = 10;
		if(num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
		int password = 1234;
		if(password != 1234) {
			System.out.println("틀림");
		} else {
			System.out.println("맞음");
			System.out.println("유저가 로그인 하였음");
			System.out.println("다음 정보 확인");
		}//if else는 짜짱 짬뽕과 같은 상황만 해야함. 즉 짜장 아니면 일요일은 안된다.
		//항상 저울 같이 유지되야하는데 예를 들어 위처럼 한 부분만 무거우면 안된다.
		password = 1234;
		if(password != 1234) {
			System.out.println("틀림");
			//break; return; exit(); continue; 형식으로 빠져나가야함
		} 
			System.out.println("맞음");
			System.out.println("유저가 로그인 하였음");
			System.out.println("다음 정보 확인");
		//이렇게 되야한다.
//============================================================			

			int nn = 10;
			if(nn<10) {
				nn = - nn;
			}else {
				nn = +nn;
			}
			
			nn = 10;
			if(nn<10) {
				nn = - nn;
			}
			nn = +nn; // 배운대로라면 이것이 맞아야 하나 else를 안푼 것이 맞는 부분이다.
			// 속도의 변화가 있기 때문이다. 들어갈지 안들어갈지 모르기 때문이다.
			while() {
				if(nn<10) {
					nn = - nn;
				}else {
					nn = +nn;
				}
			}//이렇게 해서 측정해보면 else가 없을 때 시간이 불안정하다. sin()같은 함수를
			//사용함에 있어서 일정한 시간이 유지되야하는 것이 중요하기 때문이다.	
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex13
public class Hello {
	public static void main(String[] args) {
		System.out.println();
		if(3>2) {
			System.out.println();
			if( 3 != 4){
				System.out.println();
			}
			if( 3+4 >= 9) {
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex12
/*public class Hello {
	public static void main(String[] args) {
		// if, for, while, switch: >> >> do while(사용 안함.)
		형식: () {
					
				}
		if(조건) {
			
		}
		
		if(true) {
			System.out.println(1);
			System.out.println(9);
		}
		if(false) {
			System.out.println(2);
			System.out.println(13);
		}
		System.out.println(3);
		System.out.println("-----------------");
		if(true) {
			System.out.println(6);
			if(false) {
				System.out.println(7);
			}
			System.out.println(8);
		}
		
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex9)
public class Hello {
	public static void main(String[] args) {
		// C -> 알고리즘을 타고 온다. , Java를 이용한 억지 알고리즘 책은 있으나 알고리즘이 없다.
		// Java는 알고리즘을 라이브러리 시켰기 때문이다.
		int a = 10, b = 20;
		int t; // temp
		System.out.println(a + " " + b);
		t = a; // t = 10
		a = b; // a = 20
		b = t; // b = 10
		System.out.println(a + " " + b);
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex8)
/*public class Hello {
	public static void main(String[] args) {
		int n = 10;
		n = 20;
		System.out.println(n);
		// ex1)
		n = n + 10;
		System.out.println(n);
		// ex2) 더 빠르다(컴파일(기계어 번역) 속도).내부적으로 stack을 이용하기 때문에 위 경우 보다 이 경우가 빠름.
		// 실행 속도는 같다.
		n += 10;
		System.out.println(n);
		
		n = n + 1;
		n += 1; // 명령이 add(+) 가 들어가고 move라는 연산이 들어간다.
		n++; //실행 속도가 제일 빠르다. 제일 빠른 어셈블러 명령을 사용하기 때문에.
		++n;
		
		n = 10;
		int a, b;
		a = n++; // 대입 증가
		// a = 10, n= 11
		System.out.println(a + " " + n);
		n = 10;
		b = ++n; // 증가 대입
		System.out.println(n + " " + b);
		// a = 11, n = 11
		
		//func(a){}, func(10) 은 값의 전달이라기 보다는 a=10 이라는 것이다.
		//func(a){}, func(b++) 을 하면 증가된 값이 전달되는 것이 아닌 것이다.
		
		//string s = new string("abc")
		//f(string s) == f(new string("abc"))
		//잠시만.. string a = new string(a)가 public string(new string(a))라는 뜻?
		
	}
}*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex8)
public class Hello {
	public static void main(String[] args) {
		//1. 변수이름은 중복될 수 없다.
		int apple;
		//int apple; (x)
		
		//2. 대소문자 구분된다.
		int Apple;
		
		//3. 첫글자가 숫자가 아니라면 숫자 사용가능
		int Apple123;
		// int 9Apple; 첫 글자 숫자 불가능
		
		//4. _ $ 2개를 제외하면 특수문자 사용 불가능
		int apple_num; //변수의 합성
		int _34; //3행 4열을 34라 표현할 때 _를 사용.
		
		//5. 한글 사용 가능(가급적 피한다.)
		int 사과 = 10;
		System.out.println(사과);
		
		//6. 단어 합성시에는 카멜 표기법 사용
		int bananaNumber = 10;
		
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex6,7)
	public class Hello {
	public static void main(String[] args) {
		//메모리의 요청(주소를 알아야하므로)
		//byte: 메모리 1개 주세요  , short 2개 ,int 3개 주세요, long 4개주세요 : 정수 관련
		//보통 int가 적절한 범위라서 사용한다.
		byte apple;
		// 메모리 1개 주세요 애플이라는 이름으로. 숫자를 변경시킬 수 있으므로 변수라고 함 반대는 상수
		// = 을 대입연산자
		apple = 10;
		System.out.println(apple);
		apple = 20;
		System.out.println(apple);
		//apple = 200; 에러가 뜬다. +- 128~127이라서. 128은 불가능하다.
		
		
		// short 타입
		// banana 변수(variable)
		// = 대입 연산자
		// 20 리터럴(=을 이용해 대입되는 무언가)
		short banana = 20; // 주황색 줄은 사용하지 않을 메모리를 왜 달라고 하는지 묻는 것
		
		int orange = 30;//20억 넘어야 에러 뜸
		
		long kiwi = 2222222;
		
		// byte 단위 boolean(1), char(2), float(4 소숫점), double(8)
		boolean t1 = true;// false
		char t2 = 'A';//문자 1개 단위 관리
		char t3 = '한';
		char t4 = 65; //가능하지만 사용x (가독성이 떨어진다.)
		System.out.println(t2);
		System.out.println(t3);
		System.out.println((int)t2);
		System.out.println((int)t3); //이 순간만은 int로 봐달라
		System.out.println((char)(t3+1));//글자 수는 45000개 .그래서 char는 2byte지만 0~60000까지 표현가능하다.
		System.out.println(Character.MIN_VALUE);//?가 뜬다..casting을 해야한다.
		System.out.println((int)Character.MAX_VALUE);
		
		char a = 'A', b =20;
		System.out.println(a+b);//지금처럼 산술적으로 사용하는 것이 아닌 A 다음 20번째 문자가 뭐냐는 식의 사용만 하자
		
		float t5 = 3.14f; //마지막에 f가 무조건 있어야 한다. 4 byte
		double t6 = 3.14; //double은 f를 뺀다. f의 유무에 따라 나뉜다.
		//더 정밀한 것을 double로 쓰는 것인가..? 어차피 오차는 나는데 
		//오차의 유효범위를 줄이기 위해서 사용하는 것이 맞는가? 메모리의 진화로
		//오픈 라이브러리에서는 double을 사용한다.
		
		//위의 8개 타입이 기본 타입. 이 외에 없다.
		float sum = 0.0f;
		for (int i = 0 ; i<100;i++) {
			sum = sum + 0.1f;
		}
		System.out.println(sum); // 결과적으로 오차가 나온다. double로 바꾸도 해결이 안됨.
		double sum1 = 0.0;
		for (int i = 0 ; i<100;i++) {
			sum1 = sum1 + 0.1;
		}
		if(sum==10.0f){
		System.out.println("안된다.");
		}//묻는 거 자체가 불법이다.
		
		System.out.println(sum1);
	}
}*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex5)
public class Hello {
	public static void main(String[] args) {
		//메모리 안의 전구 1개 = 1 bit , 이것이 8개 모이면 8 bit= 1 byte 이것이 하나의 메모리 이것이 모이면 램
		//2, 4, 8, 16 byte 단위로 메모리 요청 가능.
		//2^n(전구의 개수)가 표현할 수 있는 상태의 개수. 1byte = 2^8=256을 외워서 손해 안봄.
		//전구의 상태는 다 꺼진 상태 0부터 다 커진 상태까지의 경우의 수 7까지 표시
		//그러므로 2^8이 0~255까지 표현
		//-4 -3 -2 -1 +1 +2 +3 +4
		// 0  1  2  3  4  5  6  7 이면 -측은 0이 없으므로 -측에서 +4를 없앤다
		//그래서 범위가 -2^(n-1)~+(2^(n-1))-1 즉 1byte는 범위가 -128~127이다.
		//2byte 는
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);//2byte +-3만
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);//4byte +-20억
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);//4byte +-20경
		System.out.println(Long.MAX_VALUE);
		//블록 지정 밑 crtl + i 는 줄맞춤
		
		
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
//ex4
public class Hello {
	public static void main(String[] args) {
		//대소 관계: >, >=, <, <=, ==,!=
		System.out.println(10>7);
		System.out.println(7>=7);
		System.out.println(15<=15);
		System.out.println(12!=12);
		System.out.println(1==1);
		System.out.println("-----------------");
		//논리 연산: &&(and), ||(or)
		System.out.println(false||false);
		System.out.println(false||true);
		System.out.println(true||false);
		System.out.println(true||true);
		System.out.println("-----------------");//보기 편하게
		System.out.println(false&&true);
		System.out.println(false&&false);
		System.out.println(true&&true);
		System.out.println(true&&false);
		//1. 산술 2. 비교 3. 논리 연산 순서대로 일어난다.
		System.out.println(3+2>7 && 2+6<8);
		// 결국 마지막은 논리연산이 끝나므로 true 아니면 false 값이 뜬다.
		System.out.println(!true);//!()는 부정의 의미
		System.out.println(!(3>2));//사각현 안에 x를 넣었는지 묻는 코드에!를 붙여
		// 사각현 안에 x코드가 있느냐? 또는 밖에 x가 있느냐 묻는 식으로 묻기 위해
		// !(GameOver) = T/F를 하면 GameOver의 반대말이 없으므로 GameOver가 아니냐?
		// 라고 물을 때 사용
	}
}
*/


//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//ex3
/*
 public class Hello {
 
	public static void main(String[] args) {
	//연산 종류
	System.out.println(1+2);
	System.out.println(3-4);
	System.out.println(5*6);
	System.out.println(5/4);
	System.out.println(7%6);// 1777%7을 하면 0~6 사이만 구할 수 있다.
	//1234에서 %10을 이용해서 4뽑고 3뽑고 2뽑고 1뽑을 수 있다.
	//%는 강력하게 잘 사용된다.
	System.out.println(3+4*5);//곱, 나눗셈이 더 우선이다.
	System.out.println((3+4)*5);//()를 이용해 우선 순위 가능.
	System.out.println((2+3)*(4+5));//연산 우선 순위를 이용해서.
	
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// ex2)
/*
public class Hello {
	public static void main(String[] args) {
		System.out.println(100); //정수
		System.out.println('한'); //''로 덮는 문자.반드시 한개 이상
		System.out.println("호랑이"); //문자열
		System.out.println(100+200); //숫자+숫자
		System.out.println(100+"호랑이"); //숫자+문자 = 문자열
		System.out.println("호랑이"+100); //문자+숫자 = 문자열
		System.out.println("동물의 왕"+": 사자"); //문자열+문자열 = 문자열
		System.out.println("100"); //문자열
		System.out.println("100"+100); //문자열
		System.out.println(10+20+"30"); //왼->오
		System.out.println("호랑이"+10+20); //결국 연산 작동은 일어나지 않는다
		System.out.println(10+" "+20+" "+30); // 여러 값 한꺼번에 보기
		System.out.println(10+'A'); // 문자는 산술연산이 일어나면 아스키 코드로 치환
		System.out.println(1+'A'); // 
		System.out.println((char)(1+'A'));// B가 나온다. 타입 캐스팅이라고 부른다.
	}
}
*/



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// ex1)
/*
  public class Hello { public static void main(String[] args) {
  
  System.out.println(1000); //출력 시스템(메소드) System.out.println(1000); //출력
  시스템(메소드)
  
  System.out.println(); System.out.println(); }//하나의 블록.
  
  }
*/