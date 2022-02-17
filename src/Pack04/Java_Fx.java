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

	//������ ����� �޴� ��찡 ó���̶� lunch�� static�̰� start�� static�̿��߸� �ϴ°��� ���� ����� ����� �� ����.
	public static void main(String[] args) {
		launch(); //���������� start ȣ�� => ������ ���� ���� ��İ� ��� =>Launch()�� �翬�� static�̴�.
	}
}
 */

/*
public class Java_Fx extends Application{ 

	@Override
	public void start(Stage arg0) throws Exception {

		//���� UI�� Drag �� Drop ������� ����ؾ� �ϴµ� �̷� ������ �ڵ带 �Ἥ UI�� �׷��� ��������.
		HBox root = new HBox(); // �θ� ������ VBox(Vertical Box) => ���̾ƿ� ����
		// ũ�⸦ ����
		root.setPrefSize(400, 300);
		root.setSpacing(10);

		Button btn1 = new Button("��ư1");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("ȣ����.....");	
			}
		});

		root.getChildren().addAll(btn1);

		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("ȣ����");
		arg0.show(); // ������ ��ϵ� ���� ȭ�鿡 ���
	}

	//������ ����� �޴� ��찡 ó���̶� lunch�� static�̰� start�� static�̿��߸� �ϴ°��� ���� ����� ����� �� ����.
	public static void main(String[] args) {
		launch(); //���������� start ȣ�� => ������ ���� ���� ��İ� ��� =>Launch()�� �翬�� static�̴�.
	}
}
*/



/*
class Tiger extends Thread{
	Button btn;
	Tiger(Button btn){//��Ʈ���� ������ ���� �� ������ �׸�ŭ �ڵ尡 ����������. ��� �ؾ��ұ�? This�� �̿��Ѵ�.
		this.btn=btn;
	}
	public void run() {
		System.out.println("������ ����");
		System.out.println("������ ����");
		Platform.runLater( ()-> {
		btn.setText("ȣ����");//btn1�� �𸣰� ������ ������ �����. => �ذ� ��� 1. �����ڸ� �̿��Ѵ�(����).
	});
	}
}
*/



//ex89)
public class Java_Fx{
	public static void main(String[] args) {
		System.out.println("����� ����");
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		System.out.println("��ο� ����");
	}
	//�ΰ��� Ŭ������ �����ų ��� ���� �� ���� ���� �ܼ� => �� �ܼ� => ���� => ���÷��� ������ ���� ���� �ܼ� ����
	//��Ʈ�� ����Ʈ + S ��ü ����
	//�� �ַܼ� �ϳ��� ���α׷���  �ܼ� 2����  ���� �б����� ���� �� �ִ�(�ٸ� â ��ȯ�� ���� ���� ����. 
}










