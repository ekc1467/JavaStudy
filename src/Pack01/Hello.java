package Pack01;

import java.util.Random;

//crtl + shift + / => ��ü �ּ�, crtl+shift+\ => ��ü�ּ� Ǯ��
//crtl + ���콺�� => ������ ������, crtl+(+,-) ũ�� ����
/*��Ʈ�� ����Ʈ ����Ű , for ��Ʈ�� �����̽� �ѹ� ������ �� ���� ������ �̵�
 window�� show view => other�� dubug�� Ų��.
 ���� �ݺ��ϸ� ���� �� ��ư�� ���. �� ���� �� ��ư�� ���α׷��� ���� ���̶�� ���̴�.
debug�� ���� ���α׷� ���� �߿� ������ �ȵǴ� �� �˰� �ѹ� �� ������ 2���� ���� �� �� �ִ�.
�� �� �ϳ��� ���� ���ѹ����� 1���� ���µ� �� ���� ����׷� �� ���ִ�.
����� â�� terminate remove�� �� �������� �ȴ�.

����ƽ Ŭ���� �޼ҵ尡 �ƴ� �̻� �ν��Ͻ��� �����ؼ� ����� �ؾ���.

�����̾� Ÿ���� Ŭ������ �ƴϸ� ������� ���� ��ü�� �ƴ� �����̴�. �� ���ŷ� .���� ���� �޼ҵ� ȣ���� �Ұ����ϴ�.

new + crtl + space�� �ϸ� ��ü ���� �� ���� �� ���� air ġ�� ��Ʈ�� �����̽��ٷ� �ϼ�

crtl+alt+j �� �� �� �����

//f4���� ������ ��� �������� ���´�.
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

		Bbb t2 = (n)->{ //��°�� n Ÿ���� ���������൵ ����?
			System.out.println(1);
		};
		
		t2.f1(100);
		
		Ccc t3 = ()-> {
			return 200;
		};
		System.out.println(t3.f1());
		
		Ddd t4 = (s,n)->{return s+n;};
		System.out.println(t4.f1("ȣ����",3000));
		
		// ���� �ڵ� 1�ٸ� �ִ� ���
		// return �� {} �� ������ �� �ִ�. (���� ���ʿ� ���� �����ؾ��Ѵ�. �߰�ȣ ������ �Ƹ� ���� ���� ���ٴ� �������� ��) �� �ڵ�� t3�� ����.
		Ccc t5 = ()-> 200;
		System.out.println(t5.f1());
		
		//t4�� ����.
		Ddd t6 = (s,n)-> s+n;
		System.out.println(t6.f1("����", 4000));
		//�ܵ� ���� �ƴ�. �������� �����̴�. �޾� �ִ� �� ������ ��������.
	}
}




/*
	//ex69)
	//��Ĺ��� ��ŭ ���� �͵� ����.
	interface Tiger{
	void f1();
	}
	
	class Cat{
	void f1() {}
	}
	
	class Lion{
	void f1(Tiger t) {
		t.f1(); // �����ؼ� ������ �ȵƴµ��� ����� �ȴ�. �� ȣ�� �� �� �ڵ尡 ������� �ްڴٴ� ���̴�.
	}
	void f2(Cat c) {
		c.f1();
	}
	}
	
	public class Hello {
	public static void main(String[] args) {
		Lion lion = new Lion();
		//lion.f1();
		//lion.f1(new Tiger()); //�������̽��� new�� �Ұ����ϴ�.
		lion.f1(new Tiger() {// �͸��Լ��� �̿��� ȣ��� �� �����Ͽ� ����������.
			
			@Override
			public void f1() {
				System.out.println("ȣ����");
				
			}
		});
		
		lion.f1(new Tiger() {// �͸��Լ��� �̿��Ѵ�.
			
			@Override
			public void f1() {
				System.out.println("������");
				
			}
		});
		
		Tiger t1 = new Tiger() {
			//�̰��� ����� �ƴ� �׳� �ߴ� �ڵ�
			@Override
			public void f1() {
				// TODO Auto-generated method stub
				System.out.println("�޹���");	
			}
		};
		
		//���� �Լ�.
		Tiger t2 =()->{ //�ַο��� �Ѵ�
			//�̰��� ����� �ƴ� �׳� �ߴ� �ڵ�		
			System.out.println("�޹���1");		
		};
		
		Tiger t3 = ()->{
			System.out.println("�޹���2");
		};
		
		//���� ������ ���ٷ� ������
		lion.f1( ()-> {
			System.out.println("�޹���3");
		}); //���ٸ� �ʹ� ���� ���� �ذ� ���� �ʹ� �ܿ�� ���ٸ� �ش´�.
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
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
		t.f1(); // �����ؼ� ������ �ȵƴµ��� ����� �ȴ�. �� ȣ�� �� �� �ڵ尡 ������� �ްڴٴ� ���̴�.
	}
	void f2(Cat c) {
		c.f1();
	}
}

public class Hello {
	public static void main(String[] args) {
		Lion lion = new Lion();
		//lion.f1();
		//lion.f1(new Tiger()); //�������̽��� new�� �Ұ����ϴ�.
		lion.f1(new Tiger() {// �͸��Լ��� �̿��� ȣ��� �� �����Ͽ� ����������.
			
			@Override
			public void f1() {
				System.out.println("ȣ����");
				
			}
		});
		lion.f1(new Tiger() {// �͸��Լ��� �̿��Ѵ�.
			
			@Override
			public void f1() {
				System.out.println("������");
				
			}
		});
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
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
		// ���� : ��ü�� ���� ��ų ���� ����.
		// Tiger t1 = new Tiger();
	
		// �������̽� ���1
		Lion t1 = new Lion();
		Tiger t2 = new Lion();
		
		// �������ͽ� ���2
		//�������̽��� ��� �������� �� �� �ִ�.
		//Tiger t3 = new Tiger() {} 
		//�̰��� �͸� Ŭ������� �̾߱��Ѵ�. �Ｎ���� ����� �������.
		Tiger t3 = new Tiger() {
			@Override
			public void f1() {
				// TODO Auto-generated method stub
				System.out.println("ȣ����");
			}
		};
		t3.f1();
		
		//�������̽� ���3. ������� ��ü�� ���µ� ��� ����? �ڿ� .�� �ٷ� ����Ѵ� (��ý����Լ�)
		//�̰��� �͸� ��ü��� �Ѵ�.(�̸��� ���ٴ� �ǹ�)
		 new Tiger() {
			@Override
			public void f1() {
				// TODO Auto-generated method stub
				System.out.println("�޹���");
			}
		}.f1();
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex67-7)
//�̰��� ���� DI �⺻ �������� ������ ����
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
//Ǯ�� ������ ����
// �����ڸ� �̿��ؼ� ���� ���� ���踦 �����.
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
	public void f1() {System.out.println("���� ����");}
}

public class Hello {
	public static void main(String[] args) {
		Aaa t = new Aaa(new Ccc());
		t.f2();
	}
}
*/


//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
// ����Ⱑ ���� �� �⸧�� ������ �⸧�� �־��ٰ� �ϰ� ������ ������ ������ �־��ٰ� �ϰ� �� �ʿ���� ������ Ŭ������ �������� �������̽� �Ѵٶ�� ���̴�.
// �׷��� ����Ⱑ ���� �� ���Ḧ �ް� ���� �������� �⸧ ���� ��ź�� �ְ� �̰��� ��ĳ�����̴�.
// ���� �⸧ ���ۿ� �ִ� ���� �� ���� �������� �����ڿ��� �ѹ� �޾Ƴ��� �� �����͸� �ý��ۿ��� �� �������� => �����ڿ��� �⸧�� ���ζ�� ���� ������ �ϴ� ���� Injection�̶�� �Ѵ�.
// �ٵ��� ai �������̽� ���� �ȵ��ư��� �� ó�� ������ ������ ���Ծ��� �����ư���. �̰��� ������(dependency��� �Ѵ�) �������� �����̸鼭 �����Ѵٶ�� ���� ���� �����̶�� �ϸ�
// �̰��� DI (dependency Injection)�̶�� �Ѵ�. => ���� �� �����ȿ��� ���ȴ�.

// ex 67-6) ��ž�� ���İ� �ϴµ� ���ߴ� �� ��Ÿ�� �ع��� �� �δ� ������
// �μ������� �ؼ� �Ͼ�� ����� ���� �ʾƵ� �Ͼ�� ����� ���ٸ� ���ϴ� ���� ����.
// void play�� ������ �� �ϴ�. =>�ʵ带 �����.

class Baduk{
//�������̽�(Ai)�� ��ӹ��� ��ü�� ���Թ��� �� �ְ� Ai ai�� ������ְ� ���Թ��� ������(1���� ���� ����)�� �����ΰ� ���� �޾Ƽ� ���� ���� Ŭ�������� ��ü�� �����. 
//=> ���� ������ Di(���� ���� ����) 
	
//	Baduk(){
//		System.out.println("�뱹�� �����մϴ�.");
//	}
//	void play(Ai ai) {
//		ai.play();
//	}
//	void stop(Ai ai) {
//		ai.stop();
//	} �̰��� ������ �ٲ۴�.
	
	Ai ai;
	
	// �����ڴ� ����(injection)�� �޴´�.
	Baduk(Ai ai){
		this.ai = ai;
		System.out.println("�뱹�� �����մϴ�.");
	}
	
	void play() {
		ai.play();
	}
	void stop() {
		ai.stop();
	}
}


//67-5 d�������̽�ȭ ��Ŵ
interface Ai{
	 void play();
	 void stop();
}


//�Ƹ���
class AlphaGo implements Ai{ //Ai�� AI��� �ص� �ȴ�. �����̱� ������
	 public  void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
	 public void stop() {
		 System.out.println("���İ� ������ ����մϴ�.");
	 }
}

//MS
class BetaGo implements Ai{
	public void  play() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
	}
	public void stop() {
		 System.out.println("��Ÿ�� ������ ����մϴ�.");
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
//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*//ex 67-4)
class Baduk{
	Baduk(){
		System.out.println("�뱹�� �����մϴ�.");
	}
	void play(Ai alphaGo) {
		alphaGo.play();
	}
}

//�߻� Ŭ����ȭ ��Ŵ
abstract class Ai{
	abstract void play() {}
}

//67-5 d�������̽�ȭ ��Ŵ
interface Ai{
	void play();
}


//�Ƹ���
class AlphaGo implements Ai{ //Ai�� AI��� �ص� �ȴ�. �����̱� ������
	 public  void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
}

//MS
class BetaGo implements Ai{
	public void  play() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
	}
}



public class Hello {
	public static void main(String[] args) {
		Baduk baduk = new Baduk();
		baduk.play(new AlphaGo());
		baduk.play(new BetaGo());
	}
}*/

//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//67-3) �̱��� Ŭ������ ���� �����ϴ� ������ 67-4��
class Baduk{
	Baduk(){
		System.out.println("�뱹�� �����մϴ�.");
	}
	void play(Ai alphaGo) {
		alphaGo.play();
	}
}

class Ai{
	void play() {
		
	}
}

//�Ƹ���
class AlphaGo extends Ai{ //Ai�� AI��� �ص� �ȴ�. �����̱� ������
	void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
}

//MS
class BetaGo extends Ai{
	void play() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
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



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//67-2) �ٸ� �ΰ��������� ������ �� ���� Ŭ������ �Լ��� �߰� �ؾ��ϴ� ������ 67-3��
class Baduk{
	Baduk(){
		System.out.println("�뱹�� �����մϴ�.");
	}
	void play(AlphaGo alphaGo) {
		//System.out.println("�ΰ������� ���İ��Դϴ�.");
		alphaGo.play();
	}
	void play(BetaGo betaGo) {
		betaGo.play();
	}
}


// �Ƹ���
class AlphaGo{
	void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
}

// MS
class BetaGo{
	void play() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
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



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//67-1) �ΰ������� ������ ���� 67-2��
//class ConstantDesc{
class Baduk{
	Baduk(){
		System.out.println("�뱹�� �����մϴ�.");
	}
	void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
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
//66) final( ������ )
// 1. ����
// 2. Ŭ����
// 3. �Լ�
// 3���� �뵵�� �ִ٤�.
class Tiger{
	// 1. �ʵ� final( ���� �ʱ�ȭ �ϴ� ���� ���Ⱑ �������̴�. )
	// ���ȭ �Ǿ� ������. ( �ѹ� �ʱ�ȭ�� ���ķ� ������ �������� ����̴�.)
	// const
	// 
	//final int num = 10;
	//�ٸ� �̷��� �ʱ�ȭ�� �Ƚ����� ��� �� 1�� �����ڷ�(��) ���� ������ �����ϴ�. �׷��� ���� ��ó�� �ٷ� �ʱ�ȭ ��Ų��.
	final int NUM;
	Tiger(){
		NUM=30;
	}

