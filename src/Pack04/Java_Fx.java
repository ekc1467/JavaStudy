package Pack04;



import java.util.Scanner;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/*
public class Java_Fx extends Application{ 

	@Override
	public void start(Stage arg0) throws Exception {
		arg0.show();
	}

	//메인이 상속을 받는 경우가 처음이라서 lunch가 static이고 start가 static이여야만 하는가에 대한 논란이 생기는 것 같다.
	public static void main(String[] args) {
		launch(); //내부적으로 start 호출 => 스레드 내부 구현 방식과 비슷 =>Launch()도 당연히 static이다.
	}
}
 */

/*
public class Java_Fx extends Application{ 

	@Override
	public void start(Stage arg0) throws Exception {

		//요즘 UI는 Drag 와 Drop 방식으로 사용해야 하는데 이런 식으로 코드를 써서 UI를 그려서 버려졌다.
		HBox root = new HBox(); // 부모 설정을 VBox(Vertical Box) => 레이아웃 설정
		// 크기를 설정
		root.setPrefSize(400, 300);
		root.setSpacing(10);

		Button btn1 = new Button("버튼1");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("호랑이.....");	
			}
		});

		root.getChildren().addAll(btn1);

		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("호랑이");
		arg0.show(); // 씬으로 등록된 것을 화면에 출력
	}

	//메인이 상속을 받는 경우가 처음이라서 lunch가 static이고 start가 static이여야만 하는가에 대한 논란이 생기는 것 같다.
	public static void main(String[] args) {
		launch(); //내부적으로 start 호출 => 스레드 내부 구현 방식과 비슷 =>Launch()도 당연히 static이다.
	}
}
*/



/*
class Tiger extends Thread{
	Button btn;
	Tiger(Button btn){//컨트롤을 여러개 받을 수 있지만 그만큼 코드가 더러워진다. 어떻게 해야할까? This를 이용한다.
		this.btn=btn;
	}
	public void run() {
		System.out.println("스레드 시작");
		System.out.println("스레드 종료");
		Platform.runLater( ()-> {
		btn.setText("호랑이");//btn1을 모르게 때문에 오류가 생긴다. => 해결 방법 1. 생성자를 이용한다(주입).
	});
	}
}
*/



//ex89)
public class Java_Fx{
	public static void main(String[] args) {
		System.out.println("여기는 월드");
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		System.out.println("헬로우 종료");
	}
	//두개의 클래스를 실행시킬 경우 오른 쪽 위에 오픈 콘솔 => 뉴 콘솔 => 선택 => 디스플레이 뉴에서 보고 싶은 콘솔 선택
	//컨트롤 시프트 + S 전체 저장
	//핀 콘솔로 하나의 프로그램을  콘솔 2개로  돌려 분기점을 정할 수 있다(다만 창 전환을 누른 것을 잊지. 
}










