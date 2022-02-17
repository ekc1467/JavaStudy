package Pack03;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/*
public class Datas_Sructure {
	//자료 구조 -> 데이터 관리 - CRUD.추가적으로 검색도 생각해 볼 수 있으나 R(read)에 포함되어 있고 정렬도 R(read)에 포함이 되어있다.
	//10이 들어가면 C, 무엇이 들어갔는지 확인 해보니 10이 있다 = >read , 10을 30으로 바꾼다 U , 30을 삭제한다.=>D
	//정렬해서 보여주세요 = >R의 정렬, 10<X<30의 X를 보여주요 = > 검색
	//1개를 추가하는 데 기존에 100만개가 있을 때 여러 알고리즘이 있지만 속도가 기준이다. (오라클이 CRUD를 잘 만들었기 때문에 성공했다.)
	//많은 정렬 알고리즘이 발견 되었지만 퀵 정렬까지 발견되었고 퀵 정렬이 조금씩 변경 되어가고 있다. => 어떤 식으로든 빠르면 된다.
	//알고리즘의 속도를 높이는 방식은 정점으로 왔을 정도로 이미 포화가 되었고 다른 방식을 찾다가 특화 시키는 것이였다.
	//EX) C에만 특화된 알고리즘. R에만 특화된 알고리즘(정렬, 검색).등으로 알고리즘을 그룹으로 묶어 나누어 쓴다.
	//=> 물론 CRUD 모든 부분에 사용할 수 있다. 특화만 되었을 뿐이다.
	// 총 8가지의 라이브러리로 나누어졌다. 웬만해서는 정렬과 검색에 특화를 시켜서 사용 중이다.
	// 이 8가지를 전부 묶어서 Collection이라고 한다. 전반적으로 욕을 안먹는 종류 2가지가 Linked List와 Array 두 가지이다. 
	// 게임 등에서 사용될 때 Linked List를 매우 유용하다. => 검색에는 상당히 약하다(이럴 때 ArrayList를 쓰면 된다. ArrayList는 다만 Create에 상당히 약하다.)
	// 한 구조만 제대로 파면 대동소이 해서 비슷비슷하게 사용 가능하다. (그러나 각각의 자료구조에 대해 장단점은 파악해두자.)
}*/












//ex 87)UI(Swing 라이브러리 =(업그레이드)=> JavaFx 라이브러리). 그러나 잘 넘어가지 않는다. 그래서 버려져서 라이브러리를 다운받아 써야한다.
//public class Datas_Sructure extends Application{//Application을 하면 그 상송받은 것들 중 JavaFx가 존재해야 하지만 없는 것을 보니 따로 홈페이지에서 다운받아야 한다.
//	public static void main(String[] args) {
//		https://gluonhq.com/products/javafx/에서 다운받아서 어디든 풀어도 되지만 프로그램 파일 폴더 안의 java 폴터에 풀어서 나온 폴더로 경로 설정으로 추가하는 것이 좋다.
//		프로퍼티 ->자바 빌드 패스 ->모듈 패스 -> add external jaRS -> JARS 파일들 한꺼번에 추가 -> APPLY -> APPLY CLOSE
//		Referenced Libraies 가 패키지 라이브러리 목록 계층에 생성되어 있다.
//		프로젝트 01을 누르고  run as -> run configuration->Arguments -> VM argument에 --module-path "C:\Program Files\Java\javafx-sdk-11\lib"
//--add-modules javafx.controls,javafx.fxml 입력. 다만 프로젝트 마다 매번 설정해줘야한다. 이후 다시 application에 컨트롤 스페이스바를 해보자
//swing과 충돌이 일어나니 확인 해보자
//	}
//}

//평소처럼 main 메소드만 구현하면 에러가 발생하는 데 Application에 구현해야만 하는 abstract가 존재해서이며 자동완성으로 start를 완성시켜 구현한다.
public class Datas_Sructure extends Application{ 
	
	@Override
	public void start(Stage arg0) throws Exception {
		arg0.show();
	}
	
	//메인이 상속을 받는 경우가 처음이라서 lunch가 static이고 start가 static이여야만 하는가에 대한 논란이 생기는 것 같다.
	public static void main(String[] args) {
		launch(); //내부적으로 start 호출 => 스레드 내부 구현 방식과 비슷
	}
}