	void f1() {
		//this.NUM = 20; �Ұ���
	}
}

//2. Ŭ���� final
class Aaa{}
final class Bbb extends Aaa{} //class �̸� �տ� final�� ������ ��� ����� �Ұ����ϴ�.
//class Ccc extends Bbb{}

class Ddd extends String{} //=> ����� �Ұ���. String�� final�̶�  �� �̻� Ȯ���� ���� ������ �ִ� ���� ����� �ڽŰ��� �ִ� �κ��̴�.
class Eee extends Thread{} //=> ���̳��� �س��� �ʾƼ� ��� ����. ���ʿ� �����尡 ��� �����ϰ� �ؼ� ����� ���� �ϱ� ���� 

//3. �Լ� final. ��� �ް� ���� �ִµ� ���� �׳� ������ �Լ��� �θ� Ŭ������ �Լ� �̸��� ���� �ٶ��� �Ǽ��� �Լ��� �������̵� �ع��� �� ������ �������̵� �Ұ����ϰ� �ϰ� ���� �Լ��� final�� ���ƹ����� ��쿡 ����ϴ� ���̴�. 
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
		//t1.NUM = 20; �Ұ���
		//math PI ���� ��쵵 �����̱� ������ 3.14~�� ��� ���� �Ǿ��ִ�.
		
		
		String s; //������ String�� final�̶� ����ؼ� �Ұ����ϴ�.( ǥ�� ���̺귯���� final�� �ƴϿ��� ��� ������ ���鵵 ����.)
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex65) ��ĳ���ð� ���� �Ǿ��־ ������ �������̽� �߰��� �����Ѵ�.
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
		//���¿� �Լ��� �ϳ� �ۿ� �����鼭 implements�� �̿��ϴ� ������ �����ΰ�?�� �и� ��ĳ���� �����ؼ� �� ���ϰ� ������ �����ϱ� ���ؼ� �̴�. �Ŀ� �̷� ��츦 ���� �� ���̴�.
		ParentTiger t1 = new Tiger();
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
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

//@FunctionalInterface Ǯ� ������ �ȶ��. �Լ��� 1���� �ʰ��ϸ� ������ �߰� ����� ���� ���̱� �����̴�. ������ �Ǽ��� 1���� �� ����� ���� ���� ������̼��� ���̴�.
//�������ϱ� �Ϻ������� ��ӵ� �Ͱ� ��ӵ� ���� ��� ���� �ִ��� �˾ƺ��� ���� ������̼��� ���� �� �ϳ�
interface Eee{
	void f1();
}

public class Hello {
	public static void main(String[] args) {
		String s;
		Thread t;
		StringBuffer sb; //f3���� ����     implements Serializable�� �� �� �ִµ� f3�� ���� �ȿ� �ƹ��͵� ���� ������ ������Ʈ �Ŀ� �߰� �� �� �־ �׳� �߰��س��� ���̴�. 
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex63)

// ���� �߻� Ŭ������ ���� �߻��Լ��̱� ������ ���� ������ �����϶�� ���̴�. ���� ������ ���µ� ��ӹ��� ����� �ڵ��ϼ���=> �������̽�(������)�̴�. �� ���� ���� ���.
/*abstract class ����Ʈ��{
	abstract void �޽���(); // interface
	abstract void ��ȭ��(); 
	abstract void �۽����();
	abstract void ���±��();
	abstract void ����();
}

class �ȵ���̵� extends ����Ʈ��{
	
}

class ������ extends ����Ʈ��{
	
}

class ������ extends ����Ʈ��{
	
}*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex63) ��ȹ������ ��Ȯ�� ���� �������̽��� �����ϴ� ���̴�. �����ؾ��� �������̽��� �����ϱ� �����̴�.
//Ŭ������ ���� ����� �Ұ����ϴ�. �������̽��� ���� ����� �����ϱ� �����̴�.(�������̽��� ���̵��̴�.)
abstract class Aaa{
	abstract void f1();
	abstract void f2();
}

//Aaa�� �ϳ��� ���� �Ǿ����� �����鼭 extends��� �θ��� ���� �̻��ϴ�. 
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

interface Ccc{// ����Ʈ�� abstract�� ���̱� ������ ���� �����ϴ�. 
	abstract void f1();
	void f2();
}

class Ddd implements Ccc{ // ��ӵǾ��ٰ� �ƴ϶� �����Ѵ��� ������ implements�� ����Ѵ�.

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



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex62)
class Tiger{

}
public class Hello {
	public static void main(String[] args) {
		int num = 1;
		
//		//�� ���� ���̰� ũ��.
//		int r1 = 100 * 3; // num + num + num
//		int r2 = 3 * 100; // 3 + 3 + ~
//		//���� ����̱� ������ �翬�� ���� ���̰� ���ϴ�. �翬�� ù�� ° ������� ����ؾ��Ѵ�.
		int r1 = num* 50;
		int r2 = 50 *num;
		//���� ����� num�� 1�̳� 100�̳Ŀ� ���� ���� ������ �ڰ� ���� �� ��������.
		
		System.out.println(r1);
		System.out.println(r2);
		
		
		//800*x => ���ɻ��� �̵��� ���� ����� ��Ʈ ���� ������� ���Ѵ�. (512+256+32)*x => 512*x + 256*x + 32*x => 2^9*x+2^8*x+2^5*x
		
		int test = 6;
					//     0110(6)
					//   01100(12) test << 1
					//  011000(24) test << 2
		System.out.println(test << 1); // 6 * 2�� 1
		System.out.println(test << 2); // 6 * 2�� 2
		System.out.println(test << 3); // 6 * 2�� 3
		System.out.println(test << 4); // 6 * 2�� 4
		//System.out.println(test * 2�� 4��); // 6 * 2�� 4
		
		// ��
		// (512+256+32)*x => 512*x + 256*x + 32*x => 2^9*x+2^8*x+2^5*x =>  2<<9*x+2<<8*x+2<<5*x
		// 
		
		int a = 23;
		System.out.println(800 * a); //�̰� ���ٴ�
		System.out.println(a * 800); //�̰� ����. a�� 800�̻��� Ȯ�� �鸸������ �� Ȯ���� �����غ����ϴ�
		System.out.println( (a<<9) + (a<<8) + (a<<5) );
		
		for (int i = 0; i < 600; i++) {
			for(int j=0 ; j <800; j++) {
				System.out.println(a * 800);
				System.out.println( (a<<9) + (a<<8) + (a<<5) );
				//�̹����� ���� 2���� ���� �� �̷� ��� �� �� for���� ����ϰ� �̰��� ���� TV�ػ󵵸� ����� �����ؼ� ������� �� �Ͼ�� ����� ���� 800*600���� ���̰� ���ٴ� ���̴�. �ּ�
				//��ġ�� ��Ʈ�� ���� ��� +���굵 �������� |�� ������� �ξ� ������. ���� ������� Integer �Լ����� ���� ��Ʈ �����ڵ��� ����.
			}
		}
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
// ex58) ����( bit ���� ): 2(��), 10(��), 16(����) = > 0~9 + a, b, c, d, e, f ����
// 2����: 0,1,10,11,100 ; 10����: 0~9,10,11,12 ; 16����: 0~f,10~1f,20~2f
// 10 �������� 2���� 16������ �� ���ϴ� ���: 10������ ��Ÿ�� ���� 17�� 2������ ��Ÿ������ 2�� ��� �����ٰ� ���� �������� 1��° �ڸ��� ���� 16������ �ٲٷ��� 16���� ��� �����鼭 �������� 1�ڸ���..�׳� �˻��ϸ� �� ���´�.
// ���� ǥ���=> ������:(236)10(����ũ��) => �� �˻�����..
// 10�������� 10������ ���ϴ� �溡: 236�� 10�� 2���� 2�� 10�� 1���� 3�� 10�� 0���� 6�� ���� ��.
// 2�������� 10������ ���ϴ� ���: 2���� 10100�� 10�������� �ٲٷ��� 2�� 0���� 0�� ���ؼ� ���ϰ� 2�� 1���� 0�� ���ؼ� ���ϰ� 2�� 2���� 1�� ���ϰ� ~�ؼ� ���Ѵ�. (ū �������� ���� ������ ���� ���� �ݴ��ΰ�?)
// 2�������� 16������ ���ϴ� ���: �׳� ���ͳ� �˻��ϸ� ���� �͵� ���� ���´�. 16������ ���������̶�� ���ϴ� ������ 10������ �޸� 10������ ����� 16�������� 2������ 4�ڸ��� ��� ǥ���ϸ� 16������ �ٷ� �ٲ� �� �ֱ� �����̴�.
// 2�� 8, 16���������� ���� ��ȯ�� 2�� �������� ����̶� ����� ������ 10������ 2�� ������ �ƴϱ� ������ �ٸ���.

//ex61)
class Tiger{

}
//���� �ʿ��� �������� �̾Ƴ� �� �ִ� ����� ��Ʈ&�� ����ϴ� ���̴�. FF FF FF FF => ���� F�� ���� ��� , F0 F0 F0 F0 => F�� �κи� ���
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
		System.out.println(hexaToBinary(0xffff0000)); // mask������(�ɷ��� �� �� �ְ� �ϴ� ������)
		System.out.println(hexaToBinary(n1 & 0xffff0000));
		
		//������ �ռ��� �� �� ���� ����Ѵ�.
		System.out.println(hexaToBinary(n1 | 0xffff0000));
		
		int a = 0xf3;
		int b = 0x3600;
		int c = 0xEC0000;
//		���� Ǯ��� ���� ���̴�.
//		int a = 0x 00 00 f3;
//		int b = 0x 00 36 00;
//		int c = 0x EC 00 00;
		
		int d = a | b| c;
		System.out.println(hexaToBinary(d)); //=> �ؼ��ϸ� EC36F3
		System.out.println("------------------------------------");
		
		//��Ʈ���� => ��ü ������ �������� �̵��ϰ� ������ ���� �Ѹ��� Loss�� �Ҿ��. ���� ���� ���� 0���� ���� ���´�.
		int e = 0xf09;
		System.out.println(hexaToBinary(e));
		System.out.println(hexaToBinary(e<<1));
		System.out.println(hexaToBinary(e>>1));
		
		System.out.println("------------------------------------");
		
		int data = 0xabcd;
		// 		 21(5��) 30(6��) 13(5��)=> �̷��� ����ϰ� �ʹ�. => ���ϴ� ��Ʈ���� ���� �ʹ�. => ��Ʈ& ����
		// 0000 0000 0000 0000 1010 1011 1100 1101		
		System.out.println(hexaToBinary(data));
		
		// 0000 0000 0000 0000 1010 1011 1100 1101
		// 0000 0000 0000 0000 0000 0000 0001 1111 => 0x1f
		System.out.println(data & 0x1f);
		// 0000 0000 0000 0000 1010 1011 1100 1101
		// 0000 0000 0000 0000 0000 0111 1110 0000
		System.out.println(data & 0x7e0);//=> ���� 5��Ʈ ������ ���ϴ� 6�ڸ��� ����ŷ ����
		
		System.out.println((data & 0x7e0)>>5); //5�ڸ� ó���ع�����
		// 0000 0000 0000 0000 1010 1011 1100 1101
		// 0000 0000 0000 0000 1111 1000 0000 0000
		System.out.println((data & 0xf800)>>11); //11�ڸ� ó���ع�����
		System.out.println((data & 0x0000f800)>>11); //11�ڸ� ó���ع����� => ���� �������� ����.
		//���� ��Ʈ�������� �о������ �����ϸ�  �������� ��������
		
		System.out.println( (data >> 11) & 0x1f );
		System.out.println("------------------------------------");
		//��Ʈ ���� => �̹��� ������ �̷� ������
		System.out.println(hexaToBinary(data));
		System.out.println(hexaToBinary(~data));
		
		//exclusive or
		System.out.println("------------------------------------");
		System.out.println(hexaToBinary(data));
		System.out.println(hexaToBinary(0x0000ffff));
		System.out.println(hexaToBinary(data^0x0000ffff));
		
		// & | >> << | ^
		// Integer Ŭ������ ���� ���� ������� ���� ���ȴ�.
		
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex60
class Tiger{

}
public class Hello {
	 void f0() {
		
	 }
	 //�����͸� ���� ����Ű�� �ؼ� �����ְ� ������ �ǵ������� String�� �ƴϸ� StringBuffer�� ��ȯ������ ���Ѵ�.
	 static String hexaToBinary(int n) {
		 //������ �迭�� �̿��� 2�� ��ӳ���� 2������ ���ϴ� ����� �����ϴ� �̷� �������� �ڵ��� ������ �̹� ������ ����� �̿��ϴ� ���� ����.
		 String s = Integer.toBinaryString(n);
		 System.out.println(s);
		 System.out.println(s.length()); 
		 
		 //32bit�� �ش��ϴ� ���ڿ��� �����.
		 while(s.length() < 32) {
			 //
			 s = "0" + s; //=> string�� ������ �Ǵ� ���� �ƴ϶� ���� ��� �����ϴ� ���̴� =>  ����� ���̵��.
		 }
		 System.out.println(s.length());
		 System.out.println(s);
		 
		 StringBuffer sb = new StringBuffer(s);
		 System.out.println(sb);
		 // StringBuffer�� insert(" ")�� ������ �ִ�. 000000000000���� 0000 00000000�� ��� ������ ������ 0000 000 00000�̷������� ����� ������
		 //�ڿ������� 000000000000 0000 => 00000000 0000 0000 �̷��� ���� ���� �´�.
		 for (int i = 0; i <7 ; i++) {
			 sb.insert((7-i)*4, " ");
			 System.out.println((7-i)*4);// => ��ġ ����
		 }
		 System.out.println(sb);
		 return sb.toString();
	 }
	 
	public static void main(String[] args) {
		// >> ���� ���ϴ� �������� 2���� ����� �ϰ� �ʹ�.
		int num = 0x63ce7bcd;
		
		System.out.println(hexaToBinary(num));
		//f();=> �Ұ��� static�ȿ��� ����� �Լ��� static�̿��߸� ��
		
		System.out.println(hexaToBinary(0xab));
		System.out.println(hexaToBinary(123456));
		
		int num2 = 100;
		System.out.println(hexaToBinary(num2)); //������ ���¸� �� �� �ִ�.
		
		System.out.println(hexaToBinary(0x7fffffff)); //80 00 00 00 �� �� �����̴�. �� ������ �پ�ѱ� �Ϻ������̴�. (�������� ������ �Ѱ��ְ� 0�� ����ؾߵǱ⶧���� 1�� ���� int�� ǥ���� �� �ִ� MAX ���̴�.)
		//00 -> 0000 0000
		//1f
		//7f == 7f ff ff ff -> 0111 1111 1111 1111 1111 1111 1111 1111
		//80 == 80 00 00 00 -> 1000 0000 0000 0000 0000 0000 0000 0000
		//af
		//ff -> 1111 1111
		
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex59)
class Tiger{

}
public class Hello {
	public static void main(String[] args) {
		int num1 = 100;
		System.out.println(num1);
		
		//0x�� 16������ ���Ѵ�.
		//����� 10������ �Ѵ�.
		int num2 = 0x100;
		System.out.println(num2);
		
		int num3 = 0xABCD;
		System.out.println(num3);
		
		int num4 = 0x63ce7bcd; // ���ڸ��� 4��Ʈ�� �����Ѵ�. ���� 2���� 8��Ʈ(1byte)�� �����Ѵ�. 8�ڸ��� 4����Ʈ(4byte==int)�� �����Ѵ�. �� int�� �����ϸ� �� �̻� ���� ���� ����.( FF FF FF FF ) => �� F�� 15�̴ϱ� �̰� �ִ� ���� �̾߱� �ϴ� �ű���
		System.out.println(num4);
		// 0110 0011 1100 1110 0111 1111
		
		// 0x7fffffff >> 0 ~~ 80 00 00 00 ~~ FF FF FF FF =>�� ���ݸ� MAX VALUE�� ������ ���ϱ�? �װ��� ���� ���� �����ϱ� �����̴�. => �� ����
		int num;
		//Integer
		boolean
		Boolean;
		System.out.println(Integer.toBinaryString(num4)); => ����� �ٸ���?
		
		
		int num5 =0xab;
		// 10101011 => �̷� ����� ���ϴ� ���� �ƴ϶� 0000 0000 0000 0000 0000 0000 1010 1011 ���� 32bit�� �� ���� ���ϴ� ���̴�.

		// 0�� ������ ���� �ƴ϶� 4�ڸ��� �߸� ���ڿ� Ǯ�� ���鼭 �۾��ϴ� ��찡 ����. �׷��� �̷��� ����ϴ� �Լ��� ����.
		System.out.println(Integer.toBinaryString(num5));
		
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
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
	
				//2���� : 0001 0101 0101 1110 1111
				//16����: 1	  5	   5	E	 F
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
			   //�ε���  012 = ����ȭ
		String s1 = " ����ȭ ���� �Ǿ����ϴ�. ";
		//Ŀ���� �÷� �о��. int java.lang.String.length() => �ڹ� �ȿ� �� ���� ��Ʈ�� ���� ���� �Լ�
		s1.length();
		// ex1)
		//������ �ϴ� int ��� ��ȯ ���� �����Ƿ� ���� ����
		//���ڿ��� ���� ��ȯ
		System.out.println(s1.length());
		
		// ex2)
		// char String.charAt(int index)
		// �ε����� �ִ� ���� Ž��
		System.out.println( s1.charAt(3));
		s1.charAt(0);
		
		// ex3)
		// String s1 = "����ȭ ���� �Ǿ����ϴ�"
		// ��ġ Ž��
		System.out.println(s1.indexOf("�� �Ǿ�"));
		
		//�˻��� �����ϸ� ���� �Ǵ� -1�� �����մϴ�. => ���� 30��
		System.out.println(s1.indexOf("���ϴ�."));
		// �̷� ������ -1���ϵǴ� ���� �̿��� ���� �ڵ� ����.
		if(s1.indexOf("���ϴ�") == -1){
			System.out.println("�˻�����");
		}
		else {
			System.out.println("�˻�����");
		}
		
		// ex4)
		// Stirng s1 = "����ȭ ���� �Ǿ����ϴ�."
		// String java.lang.String.replace(
		//	CharSequence target
		//	CharSequence replacement)
		s1.replace("����", "������");
		// ����.. ���� �����͸� �������� �ʴ´�. ���� �����͸� �����ϴ°� ���� �ʴ°�? �ϱ⵵ �ϰ� ���ϱ⵵ �ϴ°�? �ǹ��� ������ �Ѵ�.
		// String Ŭ������ ����� ������ �������� �ʴ´�.
		// StringBuffer Ŭ������ ���� ����Ÿ�� ������ �� �ִ�. => ���� ��ü�� ���� �����͸� ������ �������� ���.
		System.out.println(s1);
		
		
		// ���� ���� ���� �����Ͱ� ���� �� ���� �ƴ϶�
		// 1. s1�� �޸𸮰� �����ȴ�.(��ü�� �������)
		// 2. s1�� �޸𸮸� �� �Ҵ� �޴´�.(���ο� ��ü�� ����� �� ��)
		//s1 = "ȣ����";
		//System.out.println(s1);
		
		// ex5)
		String s2 = s1.replace("����", "������");
		System.out.println(s2);
		//���� ���� �����Ƿ� �׳� ��� �����ϴ�.
		System.out.println(s1.replace("����", "������"));
		
		// String s1 = " ����ȭ ���� �Ǿ����ϴ�"
		// ex5) sub string
		// 3���� �� �߶������.
		System.out.println(s1.substring(3));
		
		// ���� ������ ���� ����� �޶����� ��찡 �ִ�. �׷��� 3������ 5������ �߶󳻴��� 3������ 5���� ���ڸ� �߶󳻴��� �򰥷� �� ���� �ִ�.
		// start ~ end-1
		// end - start +1 => �ΰ����� +������ �����ϱ� ���� end - start ��ŭ �ڸ���.(�� ���� �ٷ� �ձ���)
		System.out.println(s1.substring(3,5));
		
		// ex6)
		s1 = "Apple";
		// Apple apple aPPLe = > ��� �ҹ��ڳ� �빮�ڷ� �ٲ���� ã�ƾ� �ҹ��� �빮�ڷ� ���� ����� �������� ����� ���� ����ʰ� ã�� �� �ִ�.
		// �� �����͸� �ٷ� �� �����ϰ� ���� �� �ִ�.
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		// ex7)
		s1 = "  A p p l e  ";
		System.out.println(s1);
		System.out.println(1000);
		
		// ����(����)�� �����ϴ� ������ �Ѵ�.
		//id : 12234	 //�����ؿ� �� �̷� ������ space�ٸ� ������ ������� ���� �����ؿ��� ��찡 �ִ�.
		System.out.println(s1.trim());
		System.out.println(2000);
		
	}
}
*/

//-------------------------------------------------------------------------------------------


/*
//=-------------------------------------------------------
	//ex56)
	// 4. �߻��Լ��� ������ Ŭ������ �ݵ�� �߻�Ŭ���� �̾���Ѵ�.
	abstract class Aaa{
	//������ �ϰ� ���� ������ ����. �ڵ带 ��������.
	//��	1. �������̵��� ��ǥ�� �Ѵ�.
	//	2. ���� ������ �ڵ带 �ۼ��� ������ ����.
	//	3. �׷��� {}�� ���ְ� �����ݷ��� ��´�. => �̿ϼ� �ڵ尡 �ȴ�. => �̰��� �߻� �ڵ� ��� �Ѵ�. => �̿ϼ�=�߻�
	// ����� �߻� ����� ������ ���ذ� �ǹ� �� �ؼ��� ������ �������� ���ϱ� �����̴�.=> abstract�� �������μ� �̿ϼ�(�߻�)���� �˸���.
	// �ڵ尡 �̿ϼ��̱� ������ ��ü�� ������ų �� ����.
	abstract void f1();
	}
	//�߻� Ŭ������ ��ӹ޴� ���� �ݵ�� �ڵ带 �����ؾ��Ѵ�.
	class Bbb extends Aaa{
	// ��ӹ��� �߻� Ŭ������ �߻� �Լ��� �������̵��ؼ� �ݵ�� �ϼ� ���Ѿ� �Ѵ�. crtl + space�� ������ ���� �ȵǸ� �ȵǾ �ٷ� ���.
	void f1() {
		System.out.println();
	}
	}
	public class Hello {
	public static void main(String[] args) {
		Aaa a = new Bbb();
		a.f1();
		
		// �߻�Ŭ����(�̿ϼ� Ŭ����)�� �ڵ尡 �̿ϼ��̱� ������ ��ü�� ������ų �� ����.
		// Aaa t =new Aaa();
	}
}
*/



//-------------------------------------------------------------------------------------------
/*
//ex55)
//��ĳ����~>������ -> �𸣸� ������ ������ ������ �ȵȴ�.
//Design Pattern -> 23���� ���� -> ȸ����� �ǰ����
//1�� => GoF�� DP(���� ������ å, ������ �� �̸�) -> ��õ���� �ʴ´�.
//�˻� �� 1���� ���� ��� ������ �� �� ���ϸ� �Ĵ� ���� �����Ѵ�. �ǹ� ������ �Ұ����ϴ�.
//�ٸ� �ҽ��ڵ� ���(������ ���� ����)�� ������ �˰� �ҽ��ڵ带 �� �� ���ϴ�.
//��� �۽�Ʈ ������ ���� å ��õ (ȣ��ȣ ����)

class Animal{
	void cry() {
		System.out.println("�Ҹ� ���� ����");
	}
}
class Tiger extends Animal{
	void cry() { System.out.println("����");}
}
class Cat extends Animal{
	void cry() { System.out.println("�߿�");}
}
class Dog extends Animal{
	void cry() { System.out.println("�۸�");}
}

class Snake extends Animal{
	
}
class Lion extends Animal{
	void cry() { System.out.println("����");}
}

class Zoo{
	//�����ε��� ��Ģ
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
	//������ �Ѹ��� �� ����� �� ���� �� �ϳ��� �� ����Ѵ�. �̰� �ܺ� ��ȭ�� �͵� �ڵ����� ���� �� �ֵ��� �ڵ�ȭ ����� ����� ���� �ְ��. ���� ��� ��� �� ��� ���.
	//�̷��� ��ĳ��Ʈ�� �ذ��� ���̴�. �̰��� ������ ���Ͽ����� ���� ���ȴ�.
	//�̰��� SOLID ��Ģ �� O�� ���Ѵ�.
	void sound(Animal t) {
		t.cry(); //�ִ� ���(�����) ���忡�� �ֱ� ������ ���� ����� �𸥴�. �پ��� ������ ����� ���´�. => �̰��� ������ ���α׷��̶�� �Ѵ�.
	}
	
}

public class Hello {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.sound(new Tiger());
		zoo.sound(new Cat());
		zoo.sound(new Dog());
		zoo.sound(new Snake());
		zoo.sound(new Lion()); //�̷��� ���� ���ڸ� �߰��� �� �ִ�.
	}
}
*/


//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex54)
class Animal{
	void cry() {
		System.out.println("�Ҹ��� �� �� ����");
	}
}
class Tiger extends Animal{
	@Override
	void cry() {
		System.out.println("����");
	}
}

class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("�߿�");
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
			ani[rnd.nextInt(3)].cry(); //��ĳ������ ���� �� �ٷ� �� �ִ� ��ũ��.
		}
//		ani[0] = new Tiger();
//		ani[1] = new Cat();
//		ani[2] = new Snake();
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//53��)
class Animal{
	void cry() {
		System.out.println("�Ҹ��� �� �� ����");
	}
}
class Tiger extends Animal{
	@Override
	void cry() {
		System.out.println("����");
	}
}

class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("�߿�");
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
		