/*
//ex88-7)
class Tiger extends Thread{
	Java_Fx Java_Fx;
	Tiger(Java_Fx Java_Fx){//컨트롤을 여러개 받을 수 있지만 그만큼 코드가 더러워진다. 어떻게 해야할까? This를 이용한다.
		this.Java_Fx=Java_Fx;
	}
	public void run() {
		System.out.println("스레드 시작");
		System.out.println("스레드 종료");
		Platform.runLater( ()-> {
		Java_Fx.btn1.setText("호랑이");//btn1을 모르게 때문에 오류가 생긴다. => 해결 방법 1. 생성자를 이용한다(주입).
		Java_Fx.btn2.setText("개");
	});
	}
}

public class Java_Fx extends Application{ 

	Button btn1;
	Button btn2;
	@Override
	public void start(Stage stage) throws Exception {//arg0을 stage로 변경했다.

		//요즘 UI는 Drag 와 Drop 방식으로 사용해야 하는데 이런 식으로 코드를 써서 UI를 그려서 버려졌다.
		HBox root = new HBox(); // 부모 설정을 VBox(Vertical Box) => 레이아웃 설정
		// 크기를 설정
		root.setPrefSize(400, 300);
		root.setSpacing(10);
		
		btn1 = new Button("버튼1");
		btn2 = new Button("버튼2");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Tiger t = new Tiger(Java_Fx.this);
				t.start();
			}
		});

		root.getChildren().addAll(btn1,btn2);

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("호랑이");
		stage.show(); // 씬으로 등록된 것을 화면에 출력
	}

	//메인이 상속을 받는 경우가 처음이라서 lunch가 static이고 start가 static이여야만 하는가에 대한 논란이 생기는 것 같다.
	public static void main(String[] args) {
		launch(); //내부적으로 start 호출 => 스레드 내부 구현 방식과 비슷 =>Launch()도 당연히 static이다.
	}
}
*/
/*
//ex88-6)
public class Java_Fx extends Application{ 

	@Override
	public void start(Stage arg0) throws Exception {


		//요즘 UI는 Drag 와 Drop 방식으로 사용해야 하는데 이런 식으로 코드를 써서 UI를 그려서 버려졌다.
		HBox root = new HBox(); // 부모 설정을 VBox(Vertical Box) => 레이아웃 설정
		// 크기를 설정
		root.setPrefSize(400, 300);
		root.setSpacing(10);

		// 방법1 
		//---------------------------------------------------------------------------------------------
		// Swing이랑 헷갈리지 말고 JavaFx로 된 것을 Import
		Button btn1 = new Button("버튼1");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new Thread() { //Thread t = new Thread(); t.start()할 필요없이 바로 new 해서 .start로 바로 사용했다.
					@Override
					public void run() {
						// TODO Auto-generated method stub
						System.out.println("스레드 시작");
						Platform.runLater( ()-> {
							btn1.setText("호랑이"); //스레드 안에서 컨트롤 변환을 이용할 때는 이런 식으로
						} );
						System.out.println("스레드 종료");
					}
				}.start();
			}
		});
		
		root.getChildren().addAll(btn1);



		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("호랑이");
		arg0.show(); // 씬으로 등록된 것을 화면에 출력
	}

	//메인이 상속을 받는 경우가 처음이라서 lunch가 static이고 start가 static이여야만 하는가에 대한 논란이 생기는 것 같다.
	public static void main(String[] args) {
		launch(); //내부적으로 start 호출 => 스레드 내부 구현 방식과 비슷 =>Launch()도 당연히 static이다.
	}
}
*/
/*
//88-5)
public class Java_Fx extends Application{ 

	@Override
	public void start(Stage arg0) throws Exception {


		//요즘 UI는 Drag 와 Drop 방식으로 사용해야 하는데 이런 식으로 코드를 써서 UI를 그려서 버려졌다.
		HBox root = new HBox(); // 부모 설정을 VBox(Vertical Box) => 레이아웃 설정
		// 크기를 설정
		root.setPrefSize(400, 300);
		root.setSpacing(10);

		// 방법1 
		//---------------------------------------------------------------------------------------------
		// Swing이랑 헷갈리지 말고 JavaFx로 된 것을 Import
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				btn1.setText("홍길동");
				btn2.setText("홍길동");//다른 컨트롤을 제어 가능하다.
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) { //속성의 제어
				// TODO Auto-generated method stub
				//btn1.setVisible(false);
//				btn1.setDisable(true);
//				btn1.setVisible(!btn1.isVisible());
				btn1.setVisible(!btn1.isDisable());
			}
		});
		//SOLID의 인터페이스 분리 법칙을 따라 만들었다.

		root.getChildren().addAll(btn1, btn2);



		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("호랑이");
		arg0.show(); // 씬으로 등록된 것을 화면에 출력
	}

	//메인이 상속을 받는 경우가 처음이라서 lunch가 static이고 start가 static이여야만 하는가에 대한 논란이 생기는 것 같다.
	public static void main(String[] args) {
		launch(); //내부적으로 start 호출 => 스레드 내부 구현 방식과 비슷 =>Launch()도 당연히 static이다.
	}
}

*/

