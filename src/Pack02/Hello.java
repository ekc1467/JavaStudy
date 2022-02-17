package Pack02;

import java.io.*; // 별을 붙이면 전체를 의미.



/*
class Tiger{

}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
	}
}
*/


//ex78)
class Tiger{

}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
	}
}





/*
//ex77)
class Tiger{
	private int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}


class Lion{
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}

class Cat{
	private float data;

	public float getData() {
		return data;
	}

	public void setData(float data) {
		this.data = data;
	}
	
}

class Dog<T>{ // 사용될 타입을 객체 생성할 때 알려주는 것을 제네릭이라고 한다.
	T data;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}

//이렇게도 사용 가능하다. 문자나 개수 정의 가능하다.
class Dragon<U, K>{
	U data;
	public U getData() {
		return data;
	}
	public void setData(U data) {
		this.data = data;
	}
}

public class Hello {
	public static void main(String[] args) {
		//Dog안의 T는 전부 Integer가 된다. <>를 컨테이너라고 부른다.
		//Dog<int> gt1= new Dog<int>(); int 같은 프리미어 타입은 절대 불가능이다. 클래스 타입만 가능하다.
		Dog<Integer> gt1= new Dog<Integer>(); // new 쪽 <Integer>를 생략할 수 있지만 직관성을 위해 생략하지 말자
		gt1.setData(100);
		//Dog<Float>
		Dog<Float> gt2= new Dog<Float>(); 
		gt2.setData(2.22f);
		//Dog<Boolean>
		
		Tiger t1 = new Tiger();
		t1.setData(100);
		System.out.println(t1.getData());
		
		Lion t2 = new Lion();
		t2.setData("호랑이");
		System.out.println(t2.getData());
		
		Cat t3 = new Cat();
		// 필드의 형태를 string에서 float하려면 죽었다 깨어나도 이렇게 바꿀 수 밖에 없다. 그러나 제네릭을 이용히면 된다.
		t3.setData(3.14f);		
		System.out.println(t3.getData());
	}
}

*/

/*
//ex76) bmp파일을 read, bmp파일을 직접 만들 수 있으면.
public class Hello {
	public static void main(String[] args) {
		try {
			//java.io.FileNotFoundException 라는 예외가 발생하면 경로나 파일 이름 오타이다.
			Reader reader = new FileReader("sample.txt");
			System.out.println(1000);
			//int java.io.Reader.read() throw IOException
			//int readData = reader.read();
			
			while(true) {
				int readData = reader.read();
				if(readData == -1) { //파일 끝이면 공식 룰처럼 -1이 리턴된다. EOF
					System.out.println("끝까지 모두 읽음");
					break;
				}
				System.out.println((char)readData);
			}

			//System.out.println((char)readData);

			reader.close();

		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(2000);
	}
}

*/


/*
 * public class Hello {
	
static void m1() {
		
	}
	public static void main(String[] args) {
		
		m1(); // 클래스 객체를 실행 할 필요없이 main이 static으로 이루어져 바로 생성되어 m1 또한 static으로 실존 되어있어야만 사용 가능하며
		//main 함수 안의 모든 내용도 new 같이 바로 실존 시키는 내용만 가능하다.
	}
}
*/