		//��ó�� �ص� ��� ���� �����ѵ� �� ��ó�� ��ĳ��Ʈ�� �̿��ұ�?
		Tiger t4 = new Tiger();
		t4.cry();
		Cat t5 = new Cat();
		t5.cry();
		Snake t6 = new Snake();
		t6.cry();
		
//		String s0, s1, s2, s3;
//		s0 = "ȣ����";
//		s1 = "ȣ����";
//		s2 = "ȣ����";
//		s3 = "ȣ����";
		String[] ar2 = new String[4];
		// ���ڿ� ��ü�� ������� ���� �ƴ϶� ��ü�� ���� �� �ִ� �� 4���� �������.
		ar2[0] = "ȣ����0";
		ar2[1] = "ȣ����1";
		ar2[2] = "ȣ����2";
		ar2[3] = "ȣ����3";
		
		String[] ar = new String[] {new String("ȣ����0"),"ȣ����1","ȣ����2","ȣ����3"};
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



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
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
		Aaa t = new Bbb(); //��ĳ��Ʈ
		
		//1.�ڽ� ���� ã�ƺ��� �������̵��� �Ǿ��ִ��� Ȯ�� �� �Ǿ����� �ڽ� ���� ���� �ƴϸ� �ڽ��� ���� ����.
		t.f3();	// 30
		t.f4(); // 40
		