/*
//ex88-7)
class Tiger extends Thread{
	Java_Fx Java_Fx;
	Tiger(Java_Fx Java_Fx){//��Ʈ���� ������ ���� �� ������ �׸�ŭ �ڵ尡 ����������. ��� �ؾ��ұ�? This�� �̿��Ѵ�.
		this.Java_Fx=Java_Fx;
	}
	public void run() {
		System.out.println("������ ����");
		System.out.println("������ ����");
		Platform.runLater( ()-> {
		Java_Fx.btn1.setText("ȣ����");//btn1�� �𸣰� ������ ������ �����. => �ذ� ��� 1. �����ڸ� �̿��Ѵ�(����).
		Java_Fx.btn2.setText("��");
	});
	}
}

public class Java_Fx extends Application{ 

	Button btn1;
	Button btn2;
	@Override
	public void start(Stage stage) throws Exception {//arg0�� stage�� �����ߴ�.

		//���� UI�� Drag �� Drop ������� ����ؾ� �ϴµ� �̷� ������ �ڵ带 �Ἥ UI�� �׷��� ��������.
		HBox root = new HBox(); // �θ� ������ VBox(Vertical Box) => ���̾ƿ� ����
		// ũ�⸦ ����
		root.setPrefSize(400, 300);
		root.setSpacing(10);
		
		btn1 = new Button("��ư1");
		btn2 = new Button("��ư2");
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
		stage.setTitle("ȣ����");
		stage.show(); // ������ ��ϵ� ���� ȭ�鿡 ���
	}

	//������ ����� �޴� ��찡 ó���̶� lunch�� static�̰� start�� static�̿��߸� �ϴ°��� ���� ����� ����� �� ����.
	public static void main(String[] args) {
		launch(); //���������� start ȣ�� => ������ ���� ���� ��İ� ��� =>Launch()�� �翬�� static�̴�.
	}
}
*/
/*
//ex88-6)
public class Java_Fx extends Application{ 

	@Override
	public void start(Stage arg0) throws Exception {


		//���� UI�� Drag �� Drop ������� ����ؾ� �ϴµ� �̷� ������ �ڵ带 �Ἥ UI�� �׷��� ��������.
		HBox root = new HBox(); // �θ� ������ VBox(Vertical Box) => ���̾ƿ� ����
		// ũ�⸦ ����
		root.setPrefSize(400, 300);
		root.setSpacing(10);

		// ���1 
		//---------------------------------------------------------------------------------------------
		// Swing�̶� �򰥸��� ���� JavaFx�� �� ���� Import
		Button btn1 = new Button("��ư1");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new Thread() { //Thread t = new Thread(); t.start()�� �ʿ���� �ٷ� new �ؼ� .start�� �ٷ� ����ߴ�.
					@Override
					public void run() {
						// TODO Auto-generated method stub
						System.out.println("������ ����");
						Platform.runLater( ()-> {
							btn1.setText("ȣ����"); //������ �ȿ��� ��Ʈ�� ��ȯ�� �̿��� ���� �̷� ������
						} );
						System.out.println("������ ����");
					}
				}.start();
			}
		});
		
		root.getChildren().addAll(btn1);



		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("ȣ����");
		arg0.show(); // ������ ��ϵ� ���� ȭ�鿡 ���
	}

	//������ ����� �޴� ��찡 ó���̶� lunch�� static�̰� start�� static�̿��߸� �ϴ°��� ���� ����� ����� �� ����.
	public static void main(String[] args) {
		launch(); //���������� start ȣ�� => ������ ���� ���� ��İ� ��� =>Launch()�� �翬�� static�̴�.
	}
}
*/
/*
//88-5)
public class Java_Fx extends Application{ 

	@Override
	public void start(Stage arg0) throws Exception {


		//���� UI�� Drag �� Drop ������� ����ؾ� �ϴµ� �̷� ������ �ڵ带 �Ἥ UI�� �׷��� ��������.
		HBox root = new HBox(); // �θ� ������ VBox(Vertical Box) => ���̾ƿ� ����
		// ũ�⸦ ����
		root.setPrefSize(400, 300);
		root.setSpacing(10);

		// ���1 
		//---------------------------------------------------------------------------------------------
		// Swing�̶� �򰥸��� ���� JavaFx�� �� ���� Import
		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				btn1.setText("ȫ�浿");
				btn2.setText("ȫ�浿");//�ٸ� ��Ʈ���� ���� �����ϴ�.
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) { //�Ӽ��� ����
				// TODO Auto-generated method stub
				//btn1.setVisible(false);
//				btn1.setDisable(true);
//				btn1.setVisible(!btn1.isVisible());
				btn1.setVisible(!btn1.isDisable());
			}
		});
		//SOLID�� �������̽� �и� ��Ģ�� ���� �������.

		root.getChildren().addAll(btn1, btn2);



		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("ȣ����");
		arg0.show(); // ������ ��ϵ� ���� ȭ�鿡 ���
	}

	//������ ����� �޴� ��찡 ó���̶� lunch�� static�̰� start�� static�̿��߸� �ϴ°��� ���� ����� ����� �� ����.
	public static void main(String[] args) {
		launch(); //���������� start ȣ�� => ������ ���� ���� ��İ� ��� =>Launch()�� �翬�� static�̴�.
	}
}

*/