/*
//ex75)
public class Hello{
	public static void main(String[] args) {
		int height = 5;
		int width = 6;
		for (int i = 0; i < height; i++) {//항상 세로와 관련
			for (int j = 0; j < width; j++) {//항상 가로와 관련
				if((i+j)%2 == 0) {// 위의 예시로 규칙을 파악해서 if문 작성
					System.out.print(" o ");
				}
				else {
					System.out.print(" x ");
				}
				
				//System.out.print((i+j)%2 == 0?"O ":"X ");
				//이것도 이렇게 삼항연산으로 줄일 수 있다.
			} 
			System.out.println();// 이중 for문은 알고리즘의 대표적인
		}
		
		try {
			//open : 리소스를 얻어내는 과정. 보통 close 쪽과 쌍을 이루는 경우가 많아서 항상 생각해줘야 한다.
			// 이미 파일 명이 존재하면 덮어서 씌운다. => 업캐스팅 => F3으로 보면 OutputStreamWriter를 상속 받았고 OutputStreamWriter이 상속 받은 것은 Writer이다.
			Writer writer = new FileWriter("sample.txt");
			for (int i = 0; i < height; i++) {//항상 세로와 관련
				for (int j = 0; j < width; j++) {//항상 가로와 관련
			writer.write((i+j)%2 == 0?"O ":"X ");
				}
				writer.write("\n");
			}
			
			
			//close : 안하면 경고가 뜬다.
			writer.close();
		}
		catch(Exception e) {
			
		}
	}
}

*/

/*
//ex74)

class Tiger{

}
public class Hello {
	public static void main(String[] args){
		System.out.println(1);
		
		//파일 입출력은 펜을 쓰기위해 뚜겅을 열고 닫듯이. 이유는
		// 자바와 관련없이 시스템 상 파일을 한꺼번에 열수 있는 개수 제한이 있다. 반드시 닫아야 한번에 쓸 수 있는 자원이 줄어들지 않는다. (그림판, 포토샵 등의 파일을 열고 이용하는 다른 응용 프로그램들이 돌지 못한다.)
		try {
			//open : 리소스를 얻어내는 과정. 보통 close 쪽과 쌍을 이루는 경우가 많아서 항상 생각해줘야 한다.
			// 이미 파일 명이 존재하면 덮어서 씌운다. => 업캐스팅 => F3으로 보면 OutputStreamWriter를 상속 받았고 OutputStreamWriter이 상속 받은 것은 Writer이다.
			Writer writer = new FileWriter("sample.txt");
			
			writer.write("apple");
			writer.write("\n");//줄 바꿈.
			writer.write("호랑이");
			//writer.write(null);
			
			//close : 안하면 경고가 뜬다.
			writer.close();
		}
		catch(Exception e) {
			
		}
		
		System.out.println(2);
	}
}

*/
//ex73)
/*
class Tiger{
	
	

}
public class Hello {
	static int m1() {
		return 100;
	}
	static void m2(int a, int b) {
		System.out.println("호랑이1");
		if(a > b) {
		System.out.println("호랑이3");
		}
		else {
			//함수 실행 중단.
			return;
		}
		System.out.println("호랑이3");
	}
	static void m3(int a, int b) {
		try {if(a>b) {
			System.out.println("호랑이1");
		}
		else {
			return;}
		
		return;
		} catch(Exception e)
		{
			//함수 실행 중단.
			return;
		}finally {System.out.println("호랑이3");
			
		}
	}
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		
		System.out.println(m1());
		m2(1, 2); // 중단이 됐음에도 호랑이 3을 출력하고 싶다면?
		m3(1, 2); // final을 쓰면 return이던 else던 오류가 발생하던 무조건 실행되므로 호랑이3이 출력된다.
//		try {
//			System.out.println(2/1);
//		} catch (Exception e) {
//			System.out.println(1);
//		//finally는 무조건 실행된다.
//		} finally { 
//			System.out.println(2);
//		}
		System.out.println(3);
	}
}



*/


/*
 * //ex72)
class Tiger{
	
}
public class Hello {
	public static void main(String[] args) {
		for( int i = 0 ; i<4 ; i++) {
			//sleep 또한 에러를 이용해서 try catch를 사용해야한다.
			//자바와 데이터 베이스 연결을 할 때 밑의 현상이 많이 일어나는데(Unhandle 예외) 이렇게 방어를 많이한다.
			try {Thread.sleep(1000);}catch(Exception e) { // 1000 ms == 1, 단 줄로 많이 쓴다.
				
			}
		}
		
		
	}
}
*/