		Bbb t2 = new Bbb(); //�̷��� ����� �Ǵ� �� �� ��ó�� ��ĳ��Ʈ�� ����ұ�? �װ� ������..
		t2.f3(); // 10
		t2.f4(); // 40
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex52)	���� �ټ���!***** => ������, ��ĳ����
class Aaa{
	void f1() {};
}

class Bbb extends Aaa{
	void f2() {};
	void f1() {
}

public class Hello {
	public static void main(String[] args) {
		
		// ����ϰ� �ƹ� ���谡 ����.
		Aaa t1 = new Aaa(); // �� = ��
		t1.f1();
		
		
		// ��ĳ����(UpCasting)
		Aaa t2 = new Bbb(); // �� = �� => ���� ����
		t2.f1();// f2()�޸𸮰� �ִµ� ����� �� �� ���̴�.
		
		
		
		// �ٿ�ĳ����(�ڹٿ��� �������� ����) => �ٸ� ���� �����ȴ�.
		//Bbb t3 = new Aaa(); // �� = ��
		
		
		Bbb t4 = new Bbb(); // �� = ��
		t4.f1();
		t4.f2();
		
		
		
		//������ �����̰� �������� ��� �޸�.
		//�� ������ �����̱⿡ �ø� �� ������ ��� �޷θ��� �ø� �� ����.
		
//				Aaa t1 = new Aaa(); //���������� t1�� Aaa���� �޸𸮵� Aaa����
//				
//				//�� ����? ������ ��� ���� ���ϴµ�? �̰��� �ذ��ϴ� ���� �������̴�.
//				Aaa t2 = new Bbb(); //���������� t2�� Aaa���� �޸𸮴� Bbb����
//				
//				//���ʿ� �������� �ȵǼ� ������ ���Ͼ��.
//				Bbb t3 = new Aaa(); //���������� t3�� Bbb���� �޸𸮴� Aaa���� => �Ұ����ϴ�. ������. => �ٿ�ĳ���� => �����ϴ�.
//				                                                                                                                                                     
//				Bbb t4 = new Bbb(); //���������� t4�� Bbb���� �޸𸮴� Bbb����
			}
}

*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex51) 4��° this. �ٸ� �ڽ��� �����ڸ� ȣ���ϴ� ��.
class Tiger{
	int num;
	int age;
	Tiger(){
		age = 10000; // �ݵ�� ������ �ʱ�ȭ��ų�� Ȯ���� ��� �̷���.
		System.out.println(1);
	}
	Tiger(int a){
		this(); //�����ڸ� ���� this �ڵ�� �ݵ��� ù�ٿ� �־���Ѵ�.
		num = a;
		System.out.println(2);
	}
	Tiger(int b, int c){
		this(b*c);// �ٸ� �������� �ʱ�ȭ�ñ� ��� �̷��� �����ڿ� this��.
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



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex50)
//Aaa�� f4�� �������� ��� �������� �����µ� �� ���� Object��� Ŭ������ �ڵ����� ��ӹ޾����ִ�.
//�� ���ʿ� ��� Ŭ������ Object�� ��ӹ��� ���̴�. hashcode()�� �ְ�, toString�� ������ �ִ�.
//�� �츮�� ������ �������� ����� toString�� object�� toString�� ��ӹ��� ���̴�.
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
		Ccc t1 = new Ccc(); //f4���� ������ ��� �������� ���´�. Ŭ�������� ������ �� �ȿ� �ִ� ������� �˷��ش�.
		//f4���� ������ ��� �������� ���´�. Ŭ�������� ������ �� �ȿ� �ִ� ������� �˷��ش�.
		StringBuffer sb; // ����� �� �޼ҵ� �������� �� �ǹ̸� �� �� �ִ�. �� ã�ư��� ����.
	}
}
*/


//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
// ex49)
// �����ڰ� ȣ��Ǵ� ���� ����:
// �θ� >> �ڽ� : <-------------�߸��� �ؼ�.
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
		// �θ� �����ڸ� ���ϴ� �ڵ尡 �����Ǿ� �ִ�.
		//super();// �� �ڵ尡 �����Ǿ� �ִ�. �̷��� �س��Ƶ� ����� �Ȱ��� �θ� ������ ���� �� �Ƶ� ������ ����
		super(3,4);
		super(2);//���ڰ� �ִ� �����ڸ� �θ��� ���ϸ� �̷��� �μ� ���� ������ �����ϸ� �ȴ�. 
		//�����ڸ� ȣ���� �� new�� �� �ѹ��� ȣ���ϴ� �� ó�� super�� ���⼭ �ѹ��� ȣ�Ⱑ��
		System.out.println(2);
		//���ڰ� �θ� �糢�� ȣ�� �Ұ���
	}
	
}

public class Hello {
	public static void main(String[] args) {
		Bbb b = new Bbb();
		Bbb c = new Bbb(3,4);
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex48)
class Aaa{ // ����
	void f1() {System.out.println(1);}
}
class Bbb extends Aaa{ // �θ�
	
}
class Ccc extends Bbb{
	
}
class Ddd extends Bbb{
	//Ccc�� �����̴�. �����θ��� ����θ� ���� ���� ���� ������ ���� ���� ����.(��������X)
	//Bbb�� ��ӹ��� Ŭ����(��)�� ����� Aaa�� �ڿ������� �� ���ΰ� �ǰ� ���ΰ� �θ� ����� ���� �����̵ȴ�.
	//�ٸ� �� Ŭ������ ���ÿ� ��� �޴� ���� �ڹٿ����� �ȵȴ�. ��� ��������� ���� �����Ѵ�.
	//*ȭ��ǥ�� �θ������� ����Ű�� �ִ´�.
	//���Ե� �θ������� ���Եȴ�.
}

public class Hello {
	public static void main(String[] args) {
		Ccc t1 = new Ccc();
		t1.f1(); //������ f1()�� ����Ѵ�.
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex47) ���
//����� ����: 
//1. �⺻ + Ȯ��(extend) ( �θ� Ȯ���Ų��.)
//2. �ߺ��� �ڵ带 �̾Ƴ���.(�ߺ��� �ڵ带 �̾� �θ�� �����.)

// ��� ��ü�� �ڽĿ��� ����� �䱸�� �� ������ ����ϰ� ������ �θ���� ã�Ƽ� �ִ� �� Ȯ���ϰ� ������ ����� ����Ѵ�.

// ��� ���� ����
// 1. is a: �ڽ��� �θ��̴�. (ȣ���̴� �����̴�., �Ļ��� �����̴�.) => ��Ӱ��踦 ����� ������.
// 2. has a: ������ ���̴ٴ� �ȵ����� ������ ���� ������ �ִٴ� ������ �ȴ�. => ��Ӱ����̴�.
// ���ÿ� ����̿� �������� ��Ӱ��谡 �Ǿ������� ���� �ȵ����� ���ø� ���� ����ߴٴ� ���� ����
/*
//ex47)
 * class Aaa{ // �θ�
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
} //�Լ� �� �������� ������ �κ��� �Լ� �����̶�� �Ѵ�.
class Bbb extends Aaa{ // �ڽ�
	void f2() {
		System.out.println(2);
	}
	void f3() {
		System.out.println(32);
	}
	void f4() {
		f3();//this.f3() // Ŭ���� �ȿ� �켱 f3�� �ִ� �� ���캻��.
		super.f3(); //  �θ��� f3�� �̿��Ѵ�.
	}
	
	@Override //�������̵� �� ���� �̷��� �˸���. - ������̼�
	//�̷��� �ϴ� ���� ������ ������̼� �޾Ƴ����� ��Ÿ�� ��Ÿ���ų� ������ ������ @���� �� �������ϸ� ������ ���ּ��� ��� �ǹ��̴�.
	//�� ���� ���� �������̵��� ����� �ȵǸ� ������ ���(����, ��Ÿ, Ÿ�� ���� ��) => Ÿ���̳� ���� ������ Ʋ���� ������̼��� ������ ������
	//�ȶߴ� ������ ������ó�� ���ڸ� �������� ���� ���� �� �ְų� ����Ÿ���� ���� �� �ִ� ���� ���������� �ִ�.
	String f5(int a, int b, String t) {
		return null;
	}
}

public class Hello {
	public static void main(String[] args) {
		Bbb t1 = new Bbb();
		t1.f1();
		t1.f2();
		//�������̵�(overriding)
		t1.f3();
		System.out.println("------------------------------=-----=-=-================");
		t1.f4();// �ڱ� �ڽ� ȣ��
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex46-3)) this�� 3��° ���. ���� ����� ����ϰ� ���� �� �ְ� ���ش�.(���� �ʿ��� ������.)
class Man{
	void f1() {
		Women w = new Women();
		boolean result = w.marry(this);
		System.out.println(result ? "^^" : "�Ф�");
	}
	String ����() {
		return "����";
	}
}
class Women{
	boolean marry(Man info) {
		String str = info.����();
		return str == "����" ? false :true;
	}
}
public class Hello {
	public static void main(String[] args) {
		Man t1 = new Man();
		t1.f1();
		
//		Control con = new Control();
//		//���⼭�� this�� ��(Hello class)�� �����ڴٴ� �ǹ��̴�.
//		con.makeButton(this, "�ؽ�Ʈ", "����");
////�Ƹ� con�ȿ��� ĥ�ϴ� ���� �Լ��� ��� ���� ������� ���� this�� ĥ�ϴٸ� ����ϴٴ� ���� ���̴�.
//// �� ���� ���濡�� �ʿ��ϴ�. ���� ������ �۾��� �ȵȴ� ��� ������ this�� ���� ���� ����� �� �ְ� ���ִ� ���̴�.
////		makeButton{
////			this.ĥ�ϴ�
////		}
	}
	
	void ĥ�ϴ�() {	
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex46-2) this ���2
//channing�� �������� �Ѵ�.
class Tiger{
	//Tiger this;
	Tiger f1() {
		//System.out.println("��ħ");
		System.out.println("���̵� Ȯ��");
		//return null;
		//return new Tiger();
		return this;
	}
	
	Tiger f2() {
		//System.out.println("����");
		System.out.println("�н����� Ȯ��");
		return this;
	}
	
	void f3() {
		//ystem.out.println("����");
		System.out.println("��ȿ�� �˻�");
	}
}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.f1().f2().f3();// �� ���´� this�� ������ �� ���ε� �ܸ��� ���̴�. �� this�� ���ϵǾ��ִ� ���¶� .�� ���� �� �ִ�(chaining).
		System.out.println("----------------------------------");
		t1.
		f1().
		f1().
		f1().
		f2().
		f1().
		f3();//f3�� return�� ��� chaining�� �Ұ����ϴ�. �̷� ���� �ڵ彺Ÿ�Ϸ� �Ѵ�.
		
		t1.f1();
		t1.f2();
		t1.f3();
		//���� �� ���̴� ���µ� �� �̷��� �ϴ°�?
		System.out.println("----------------------------------");
		
		//������ �ִ� �ڵ带 �����Ⱑ ��ó�� �Ǿ������ �����̴�.
		t1.f1();
		System.out.println("������");
		t1.f2();
		t1.f3();
		
		System.out.println("----------------------------------");
		//���� �ڵ�� �����Ⱑ �Ұ����ϴ�.
		t1.
		f1().
		f2().
		f3();
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex46-1) this ���1
//�Լ��� �����μ��� �ʵ带 �����ϱ� ���� �뵵
//-----------------------------------------------------

class Tiger{
	String name;
	int 	age;

// �ڵ����� ���ʷ���Ʈ�� ����� ���� ���: ������, setter, getter, toString	
public Tiger(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	Tiger(String name, int age){
//		this.name = name; // �ʵ� <= �μ�;
//		this.age = age;
//	}
	
	void f1() {
		System.out.println(name + " " + age);
		// System.out.println(this.name + " " + this.age) �������� �Ǹ� �̷��� �ٲ��.
		System.out.println(this.name + " " + this.age);
	}
	
	void f2() {
		f1();
		this.f1();//���� ���. ����� ������ �� �� �� �̷��� ����ߴ�.
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
		Tiger t1 = new Tiger("ȣ����", 10);
		System.out.println(t1);
		t1.f3("������", 20);
		System.out.println(t1);
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex45)
class Lion{}
class Tiger{
//	Lion lion;
//	Tiger t;
	Tiger() {
		//this = ????????; // �� �ڵ嵵 �����Ǿ� �ִ�. new�� ������ Ǯ��������.
		//this = t1; , this = t2 // new�� ������ �����Ǵ� ���� �̷��� �ٲ��. 
		// ���� ���� ������ ���� �ְ� �׷��⿡ ����� ���̵�ٴ� ���̴�.
		System.out.println(this.hashCode());
	}
	// �ƹ� �ڵ尡 ��� ����Ʈ ���� �ڵ尡 �ִ�.
	//Tiger this ��� Ŭ������ �� �ڵ尡 ���������� �����Ǿ� �ִ�. 
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



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex44
class Tiger{
	private Tiger(){ 
		// ����Ʈ�� Tiger �����ڸ� ���� ���ھ��� Tiger �ν��Ͻ��� new�ϴ� ���� ����.
		
		
	}
}
public class Hello {
	public static void main(String[] args) {
		
		//ǥ�� Ŭ����
		//Math m = new Math(); //����� �Ұ���
		//m.abs();
		Math.abs(-10); //�̷��� Ŭ���� �̸� ��ü�� �ؼ� .�� �Ἥ ����� �� �ִٴ� ���� static�̸� abs�� ���� �� ������ ������ ���� ���ڰ� �ٸ� �����ε����� ��������� ���̴�. 
		System.out.println(Math.abs(-10)); 
		//F3���� ���� static�� �̿��� 3�� �������̴�. �׸��� return���� �ٷ� �ذ� �����ѵ� if else �Ǵ� ������ ���� ������ ������ �ӵ��� ���ؼ� �̴�.(���� ������ ���� �׷���.)
		//new�� ���Ƴ��� �Լ����� Static���� �̿��ϴ� ������ 1. Math ���� ��ü�� ��ü ���� ��� �����̴�. 
		//new�� �ȵǴ� ������ �����ڸ� ���Ƴ��� �����̴�.(private �������)
		
		//Thread.sleep(0) �������� static.
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
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
		System.out.println(t3.num); //�������� ���� static�� �Ϲ��� ����.
		
		System.out.println("������ ��ü���� : " + Tiger.count );
		//���α׷��� ���� �� Count�� 0�� �Ǿ�� �Ѵ�.
		}
	}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
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
	//OS�� ������ Hello�� new �� ������ Hello �� 2���� Hello�� ������ ���̴�.
	*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex43-1)
class Tiger{
	int n1;
	static int n2;
	static void f1() {
		//n1 = 100; // ������ ������. �ֳ��ϸ� n1�� ���� ���Ǹ� �ǰ� ���� ���� �ʾұ� �����̴�.
		n2 = 100; //�׷��� n2�� ������ �Ǵ� ���̴�.
		//f2() �翬�� ȣ���� �Ұ����ϴ�. ���Ǹ� �ǰ� �޸� ������ ���� �ʾұ� �����̴�.
		f3(); // �� ����ƽ �ȿ����� ����ƽ�� ��� �����ϴ�.
		//****f3()�� �ڿ� �ִµ��� ������ ������ ������ �ѹ� ���� ������ �Ŀ� static�� ��������ٴ� ���̴�.
	}
	void f2() {
		f1(); // �ٸ� �Լ������� �翬�� static ��� �����ϴ�. �ٸ� �Լ��� ����� �� �ֵ���.. static�� �ƴϹǷ� ���Ǹ� �ϱ� �����̴�.
	}
	static void f3() {}
}

public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex42-2
	class Tiger{
	// �ʵ�� �޸� �޼ҵ�� �����ϴ� ���̶� ������ �ѹ� �ۿ� �ȸ���� �ǵ� �� ���̴°�?
	// ��ü ���� ����� ������ ���� ��� �����̴�. �׷��� ���� �о߿��� �ý����� �ӵ��� �䱸�ϴ� �κп� static�� ���� ����Ѵ�.
	static void f1() {
		
	}
	void f2() {
		
	}
	}
	public class Hello {
	//������(Entry Point)
	//Hello�� Ŭ�����̴�. �׷��� �ʵ� �޼ҵ� ������ �� ���� �� �ִ�.
	int age;
	Hello(){
		
	}
	void f1() {
		
	}
	public static void main(String[] args) {
		// main�� �ٷ� ȣ��Ǵ� ������ static�̱� �����̴�.
		// main�� ȣ���� OS�� �ϴ� ���̴�.
		// Hello h = new Hello();
		// h.main();
		// Hello.main()
		
		// �ʵ�� �޸� �޼ҵ�� �����ϴ� ���̶� ������ �ѹ� �ۿ� �ȸ���� �ǵ� �� ���̴°�?
		// ��ü ���� ����� ������ ���� ��� �����̴�.
		// Tiger t1 = new Tiger();
		// Tiger t2 = new Tiger();
	}
	void f2() {
		
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex42-1)
//����⸦ ���� ���赵�� 1���� ����ž�� �̸� ����� ���´�. static.
class Tiger{
	//������ �Ǵ� ���� �� ����ƽ ������ ����ƽ �Լ��� ������ ������. �� �޸𸮷� �̹� ���� ���� ���´�.
	//�׷��Ƿ� ��ü�� �������� �ʾƵ� ����� �����ϴ�.
	//��ü ������ ���� �ʾ��� �� ü�̴��� �Ұ��� �ϱ� ������ ����ƽ �ʵ� �� �޼ҵ�� class �̸� ��ü�� �����Ѵ�. Tiger.����ž()
	//���� ��ü�� �����ϸ� ������ �����ϴ�.
	
	static int n1;
	int n2;
	
	static void ����ž() {
		System.out.println("��");
	}

	void ����() {
		System.out.println("����");
	}
}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		Tiger.����ž();
		t1.����();
		t1.����ž();
		
		System.out.println(t1.n1);
		System.out.println(t1.n2);
		//static ���� 1. �������� ����ҰŸ� ���� ��ü�� ������ ������ ���� ��ų �ʿ���� static���� �����ϸ�ȴ�.
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex)
class Tiger{ // Generate ����� �̿��ؼ� Getter, Setter�� �˾Ƽ� ���� �� �ִ�.
	// ���� Getter, Setter�� �� �� ó���� �ع�����.
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



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex42)
//����ʵ�� ��ü�� �������Ѽ� ���� �ʱ�ȭ�ؼ� ����ϴ� ���� ���� �ҹ��̴�(�ݱ� �� �Ǿ��ִ�.)
// �� Ŭ�������� �˾Ƽ� �ʱ�ȭ�� ��Ű�� �����Ͽ��� �Ѵٴ� ���̴�. Ŭ�������� �ϰ� Main������ ���� ��Ȯ�� �������� �ִ�.
// �� Ŭ���� ���忡�� �ܺο��� �����͸� �����ϰ� ���� �ڽ��� ������ �ǵ鿩�� �Լ� �� �� ������ ��ġ�� ���� �����ϰ� �����.
// �׷��� private�� �̿��� Ŭ������ ������ �ʱ�ȭ ���ѳ��� (����) �Լ��� �̿��� ��� �� �����Ѵ�.(get, set) 
class Tiger{// ��ǰ���� �����ؾ��Ѵ�.
	
	int age2;
	int money2;
	Tiger(){
		age2 = 100;
	}
	
	void fMoney() {
		int sum = money2*10;
		System.out.println(money2);
	}
	
	
	
	//�ܺο��� ����� �� ����. ���м�. ��� ���� �ʵ�� ���� private�� �ϴ� ���� ����.
	//����Ʈ�� public���� ����Ǿ� �ִ�.
	private int age;
	private int money;
	private String name;
	void setName(String n) {
		name = n;
	}
	String getName() {
		return name;
	}
	
	//  getter, setter �Լ�
	//  private �� get, set �Լ��� ����
	// 1. ��°� �Է��� ���� �� �ִ�. (get, set�� �������� �ʴ� �������)
	// 2. ��°� �Է� �� ���ϴ� �͸� ������ �� �ִ�.
	int getAge() {
		return age;
	}
	void setAge(int data) {
		age = data;
	}
	
	// f3���� ���� ������� f1, f2�� private�� �ؾ��Ѵ�.
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
		
// ����ʵ�� ��ü�� �������Ѽ� ���� �ʱ�ȭ�ؼ� ����ϴ� ���� ���� �ҹ��̴�(�ݱ� �� �Ǿ��ִ�.)
// �� Ŭ�������� �˾Ƽ� �ʱ�ȭ�� ��Ű�� �����Ͽ��� �Ѵٴ� ���̴�. Ŭ�������� �ϰ� Main������ ���� ��Ȯ�� �������� �ִ�.
// �� Ŭ���� ���忡�� �ܺο��� �����͸� �����ϰ� ���� �ڽ��� ������ �ǵ鿩�� �Լ� �� �� ������ ��ġ�� ���� �����ϰ� �����.
// �׷��� private�� �̿��� Ŭ������ ������ �ʱ�ȭ ���ѳ��� (����) �Լ��� �̿��� ��� �� �����Ѵ�.(get, set) 
		System.out.println(t1.age2);// �߸��� ��� ���. ���� ����ϰ� �ִ�.
		t1.money2 = 200; // �߸��� �ʱ�ȭ ���. ���ο��� ���� �����ϰ� �ִ�.
		
		//���� ����ϰ� �ʹٸ�
		t1.setAge(1000);
		System.out.println(t1.getAge());//�ùٸ� ��� ���. �ʵ带 ���� �ǵ����� �ʰ� ����ϰ� �ִ�.
		
	}
}
*/


//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex)41
//�����ڴ� ������ �� 1�� �����ȴ�.
class Tiger{
//	//����Ʈ�� �־�����. ������ �����ڴ� 1�� ��������� �ϱ� �����̴�. �׷��� ���� �����ڴ� �츮�� �ȸ��� ���������.
//	Tiger(){
//	
//			}; 
	
//	// �Ϲ������� �̷��� ����� ���´�. �ٸ� �����ڸ� �����ϸ� �� ����Ʈ �����ڰ� ������� ������ �̸� �����س��´�.
	String name;
	int age;
	
