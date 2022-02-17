package Pack03;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/*
public class Datas_Sructure {
	//�ڷ� ���� -> ������ ���� - CRUD.�߰������� �˻��� ������ �� �� ������ R(read)�� ���ԵǾ� �ְ� ���ĵ� R(read)�� ������ �Ǿ��ִ�.
	//10�� ���� C, ������ ������ Ȯ�� �غ��� 10�� �ִ� = >read , 10�� 30���� �ٲ۴� U , 30�� �����Ѵ�.=>D
	//�����ؼ� �����ּ��� = >R�� ����, 10<X<30�� X�� �����ֿ� = > �˻�
	//1���� �߰��ϴ� �� ������ 100������ ���� �� ���� �˰����� ������ �ӵ��� �����̴�. (����Ŭ�� CRUD�� �� ������� ������ �����ߴ�.)
	//���� ���� �˰����� �߰� �Ǿ����� �� ���ı��� �߰ߵǾ��� �� ������ ���ݾ� ���� �Ǿ�� �ִ�. => � �����ε� ������ �ȴ�.
	//�˰����� �ӵ��� ���̴� ����� �������� ���� ������ �̹� ��ȭ�� �Ǿ��� �ٸ� ����� ã�ٰ� Ưȭ ��Ű�� ���̿���.
	//EX) C���� Ưȭ�� �˰���. R���� Ưȭ�� �˰���(����, �˻�).������ �˰����� �׷����� ���� ������ ����.
	//=> ���� CRUD ��� �κп� ����� �� �ִ�. Ưȭ�� �Ǿ��� ���̴�.
	// �� 8������ ���̺귯���� ����������. �����ؼ��� ���İ� �˻��� Ưȭ�� ���Ѽ� ��� ���̴�.
	// �� 8������ ���� ��� Collection�̶�� �Ѵ�. ���������� ���� �ȸԴ� ���� 2������ Linked List�� Array �� �����̴�. 
	// ���� ��� ���� �� Linked List�� �ſ� �����ϴ�. => �˻����� ����� ���ϴ�(�̷� �� ArrayList�� ���� �ȴ�. ArrayList�� �ٸ� Create�� ����� ���ϴ�.)
	// �� ������ ����� �ĸ� �뵿���� �ؼ� �������ϰ� ��� �����ϴ�. (�׷��� ������ �ڷᱸ���� ���� ������� �ľ��ص���.)
}*/












//ex 87)UI(Swing ���̺귯�� =(���׷��̵�)=> JavaFx ���̺귯��). �׷��� �� �Ѿ�� �ʴ´�. �׷��� �������� ���̺귯���� �ٿ�޾� ����Ѵ�.
//public class Datas_Sructure extends Application{//Application�� �ϸ� �� ��۹��� �͵� �� JavaFx�� �����ؾ� ������ ���� ���� ���� ���� Ȩ���������� �ٿ�޾ƾ� �Ѵ�.
//	public static void main(String[] args) {
//		https://gluonhq.com/products/javafx/���� �ٿ�޾Ƽ� ���� Ǯ� ������ ���α׷� ���� ���� ���� java ���Ϳ� Ǯ� ���� ������ ��� �������� �߰��ϴ� ���� ����.
//		������Ƽ ->�ڹ� ���� �н� ->��� �н� -> add external jaRS -> JARS ���ϵ� �Ѳ����� �߰� -> APPLY -> APPLY CLOSE
//		Referenced Libraies �� ��Ű�� ���̺귯�� ��� ������ �����Ǿ� �ִ�.
//		������Ʈ 01�� ������  run as -> run configuration->Arguments -> VM argument�� --module-path "C:\Program Files\Java\javafx-sdk-11\lib"
//--add-modules javafx.controls,javafx.fxml �Է�. �ٸ� ������Ʈ ���� �Ź� ����������Ѵ�. ���� �ٽ� application�� ��Ʈ�� �����̽��ٸ� �غ���
//swing�� �浹�� �Ͼ�� Ȯ�� �غ���
//	}
//}