/*EX 88-4
 * 채팅 프로그램 UI
public class Java_Fx extends Application{ 

	@Override
	public void start(Stage arg0) throws Exception {


		VBox root = new VBox(); // 부모 설정을 VBox(Vertical Box) => 레이아웃 설정
		// 크기를 설정
		root.setPrefSize(400, 300);
		root.setSpacing(10);

		// 방법1 
		//---------------------------------------------------------------------------------------------
		// Swing이랑 헷갈리지 말고 JavaFx로 된 것을 Import
		Button btn1 = new Button("버튼1");
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("호랑이.....");	
			}
		});

		TextArea textArea = new TextArea();
		
		
		TextField textField = new TextField();
		//text 필드는 디폴트로 엔터를 칠 때 handle 이벤트가 일어나는 것이 설정이 되어있다.
		textField.setOnAction(new EventHandler<ActionEvent>() {@Override
			public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub
			//System.out.println("앵무새");
			String s = textField.getText();
			textField.setText("");
			//System.out.println(s);
			textArea.appendText(s+"\n");
			}
		});

		root.getChildren().addAll(btn1, textField, textArea);


		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("호랑이");
		arg0.show(); // 씬으로 등록된 것을 화면에 출력
	}

	//메인이 상속을 받는 경우가 처음이라서 lunch가 static이고 start가 static이여야만 하는가에 대한 논란이 생기는 것 같다.
	public static void main(String[] args) {
		launch(); //내부적으로 start 호출 => 스레드 내부 구현 방식과 비슷 =>Launch()도 당연히 static이다.
	}
}

*/

/*
//ex 88-3) UI: JAVAFX
//interface A<T>{
//	void f1();
//}
//
//class Tiger{
//	void f100(A<Integer> t) {
//		t.f1();
//	}
//}
public class Java_Fx extends Application{ 

	@Override
	public void start(Stage arg0) throws Exception {

//		A<Integer> t = new A<Integer>() {
//			public void f1() {
//				
//			}
//		};

//		Tiger tiger = new Tiger();
//		tiger.f100(new A<Integer>{
//			public void f1() {
//				System.out.println("test");
//			}
//		});



		//요즘 UI는 Drag 와 Drop 방식으로 사용해야 하는데 이런 식으로 코드를 써서 UI를 그려서 버려졌다.
		HBox root = new HBox(); // 부모 설정을 VBox(Vertical Box) => 레이아웃 설정
		// 크기를 설정
		root.setPrefSize(400, 300);
		root.setSpacing(10);

		// 방법1 
		//---------------------------------------------------------------------------------------------
		// Swing이랑 헷갈리지 말고 JavaFx로 된 것을 Import
		Button btn1 = new Button("버튼1");
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("호랑이.....");	
			}
		});
		Button btn2 = new Button("버튼2");
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("사자.....");	
			}
		});
		//SOLID의 인터페이스 분리 법칙을 따라 만들었다.

		root.getChildren().addAll(btn1);



		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("호랑이");
		arg0.show(); // 씬으로 등록된 것을 화면에 출력
	}

	//메인이 상속을 받는 경우가 처음이라서 lunch가 static이고 start가 static이여야만 하는가에 대한 논란이 생기는 것 같다.
	public static void main(String[] args) {
		launch(); //내부적으로 start 호출 => 스레드 내부 구현 방식과 비슷 =>Launch()도 당연히 static이다.
	}
}

 */


/*
//ex 88-2
public class Java_Fx extends Application{ 

	@Override
	public void start(Stage arg0) throws Exception {
		//요즘 UI는 Drag 와 Drop 방식으로 사용해야 하는데 이런 식으로 코드를 써서 UI를 그려서 버려졌다.
		HBox root = new HBox(); // 부모 설정을 VBox(Vertical Box) => 레이아웃 설정
		// 크기를 설정
		root.setPrefSize(400, 300);
		root.setSpacing(10);

//		// 방법1 
//		//---------------------------------------------------------------------------------------------
//		// Swing이랑 헷갈리지 말고 JavaFx로 된 것을 Import
//		Button btn1 = new Button("버튼1");
//		root.getChildren().add(btn1);
//		Button btn2 = new Button("버튼2");
//		root.getChildren().add(btn2);


		//---------------------------------------------------------------------------------------------
		// 방법2
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		root.getChildren().addAll(btn1, btn2, btn3);



		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("호랑이");
		arg0.show(); // 씬으로 등록된 것을 화면에 출력
	}

	//메인이 상속을 받는 경우가 처음이라서 lunch가 static이고 start가 static이여야만 하는가에 대한 논란이 생기는 것 같다.
	public static void main(String[] args) {
		launch(); //내부적으로 start 호출 => 스레드 내부 구현 방식과 비슷 =>Launch()도 당연히 static이다.
	}
}
 */