	Tiger(){};
	
	
	Tiger(int data){ // �̷��� ���ڸ� ������ �ϸ� �̸��� �͸����� �������ִ� ������ ��Ȳ�� ���� ������ �� �ְ� ���� �� �ִ�.
		name = "�͸�";
		age = data;
	}
	
	Tiger(String n, int data){
		name = n;
		age = data;
	}
	void showData() {
		System.out.println(name + " " + age);
	}

	//��Ŭ�� => �ҽ� => �ؿ��� 3��° autogenerater�� �̿��ϸ� �̷��� ���� �̻ڰ� ���ϴ� ������ �̿��� ���� ��� �ڵ带 ������ �� �ִ�.
	@Override
	public String toString() {
		return "Tiger [name=" + name + ", age=" + age + "]";
	}
	

}

public class Hello {
	public static void main(String[] args) {
		
		Tiger t1 = new Tiger(100); // �����ڸ� ����� ���� ����Ʈ �����ڰ� ������� �μ��� ���� �������� ���� �� ����. �׷��� ���� ����ߵ��� ����Ʈ �����ڸ� ����� ���´�.
		System.out.println(t1.name + " " + t1.age);
		Tiger t2 = new Tiger("ȫ�浿", 200);
		t2.showData();
		
		System.out.println(t1.toString());
		System.out.println(t1);
	}
}

*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
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
		//����Ʈ �����ڴ� ���ڸ� ���� �� ���� ��Ȳ�� ���� �ʱ�ȭ�� ��ų �� ��� �ǹ̰� ����.
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
//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex40-1)

class Tiger{
	
	int age; // 1. �ʱ�ȭ ���1(���� ����) 
	
	Tiger(){ // 2. �ʱ�ȭ ���2(���� ����)
		System.out.println(1);
		age = 100;
	}
	