//���ó�� main �޼ҵ常 �����ϸ� ������ �߻��ϴ� �� Application�� �����ؾ߸� �ϴ� abstract�� �����ؼ��̸� �ڵ��ϼ����� start�� �ϼ����� �����Ѵ�.
public class Datas_Sructure extends Application{ 
	
	@Override
	public void start(Stage arg0) throws Exception {
		arg0.show();
	}
	
	//������ ����� �޴� ��찡 ó���̶� lunch�� static�̰� start�� static�̿��߸� �ϴ°��� ���� ����� ����� �� ����.
	public static void main(String[] args) {
		launch(); //���������� start ȣ�� => ������ ���� ���� ��İ� ���
	}
}

/*
 * 
 * //ex86)
//�������� ���� �ڵ忡�� if���ȿ� if���� ���� �� ù��° if���� ������ ������ �Ƚ�Ų �� �ٸ� ������ �����ؼ� ���� �ٲ�ä�� �ٽ� ���� 2�� ° ���� ���� ���� �������� ���� ������ ���ƿͼ� ���� ������ ���ǹ����� �ɷ������� �� ����
//�ϵ��� ������ �� �ִ�. �׷� �� ������ ���� ������ CS�� �� �� �ִµ� �׵��� �ٸ� ���α׷��� ������ �� �ֱ� ������ �ִ��� ������� �ʴ� ���·� ����ؾ��Ѵ�. ������ ����ų �� ������ �ϴ� ���������� CS�� �����ɷ������� ��� ���α׷��� �������� ������ �����.
// �����尡 ����� �� ������ �� ���� ��ȣ�� �ִ�.


//thread�� �߻��ϸ� ���� while(true)�� break�� �ɸ� ������ ���ٶ�� �����ϸ� �ȴ�.
//3���� �ǽð�(RT)���� ���������� �� ���ϵǰ� 20�� �� ���� �����Ÿ���.
//while���� ������ε� blocking�� ������.
//main -> while(1) accept(num++;)=> start() ������ ����ϴ� ���� ������, �����ϸ� ���ŷ�� Ǯ���� �ٽ� ����ڸ� ��ٸ���.
// => while read(������ �����͸� ������ ���ŷ�� Ǯ���� �ٽ� ����ڸ� ��ٸ���.) => �̷� ����� ��� ���� ���α׷� ���



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
		};//�͸� Ŭ���� ��� //�͸� �Լ� ����� �͸� Ŭ���� ��İ� �ٸ��� �Լ��� ������ �ϴ� ��?
		t4.start();
		
		new Thread() {// �͸� ��ü ���
			public void run() {
				System.out.println(3);
			}
		}.start();
	}
}

*/