/*
// 1. Layout
// 2. Control => 속성(글자, 배경 색상, 두께, 폰트 종류, 폰트 크기), 이벤트(액션, 메세지, 클릭, 호버 액션(포커스 위치), 입력(글자 개수 Max, 글자 하나 입력)) => 일련의 사건들

//ex 88-1-1
public class Java_Fx extends Application{ 

	@Override
	public void start(Stage arg0) throws Exception {
		//요즘 UI는 Drag 와 Drop 방식으로 사용해야 하는데 이런 식으로 코드를 써서 UI를 그려서 버려졌다.

		VBox root = new VBox(); // 부모 설정을 VBox(Vertical Box) => 레이아웃 설정
		// 크기를 설정
		root.setPrefSize(400, 300);
		//---------------------------------------------------------------------------------------------

		// 실제로 코드를 작성해서 배치를 설정(UI 그리기)

		//실제로 보여질 클래스 안에 눈에 보이지 않는 배치를 등록한다.---------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("호랑이");
		arg0.show(); // 씬으로 등록된 것을 화면에 출력
	}

	//메인이 상속을 받는 경우가 처음이라서 lunch가 static이고 start가 static이여야만 하는가에 대한 논란이 생기는 것 같다.
	public static void main(String[] args) {
		launch(); //내부적으로 start 호출 => 스레드 내부 구현 방식과 비슷 =>Launch()도 당연히 static이다.
	}
}

 */
/*
//ex88-1) 스레드처럼 Java_Fx도 부모의 Lauch가 start()를 실행하는 형태이다.
public class Java_Fx extends Application{ 
	//1 -> 2 -> 3 -> Exit 순서대로 출력된다.
	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println(2);
		arg0.show();
		System.out.println(3);
	}

	//메인이 상속을 받는 경우가 처음이라서 lunch가 static이고 start가 static이여야만 하는가에 대한 논란이 생기는 것 같다.
	public static void main(String[] args) {
		System.out.println(1);
		launch(); //내부적으로 start 호출 => 스레드 내부 구현 방식과 비슷 =>Launch()도 당연히 static이다.
		System.out.println("Exit");
	}
}

 */






























/*
//내가 만든 테스트 패키지에서 위의 메인이 스태틱이면 런쳐가 스태틱이고 그럼 스레드 방식과 비슷하게 런처 안의 start()가 실행되어서 우리가 설정한 start가 실행되는 이론인데
// 어째서 start는 상속 받을 수 있을까 static은 상속이 안되는데? 사실은 start는 스태틱이 아니고 A 자기 자신을 객체화 시키고 거기에 find 함수로 B를 찾아서 A에 넣고
// 업캐스팅으로 인해 A의 start()는 B의 start로 대체되고 B가 lunch를 실행 시키면 lunch안에 A의 start()가 실행되는데 내용은 B이므로 우리가 지정한 start가 실행되는 것을 실험한 부분.
// find는 Class<?> cls = Class.forName("Pack01.Hello");를 대충 이용했다? =>unhandle exception이므로 try catch를 넣자.
// 내가 봤을 때 forNama에 공식은 자신(A)를 상속 받은 애들 중에 자신과 같은 start()를 cls.getMethod("start",null)로 찾아라 한다. 두번째 인수는 있으면 사용된다.
//Method m = clas.getMehod ("start");를 try catch를 이용해 집어넣는다. => 메소드 얻는 방법..생각해두자. => B의 start를 public으로 설정 해둬야 찾는다.

// Hello 클래스를 찾을 때 이용하는 방식 (find())
//try{
//Class<?> cls;
//cls = Class.forName("Pack01.Hello);
//
//Constructor<?> constructor = cls.getConstructor();
//Object obj = constructor.newInstance();
//Method start = clas.getMehod ("start", 여기는 찾고 있는 함수가 받는 인자 값의 타입을 . start()는 없으므로 넣지 않는다. ex)String.class );
//start.invoke(obj,넘길 인자 그러나 start()는 없으므로 넣지 않는다.); //=> start함수를 호출
//}
//catch(Exception){
//e.printstackTrace();
//}


즉 Static은 어떻게(윗 부분은 생략)
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
 */