	Tiger(int data){ // ���ڸ� ���� ������ �����ؼ� ���ϴ� ������ �ʱ�ȭ ��ų �� �ִ�.
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
//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex39)
//������
// 1. ��� ���� : �ʵ� �ʱ�ȭ
// 2. ������ �޼ҵ��� �Ѵ�.(�Լ��̴�.)
// 3. �Լ��� �̸��� �ݵ�� Ŭ���� �̸��� ����
// 4. ������ �Լ��� �μ��� ���޹��� ���� ������, return�� ���� ���� ����. �׷��� void�� ���� �ʴ´�.
// 5. �μ��� ������ ���� �����ڸ� ����Ʈ �����ڶ�� �Ѵ�.
// 6. ȣ���� newŰ���带 ����� �� �� 1�� ȣ��ȴ�. ���α׷��Ӱ� ���Ƿ� ȣ���ϴ� ���� �Ұ����ϴ�.
// 7. �Լ��̱� ������ �����ε��� �� �� �ִ�.
// 8. ������ �ڵ带 �ۼ����� ������ �ڵ����� ����Ʈ �����ڰ� ����� ����. -������ �ڵ带 �ۼ��ϸ� �ڵ����� �����ڰ� ����� ���� �ʴ´�.
// �����ڴ� ����Ⱑ ���۵Ǵ� ������ ������ ���ѳ��� �� ����(set)
class Tiger{
	// �ʵ�
	int age;
	
	// ������: Ŭ���� �̸��� �����ϴ�.
	// �̷��� �μ� ������ ���� ��� ����Ʈ �����ڶ�� �Ѵ�.
	Tiger() {
		System.out.println("������ ��");
		age = 100;
	};
	// �޼ҵ�
	
}
public class Hello {
	public static void main(String[] args) {
		System.out.println(1);
		Tiger t1 = new Tiger(); //new�� ���Ͽ� �ڵ����� ȣ��Ǿ���.
		System.out.println(2);
		Tiger t2 = new Tiger();
		System.out.println(3);
		System.out.println("-----------------------------------------");
		for (int i = 0; i <3 ; i++) {
			Tiger temp = new Tiger(); //���ο� ��ü�� 3�� ��������� 3�� �������.
			System.out.println(temp.hashCode());
		}
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
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
	} //������ �����ε�(overloading)�� �ϱ� ������ �̷� ������ �̿��ߴ�.
	//���� 2, 3 �̷��� ���� ���� ������ ���ϴ� ���̴�.
	
	//�����ε�(overloading) ���
	int getReangle(int x1, int y1, int x2, int y2)
	{
		int width = x2-x1;
		int height = y2-y1;
		return width-height;
	}
	
	int getReangle(int x) {
		return x*x;
	}

	
// ���ϰ����� ������ �Ұ����ؼ� ������ ���.
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
		//���� ���. 
		System.out.println(t1.getReangle2(10, 5, 20 ,15));
		System.out.println(t1.getReangle3(25));
		//�����ε� ���
		System.out.println(t1.getReangle(10, 5, 20 ,15));
		System.out.println(t1.getReangle(25));
		
		String s;
	}
}
*/



/*
//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex38-1)
//�Լ� �̸��� �����ϰ� �۸��� ������ ���
//�Լ� �̸��� �����ϰ� ���x������ ������ 2���� ����� �ִ�.
//�����ε�(Overloading) - ���� ȸ����� �Ի� 1�� ������ ���´�.
class Tiger{
	//1. �μ� ���� ������ �ٸ� ���
	void showMeTheMoney() {
		System.out.println(1);
	}
	void showMeTheMoney(int a) {
		System.out.println(2);
	}
	void showMeTheMoney(int a, int b) {
		System.out.println(3);
	}
	//2. �μ� ���� ������ ������ Ÿ���� �ٸ� ���
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
		
		t1.showMeTheMoney((short)10);//short�� ���� int�� ���� �𸣱� ������ Ÿ�� ĳ������ �ؾ��Ѵ�. �̰��� �ָŸ�ȣ�� ��Ȳ�̶�� �Ѵ�.
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
	///Tiger bbb = aaa; // ����
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
		
		Tiger ccc = t1.m1(aaa); // new �� ������� ����� �ϳ��� ������ ���̴�. ���ʿ� new�� �ϳ� ���������..
		System.out.println(ccc.hashCode());
		System.out.println(ccc.number);
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex36)
class Tiger{
	int num = 100;
}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		System.out.println(t1.hashCode());//�ĺ� ��ȣ�� �޴´�.
		Tiger t2 = new Tiger();
		System.out.println(t2.hashCode());//�ĺ� ��ȣ�� �޴´�.
		Tiger t3 = null;
		//System.out.println(t3.hashCode());//������ ���. Null Pointer Exception
		t3 = t1;
		System.out.println(t3.hashCode());// ���� �ؽ��ڵ尡 ���. ���� new Tiger �ּҸ� �����ϴ� �������̶�.
		System.out.println(t1.num);
		t1.num = 200;
		System.out.println(t3.num);
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
 * 
 * ex35)
class Tiger{

}

class Lion{
	//Tiger t = new Tiger();
	void m1(int a, String s, Tiger t, Lion l) {//�ڱ� Ŭ������ ��ü�� �ִ� �͵� �����ϴ�.
		//null�� ���ڷ� �޾Ƶ� ������� ������ ������ ���� �ʴ´�.
		if( s != null) { //null�� ���ڷ� ���� �� �ִ� Ȯ���� ������ �̷� ������� �ڵ尡 ����. �̰��� ������� ���α׷��̶�� �Ѵ�.
			
		}
	}
	
	Tiger m2() { // ���� Ŭ������ ���� �����ϴ�.
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
		t1.m1(10, "ȣ����", new Tiger(), new Lion());
		t1.m1(10, null, null, null);
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex34)

class Tiger{
	//8���� ������Ƽ�� Ÿ�� + class
	void m1(float a, String s) { 
	// Ŭ������ �μ��� ���޹��� �� �ִٴ� ���� ���鸸 ���� Ŭ������ �μ��� ���� �� �ִٴ� ���̴�.
		//System.err.println(a);//����ó�� ������ּ���
		System.out.println(a+ " " +s);
		
		System.out.println(s.length());
		
	}
	
	String m2() {
		// ��� 1
		//return "ȣ����";
		// ��� 2
		String s = "������";
		return s;
	}
}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.m1(3.14f, "ȣ����");
		//1.
		t1.m2();
		String s = t1.m2();
		//2.
		System.out.println(s);
		//3.
		System.out.println(t1.m2());
		
		//String s2; // ������ ��ü�� ���� �ȴٸ� ���� �̸��� �������� ���̴�.
		//ex) ����Ⱑ ��������� �̸��� ���� 747�� �ϰڴ�.
		//s2.length(); //�翬�� ����Ⱑ ������� ���� �ƴϹǷ� ������ ���.
		
		// null�� �̿��ؾ��� s2�� ��ü�� �ƴϴٶ�� ���� ��������� ǥ���Ѵ�.
		String s2 = null;
		String s3 = "�ڳ���";
		s3 = null;
	}
	String m3() {
		return null;// ������ ���ϱ� ���ؼ� �ϴ� null�� ����
	}
}



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex33)
class Tiger{

}
public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		
		// ���ڿ��� ���������� �����Ѵ�.
		// ù�ڰ� �빮�ڶ�� ���� Ŭ������� 
		// ���� ���� ���� ����.
		// �ڹٿ��� ǥ������ �����ǰ� �ִ� ǥ�� Ŭ�����̴�.
		// ������ �ٸ��� method�� ���� �ִ� �� �ñ�(String�� Ŭ�����̴ϱ�) ���� String�� ���� ���� �ִ�.
		String s1 = new String(); //String ���� ���콺 Ŀ���� ������ ���� f3�� ������ ������ �� �� �ִ�.
		s1 = "ȣ����";
		System.out.println(s1);
		System.out.println(s1.length());//��Ʈ�� �ɸ� �� �� �ִ� �Լ��� �� �� �ִ�. �����̾� Ÿ���� �ȵȴ�.
		
		// ��� ǥ���̴�.
		String s2 = "�޹���";
		System.out.println(s2);
		
		Thread t; // Thread�� ��ӹްų� Runnable�� �������̽� �߰��϶�� ������ ������ Runnable�� �������̽��� �߰� �س��Ҵ�.
		
		Math m;
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
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
		// �̸��� ��ø�� ��� �켱 ����.
		// 1. �ϴ��� ���� ������ ���� ����Ѵ�.
		// �μ� ���� ���� ���ȴ�.
		int result = a+ b;
		System.out.println(result);
		// �ʵ��� a, b�� ����ϰ� �ʹٸ�....
		// this >> Ű���带 ����Ѵ�.
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
	}//�⺻���� ��� ����
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex31

import java.util.Iterator;
import java.util.Random;



class Tiger{//������ �������
	void f1() {
		System.out.println(1);
		
	}
	void f2() {
		f1();//������ ����� ��� �����ϴ�. �Լ� �ȿ����� �Լ��� ������ �� ����. Ŭ���� �ۿ��� ������ �� ����.
		System.out.println(2);
	}
	void f3() {
		f2();
		System.out.println(3);
	}
	
	//��ȣ ȣ��
	void f4() {
		System.out.println(4);
		f5();
	}
	void f5() {
		System.out.println(5);
		f4();
	}//���� ���.
	
	// ���ȣ��(recursive call)
	void f6() {
		System.out.println(6);
		f6();//��� ȣ�� (���̵� ���α׷�) �׷��� �� ����ϸ� ������ �����ϴ�.
	}
	//��Ʈ�� . ���� ���ϴ� ������ ���� ������ �Ȱ��� ����� ��ȣ���� ��� �ϴ� ������ Ǯ �� �ִ�.(���ȣ��)
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

//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*//**************************�߿�***************************
//ex)30
class Tiger{
	//1.�ܸ�(x)
	//2 =
	//3 ��¿���
	//���ڴ� ������ �޾Ƶ� 1 ���� ���� ����(������ ���� ����� ����)
	// ������ �ִ�. FuncName(){}
	// void: ~�� ����. �Լ������� ���ϰ��� ���ٷ� ǥ��
	void func01() {
		
	}
	int func02() {//void�� �ƴ� ���� �ݵ�� return�̶�� Ű���尡 �־�� �Ѵ�.
		//������ �����̾� Ÿ�� �� ��� �������.
		//return 0;//�켱�� ������ ���ϱ� ���� return 0;�� �ϴ� ���̴�.
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
//		return 100;// return�� �Լ� ���� ����
//		//System.out.println(1000);
		
		//print ���� ���� �Ұ����ϴ�.
	}
	//���� Ű���� ��� ���̴�.
	
	//void���� return Ű���� ��밡���ϴ�.
	void func04() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i==5) {
				//break;
				return; // ���ϸ� ����� �����ϴ�.
			}
		}
		System.out.println("for �� �ߴܵ�"); // �� ���� ��ü�� �ȶ��.
//		System.out.println(1);
//		return;
		//System.out.println(1);
	}
	
	// 4��° ���� , ���ڵ� �ְ� ���ϵ� �ִ�.
	int func05(int num) {
		
		//return num* num; // �켱 return 0�� �����س��� �����Ѵ�.
		int result = num* num;
		System.out.println(result);
		return result;//���� ����. �̷��� �޾� ���� ���� �и� �ѹ� ������� ���ٵ��� ���� �ٸ��� �� �̿��ؾ��Ѵٴ���  ������ �ִ�.
	}
	
	int func06(int num) {
		return num*num; //���⼭ �ٷ� println�� ������� �ʴ� ������ �̰��� ��� �ܿ� �ٸ� ���� �̿��� �� �ֱ� ����.
	}
	
	// ��Ģ�� �����. -1�� ���ϵ� ��� ����, +1...����..�̷� ���� �Լ��� if������ ���� ����. �ؿ� �̿��� ���� Ŭ������ ��� ���� �ִ�.
	int func07(int num) {
		if(num<0) {
			//System.out.println("������"); ��� ǥ�� ���̺귯�������� �˸����� �ʰ� Ʋ�� ��� ������ �ƴ϶� -1 ���� ���� ���Ͻ�Ų��.
			//�� ��Ģ�� �����. -1�� ���� �� ���� ������ ����̴� ����...
			return -1;//�� �̻� ���α׷��� ����Ǿ�� �ȵȴٴ� ���� ������.
		}
		
		if (num%2 == 0) {
			System.out.println("¦");
		}else {
			System.out.println("Ȧ");
		}
		
		return 1;
	}
}

public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		// 1. �ܸ�
		t1.func02();
		//2. ���� �� ���
		int num = t1.func02();
		//int num = 100;
		System.out.println(num);
		//3
		System.out.println(t1.func02()); // t1.func02�� 100���� ���´ٰ� �����ϸ� �ȴ�.
		
		System.out.println(t1.fun03());
		
		//���� ������ ��ã�´�.
		//System.out.println(t1.func01());
		
		//�޼ҵ忡�� return Ű���带 ������ �Լ��� �ߴܵȴ�.
		//� ������ �ڵ尡 ������ �Ǵ��� return�� ������ �Ѵ�. ���ǹ����� �����ؾ� �Ѵ�. return�� �������� ��찡 �ֱ� �����̴�.
		
		
		t1.func04();
		
		System.out.println(t1.func05(3));
		System.out.println(t1.func06(5));
		System.out.println(t1.func06(3)+t1.func06(5));
		
		if(t1.func07(-4)== -1) {
			System.out.println("���� �� �ٽ� �õ����ּ���"); //�̷� ������ if���� return�� ��Ģ���� ���ϴ� ����� ����� �����ϴ�.
		};
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex29)
// �޸���� �������� �θ��� �Ϳ� ȣ���Ѵٰ� �Ѵ�. (memory ȣ��(call))
// �޸� 3�̶� �� �� �޸��� 3�� ¢�� �Ѵ�. 3�� �μ���� �Ѵ�. ���� �����ڴ� ���� ������ �ʴ´�.
/*
class Tiger{
	void m1() {
		System.out.println("��");
	}
	void m2(int num) { // =�̶�� ���� ������ �Ͼ��.
		System.out.println("��" + "*" + num);
	}
	void m3(int num) { // num�� ���������� ������ �ȿ����� �̿� �����ϴ�
		for(int i = 0; i<num;i++) {//�̷� ������ ���ڸ� �� �̿��غ���
			System.out.print("��");
		}System.out.println();// ln�� �����Ϸ��� �ȿ� ���ڰ� �־���Ѵ�. ln�� �ִ� ��� �ٳѱ�Ⱑ �ֱ� ����.
	}
	//void m4(int num,b)//�ȵȴ�..
	void m4(int a, int b) {
		System.out.println(a+b);
		System.out.println(a*b);
	}
	
	
	
	void m5(int w, int h, char ch, boolean b) {// a, b�� �����ʰ� ���� ���� �������� �ִ´�. ~4,5�������� ������ �̼� ����
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
			// n�� �������μ� 5�ܸ� ���� ���� 5�� �ٲٰ� ���� ������ Ȱ�뵵�� ������ ������.
		}
	}
	void m7(int n) {
		int sum = 0;
		for (int i= 1; i<=n;i++) {
			sum += i;
			}
		System.out.println(sum);
		}
	// �ð��� �޸𸮰� ���� ��� ���� ����� ��ٰ� �Ѵ�. �Լ��� ������ �� ����, �μ��� �þ ������ ����� ���.
	// �Ҵ� �� ���� ��� ���� ���� ������ ����ȭ�� ���Ѽ� �Լ�ȭ�� ���� �Ѵ�.
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
		t1.m8(8, 7, '��', '��');
		t1.m1();
		t1.m2(3);
		t1.m3(8);
		t1.m3(14);
		t1.m4(3, 4);
		// ù���� �μ��� ����, �ι�° �μ��� ���� �������� ���� ����.
		t1.m5(5, 4, '*', true); //�Ȼ���ϴ� ���ڵ� ä���־���Ѵ�.
		t1.m6(19);
		t1.m7(100);
		
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex28)
/*class Tiger{
	// 1. void f1() {} 
	// 2. void f1(int a) {}
	// 3. int f1() {}
	// 4. int f1(int a) {}
	
	// 1. ���Ͼ��� f1(�μ����� ����) {} 
	// 2. ���Ͼ��� f1(�μ����� ����) {}
	// 3. �����ִ� f1(�μ����� ����) {}
	// 4. �����ִ� f1(�μ����� ����) {}
	
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



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
public class Hello {
	public static void main(String[] args) {
		//�ڵ��� ��Ȱ��
		//�Լ�(�޼ҵ�) : ���� ���Ǵ� �ڵ带 �����ؼ� ��Ȱ���Ѵ�.
		
		Tiger t1 = new Tiger();
		System.out.println(1000);
		t1.method01(); // �Լ��� ȣ���Ѵ�.
		//���α׷����� ����(�б�)�� �Ͼ�� Ŭ���� ������ �޼ҵ�� �����Ѵ�. �� ���� �� ������ �� �����Ѵ�.
		//�� ���� �ڱ� �ڸ��� ���ƿ� �� �ٽ� ���������� �̵��Ѵ�.
		System.out.println(2000);
		t1.method01();
		
		Tiger t2 = new Tiger();
		t2.method01();
		System.out.println("-----------------");
		// �Լ� ���� ���� �ƹ��� ���� ���۵Ǿ �������� �ѹ� �ۿ� �ȸ��������.(�ʵ�� ���鶧���� �������)
		t1.method02();
		t2.method02();
	}
}
*/



/*
//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex)27
//���������� Ŭ���� �̸��� ù���ڴ� �빮��.
//���赵
class Airplane{ 
	//������ ��� ������ ���� ����� ���� �޸𸮸� �Ҹ��ϰ� �ִ� ��Ȳ�̴�.
	
	// 1. �ʵ�(����) >> �Ӽ�
	int a; // int fuel;
	float b;
	int seat;
	int[] ar = new int[4]; // Ŭ������ ���� �ص� �� �ִ�. �ۿ��� �ʱ�ȭ ����.
	
	int num = 99;
	// 2. ������
	// 3. �޼ҵ�(�Լ�) ������ ���� �� �����Ѵٸ� 1, 2, 3 ������ ����.
}

public class Hello {
	public static void main(String[] args) {
		//���赵 = Ŭ����
		//���� 
		// 1. ������
		// 2. �Ӽ�(��, ����)  => ����, �ʵ�
		// 3. ����(����) = �⸧ ����, ����, ������ ����ø���.
		// => �޼ҵ�(�Լ���� ���� ���� �ʴ´�. ���ʿ� Ŭ���� �ۿ� �޼ҵ�(�Լ�)�� ����� ����)
		// �ʼ� ������ 2�� 3��. ������� ����⸦ ��ü��� �Ѵ�.
		// ��ü�� ����� ������ �ν��Ͻ���� �Ѵ�.(�Ｎ���� �����.) => ��������� ������ �ν��Ͻ���� �ϰ� ������� ���� ��ü�̴�
		// ���� ��ü�� ���� ���赵, â�� ��ü�� ���� ���赵 �� ���赵 3�������� �� �̿��ؼ� ����⸦ �������.(�̰��� ��ü ���� ���α׷��̶�� �Ѵ�.)
		// �������� ���� �Ⱓ�� ������ �鿡�� �ξ� ����. �ٸ� �ӵ����� ������ �� ������.
		// ��� Ŭ����(���赵)�� �ʵ�� �޼ҵ�� �����ϰ� ����� �� ���� ������Ʈ(��ü)
		
		// Airplane a = new Airplane(); // new�� �ּҰ� ����?
		//Airplane airplane = new Airplane(); �� �� ���� �� ���̹�
		//Airplane air // ���� ���� ���� �� ���̹�. 1��°�� 1 �Ⱥ��̰� �� �� �ٷ� air2�� ���̹�.
		//���� ����Ⱑ ���������.
		Airplane air = new Airplane();// new���� ���� �޸� ���� ����
		//air.a = 10;
		air.b = 20.0f; //dot(chaining)���� ����� ���� ����
		air.seat = 30;
		System.out.println(air.a);// �Է��� �Ǿ����� ������ 0���� �ʱ�ȭ �Ǿ� ����.
		System.out.println(air.b);// �ʵ�(���)�� ����ϰ� �ִ�. �ʵ� =���(�ʵ� �޼ҵ� ������ ���θ� ����) ����, ��� �޼ҵ帻�� ��� �Լ���� ��.
		//�翬�� ���� Ŭ�������� ���� ��ü���̴��� ���� ��ü�� ����� �ּ� ���� �ٸ� ���̴�. 
		Airplane air2 = new Airplane();
		air2.seat = 40;
		System.out.println(air.seat+ " " + air2.seat); //���� ���� �ٸ���.
		
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
		
		air.ar = new int[8]; // ������ �� ���� ����
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
//		// ar�� ����ߴٰ� ġ��
//		// ������ 10���� �������.
//		// �׸��� ���ο� 20���� �����ȴ�.
//		ar = new int[20]; //new�� �޸� ��û
//		// �޸� �ݳ� �ڵ� => C������ delete ar;�� �ݳ��� ��û�ؾ������� �ڹٿ����� �˾Ƽ� �ڵ����� �ݳ������ش�.
//		
	}
}
//������ Ŭ���� 1���� ���� 1��
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex26)
/*
public class Hello {
	public static void main(String[] args) {
		// 0 0 0 0 0 0 �հ� ���� �������� ��, ��ȯ�� ���������� �����͸� �����س��� �ذ��ؾ��Ѵ�.
		Random rnd = new Random();
		int num = 50;
		int[] ar = new int[num];
		for (int i = 0; i < ar.length; i++) {
			// ������ ����(�ʱ�ȭ)
			ar[i] = rnd.nextInt(20);
		}
		//�� ���̿� ���� �߰� �ڵ尡 ���� �ԷµǾ� �ִ� ���� �����̹Ƿ� ������ ���Ű� ����� ���� ���� �ʴ´�.
		for (int i = 0;i<ar.length;i++) {
			// ������ ���
			System.out.print(ar[i] + " ");
		}System.out.println();// ��Ģ�� �˾Ƴ��� ���� �������� ������ �ǹ� �ִ� �ൿ�̴�.
		
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



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex25) �迭(array)
/*
import java.util.Random;

public class Hello {
	public static void main(String[] args) {
		//2���� �迭�� �� ������� �ʴ´�.
		// 1. ����, new�� �� �� ���� ���̿��� �Ѵ�.
		int[] arr = new int[4]; //(4*4)byte �޸�. ����Ʈ�� 0�� ������ �Ǿ��ִ�.
		int arr0, arr1, arr2, arr3; // ���� ���� ����.
		// 2. �ʱ�ȭ�� ��ŭ �޸� Ȯ��. ���� ���ÿ����� ���� ����̴�.
		//������ �鸸 ���� ������ �� ������ �޸� Ȯ���� �ϱ� ������ ���� ��� x
		int[] brr = new int[] {10, 20, 30}; // �ڵ����� 3���� �޸𸮰� ���������.
		// 3. ����.
		int[] crr = {10, 20, 30}; // int�� ��ӹ޾Ƽ� �����Ѱǰ�? 
		//�����ؼ��� 1�� ����� ����.
		
		// arr�� ������ 10�� �ִ�.
		// ex)1
		arr = new int[10]; //arr�� 4byte���� �ּҸ� �����ϴ� ���� ���̴�. (���ÿ� �ִ�?)
		arr[0] = 10;
		System.out.println(arr[0]);
		System.out.println(arr[1]); // �ʱⰪ
		//�޸� �ʱ�ȭ�� �Ƚ�Ű�� �ֱ� ������ C�� JAVA���� �� ������.
		//�׷��� JAVA�� C ���� ����ȭ �Ǿ��ִ�.
		arr[9] = 20; // ����� �� �ִ� ���� ������ n�� -1��
		System.out.println(arr[9]);
		
		//ex2)
		//0-9
		//arr[-5] = 100; //�ߴܵ�
		//arr[10] = 100;
		//ArrayIndexOutOf~ ���α׷��� �ߴܵǾ� ȣ���� ��� �Ұ���
		System.out.println("ȣ����");
		
		//ex3) ���� ��� �� ������� ����
		int num = 4;
		arr[num*2-7] = 999;
		System.out.println(arr[1]);
		
		//ex4)
		arr[5] = 7;
		arr[arr[5]] = 888; // �迭��ȣ 7���� �ְڴٴ� �ǹ�.
		System.out.println(arr[7]);
		arr[arr[5]*2-7] = 777;
		System.out.println(arr[7]);
		
		//ex5
		System.out.println("-----------------------");
		System.out.println(arr.length);
		
		//ex6)
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " "); //���� ln�� ���� �ʰ� �����
		}System.out.println(); // �ٹٲ��� �̷� ������ ������ �ڿ� �ִ´�.
		System.out.println("������");
	}
}*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
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
		case 0:{//�� �� �̻��� ��� �̷��� �ۼ��Ѵ�.
			for (int i = 0; i < 10; i++) {
				System.out.println("������ " + num+" * "+i+" = " + num*i);
			}
			
		}break;
		
		case 1: {
			int sum = 0;
			for (int i = 0; i <= num; i++) {
				sum += i;
				
			}
			System.out.println(num+ "���� ���� " + sum);
		}break;
		
		default: break;
		}
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex23
public class Hello {
	public static void main(String[] args) {
		int score = 87;
		switch (score/ 10) {
		case 10://break
			//10�̳� 9�� A�� ����ϱ� ���� break����.
			//�ǵ����� �ƴ��� �˱� ���� break �ּ� �ܴ�.
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



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex22
public class Hello {
	public static void main(String[] args) {
		//1. switch �ȿ� ������ ����� �� �ִ�.
		//2. case �ڿ� ������ ����� �� ����.
		//3. break�� �����ϸ� switch�� ���������� �ʴ´�. �����ϸ� break ���� ������ �����.
		//4. �����ϴ� �б⹮�� ���� ���� default�� �̵��Ѵ�. �ȳ־ ���X
		//5. ����, ����, ���ڿ� ��� �бⰡ �����ϴ�.
		//6. �ǵ������� break�� �����ϱ⵵ �Ѵ�.
		int num = 90;
		int nn = 10;
		char ch = '��';
		switch (ch) {
		//case nn: >> ����� �� ����.
		case '��': {
			System.out.println(1);
			//break; �̷��� �����ϸ� 20���� ���´�. 
		}
		case '��': {
			System.out.println(2);
			break;
		}
		case 30: {
			System.out.println(3);
			break;
		}
		default:
			System.out.println("ȣ����");
			break;
		}
	}
}*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex21)
public class Hello {
	public static void main(String[] args) {
		Random rnd = new Random(); // ǥ�� ���� �ܺ� Ŭ����

		int num = rnd.nextInt();

		if (num < 0) {// for���� �� �� ����.
			num = -num;// -���� ���� �� �����Ƿ�.
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



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex20)
/*
public class Hello {// ��ڼ�
	public static void main(String[] args) {
		int num = 12312;
		
		while(true) {
			System.out.println(num);
			if(num % 2 == 0) {
				num = num /2;
			}
			else {
				num = num*3+1;
			}// �������� 3�� ���� �ڵ�
			
			System.out.println(num);
			num = (num % 2 == 0) ? num / 2:num * 3 + 1;
			if( num == 1) {
				System.out.println(num);
				break;
			}
		}
	}
}*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex19) while( ����ϰ� ���: for)
public class Hello {
	public static void main(String[] args) {
		int num = 0;
		while( true ) {
			// ���� �ݺ��ϸ� ���� �� ��ư�� ���. �� ���� �� ��ư�� ���α׷��� ���� ���̶�� ���̴�.
			// debug�� ���� ���α׷� ���� �߿� ������ �ȵǴ� �� �˰� �ѹ� �� ������ 2���� ���� �� �� �ִ�.
			// �� �� �ϳ��� ���� ���ѹ����� 1���� ���µ� �� ���� ����׷� �� ���ִ�.
			// ����� â�� terminate remove�� �� �������� �ȴ�.
			num++;
			System.out.println(num);
			
		}
	//System.out.println("ȣ����");//������ ���. while���� true�� �־� ����� �ʱ� ������
	
		int num2 = 0;
		while(num2<4) { // �ݺ�ȸ���� �ƴ� �� while���� ���� ���� �������� �ʴ´�.
			System.out.println(num2);
			num2++;
		}
		int num3 = 0;
		while(true) {
			//�̷��� ���ǹ��� �ɾ �ȿ��� ���������� �ϴ� ���� ����
			if(num3 == 4) { //�׷��� �̷��� �ݺ�Ƚ���� �˸� while�� �����..������� �ʴ´�.
				System.out.println("Ż�� ��");
				break;
				//System.out.println("unreach code");
			}
			System.out.println(num3);//����� �ȵȴ�. �ٷ� break ������ ���������� ������
			num3++;
		}
		
	}
	// even �� �� n = n*3+1 , odd �� �� n = n/2 ��ڼ�(��ڶ������� �׷��� ���·�). �ᱹ 1�� ��������.
	// �̰��� �ݺ� ȸ���� �� �� �ִ°�? �̰��� �𸥴� �� �� �����Ƿ� while���� ����Ѵ�.
	// �н����� ���� �� ���� �Է¹��� �� ���� ��� while��.(�Է� ���� �����ϰ�)
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex18-2
/*public class Hello {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {//�׻� ���ο� ����
			for (int j = 0; j < 4; j++) {//�׻� ���ο� ����
				//���θ� �ݺ��ϴ� ���� ���θ�ŭ.
				System.out.print("* ");//ln�� ���� �ٹٲ��� ���� �ʴ´�.
			}
			System.out.println();// ���� for���� �˰����� ��ǥ����
		}
		System.out.println();
		System.out.println("------------------------");
		for (int i = 0; i < 3; i++) {//�׻� ���ο� ����
			for (int j = 0; j < 4; j++) {//�׻� ���ο� ����
				//���θ� �ݺ��ϴ� ���� ���θ�ŭ.
				System.out.print("["+i+" "+j+"]");//ln�� ���� �ٹٲ��� ���� �ʴ´�.
				//��Ģ�� �ľ��ϸ� ����. �� ��Ģ�� �� �� ���� ���ؼ� ¦���� �ľ��ϸ� ü������ ���� �� �ִ�.
			} 
			System.out.println();// ���� for���� �˰����� ��ǥ����
		}
		System.out.println("------------------------");
		int width =8;
		int height = 3;
		for (int i = 0; i < height; i++) {//�׻� ���ο� ����
			for (int j = 0; j < width; j++) {//�׻� ���ο� ����
				if((i+j)%2 == 0) {// ���� ���÷� ��Ģ�� �ľ��ؼ� if�� �ۼ�
					System.out.print(" O ");
				}
				else {
					System.out.print(" X ");
				}
				
				system.out.print((i+j)%2 == 0?" 0 ":" x ");
				//�̰͵� �̷��� ���׿������� ���� �� �ִ�.
			} 
			System.out.println();// ���� for���� �˰����� ��ǥ����
		}
		
		System.out.println("-----------");
		int result;
		if(3>2) {
			result = 10;
		}
		else {
			result = 20;
		}
		// �׻� if else�� �޴� ���� �����ϴٰ� �����Ǵ� ���� ������ ���׿������� �����Ѵ�.
		result = (3>2) ? 10:20; //���� �����ϴ�. else�� �ݷ��̶�� �����ϸ� ����.
		//(3>2) ? result = 10: result = 20; �̴� Ʋ����.
		
		int func() {
			if( 3> 2) {
				return 100;
			}else {
				return 200;
			}
			//(3>2)?return 100: return 200; �߸��� �ڵ�
			return (3>2) ? 100: 200; //�̰� �´�.
		}
		
		
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
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



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex17
/*public class Hello {
	public static void main(String[] args) {
		int num = 5;
		for (int i = 0; i < 10; i++) {
			System.out.println(num +" * " +i + " = " + num*i);
		}//num�� �ٲ� ������ 7������ �ٲٰ� for�� ��ü�� �Ȱǵ��̴� ������ �ܺκ����� ���� �ٲܶ�
		//�� § �ڵ��̴�.
		System.out.println("--------------------------------");
		
		
		int sum = 0;
		int num2 = 1000;
		for(int i = 1; i <= num2; i++) {
			//sum = sum + i;
			sum += i;
			//System.out.println(sum);
			//num2�� �־ for���� �ǵ����� �ʰ� 100������ ���� ���ߴ�.
		}
		System.out.println(sum);
		
		int sum2 = 1;
		int a = 3, b= 4;
		//2�� 8��
		for (int i = 0; i < b; i++) {
			sum2 *= a;
			// ? = 1 * 2
			// ? = (1*2)*2
			// ? = (1*2)*2)*2
		}
		
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex 16
/*public class Hello {
	public static void main(String[] args) {
		//���� 1
		for (int i = 0; i < 4; i++) {
			//ù��° ���ڷ� , �ι� ° ���ڴ� if�� Ʋ���� Ż�� �ƴϸ� ���� �� 3��° ���ڷ� ���� ����
			//break���� ������ �ٷ� Ż��
			//continue�� �� �ڸ����� �ٷ� 3��° ���ڷ� �ٽ� ��������.
			//for���� ���� �� �ٷ� ��� �� �� �� �� �־���Ѵ�.
		}
		//����2
		for (int i = 1; i<= 4; i++) {
			System.out.println(i);
			//�ι�°�� ������ ������ �� ���� �� �ݺ� Ƚ������ �Ѵ�.
		}
		//����3
		for (int i = -3; i<= 3; i++) {
			System.out.println(i);
			//������ �������� ��ǥ�� ����� �� �� ���
			//�Ǵ� �� ��찡 �� �� ��캸�� ����ȭ���� �ξ� �����ؼ� �ٲٴ� ��찡 �ִ�.
		}
		//���� 3���� ��� ����� ���ǹ� ���̴� ����� ���δ�.
		
		for (int i = 32; i<= 100; i+=18) {
			
		}
		for (int i = 32; i> 2; i--) {
			//�̷��� �� �� ���� for�� ���ǹ��� ������ ������ ��Ͼȿ� ������ ��������
			//for���� ������ ����� �����̴�.
		}
	}
}*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
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
		}// swich�� �ٲٴ� ���� ��Ģ�̴�.(swich�� ���ϴ� �������� �ٷ� �����ؼ� �������� �ӵ��� ����.)
		//else if�� ���������� �� ������� ���� ���� �ִ�. �׷��� �̰� �̿��ϴ� ���α׷��� ���� �ʴ�.
		
		if(false) {
			System.out.println(1);
		} else if(false) {
			System.out.println(2);
		} else if(false) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}// ���� if �� 1���� if�� ��� ����
	}
}*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
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
			System.out.println("Ʋ��");
		} else {
			System.out.println("����");
			System.out.println("������ �α��� �Ͽ���");
			System.out.println("���� ���� Ȯ��");
		}//if else�� ¥¯ «�Ͱ� ���� ��Ȳ�� �ؾ���. �� ¥�� �ƴϸ� �Ͽ����� �ȵȴ�.
		//�׻� ���� ���� �����Ǿ��ϴµ� ���� ��� ��ó�� �� �κи� ���ſ�� �ȵȴ�.
		password = 1234;
		if(password != 1234) {
			System.out.println("Ʋ��");
			//break; return; exit(); continue; �������� ������������
		} 
			System.out.println("����");
			System.out.println("������ �α��� �Ͽ���");
			System.out.println("���� ���� Ȯ��");
		//�̷��� �Ǿ��Ѵ�.
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
			nn = +nn; // ����ζ�� �̰��� �¾ƾ� �ϳ� else�� ��Ǭ ���� �´� �κ��̴�.
			// �ӵ��� ��ȭ�� �ֱ� �����̴�. ���� �ȵ��� �𸣱� �����̴�.
			while() {
				if(nn<10) {
					nn = - nn;
				}else {
					nn = +nn;
				}
			}//�̷��� �ؼ� �����غ��� else�� ���� �� �ð��� �Ҿ����ϴ�. sin()���� �Լ���
			//����Կ� �־ ������ �ð��� �����Ǿ��ϴ� ���� �߿��ϱ� �����̴�.	
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
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



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex12
/*public class Hello {
	public static void main(String[] args) {
		// if, for, while, switch: >> >> do while(��� ����.)
		����: () {
					
				}
		if(����) {
			
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



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex9)
public class Hello {
	public static void main(String[] args) {
		// C -> �˰����� Ÿ�� �´�. , Java�� �̿��� ���� �˰��� å�� ������ �˰����� ����.
		// Java�� �˰����� ���̺귯�� ���ױ� �����̴�.
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



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex8)
/*public class Hello {
	public static void main(String[] args) {
		int n = 10;
		n = 20;
		System.out.println(n);
		// ex1)
		n = n + 10;
		System.out.println(n);
		// ex2) �� ������(������(���� ����) �ӵ�).���������� stack�� �̿��ϱ� ������ �� ��� ���� �� ��찡 ����.
		// ���� �ӵ��� ����.
		n += 10;
		System.out.println(n);
		
		n = n + 1;
		n += 1; // ����� add(+) �� ���� move��� ������ ����.
		n++; //���� �ӵ��� ���� ������. ���� ���� ����� ����� ����ϱ� ������.
		++n;
		
		n = 10;
		int a, b;
		a = n++; // ���� ����
		// a = 10, n= 11
		System.out.println(a + " " + n);
		n = 10;
		b = ++n; // ���� ����
		System.out.println(n + " " + b);
		// a = 11, n = 11
		
		//func(a){}, func(10) �� ���� �����̶�� ���ٴ� a=10 �̶�� ���̴�.
		//func(a){}, func(b++) �� �ϸ� ������ ���� ���޵Ǵ� ���� �ƴ� ���̴�.
		
		//string s = new string("abc")
		//f(string s) == f(new string("abc"))
		//��ø�.. string a = new string(a)�� public string(new string(a))��� ��?
		
	}
}*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex8)
public class Hello {
	public static void main(String[] args) {
		//1. �����̸��� �ߺ��� �� ����.
		int apple;
		//int apple; (x)
		
		//2. ��ҹ��� ���еȴ�.
		int Apple;
		
		//3. ù���ڰ� ���ڰ� �ƴ϶�� ���� ��밡��
		int Apple123;
		// int 9Apple; ù ���� ���� �Ұ���
		
		//4. _ $ 2���� �����ϸ� Ư������ ��� �Ұ���
		int apple_num; //������ �ռ�
		int _34; //3�� 4���� 34�� ǥ���� �� _�� ���.
		
		//5. �ѱ� ��� ����(������ ���Ѵ�.)
		int ��� = 10;
		System.out.println(���);
		
		//6. �ܾ� �ռ��ÿ��� ī�� ǥ��� ���
		int bananaNumber = 10;
		
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex6,7)
	public class Hello {
	public static void main(String[] args) {
		//�޸��� ��û(�ּҸ� �˾ƾ��ϹǷ�)
		//byte: �޸� 1�� �ּ���  , short 2�� ,int 3�� �ּ���, long 4���ּ��� : ���� ����
		//���� int�� ������ ������ ����Ѵ�.
		byte apple;
		// �޸� 1�� �ּ��� �����̶�� �̸�����. ���ڸ� �����ų �� �����Ƿ� ������� �� �ݴ�� ���
		// = �� ���Կ�����
		apple = 10;
		System.out.println(apple);
		apple = 20;
		System.out.println(apple);
		//apple = 200; ������ ���. +- 128~127�̶�. 128�� �Ұ����ϴ�.
		
		
		// short Ÿ��
		// banana ����(variable)
		// = ���� ������
		// 20 ���ͷ�(=�� �̿��� ���ԵǴ� ����)
		short banana = 20; // ��Ȳ�� ���� ������� ���� �޸𸮸� �� �޶�� �ϴ��� ���� ��
		
		int orange = 30;//20�� �Ѿ�� ���� ��
		
		long kiwi = 2222222;
		
		// byte ���� boolean(1), char(2), float(4 �Ҽ���), double(8)
		boolean t1 = true;// false
		char t2 = 'A';//���� 1�� ���� ����
		char t3 = '��';
		char t4 = 65; //���������� ���x (�������� ��������.)
		System.out.println(t2);
		System.out.println(t3);
		System.out.println((int)t2);
		System.out.println((int)t3); //�� �������� int�� ���޶�
		System.out.println((char)(t3+1));//���� ���� 45000�� .�׷��� char�� 2byte���� 0~60000���� ǥ�������ϴ�.
		System.out.println(Character.MIN_VALUE);//?�� ���..casting�� �ؾ��Ѵ�.
		System.out.println((int)Character.MAX_VALUE);
		
		char a = 'A', b =20;
		System.out.println(a+b);//����ó�� ��������� ����ϴ� ���� �ƴ� A ���� 20��° ���ڰ� ���Ĵ� ���� ��븸 ����
		
		float t5 = 3.14f; //�������� f�� ������ �־�� �Ѵ�. 4 byte
		double t6 = 3.14; //double�� f�� ����. f�� ������ ���� ������.
		//�� ������ ���� double�� ���� ���ΰ�..? ������ ������ ���µ� 
		//������ ��ȿ������ ���̱� ���ؼ� ����ϴ� ���� �´°�? �޸��� ��ȭ��
		//���� ���̺귯�������� double�� ����Ѵ�.
		
		//���� 8�� Ÿ���� �⺻ Ÿ��. �� �ܿ� ����.
		float sum = 0.0f;
		for (int i = 0 ; i<100;i++) {
			sum = sum + 0.1f;
		}
		System.out.println(sum); // ��������� ������ ���´�. double�� �ٲٵ� �ذ��� �ȵ�.
		double sum1 = 0.0;
		for (int i = 0 ; i<100;i++) {
			sum1 = sum1 + 0.1;
		}
		if(sum==10.0f){
		System.out.println("�ȵȴ�.");
		}//���� �� ��ü�� �ҹ��̴�.
		
		System.out.println(sum1);
	}
}*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex5)
public class Hello {
	public static void main(String[] args) {
		//�޸� ���� ���� 1�� = 1 bit , �̰��� 8�� ���̸� 8 bit= 1 byte �̰��� �ϳ��� �޸� �̰��� ���̸� ��
		//2, 4, 8, 16 byte ������ �޸� ��û ����.
		//2^n(������ ����)�� ǥ���� �� �ִ� ������ ����. 1byte = 2^8=256�� �ܿ��� ���� �Ⱥ�.
		//������ ���´� �� ���� ���� 0���� �� Ŀ�� ���±����� ����� �� 7���� ǥ��
		//�׷��Ƿ� 2^8�� 0~255���� ǥ��
		//-4 -3 -2 -1 +1 +2 +3 +4
		// 0  1  2  3  4  5  6  7 �̸� -���� 0�� �����Ƿ� -������ +4�� ���ش�
		//�׷��� ������ -2^(n-1)~+(2^(n-1))-1 �� 1byte�� ������ -128~127�̴�.
		//2byte ��
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);//2byte +-3��
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);//4byte +-20��
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);//4byte +-20��
		System.out.println(Long.MAX_VALUE);
		//��� ���� �� crtl + i �� �ٸ���
		
		
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
//ex4
public class Hello {
	public static void main(String[] args) {
		//��� ����: >, >=, <, <=, ==,!=
		System.out.println(10>7);
		System.out.println(7>=7);
		System.out.println(15<=15);
		System.out.println(12!=12);
		System.out.println(1==1);
		System.out.println("-----------------");
		//�� ����: &&(and), ||(or)
		System.out.println(false||false);
		System.out.println(false||true);
		System.out.println(true||false);
		System.out.println(true||true);
		System.out.println("-----------------");//���� ���ϰ�
		System.out.println(false&&true);
		System.out.println(false&&false);
		System.out.println(true&&true);
		System.out.println(true&&false);
		//1. ��� 2. �� 3. �� ���� ������� �Ͼ��.
		System.out.println(3+2>7 && 2+6<8);
		// �ᱹ �������� �������� �����Ƿ� true �ƴϸ� false ���� ���.
		System.out.println(!true);//!()�� ������ �ǹ�
		System.out.println(!(3>2));//�簢�� �ȿ� x�� �־����� ���� �ڵ忡!�� �ٿ�
		// �簢�� �ȿ� x�ڵ尡 �ִ���? �Ǵ� �ۿ� x�� �ִ��� ���� ������ ���� ����
		// !(GameOver) = T/F�� �ϸ� GameOver�� �ݴ븻�� �����Ƿ� GameOver�� �ƴϳ�?
		// ��� ���� �� ���
	}
}
*/


//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//ex3
/*
 public class Hello {
 
	public static void main(String[] args) {
	//���� ����
	System.out.println(1+2);
	System.out.println(3-4);
	System.out.println(5*6);
	System.out.println(5/4);
	System.out.println(7%6);// 1777%7�� �ϸ� 0~6 ���̸� ���� �� �ִ�.
	//1234���� %10�� �̿��ؼ� 4�̰� 3�̰� 2�̰� 1���� �� �ִ�.
	//%�� �����ϰ� �� ���ȴ�.
	System.out.println(3+4*5);//��, �������� �� �켱�̴�.
	System.out.println((3+4)*5);//()�� �̿��� �켱 ���� ����.
	System.out.println((2+3)*(4+5));//���� �켱 ������ �̿��ؼ�.
	
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
// ex2)
/*
public class Hello {
	public static void main(String[] args) {
		System.out.println(100); //����
		System.out.println('��'); //''�� ���� ����.�ݵ�� �Ѱ� �̻�
		System.out.println("ȣ����"); //���ڿ�
		System.out.println(100+200); //����+����
		System.out.println(100+"ȣ����"); //����+���� = ���ڿ�
		System.out.println("ȣ����"+100); //����+���� = ���ڿ�
		System.out.println("������ ��"+": ����"); //���ڿ�+���ڿ� = ���ڿ�
		System.out.println("100"); //���ڿ�
		System.out.println("100"+100); //���ڿ�
		System.out.println(10+20+"30"); //��->��
		System.out.println("ȣ����"+10+20); //�ᱹ ���� �۵��� �Ͼ�� �ʴ´�
		System.out.println(10+" "+20+" "+30); // ���� �� �Ѳ����� ����
		System.out.println(10+'A'); // ���ڴ� ��������� �Ͼ�� �ƽ�Ű �ڵ�� ġȯ
		System.out.println(1+'A'); // 
		System.out.println((char)(1+'A'));// B�� ���´�. Ÿ�� ĳ�����̶�� �θ���.
	}
}
*/



//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
// ex1)
/*
  public class Hello { public static void main(String[] args) {
  
  System.out.println(1000); //��� �ý���(�޼ҵ�) System.out.println(1000); //���
  �ý���(�޼ҵ�)
  
  System.out.println(); System.out.println(); }//�ϳ��� ���.
  
  }
*/