/*EX 88-4
 * ä�� ���α׷� UI
public class Java_Fx extends Application{ 

	@Override
	public void start(Stage arg0) throws Exception {


		VBox root = new VBox(); // �θ� ������ VBox(Vertical Box) => ���̾ƿ� ����
		// ũ�⸦ ����
		root.setPrefSize(400, 300);
		root.setSpacing(10);

		// ���1 
		//---------------------------------------------------------------------------------------------
		// Swing�̶� �򰥸��� ���� JavaFx�� �� ���� Import
		Button btn1 = new Button("��ư1");
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("ȣ����.....");	
			}
		});

		TextArea textArea = new TextArea();
		
		
		TextField textField = new TextField();
		//text �ʵ�� ����Ʈ�� ���͸� ĥ �� handle �̺�Ʈ�� �Ͼ�� ���� ������ �Ǿ��ִ�.
		textField.setOnAction(new EventHandler<ActionEvent>() {@Override
			public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub
			//System.out.println("�޹���");
			String s = textField.getText();
			textField.setText("");
			//System.out.println(s);
			textArea.appendText(s+"\n");
			}
		});

		root.getChildren().addAll(btn1, textField, textArea);


		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("ȣ����");
		arg0.show(); // ������ ��ϵ� ���� ȭ�鿡 ���
	}

	//������ ����� �޴� ��찡 ó���̶� lunch�� static�̰� start�� static�̿��߸� �ϴ°��� ���� ����� ����� �� ����.
	public static void main(String[] args) {
		launch(); //���������� start ȣ�� => ������ ���� ���� ��İ� ��� =>Launch()�� �翬�� static�̴�.
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



		//���� UI�� Drag �� Drop ������� ����ؾ� �ϴµ� �̷� ������ �ڵ带 �Ἥ UI�� �׷��� ��������.
		HBox root = new HBox(); // �θ� ������ VBox(Vertical Box) => ���̾ƿ� ����
		// ũ�⸦ ����
		root.setPrefSize(400, 300);
		root.setSpacing(10);

		// ���1 
		//---------------------------------------------------------------------------------------------
		// Swing�̶� �򰥸��� ���� JavaFx�� �� ���� Import
		Button btn1 = new Button("��ư1");
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("ȣ����.....");	
			}
		});
		Button btn2 = new Button("��ư2");
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("����.....");	
			}
		});
		//SOLID�� �������̽� �и� ��Ģ�� ���� �������.

		root.getChildren().addAll(btn1);



		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("ȣ����");
		arg0.show(); // ������ ��ϵ� ���� ȭ�鿡 ���
	}

	//������ ����� �޴� ��찡 ó���̶� lunch�� static�̰� start�� static�̿��߸� �ϴ°��� ���� ����� ����� �� ����.
	public static void main(String[] args) {
		launch(); //���������� start ȣ�� => ������ ���� ���� ��İ� ��� =>Launch()�� �翬�� static�̴�.
	}
}

 */


/*
//ex 88-2
public class Java_Fx extends Application{ 

	@Override
	public void start(Stage arg0) throws Exception {
		//���� UI�� Drag �� Drop ������� ����ؾ� �ϴµ� �̷� ������ �ڵ带 �Ἥ UI�� �׷��� ��������.
		HBox root = new HBox(); // �θ� ������ VBox(Vertical Box) => ���̾ƿ� ����
		// ũ�⸦ ����
		root.setPrefSize(400, 300);
		root.setSpacing(10);

//		// ���1 
//		//---------------------------------------------------------------------------------------------
//		// Swing�̶� �򰥸��� ���� JavaFx�� �� ���� Import
//		Button btn1 = new Button("��ư1");
//		root.getChildren().add(btn1);
//		Button btn2 = new Button("��ư2");
//		root.getChildren().add(btn2);


		//---------------------------------------------------------------------------------------------
		// ���2
		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		Button btn3 = new Button("��ư3");
		root.getChildren().addAll(btn1, btn2, btn3);



		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("ȣ����");
		arg0.show(); // ������ ��ϵ� ���� ȭ�鿡 ���
	}

	//������ ����� �޴� ��찡 ó���̶� lunch�� static�̰� start�� static�̿��߸� �ϴ°��� ���� ����� ����� �� ����.
	public static void main(String[] args) {
		launch(); //���������� start ȣ�� => ������ ���� ���� ��İ� ��� =>Launch()�� �翬�� static�̴�.
	}
}
 */






