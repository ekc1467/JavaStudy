package Pack02;

import java.io.*; // ���� ���̸� ��ü�� �ǹ�.



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

class Dog<T>{ // ���� Ÿ���� ��ü ������ �� �˷��ִ� ���� ���׸��̶�� �Ѵ�.
	T data;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}

//�̷��Ե� ��� �����ϴ�. ���ڳ� ���� ���� �����ϴ�.
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
		//Dog���� T�� ���� Integer�� �ȴ�. <>�� �����̳ʶ�� �θ���.
		//Dog<int> gt1= new Dog<int>(); int ���� �����̾� Ÿ���� ���� �Ұ����̴�. Ŭ���� Ÿ�Ը� �����ϴ�.
		Dog<Integer> gt1= new Dog<Integer>(); // new �� <Integer>�� ������ �� ������ �������� ���� �������� ����
		gt1.setData(100);
		//Dog<Float>
		Dog<Float> gt2= new Dog<Float>(); 
		gt2.setData(2.22f);
		//Dog<Boolean>
		
		Tiger t1 = new Tiger();
		t1.setData(100);
		System.out.println(t1.getData());
		
		Lion t2 = new Lion();
		t2.setData("ȣ����");
		System.out.println(t2.getData());
		
		Cat t3 = new Cat();
		// �ʵ��� ���¸� string���� float�Ϸ��� �׾��� ����� �̷��� �ٲ� �� �ۿ� ����. �׷��� ���׸��� �̿����� �ȴ�.
		t3.setData(3.14f);		
		System.out.println(t3.getData());
	}
}

*/

/*
//ex76) bmp������ read, bmp������ ���� ���� �� ������.
public class Hello {
	public static void main(String[] args) {
		try {
			//java.io.FileNotFoundException ��� ���ܰ� �߻��ϸ� ��γ� ���� �̸� ��Ÿ�̴�.
			Reader reader = new FileReader("sample.txt");
			System.out.println(1000);
			//int java.io.Reader.read() throw IOException
			//int readData = reader.read();
			
			while(true) {
				int readData = reader.read();
				if(readData == -1) { //���� ���̸� ���� ��ó�� -1�� ���ϵȴ�. EOF
					System.out.println("������ ��� ����");
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
		
		m1(); // Ŭ���� ��ü�� ���� �� �ʿ���� main�� static���� �̷���� �ٷ� �����Ǿ� m1 ���� static���� ���� �Ǿ��־�߸� ��� �����ϸ�
		//main �Լ� ���� ��� ���뵵 new ���� �ٷ� ���� ��Ű�� ���븸 �����ϴ�.
	}
}
*/


/*
//ex75)
public class Hello{
	public static void main(String[] args) {
		int height = 5;
		int width = 6;
		for (int i = 0; i < height; i++) {//�׻� ���ο� ����
			for (int j = 0; j < width; j++) {//�׻� ���ο� ����
				if((i+j)%2 == 0) {// ���� ���÷� ��Ģ�� �ľ��ؼ� if�� �ۼ�
					System.out.print(" o ");
				}
				else {
					System.out.print(" x ");
				}
				
				//System.out.print((i+j)%2 == 0?"O ":"X ");
				//�̰͵� �̷��� ���׿������� ���� �� �ִ�.
			} 
			System.out.println();// ���� for���� �˰����� ��ǥ����
		}
		
		try {
			//open : ���ҽ��� ���� ����. ���� close �ʰ� ���� �̷�� ��찡 ���Ƽ� �׻� ��������� �Ѵ�.
			// �̹� ���� ���� �����ϸ� ��� �����. => ��ĳ���� => F3���� ���� OutputStreamWriter�� ��� �޾Ұ� OutputStreamWriter�� ��� ���� ���� Writer�̴�.
			Writer writer = new FileWriter("sample.txt");
			for (int i = 0; i < height; i++) {//�׻� ���ο� ����
				for (int j = 0; j < width; j++) {//�׻� ���ο� ����
			writer.write((i+j)%2 == 0?"O ":"X ");
				}
				writer.write("\n");
			}
			
			
			//close : ���ϸ� ��� ���.
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
		
		//���� ������� ���� �������� �Ѱ��� ���� �ݵ���. ������
		// �ڹٿ� ���þ��� �ý��� �� ������ �Ѳ����� ���� �ִ� ���� ������ �ִ�. �ݵ�� �ݾƾ� �ѹ��� �� �� �ִ� �ڿ��� �پ���� �ʴ´�. (�׸���, ���伥 ���� ������ ���� �̿��ϴ� �ٸ� ���� ���α׷����� ���� ���Ѵ�.)
		try {
			//open : ���ҽ��� ���� ����. ���� close �ʰ� ���� �̷�� ��찡 ���Ƽ� �׻� ��������� �Ѵ�.
			// �̹� ���� ���� �����ϸ� ��� �����. => ��ĳ���� => F3���� ���� OutputStreamWriter�� ��� �޾Ұ� OutputStreamWriter�� ��� ���� ���� Writer�̴�.
			Writer writer = new FileWriter("sample.txt");
			
			writer.write("apple");
			writer.write("\n");//�� �ٲ�.
			writer.write("ȣ����");
			//writer.write(null);
			
			//close : ���ϸ� ��� ���.
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
		System.out.println("ȣ����1");
		if(a > b) {
		System.out.println("ȣ����3");
		}
		else {
			//�Լ� ���� �ߴ�.
			return;
		}
		System.out.println("ȣ����3");
	}
	static void m3(int a, int b) {
		try {if(a>b) {
			System.out.println("ȣ����1");
		}
		else {
			return;}
		
		return;
		} catch(Exception e)
		{
			//�Լ� ���� �ߴ�.
			return;
		}finally {System.out.println("ȣ����3");
			
		}
	}
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		
		System.out.println(m1());
		m2(1, 2); // �ߴ��� �������� ȣ���� 3�� ����ϰ� �ʹٸ�?
		m3(1, 2); // final�� ���� return�̴� else�� ������ �߻��ϴ� ������ ����ǹǷ� ȣ����3�� ��µȴ�.
//		try {
//			System.out.println(2/1);
//		} catch (Exception e) {
//			System.out.println(1);
//		//finally�� ������ ����ȴ�.
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
			//sleep ���� ������ �̿��ؼ� try catch�� ����ؾ��Ѵ�.
			//�ڹٿ� ������ ���̽� ������ �� �� ���� ������ ���� �Ͼ�µ�(Unhandle ����) �̷��� �� �����Ѵ�.
			try {Thread.sleep(1000);}catch(Exception e) { // 1000 ms == 1, �� �ٷ� ���� ����.
				
			}
		}
		
		
	}
}
*/