/*
//ex71) 예외를 프로그래머가 직접 발생 시킬 수 있다.
class Tiger{
	//방법 1
	void f1(){
		System.out.println("함수 1");
		
		try {
			//에러를 던지는 놈이 있으면 받는 놈이 있어야 한다. 이 경우 catch가 받는다.
			throw new Exception(); //오류 발생 시키기
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//방법2
	void f2() throws Exception { // Exception을 쓰면 이 함수를 호출하는 측에서 받아라는 뜻. 예외 떠넘기기.
		System.out.println("함수 2");
		 //Exception을 쓰면 이 함수를 호출하는 측에서 받아라는 뜻. 예외 떠넘기기.
		throw new Exception(); // 오류 발생키기기
		//받는 측에서 해결하는 2번 방법이 많이 쓰인다. 이유는 받는 측에서 무슨 오류인지 확인하고 해결할 때 catch에서 거의 대응해서 해결하기 때문이다.
	}
}



public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.f1();
		System.out.println("호랑이1");
		
//		//Unhandled exception => 사용하는 사람이 받아라.
//		//에러가 뜨는 빨간 줄 옆에 전구를 보면 Unhandled exception이라고 뜬다.
//		t1.f2();
		
		try{
			t1.f2();
		}catch(Exception e) {
			
		}
		System.out.println("호랑이2");
		
	}
}
public class Hello{
	public static void main(String[] args) throws Exception { 3. 운영 체제에 떠넘겨버린다.
		
	}
}
*/


//ex70) // 실제로 try catch를 사용하지는 않는다.
/*class Tiger{

}

public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		
		//int[] ar = new int[3];// 0 1 2
		
		// 1. 배열 인덱스 범위를 벗어났다. 예외 에러 메시지가 출력된다.
		// ArrayIndexOutOfBoundsException
		// ar[3] = 10; 
		
		// 2. java.lang.ArithmeticException
		// System.out.println(5 / 0);
		
		// 3. NullPointerException
		String s = null;
		// s.length();
		
		//예외가 발생하면 프로그램이 중단된다. 예외가 발생하면 프로그래머가 대응하라는 것이다.
		// 처음부터 예외가 발생하면 프로그램을 중단시킨다는 생각을 하면 안된다. 계산기에 예외가 뜨면 종료를 하는 것이 아니라 잘못된 점을 알려주고 진행 해야한다.
//		int[] ar = new int[3];// 0 1 2
//		System.out.println("호랑이1");
//		ar[3] = 10;  // >> 여기서 중단된다.
//		System.out.println("호랑이2");
		
		
		
		
		//예시일 뿐 배열이나 간단한 수학 계산 때문에 try catch를 거는 일은 없다.
		int[] ar = new int[3];// 0 1 2
		System.out.println("호랑이1");
		
		try {
			ar[3] = 10; // >> 여기서 중단이 이제는 안된다.
		} catch (Exception e) {
			//예외가 발생하면 catch 블록으로 들어온다.
			System.out.println("발생");
			//ArrayIndexOutOfBoundsException라는 예외가 있다는 것을 출력한 것이지 에러가 뜬 것이 아니다.
			//e.printStackTrace(); 
		}
		System.out.println("호랑이2");
		
		try {
			System.out.println(5 / 0);
		} catch (Exception e) {
			System.out.println("발생");
		}
		System.out.println("호랑이3");
		
		String s = null;
		try {
			s.length();
		}
		catch(Exception e){
			System.out.println("발생");
		}
		System.out.println("호랑이4");
		
		//위의 4번은 if문을 거는 것이 정상이다.
		
		//s는 현재 코드가 비어있을 지라도 중간에 언제 다른 코드가 삽입 될지도 모르기 때문에 if문으로 방어적인 프로그램을 짜야한다. 
		s = new String("독수리");
		if (s != null) {//null일수도 있고 아닐 수도 있다. API 라이브러리에서는 방어적인 프로그램 식 코딩은 필수이다.
			s.length();
		}
	}
}*/