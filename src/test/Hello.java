//��� �׽�Ʈ
package test;


class Aaa{
	void f1() {};
}

class Bbb extends Aaa{
	void f2() {};
	void f1() {System.out.println("�ȳ��ϼ���");}
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
//�ͼ� �����غ���
//��ĳ���ð� �򰥸�
public class Hello {
	public static void main(String[] args) {
		a g= new a();
		g.aa();
		g.bb();
		g.cc();
	}
}

*/