/*
//ex71) ���ܸ� ���α׷��Ӱ� ���� �߻� ��ų �� �ִ�.
class Tiger{
	//��� 1
	void f1(){
		System.out.println("�Լ� 1");
		
		try {
			//������ ������ ���� ������ �޴� ���� �־�� �Ѵ�. �� ��� catch�� �޴´�.
			throw new Exception(); //���� �߻� ��Ű��
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//���2
	void f2() throws Exception { // Exception�� ���� �� �Լ��� ȣ���ϴ� ������ �޾ƶ�� ��. ���� ���ѱ��.
		System.out.println("�Լ� 2");
		 //Exception�� ���� �� �Լ��� ȣ���ϴ� ������ �޾ƶ�� ��. ���� ���ѱ��.
		throw new Exception(); // ���� �߻�Ű���
		//�޴� ������ �ذ��ϴ� 2�� ����� ���� ���δ�. ������ �޴� ������ ���� �������� Ȯ���ϰ� �ذ��� �� catch���� ���� �����ؼ� �ذ��ϱ� �����̴�.
	}
}



public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.f1();
		System.out.println("ȣ����1");
		
//		//Unhandled exception => ����ϴ� ����� �޾ƶ�.
//		//������ �ߴ� ���� �� ���� ������ ���� Unhandled exception�̶�� ���.
//		t1.f2();
		
		try{
			t1.f2();
		}catch(Exception e) {
			
		}
		System.out.println("ȣ����2");
		
	}
}
public class Hello{
	public static void main(String[] args) throws Exception { 3. � ü���� ���Ѱܹ�����.
		
	}
}
*/


//ex70) // ������ try catch�� ��������� �ʴ´�.
/*class Tiger{

}

public class Hello {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		
		//int[] ar = new int[3];// 0 1 2
		
		// 1. �迭 �ε��� ������ �����. ���� ���� �޽����� ��µȴ�.
		// ArrayIndexOutOfBoundsException
		// ar[3] = 10; 
		
		// 2. java.lang.ArithmeticException
		// System.out.println(5 / 0);
		
		// 3. NullPointerException
		String s = null;
		// s.length();
		
		//���ܰ� �߻��ϸ� ���α׷��� �ߴܵȴ�. ���ܰ� �߻��ϸ� ���α׷��Ӱ� �����϶�� ���̴�.
		// ó������ ���ܰ� �߻��ϸ� ���α׷��� �ߴܽ�Ų�ٴ� ������ �ϸ� �ȵȴ�. ���⿡ ���ܰ� �߸� ���Ḧ �ϴ� ���� �ƴ϶� �߸��� ���� �˷��ְ� ���� �ؾ��Ѵ�.
//		int[] ar = new int[3];// 0 1 2
//		System.out.println("ȣ����1");
//		ar[3] = 10;  // >> ���⼭ �ߴܵȴ�.
//		System.out.println("ȣ����2");
		
		
		
		
		//������ �� �迭�̳� ������ ���� ��� ������ try catch�� �Ŵ� ���� ����.
		int[] ar = new int[3];// 0 1 2
		System.out.println("ȣ����1");
		
		try {
			ar[3] = 10; // >> ���⼭ �ߴ��� ������ �ȵȴ�.
		} catch (Exception e) {
			//���ܰ� �߻��ϸ� catch ������� ���´�.
			System.out.println("�߻�");
			//ArrayIndexOutOfBoundsException��� ���ܰ� �ִٴ� ���� ����� ������ ������ �� ���� �ƴϴ�.
			//e.printStackTrace(); 
		}
		System.out.println("ȣ����2");
		
		try {
			System.out.println(5 / 0);
		} catch (Exception e) {
			System.out.println("�߻�");
		}
		System.out.println("ȣ����3");
		
		String s = null;
		try {
			s.length();
		}
		catch(Exception e){
			System.out.println("�߻�");
		}
		System.out.println("ȣ����4");
		
		//���� 4���� if���� �Ŵ� ���� �����̴�.
		
		//s�� ���� �ڵ尡 ������� ���� �߰��� ���� �ٸ� �ڵ尡 ���� ������ �𸣱� ������ if������ ������� ���α׷��� ¥���Ѵ�. 
		s = new String("������");
		if (s != null) {//null�ϼ��� �ְ� �ƴ� ���� �ִ�. API ���̺귯�������� ������� ���α׷� �� �ڵ��� �ʼ��̴�.
			s.length();
		}
	}
}*/