/*
 * 
 * //ex86)
//전역문을 쓰는 코드에서 if문안에 if문이 있을 때 첫번째 if문을 들어가놓고 실행을 안시킨 후 다른 곳에서 연산해서 값이 바뀐채로 다시 오면 2번 째 조건 문에 내가 생각하지 않은 값으로 돌아와서 내가 설정한 조건문에서 걸려버리는 거 같은
//일들이 벌어질 수 있다. 그럴 때 진행이 끝날 때까지 CS을 할 수 있는데 그동안 다른 프로그램이 정지될 수 있기 때문에 최대한 사용하지 않는 형태로 사용해야한다. 문제를 일으킬 때 디텍팅 하는 문제에서도 CS가 오래걸려버리면 모든 프로그램이 멈춰지는 문제도 생긴다.
// 스레드가 실행될 때 스레드 당 고유 번호가 있다.


//thread가 발생하면 거의 while(true)에 break를 걸릴 때까지 돈다라고 생각하면 된다.
//3개를 실시간(RT)으로 돌려버리면 급 저하되고 20개 쯤 돌면 버벅거린다.
//while에서 어떤식으로든 blocking이 잡힌다.
//main -> while(1) accept(num++;)=> start() 접속을 대기하는 접속 스레드, 접속하면 블로킹이 풀리고 다시 대기자를 기다린다.
// => while read(상대방이 데이터를 던지면 블록킹이 풀리고 다시 대기자를 기다린다.) => 이런 방식이 통신 접속 프로그램 방식



class Tiger extends Thread{
	public void run() {
		System.out.println(1);
	}
}

public class Datas_Sructure {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.start();
		
		Thread t2 = new Tiger();
		t2.start();
		
		Thread t4 = new Thread() {
			public void run() {
				System.out.println(2);
			}
		};//익명 클래스 방식 //익명 함수 방식은 익명 클래스 방식과 다르게 함수를 재정의 하는 것?
		t4.start();
		
		new Thread() {// 익명 객체 방식
			public void run() {
				System.out.println(3);
			}
		}.start();
	}
}

*/

