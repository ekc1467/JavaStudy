package Pack05;
//ipconfig => IPv4 �ּ� (������ �� �� ���� IP�� �ٲ�� ���� IP�̴�. ���� ���� IP �̴�.)
//Port ��ȣ: ���
//������ ��Ʈ�� ������� Ŭ���̾�Ʈ�� ��Ȯ�� ��Ʈ ��ȣ�� ������ ������ ���� ������ �޴´�.
//Ŭ���̾�Ʈ ���� �� �Ѵ� ������ ������ �־�� �Ѵ�. ����� �ϱ� ���� ��ü�̴�. ���� ��ȣ�� ������ �� ���� ��ȣ��� �Ѵ�.
//������ ���ϰ� Ŭ���̾�Ʈ�� ������ ���(����)�� �Ϸ� �� ������ ������ �Ͼ�鼭 ���ο� ��� ������ �����ȴ�(����������).
//���ܳ� ��� ������ ���� ��ȣ�� ������ ����ִ�.
//������ A���� HI��� ������ ������ ������ �����, ������� ��� ���� ��� ���� ��ü���� �����͸� �����Ѵ�. �׸� ���� �� ������ ��� A���� ������ �Ѵ�.
//��ũƮ ����Ʈ�� ���� ��ȣ�� ���� �����Ѵ�.
//package Network__;
//
//import java.io.InputStream;
//import java.net.InetSocketAddress;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.Scanner;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//
////���ŷ�� ���� ������� ����
//class ClientThread extends Thread {
//	Socket socket;
//
//	ClientThread(Socket socket) {
//		this.socket = socket;
//	}
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		try {
//			InputStream is = socket.getInputStream();
//			byte[] recvData = new byte[512];
//			// read�� ���ŷ �Լ��̴�.
//			while (true) {
//				int size = is.read(recvData); // ������ ��������� -1�� ���Ϲ޴´�.
//				if (size == -1) {
//					System.out.println("Ŭ���̾�Ʈ ���� ����");
//					break;
//				}
//				String s = new String(recvData, 0, size);
//				System.out.println(s);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//}
//
//class ConnectThread extends Thread {
//	@Override
//	public void run() {
//		try {
//			ServerSocket ss = new ServerSocket();
//			// if(ss == null) {
//			// System.out.println("������ ������ �� ����.");
//			// exit(); // ������ �������� �ʱ� ������ ������ ������ ����.
//			// }
//			System.out.println("���μ��� ���� ����");
//
//			// �����Ϸ��� Ŭ���̾�Ʈ�� üũ�ϱ� ���� ������ ���� ip�ּҿ� ��Ʈ ��ȣ�� ������ ����ؾ��Ѵ�. => ���ε�
//			// Ŭ���̾�Ʈ�� ���ε��� �ʿ����.
//			// ss.bind("ip�ּ�",                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ��Ʈ ��ȣ); 157.xxx.xxx
//			ss.bind(new InetSocketAddress("192.168.0.88", 5001)); // ��Ʈ 0~ 10�� ����. 1024������ ��Ʈ��ȣ�� ������ ����� ��� ��.
//			// ss.bind("ip�ּ�",��Ʈ��ȣ);
//			System.out.println("���ε� �Ϸ�");
//			// ������ �����ϱ� ���� ������ ���� ���� ip�� ���ÿ� ���߾�� �Ѵ�., ���� localhost���� ���ڸ� �Է��ؾ��ϳ� localhost
//			// ������ ���� ip�� �˾Ƽ� �Է�
//			// ���ŷ �Լ� UI���� ���� ���� ���ú� ���� ������
//			// �������� ������ ���ָ� Ǯ������ �����Ǿ�����. => �� �κп��� ���ŷ �ɸ��� UI�� ���� ������ �ɷȴٰ� �Ǵ��Ѵ�.
//			// ���� ���½��ѹ����� ACCEPT�� ��ٷ��� ����������. �� ������� ���� ��ٸ����� �ؾ��Ѵ�.
//			// 1. ���� ���� X
//			// 2. ������ ��ȯ ���� O
//			
//			Socket socket = ss.accept();
//			System.out.println("������ ������ �õ�����.");
//			ClientThread ct = new ClientThread(socket);
//			ct.start();
////			new Thread() {
////				@Override
////				public void run() {
////					
////					
////				}
////			}.start();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//}
//
//public class ServerNet extends Application { // Ŭ���̾�Ʈ�� �����ϰ� ������ �����ؾ��Ѵ�.
//
//	public void start(Stage stage) throws Exception {
//		VBox root = new VBox();
//		root.setPrefSize(400, 300);
//		root.setSpacing(5);
//
//		Button btn1 = new Button("���� ����");
//		btn1.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//				// TODO Auto-generated method stub
//				ConnectThread ct = new ConnectThread();
//				ct.start();
//			}
//		});
//
//		root.getChildren().add(btn1);
//		Scene scene = new Scene(root);
//		stage.setScene(scene);
//		stage.setTitle("Server");
//		stage.show();
//	}
//
//	public static void main(String[] args) {
//		launch();
//		// System.out.println("���� ����");
//		// try {
//		//
//		// ServerSocket ss= new ServerSocket();
//		// // if(ss == null) {
//		// // System.out.println("������ ������ �� ����.");
//		// // exit(); // ������ �������� �ʱ� ������ ������ ������ ����.
//		// // }
//		// System.out.println("���μ��� ���� ����");
//		//
//		// // �����Ϸ��� Ŭ���̾�Ʈ�� üũ�ϱ� ���� ������ ���� ip�ּҿ� ��Ʈ ��ȣ�� ������ ����ؾ��Ѵ�. => ���ε�
//		// // Ŭ���̾�Ʈ�� ���ε��� �ʿ����.
//		// //ss.bind("ip�ּ�", ��Ʈ ��ȣ); 157.xxx.xxx
//		// ss.bind(new InetSocketAddress("localhost", 5001)); //��Ʈ 0~ 10�� ����. 1024������
//		// ��Ʈ��ȣ�� ������ ����� ��� ��.
//		// //ss.bind("ip�ּ�",��Ʈ��ȣ);
//		// System.out.println("���ε� �Ϸ�");
//		// //������ �����ϱ� ���� ������ ���� ���� ip�� ���ÿ� ���߾�� �Ѵ�., ���� localhost���� ���ڸ� �Է��ؾ��ϳ� localhost
//		// ������ ���� ip�� �˾Ƽ� �Է�
//		// //���ŷ �Լ�
//		// ss.accept(); // �������� ������ ���ָ� Ǯ������ �����Ǿ�����.
//		// System.out.println("������ ������ �õ�����.");
//		//
//		// }
//		// catch(Exception e) {
//		// e.printStackTrace();
//		// } => �� �ڵ�� ��ư���� �Ű��.
//		
//		System.out.println("���� ����");
//	}
//}
//
//
////������ �������� -----------------------------------------------------------------------
///*package Pack;
//
//
//
//import java.io.InputStream;
//
//import java.net.InetSocketAddress;
//
//import java.net.ServerSocket;
//
//import java.net.Socket;
//
//import java.util.Scanner;
//
//
//
//import javax.print.DocFlavor.INPUT_STREAM;
//
//
//
//import javafx.application.Application;
//
//import javafx.event.ActionEvent;
//
//import javafx.event.EventHandler;
//
//import javafx.scene.Scene;
//
//import javafx.scene.control.Button;
//
//import javafx.scene.layout.VBox;
//
//import javafx.stage.Stage;
//
//
//
//public class Server extends Application{
//
//	@Override
//
//	public void start(Stage stage) throws Exception {
//
//		VBox root=new VBox();
//
//		root.setPrefSize(400, 300);
//
//		root.setSpacing(5);
//
//		//-------------------------
//
//		
//
//		
//
//		Button btn1=new Button("��������");
//
//		
//
//		//���⼭���� ���ؾϵ�...��
//
//		
//
//		btn1.setOnAction(new EventHandler<ActionEvent>() {
//
//			
//
//			@Override
//
//			public void handle(ActionEvent arg0) {
//
//				// TODO Auto-generated method stub
//
//				
//
//				new Thread() {//���ø����̼� �ȿ�������
//
//					@Override
//
//					public void run() {
//
//						// TODO Auto-generated method stub
//
//						
//
//						try {//������ ������ �� �� ����
//
//							
//
//							ServerSocket ss=new ServerSocket();
//
//							System.out.println("���μ��� ���ϻ���");
//
//							//ss.bind("ip�ּ�",��Ʈ��ȣ);
//
//							//ss.bind("ip�ּ�",��Ʈ��ȣ);// Ŭ������ ��Ͻ�Ű�� �ٷξϹް�
//
//							//127.0.0.1==localhost �Ȱ���ǥ��
//
//					
//
//							ss.bind(new InetSocketAddress("localhost",5001));// �� �Ǿ� ������
//
//							System.out.println("���ε� �Ϸ�");
//
//							
//
//							//���ŷ�Լ�, �ϳ��� ���������� , �ϳ��� ��������, �ϳ��� �����͹޴� ���� ������ �־�� ������,.
//
//							Socket socket=ss.accept();//�Ѿ��� ��ٸ�, ui�� ���ο��� �ڱ� �۾��� ����ؾ��ϴµ� accept�� ui�� �۾��� �ؾ��ϴµ� ��� �������� �������ֱ� ��ٸ��� �ִ�. 
//
//							//�����͸� �޴� ����
//
//							
//
//							System.out.println("������ ������ �õ�����.");   //�׷��� �� �ΰ��� �浹�� ���°�, �׷��� ��ٸ��� �۾��� ������� �϶�� �Ѱ�!
//
//							
//
//							
//
//							//�ι���������()�����͹���
//
//							new Thread() {
//
//								@Override
//
//								public void run() {
//
//									try {
//
//										InputStream is=socket.getInputStream();//��Ʈ�� ����
//
//										byte[] recvData=new byte[512];
//
//										
//
//										int size=is.read(recvData);//���������Ͱ� ����
//
//										//5qkdlxmsms 10d�� ��
//
//										//������ �����Լ��� ���ŷ��
//
//										//�Ѹ���� ���α׷��� ������ �ȵ�
//
//								
//
//										String s=new String(recvData,0,size);
//
//										System.out.println(s);
//
//										
//
//										
//
//									} catch (Exception e) {
//
//										// TODO: handle exception
//
//									}
//
//									//InputStream is=socket.getInputStream();//��Ʈ�� ����
//
//									
//
//								}
//
//							}.start();//������ �������,���� ������ �����/?
//
//							
//
//							
//
//							
//
//						} catch (Exception e) {
//
//							// TODO: handle exception
//
//						}
//
//					}
//
//				}.start();
//
//				
//
//			}
//
//		});//-----> �׷��� �����忡 �־����?
//
//		
//
//		root.getChildren().add(btn1);
//
//		
//
//		
//
//		//---------------------------------
//
//		Scene scene=new Scene(root);//��Ʈ ��Ͻ�Ŵ
//
//		stage.setScene(scene);
//
//		stage.setTitle("Server");
//
//		stage.show();
//
//		
//
//		//���� ���̿� ��Ʈ���� ��ġ
//
//
//
//}
//
//	
//
//
//
//	public static void main(String[] args) {
//
//		launch();
//
//		// TODO Auto-generated method stub
//
//		System.out.println("Server Start");
//
//		
//
//		//��Ű�ü��������
//
//		try {
//
//			ServerSocket ss=new ServerSocket();
//
//			System.out.println("���μ��� ���ϻ���");
//
//			//ss.bind("ip�ּ�",��Ʈ��ȣ);
//
//			//ss.bind("ip�ּ�",��Ʈ��ȣ);// Ŭ������ ��Ͻ�Ű�� �ٷξϹް�
//
//			//127.0.0.1==localhost �Ȱ���ǥ��
//
//	
//
//			ss.bind(new InetSocketAddress("localhost",5001));// �� �Ǿ� ������
//
//			System.out.println("���ε� �Ϸ�");
//
//			
//
//			//���ŷ�Լ�
//
//			ss.accept();//��ٸ��°�
//
//			System.out.println("������ ������ �õ�����.");//�� ���ڰ� �ȳ����� ������ 
//
//											//accep�̺��ŷ�Ǿ��ִٴ� ��
//
//			//�������� ������ ���ָ� ���ŷ�� Ǯ����
//
//			
//
//			
//
//			//�ڱ��ڽſ��� �ڽ��� ������ ����صδ°��� ���ε��̶�� �Ѵ�.
//
//			//������ �ݵ�� ���ε��̶�� �۾��� �ʿ��ϴ�
//
//			//Ŭ���̾�Ʈ�� ���ε��� �ȿ����(���Ӹ��ϴ� ����̱� ������) ������ Ȯ���ϸ� �Ǵϱ�
//
//			//if(ss==null) {
//
//			//	System.out.println("������ ������ �� ����.");
//
//			//	exit();
//
//			//}
//
//			
//
//		} catch (Exception e) {
//
//			// TODO: handle exception
//
//			e.printStackTrace();//� �ͼ����� ���� �𸣱� ������ 
//
//		}
//
//		System.out.println("���ڸ� �Է��ϸ� ������ �����մϴ�.");
//
//		new Scanner(System.in).nextInt();//Ű���� �Է¹���
//
//		System.out.println("Server End");
//
//		//������ �������� i�ּҸ� ������ ������ ������ �Ұ��̴�.
//
//	}
//
//
//
//	}
//
//	
//
//}
//*/