/*
// 1. Layout
// 2. Control => �Ӽ�(����, ��� ����, �β�, ��Ʈ ����, ��Ʈ ũ��), �̺�Ʈ(�׼�, �޼���, Ŭ��, ȣ�� �׼�(��Ŀ�� ��ġ), �Է�(���� ���� Max, ���� �ϳ� �Է�)) => �Ϸ��� ��ǵ�

//ex 88-1-1
public class Java_Fx extends Application{ 

	@Override
	public void start(Stage arg0) throws Exception {
		//���� UI�� Drag �� Drop ������� ����ؾ� �ϴµ� �̷� ������ �ڵ带 �Ἥ UI�� �׷��� ��������.

		VBox root = new VBox(); // �θ� ������ VBox(Vertical Box) => ���̾ƿ� ����
		// ũ�⸦ ����
		root.setPrefSize(400, 300);
		//---------------------------------------------------------------------------------------------

		// ������ �ڵ带 �ۼ��ؼ� ��ġ�� ����(UI �׸���)

		//������ ������ Ŭ���� �ȿ� ���� ������ �ʴ� ��ġ�� ����Ѵ�.---------------------------------------------------
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("ȣ����");
		arg0.show(); // ������ ��ϵ� ���� ȭ�鿡 ���
	}

	//������ ����� �޴� ��찡 ó���̶� lunch�� static�̰� start�� static�̿��߸� �ϴ°��� ���� ����� ����� �� ����.
	public static void main(String[] args) {
		launch(); //���������� start ȣ�� => ������ ���� ���� ��İ� ��� =>Launch()�� �翬�� static�̴�.
	}
}

 */
/*
//ex88-1) ������ó�� Java_Fx�� �θ��� Lauch�� start()�� �����ϴ� �����̴�.
public class Java_Fx extends Application{ 
	//1 -> 2 -> 3 -> Exit ������� ��µȴ�.
	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println(2);
		arg0.show();
		System.out.println(3);
	}

	//������ ����� �޴� ��찡 ó���̶� lunch�� static�̰� start�� static�̿��߸� �ϴ°��� ���� ����� ����� �� ����.
	public static void main(String[] args) {
		System.out.println(1);
		launch(); //���������� start ȣ�� => ������ ���� ���� ��İ� ��� =>Launch()�� �翬�� static�̴�.
		System.out.println("Exit");
	}
}

 */






























/*
//���� ���� �׽�Ʈ ��Ű������ ���� ������ ����ƽ�̸� ���İ� ����ƽ�̰� �׷� ������ ��İ� ����ϰ� ��ó ���� start()�� ����Ǿ �츮�� ������ start�� ����Ǵ� �̷��ε�
// ��°�� start�� ��� ���� �� ������ static�� ����� �ȵǴµ�? ����� start�� ����ƽ�� �ƴϰ� A �ڱ� �ڽ��� ��üȭ ��Ű�� �ű⿡ find �Լ��� B�� ã�Ƽ� A�� �ְ�
// ��ĳ�������� ���� A�� start()�� B�� start�� ��ü�ǰ� B�� lunch�� ���� ��Ű�� lunch�ȿ� A�� start()�� ����Ǵµ� ������ B�̹Ƿ� �츮�� ������ start�� ����Ǵ� ���� ������ �κ�.
// find�� Class<?> cls = Class.forName("Pack01.Hello");�� ���� �̿��ߴ�? =>unhandle exception�̹Ƿ� try catch�� ����.
// ���� ���� �� forNama�� ������ �ڽ�(A)�� ��� ���� �ֵ� �߿� �ڽŰ� ���� start()�� cls.getMethod("start",null)�� ã�ƶ� �Ѵ�. �ι�° �μ��� ������ ���ȴ�.
//Method m = clas.getMehod ("start");�� try catch�� �̿��� ����ִ´�. => �޼ҵ� ��� ���..�����ص���. => B�� start�� public���� ���� �ص־� ã�´�.

// Hello Ŭ������ ã�� �� �̿��ϴ� ��� (find())
//try{
//Class<?> cls;
//cls = Class.forName("Pack01.Hello);
//
//Constructor<?> constructor = cls.getConstructor();
//Object obj = constructor.newInstance();
//Method start = clas.getMehod ("start", ����� ã�� �ִ� �Լ��� �޴� ���� ���� Ÿ���� . start()�� �����Ƿ� ���� �ʴ´�. ex)String.class );
//start.invoke(obj,�ѱ� ���� �׷��� start()�� �����Ƿ� ���� �ʴ´�.); //=> start�Լ��� ȣ��
//}
//catch(Exception){
//e.printstackTrace();
//}


�� Static�� ���(�� �κ��� ����)
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
		System.out.println("����");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		lunch();


	}

}//JavaFx�� Static ���� ����
 */