/*
//ex85) 블로깅 함수가 존재할 때 스레드 순서.
//출력 값을 넘기다보면 입력 받고 출력을 해야하는데 다른 입력으로 넘어가버리는 경우가 생긴다. 정말 재수 없으면 입력만 3번 받고 출력만 3번 연속될 수도 있다.
class Lion extends Thread{
	public void run() {
		new Scanner(System.in).nextInt();
		System.out.println("독수리");
	}
}


class Tiger extends Thread{
	public void run() {
		Lion t1 = new Lion();
		t1.start();
		new Scanner(System.in).nextInt();
		System.out.println("코끼리");
	}
}

public class Datas_Sructure {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.start();
		new Scanner(System.in).nextInt();
		System.out.println("호랑이");
	}
}
*/
//ex83)
/*class Tiger extends Thread{
	public void run() {
		for (int i = 0; i< 10; i ++) {
			System.out.println("호랑이 : " + i);
			try {
				System.out.println();
				Thread.sleep(0); // 컴퓨터가 생각하기에 가장 여유있는 시간에 짧게 쉬어라 => 이 시간에 다른 곧에 가서 일하고 싶어한다.
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class Datas_Sructure {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.start();
		for (int i = 0; i <10 ; i++) {
			System.out.println(" 코끼리 : " + i);
			try {Thread.sleep(0);}catch(Exception e) {}
		}
	}
}

*/
/*
//ex83) 스레드 문법이 ex82문법과 같다는 뜻이다.
// 동시에 실행되는 것처럼 보이지만 CPU(메인 프로세서)가 번갈아가며 실행시키는 것이고 이 실행 스케쥴을 Job 스케쥴이라고 하며 운영체제가 정한다.
// 동시에 프로그램들이 구동되는 환경을 멀티 태스킹이라고 한다. 하나의 프로그램 안에 여러 일을 독립으로 돌아가게 하는 것을 thread라고 이 순서도 운영체제가 정한다.
// 메인 프로그램 안에 3개의 일이 있다면 총 4개의 Thread를 사용하게 된다.(즉 4개를 OS가 관리하게 되는 것이다.)
// 하나의 프로세서가 파일을 읽어주는 것과 파일을 얼만큼 읽었는지 동시에 실행하는 것은 불가능하다. 그것이 가능하다면 번갈아가며 하는 것일 뿐이다. 속도가 빨아서 우리 눈에만 동시에 하는 것 처럼 보인다.
// 운영체제는 최대한 적절하게 일을 배분한다.
class Tiger extends Thread{
	public void run() {
		System.out.println("Thread start");// 2
		System.out.println("call");
		System.out.println("Thread end");
	}
	
}

public class Datas_Sructure{
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		// 실행하는 순간 1번과 2번 위치에서 동시에 실행된다(경쟁);
		// main()이 죽어도 계속 실행 중이다. 
		// 대락 백줄 정도를 main에게 줬다가 t1에게 100줄 줄고 하는 방식이다. 
		t1.start(); 
		System.out.println("호랑이"); // 1
	}
}

*/
//ex82)
/*
class A{
	void start() {
			System.out.println("start call");
			run();
	}
	void run() {} // 사실 이런 상태면 abstract 해놓는 게 좋긴한데 예시니깐.
		
	//void run() {System.out.println(" A class Run Call");}
}

class B extends A{
	void run() {
		System.out.println(" B class Run Call");
	}
}

public class Datas_Sructure {
	public static void main(String[] args) {
		A t1 = new B();
		t1.start();// clss A를 보지 못하고 보면 뭔지는 몰라도 부모 class 중 start()가 있다고 볼 수 있다. start를 실행시키면 내(B) run을 실행 시키고 있고 그 뜻은 내 run이 오버라이딩 되고 있다는 것.
		//즉 a는 run이 존재하고 있다는 뜻이다.(왜냐하면 B가 run을 정의해도 A의 함수 start에서 run을 쓰기 위해서는 A 내부에 run 함수가 정의 되고 있어야하기 때문이다.)
	}
}

*/
/*
//81)
public class Datas_Sructure{
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);//입력 시스템을 쓰겠다는 옵션을 인자로 넣어주면 키보드로 입력 가능하다.
		
		Random rnd = new Random();
		//int rnd2 = new Random().nextInt(100); 이렇게 줄여쓸 수 있다.
		
		System.out.println("숫자를 입력하세요");
		// 입력받기 전에 진행되지 않는다. 프로그램의 중단 버튼이 누를 수 있게 활성화 되어있다. 커서가 알아서 아래로 가 있다.
		// nextInt를 블로킹 함수라고 부른다.  블로킹 함수란 약속된 특정 조건이 만족될 때 까지
		// 프로그램이 더 이상 진행하지 못하는 함수이다.(ex. sleep())
		// 블로킹이 되지 않고도 입력을 받을 수 있는 이런 현상들을 비동기라고 한다.(즉 다른 프로그램(함수)들은 멈추지 않고 계속 진행하고 있다.) => 나중에 보게 될 것. 지금은 안미.
		
		for(int i =0; i< 100; i++) {
			int num = sc.nextInt();
			System.out.println(num);
			
			//비용이 더 들긴 하나 어차피 키보드 입력을 기다리기 때문에..이렇게 줄여써도 된다.
			//num = new Scanner(System.in).nextInt();
			if(num==999) {
				break;
			}
			// close하지 않으면 리소스 누수(leak)이 일어나고 있다라는 경고가 온다.
			//즉 객체를 닫아야 한다고 경고 주는 것.
			sc.close();
		}
		
		int num = sc.nextInt(); 
		System.out.println(num);
		num = sc.nextInt(); 
		int num2 = sc.nextInt();
		System.out.println("프로그램을 종료합니다.");
	}
}
*/
/*
//80-2)
class Book{
	String title;
	String author;
	String publisher;
	int price;
	public Book(String title, String author, String publisher, int price) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	//void info() 
	//void showInfo
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", price=" + price + "]";
	}
	
	
}

public class Datas_Sructure {
	//static LinkedList<Book> mm = new LinkedList<Book>(); => static을 사용 해버리면 search() 함수에서 바로 mm 사용가능하지만 코딩 버릇에는 좋지 않다.
	public static void main(String[] args) {
		LinkedList<Book> mm = new LinkedList<Book>();
		//mm.add(100); 관리 객체가 Book이니 당연히 100을 add하는 것은 안된다.
		
		// C(reate)에 해당된다.
		mm.add(new Book("자바를 배운다", "홍길동", "열심히 출판사", 100));
		mm.add(new Book("늦잠 자는법", "김호띵", "열심히 출판사2",150));
		mm.add(new Book("에트리에서 빅데이터란 무엇인가", "김미현", "열심히 출판사3",150));
		mm.add(new Book("자바의 정석", "이권철", "열심히 출판사4",300));
		System.out.println(mm.size());
	
		// R
		//System.out.println(mm);
		for( Book book : mm) {
			System.out.println(book);
		}System.out.println();
		
		// 검색 리딩
		Book oneBook = mm.get(2);
		System.out.println(oneBook);
		
		// U(pdate)
		mm.set(1,  new Book("일찍 깨는 법", "일찍이", " 열심히 출판사2",200));
		for( Book book : mm) {
			System.out.println(book);
		}System.out.println();
		
		//D(elete)
		mm.remove(3);
		for( Book book : mm) {
			System.out.println(book);
		}System.out.println();
		
		System.out.println("------------------------------");
		System.out.println(mm.get(0));
		
		Book findBook = search(mm,"이순신");
		if(findBook != null) {
			System.out.println("찾았다.");
			System.out.println(findBook);
		}else {
			System.out.println("그런 저자 없음..");
		}
	}
	static Book search(LinkedList<Book> mm, String name) {
		for (Book book : mm) {
				if(book.author.equals(name)) {// 원래는 get, set 사용해야하지만 빠른 수업을 위해
					return book;
				}
		}
		
		return null;//for문이 끝나버렸다는 것은 못찾았다는 의미이므로 null대입
	}
}
*/
/*
//80-1)
class Tiger{
	
}

class Lion<T>{
	T age;
	void setAge(T age) {
		this.age = age;
	}
}

public class Datas_Sructure {
	public static void main(String[] args) {
		Lion<Integer> t1 = new Lion<>(); //클래스도 들어갈 수 있다.
	}
}
*/
/*//79-3)
public class Datas_Sructure {
	public static void main(String[] args) {
		LinkedList<Integer> mm= new LinkedList<Integer>();
//		for (int i = 0; i < 6; i++) {
//			mm.add(i*10+i);
//		}
//		mm.add(100);
//		mm.add(102);
//		mm.add(104);
//		mm.add(106);
//		mm.add(108);
		//랜덤으로 확인한다.
		Random rnd = new Random();
		
		for (int i = 0; i < 20; i++) {
			mm.add(rnd.nextInt(100));
		}
		
		System.out.println(mm);
		
		
		// | 
		// 2 3 4 5 6
		for (int i =0; i <mm.size(); ) { // 삭제를 하지 않았을 때만 ++한다는 오래된 기법.
			int num = mm.get(i);
			if(num%2 == 0) {
				mm.remove(i);
			}else {
				i++; 
			}
		}
		System.out.println(mm);
	}
}

*/