/*
//ex85) ��α� �Լ��� ������ �� ������ ����.
//��� ���� �ѱ�ٺ��� �Է� �ް� ����� �ؾ��ϴµ� �ٸ� �Է����� �Ѿ������ ��찡 �����. ���� ��� ������ �Է¸� 3�� �ް� ��¸� 3�� ���ӵ� ���� �ִ�.
class Lion extends Thread{
	public void run() {
		new Scanner(System.in).nextInt();
		System.out.println("������");
	}
}


class Tiger extends Thread{
	public void run() {
		Lion t1 = new Lion();
		t1.start();
		new Scanner(System.in).nextInt();
		System.out.println("�ڳ���");
	}
}

public class Datas_Sructure {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.start();
		new Scanner(System.in).nextInt();
		System.out.println("ȣ����");
	}
}
*/
//ex83)
/*class Tiger extends Thread{
	public void run() {
		for (int i = 0; i< 10; i ++) {
			System.out.println("ȣ���� : " + i);
			try {
				System.out.println();
				Thread.sleep(0); // ��ǻ�Ͱ� �����ϱ⿡ ���� �����ִ� �ð��� ª�� ����� => �� �ð��� �ٸ� �� ���� ���ϰ� �;��Ѵ�.
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
			System.out.println(" �ڳ��� : " + i);
			try {Thread.sleep(0);}catch(Exception e) {}
		}
	}
}

*/
/*
//ex83) ������ ������ ex82������ ���ٴ� ���̴�.
// ���ÿ� ����Ǵ� ��ó�� �������� CPU(���� ���μ���)�� �����ư��� �����Ű�� ���̰� �� ���� �������� Job �������̶�� �ϸ� �ü���� ���Ѵ�.
// ���ÿ� ���α׷����� �����Ǵ� ȯ���� ��Ƽ �½�ŷ�̶�� �Ѵ�. �ϳ��� ���α׷� �ȿ� ���� ���� �������� ���ư��� �ϴ� ���� thread��� �� ������ �ü���� ���Ѵ�.
// ���� ���α׷� �ȿ� 3���� ���� �ִٸ� �� 4���� Thread�� ����ϰ� �ȴ�.(�� 4���� OS�� �����ϰ� �Ǵ� ���̴�.)
// �ϳ��� ���μ����� ������ �о��ִ� �Ͱ� ������ ��ŭ �о����� ���ÿ� �����ϴ� ���� �Ұ����ϴ�. �װ��� �����ϴٸ� �����ư��� �ϴ� ���� ���̴�. �ӵ��� ���Ƽ� �츮 ������ ���ÿ� �ϴ� �� ó�� ���δ�.
// �ü���� �ִ��� �����ϰ� ���� ����Ѵ�.
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
		// �����ϴ� ���� 1���� 2�� ��ġ���� ���ÿ� ����ȴ�(����);
		// main()�� �׾ ��� ���� ���̴�. 
		// ��� ���� ������ main���� ��ٰ� t1���� 100�� �ٰ� �ϴ� ����̴�. 
		t1.start(); 
		System.out.println("ȣ����"); // 1
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
	void run() {} // ��� �̷� ���¸� abstract �س��� �� �����ѵ� ���ôϱ�.
		
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
		t1.start();// clss A�� ���� ���ϰ� ���� ������ ���� �θ� class �� start()�� �ִٰ� �� �� �ִ�. start�� �����Ű�� ��(B) run�� ���� ��Ű�� �ְ� �� ���� �� run�� �������̵� �ǰ� �ִٴ� ��.
		//�� a�� run�� �����ϰ� �ִٴ� ���̴�.(�ֳ��ϸ� B�� run�� �����ص� A�� �Լ� start���� run�� ���� ���ؼ��� A ���ο� run �Լ��� ���� �ǰ� �־���ϱ� �����̴�.)
	}
}

*/
/*
//81)
public class Datas_Sructure{
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);//�Է� �ý����� ���ڴٴ� �ɼ��� ���ڷ� �־��ָ� Ű����� �Է� �����ϴ�.
		
		Random rnd = new Random();
		//int rnd2 = new Random().nextInt(100); �̷��� �ٿ��� �� �ִ�.
		
		System.out.println("���ڸ� �Է��ϼ���");
		// �Է¹ޱ� ���� ������� �ʴ´�. ���α׷��� �ߴ� ��ư�� ���� �� �ְ� Ȱ��ȭ �Ǿ��ִ�. Ŀ���� �˾Ƽ� �Ʒ��� �� �ִ�.
		// nextInt�� ���ŷ �Լ���� �θ���.  ���ŷ �Լ��� ��ӵ� Ư�� ������ ������ �� ����
		// ���α׷��� �� �̻� �������� ���ϴ� �Լ��̴�.(ex. sleep())
		// ���ŷ�� ���� �ʰ� �Է��� ���� �� �ִ� �̷� ������� �񵿱��� �Ѵ�.(�� �ٸ� ���α׷�(�Լ�)���� ������ �ʰ� ��� �����ϰ� �ִ�.) => ���߿� ���� �� ��. ������ �ȹ�.
		
		for(int i =0; i< 100; i++) {
			int num = sc.nextInt();
			System.out.println(num);
			
			//����� �� ��� �ϳ� ������ Ű���� �Է��� ��ٸ��� ������..�̷��� �ٿ��ᵵ �ȴ�.
			//num = new Scanner(System.in).nextInt();
			if(num==999) {
				break;
			}
			// close���� ������ ���ҽ� ����(leak)�� �Ͼ�� �ִٶ�� ��� �´�.
			//�� ��ü�� �ݾƾ� �Ѵٰ� ��� �ִ� ��.
			sc.close();
		}
		
		int num = sc.nextInt(); 
		System.out.println(num);
		num = sc.nextInt(); 
		int num2 = sc.nextInt();
		System.out.println("���α׷��� �����մϴ�.");
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
	//static LinkedList<Book> mm = new LinkedList<Book>(); => static�� ��� �ع����� search() �Լ����� �ٷ� mm ��밡�������� �ڵ� �������� ���� �ʴ�.
	public static void main(String[] args) {
		LinkedList<Book> mm = new LinkedList<Book>();
		//mm.add(100); ���� ��ü�� Book�̴� �翬�� 100�� add�ϴ� ���� �ȵȴ�.
		
		// C(reate)�� �ش�ȴ�.
		mm.add(new Book("�ڹٸ� ����", "ȫ�浿", "������ ���ǻ�", 100));
		mm.add(new Book("���� �ڴ¹�", "��ȣ��", "������ ���ǻ�2",150));
		mm.add(new Book("��Ʈ������ �����Ͷ� �����ΰ�", "�����", "������ ���ǻ�3",150));
		mm.add(new Book("�ڹ��� ����", "�̱�ö", "������ ���ǻ�4",300));
		System.out.println(mm.size());
	
		// R
		//System.out.println(mm);
		for( Book book : mm) {
			System.out.println(book);
		}System.out.println();
		
		// �˻� ����
		Book oneBook = mm.get(2);
		System.out.println(oneBook);
		
		// U(pdate)
		mm.set(1,  new Book("���� ���� ��", "������", " ������ ���ǻ�2",200));
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
		
		Book findBook = search(mm,"�̼���");
		if(findBook != null) {
			System.out.println("ã�Ҵ�.");
			System.out.println(findBook);
		}else {
			System.out.println("�׷� ���� ����..");
		}
	}
	static Book search(LinkedList<Book> mm, String name) {
		for (Book book : mm) {
				if(book.author.equals(name)) {// ������ get, set ����ؾ������� ���� ������ ����
					return book;
				}
		}
		
		return null;//for���� �������ȴٴ� ���� ��ã�Ҵٴ� �ǹ��̹Ƿ� null����
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
		Lion<Integer> t1 = new Lion<>(); //Ŭ������ �� �� �ִ�.
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
		//�������� Ȯ���Ѵ�.
		Random rnd = new Random();
		
		for (int i = 0; i < 20; i++) {
			mm.add(rnd.nextInt(100));
		}
		
		System.out.println(mm);
		
		
		// | 
		// 2 3 4 5 6
		for (int i =0; i <mm.size(); ) { // ������ ���� �ʾ��� ���� ++�Ѵٴ� ������ ���.
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
		
		//0���� �������� 1���� 0������ ���� ������ ����� �� �˻簡 ���� �ʴ´�. �� ���ŵ� ������ ���ο� �ε����� �����ȴٴ� ���� ������.
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
//ex79-1) �˻� ����
class Tiger{

}
public class Datas_Sructure {
	public static void main(String[] args) {
		LinkedList<Integer> mm= new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			mm.add(i*10+i);
		}
		System.out.println(mm); //���� ã�Ƽ� ������ ������ �� �˾ƾ� �Ѵ�. ������ ���ؼ�.
		
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
//1. �ݷ��� Ŭ������ ���� ���� �� �ִ°�? => ���� ����� ���� �� �ڷᱸ����� �Ѵ�.
//Java �ڷᱸ���� ����. => �ڹ��� ö���� 2���̴�.
//2. �̹� ���۵� Ŭ������ �� ����� �� �ִ°�?
/*public class Datas_Sructure{
	public static void main(String[] args) {
		//int�� �� ���� �ְ� float�� �� ���� �ֵ��� �ϳ��� �����͸� ������ �� �����Ƿ� => ���׸��� �̿��� ������ ���
		//LinkedList<~> t = new LinkedList<>(); => F3�� ���� ���׸����� �����Ǿ��ִ�.
		
		//CRUD+(�˻�, ����)�� �Ǵ� �� Ȯ�� �غ��� ������. (�˻�, ������ ������ R�� ����) => CRUD�� ����ؼ� ���������� �ᵵ �ȴ� ����.
		//�߱���Ʈ�� �������ִ� ���ָӴϰ� mm�̴�. �������ٰ� �˰� ���� ����� ī������ �ϴ� ���� �ƴ϶� ���ָӴϿ��� ����� ������ ���̴�.
		// �� ���ָӴϸ� ���ļ� ����ϴ� ���̴�. �߱���Ʈ �ϳ��� �ּ��� �����ּ��� ��Կ� �� �� ���ָӴϸ� ��ġ�� ��ó��.
		LinkedList<Integer> mm = new LinkedList<>();
		System.out.println(mm.size());
		// add(), create(), insert() �� �� ����� �ǹ̸� ������ �� �ڹٴ� add()�� �̿��Ѵ�.
		mm.add(100);
		System.out.println(mm.size());
		for (int i = 0; i<10; i++) {
			mm.add(i*10+i);
		}
		System.out.println(mm.size());
		
		// CR(ead)UD ==> Read. �׳� �Ѱܹ����� �ȴ�. ��Ȯ�� ������ mm.toString()�� �ǵ��� ����� ���Ұ� ���µǾ� �ִ�.
		
		// 1. �д� �͸� �����ؼ� Ȱ�뵵�� ��������.
		System.out.println(mm);
		
		// 2. �ϳ��� �б�. ���� ������ �����ؼ� ����� �� �����Ƿ� ����. Read(), get(), select() �´� ��������� �ڹٴ� get�� �̿��Ѵ�.
		for (int i = 0; i<mm.size();i++) {
			System.out.print(mm.get(i)+" ");
		} System.out.println();
		
		// 3. for ���� ����ȭ ���� => ���� �ڵ�(���� �ڵ�) => ex) ���� ������.( forEach )
		for (Integer data : mm) { 
			// Integer Ÿ������ data�� ���� �޴� �� ������ mm���� �ִ� ��ŭ �����͸� �׸�ŭ �ްڴ�. (���ͷ����Ͱ� ���ο� ���ԵǾ� �ֳ�?)
			// data: ���� ������ �ƴϸ� �ε����̴�. => ǥ��ȭ�� �ȵǾ� �ִ�. Java������ ���� �����Ͱ� �Ѿ�´�. �ٸ� ������ �ε����� �Ѿ�� �� �ε����� �̿��� �����͸� �޴� ��쵵 ������ �̷� ���� 1% �����̴�.
			System.out.print(data+ " ");
		}System.out.println(); // �����͸� ������ �����ϴ� Ÿ���� ���� for each�� �ٴ��ϴ�. ex)�迭
		
//		// �迭 ����
//		int[] ar = {10, 20 ,30};
//		for (int data : ar) {
//			System.out.print(data + " ");
//		}System.out.println();
		
//		String s = "��¡������� ��մ�.";
//		for (char i : s) {
//			
//		} //���ڿ��� for each�� �ڹٸ� �Ұ����ϴ�.
		
		
		int[] ar = {10, 20 ,30};
		// data, item, value ������ �Ҹ��� index�� �Ͽ�� ����. �� �� �� �Ҹ��� value �� ���� ����. => �� �κ��� ������ ����
		for (int data : ar) {
			System.out.print(data + " ");
		}System.out.println();
		
		
		// CRU(PDATE)E
		// set
		mm.set(5, 99); //5���� ������ 99�� �ٲ��ּ���
		for (int data : mm) {
			System.out.print(data + " ");
		}System.out.println();
		
		// CRUD(elete)
		// delete, erase, remove =>�ڹٿ����� remove�� ���� ��κ��� �� �׷���.
		mm.remove(4);
		for (Integer data : mm) {
			System.out.print(data + " ");
		}System.out.println();
		
		// �˻�
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
				//not foundó���� �˾Ƽ� ���ִ� �Լ��� ����.
			}
		}
		
	}
}

*/