/*//79-2)
class Tiger{

}
public class Datas_Sructure {
	public static void main(String[] args) {
		LinkedList<Integer> mm= new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			mm.add(i*10+i);
		}
		mm.add(100);
		mm.add(102);
		mm.add(104);
		mm.add(106);
		mm.add(108);
		System.out.println(mm);
		
		//0번이 지워지면 1번이 0번으로 오기 때문에 제대로 된 검사가 되지 않는다. 즉 제거될 때마다 새로운 인덱스로 조정된다는 것이 문제다.
		for (int i =0; i <10;i++ ) {
			if(mm.get(i)%2 == 0) {
				mm.remove(i);
			}
		}
		System.out.println(mm);
	}
}
*/
/*
//ex79-1) 검색 제거
class Tiger{

}
public class Datas_Sructure {
	public static void main(String[] args) {
		LinkedList<Integer> mm= new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			mm.add(i*10+i);
		}
		System.out.println(mm); //직접 찾아서 삭제를 직접할 줄 알아야 한다. 응용을 위해서.
		
		for (int i =0; i <mm.size();i++ ) {
			if(mm.get(i) == 55) {
				mm.remove(i);
				break;
			}
		}
		System.out.println(mm);
	}
}

*/

//ex78)
//C/C++
//1. 콜렉션 클래스를 내가 만들 수 있는가? => 내가 만들어 보는 걸 자료구조라고 한다.
//Java 자료구조가 없다. => 자바의 철학은 2번이다.
//2. 이미 제작된 클래스를 잘 사용할 수 있는가?
/*public class Datas_Sructure{
	public static void main(String[] args) {
		//int를 할 수도 있고 float를 할 수도 있듯이 하나의 데이터만 관리할 수 없으므로 => 제네릭을 이용한 범용적 사용
		//LinkedList<~> t = new LinkedList<>(); => F3로 들어가면 제네릭으로 구성되어있다.
		
		//CRUD+(검색, 정렬)이 되는 지 확핸 해보면 끝난다. (검색, 정렬은 어차피 R에 포함) => CRUD는 비슷해서 범용적으로 써도 된다 생각.
		//야구르트를 관리해주는 아주머니가 mm이다. 지나가다가 알고 싶은 사람이 카운팅을 하는 것이 아니라 아주머니에게 물어보면 끝나는 것이다.
		// 즉 아주머니를 거쳐서 사용하는 것이다. 야구르트 하나를 주세요 보여주세요 살게요 할 때 아주머니를 거치는 것처럼.
		LinkedList<Integer> mm = new LinkedList<>();
		System.out.println(mm.size());
		// add(), create(), insert() 셋 다 비슷한 의미를 가지는 데 자바는 add()를 이용한다.
		mm.add(100);
		System.out.println(mm.size());
		for (int i = 0; i<10; i++) {
			mm.add(i*10+i);
		}
		System.out.println(mm.size());
		
		// CR(ead)UD ==> Read. 그냥 넘겨버리면 된다. 정확한 문법인 mm.toString()이 되도록 만들어 놓았고 생력되어 있다.
		
		// 1. 읽는 것만 가능해서 활용도가 떨어진다.
		System.out.println(mm);
		
		// 2. 하나씩 읽기. 나온 값을을 가공해서 사용할 수 있으므로 좋다. Read(), get(), select() 셋다 비슷하지만 자바는 get을 이용한다.
		for (int i = 0; i<mm.size();i++) {
			System.out.print(mm.get(i)+" ");
		} System.out.println();
		
		// 3. for 문의 간략화 버전 => 슈가 코드(설탕 코드) => ex) 삼항 연산자.( forEach )
		for (Integer data : mm) { 
			// Integer 타입으로 data에 값을 받는 데 관리자 mm에게 있는 만큼 데이터를 그만큼 받겠다. (이터레이터가 내부에 포함되어 있나?)
			// data: 실제 데이터 아니면 인덱스이다. => 표준화가 안되어 있다. Java에서는 실제 데이터가 넘어온다. 다른 언어에서는 인덱스가 넘어와 그 인덱스를 이용해 데이터를 받는 경우도 있으나 이런 경우는 1% 정도이다.
			System.out.print(data+ " ");
		}System.out.println(); // 데이터를 여러개 관리하는 타입은 전부 for each가 다능하다. ex)배열
		
//		// 배열 예시
//		int[] ar = {10, 20 ,30};
//		for (int data : ar) {
//			System.out.print(data + " ");
//		}System.out.println();
		
//		String s = "오징어게임은 재밌다.";
//		for (char i : s) {
//			
//		} //문자열의 for each는 자바만 불가능하다.
		
		
		int[] ar = {10, 20 ,30};
		// data, item, value 등으로 불리며 index일 겅우는 제외. 셋 다 잘 불리나 value 가 제일 유명. => 이 부분이 리딩과 관련
		for (int data : ar) {
			System.out.print(data + " ");
		}System.out.println();
		
		
		// CRU(PDATE)E
		// set
		mm.set(5, 99); //5번의 내용을 99로 바꿔주세요
		for (int data : mm) {
			System.out.print(data + " ");
		}System.out.println();
		
		// CRUD(elete)
		// delete, erase, remove =>자바에서는 remove를 쓰고 대부분의 언어도 그렇다.
		mm.remove(4);
		for (Integer data : mm) {
			System.out.print(data + " ");
		}System.out.println();
		
		// 검색
		for (int data : mm) {
			if( data == 77) {
				System.out.println("find");
				break;
			}
		}System.out.println();
		
		for (int i = 0; i++ < mm.size(); i++)
		{
			Integer value = mm.get(i);
			if(value == 77) {
				System.out.println(i+" : find");
				break;
			}
			if (i == mm.size() - 1) {
				System.out.println("not found");
				//not found처리를 알아서 해주는 함수가 없다.
			}
		}
		
	}
}

*/
