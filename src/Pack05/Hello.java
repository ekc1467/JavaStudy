package Pack05;
//ipconfig => IPv4 주소 (부팅을 할 때 마다 IP가 바뀌면 유동 IP이다. 보통 고정 IP 이다.)
//Port 번호: 경로
//서버도 포트를 열어놓고 클라이언트가 정확한 포트 번호로 정보를 보내면 서버 측에서 받는다.
//클라이언트 서버 측 둘다 소켓을 가지고 있어야 한다. 통신을 하기 위한 객체이다. 고유 번호가 나오는 데 소켓 번호라고 한다.
//서버의 소켓과 클라이언트의 소켓이 통신(접속)을 하려 할 때마다 조인이 일어나면서 새로운 통신 소켓이 생성된다(서버측에서).
//생겨난 통신 소켓의 소켓 번호는 서버가 들고있다.
//서버는 A에게 HI라고 전달을 받으면 소켓을 만들고, 만들어진 모든 소켓 통신 통해 전체에서 데이터를 전달한다. 그를 통해 그 소켓의 담당 A에게 답장을 한다.
//리크트 리스트로 소켓 번호를 전부 저장한다.
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
////블로킹은 따로 스레드로 빼자
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
//			// read는 블록킹 함수이다.
//			while (true) {
//				int size = is.read(recvData); // 접속을 끊어버리면 -1을 리턴받는다.
//				if (size == -1) {
//					System.out.println("클라이언트 접속 종료");
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
//			// System.out.println("소켓을 생성할 수 없다.");
//			// exit(); // 소켓이 생성되지 않기 때문에 진행할 이유가 없다.
//			// }
//			System.out.println("메인서버 소켓 생성");
//
//			// 접속하려는 클라이언트를 체크하기 위해 서버인 나의 ip주소와 포트 번호를 스스로 기억해야한다. => 바인딩
//			// 클라이언트는 바인딩이 필요없다.
//			// ss.bind("ip주소",                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  포트 번호); 157.xxx.xxx
//			ss.bind(new InetSocketAddress("192.168.0.88", 5001)); // 포트 0~ 10만 가능. 1024이하의 포트번호는 국가나 기관이 사용 중.
//			// ss.bind("ip주소",포트번호);
//			System.out.println("바인딩 완료");
//			// 나에게 접속하기 위해 어차피 나와 나의 ip를 동시에 맞추어야 한다., 원래 localhost에는 숫자를 입력해야하나 localhost
//			// 적으면 나의 ip를 알아서 입력
//			// 블로킹 함수 UI전용 연결 전용 리시브 전용 세가지
//			// 누군가가 접속을 해주면 풀리도록 구현되어있음. => 이 부분에서 블로킹 걸리면 UI가 무한 루프에 걸렸다고 판단한다.
//			// 서버 오픈시켜버리면 ACCEPT만 기다려서 터져버린다. 즉 스레드로 따로 기다리도록 해야한다.
//			// 1. 접속 소켓 X
//			// 2. 데이터 교환 소켓 O
//			
//			Socket socket = ss.accept();
//			System.out.println("누군가 접속을 시도했음.");
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
//public class ServerNet extends Application { // 클라이언트를 종료하고 서버를 종료해야한다.
//
//	public void start(Stage stage) throws Exception {
//		VBox root = new VBox();
//		root.setPrefSize(400, 300);
//		root.setSpacing(5);
//
//		Button btn1 = new Button("서버 오픈");
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
//		// System.out.println("서버 시작");
//		// try {
//		//
//		// ServerSocket ss= new ServerSocket();
//		// // if(ss == null) {
//		// // System.out.println("소켓을 생성할 수 없다.");
//		// // exit(); // 소켓이 생성되지 않기 때문에 진행할 이유가 없다.
//		// // }
//		// System.out.println("메인서버 소켓 생성");
//		//
//		// // 접속하려는 클라이언트를 체크하기 위해 서버인 나의 ip주소와 포트 번호를 스스로 기억해야한다. => 바인딩
//		// // 클라이언트는 바인딩이 필요없다.
//		// //ss.bind("ip주소", 포트 번호); 157.xxx.xxx
//		// ss.bind(new InetSocketAddress("localhost", 5001)); //포트 0~ 10만 가능. 1024이하의
//		// 포트번호는 국가나 기관이 사용 중.
//		// //ss.bind("ip주소",포트번호);
//		// System.out.println("바인딩 완료");
//		// //나에게 접속하기 위해 어차피 나와 나의 ip를 동시에 맞추어야 한다., 원래 localhost에는 숫자를 입력해야하나 localhost
//		// 적으면 나의 ip를 알아서 입력
//		// //블로킹 함수
//		// ss.accept(); // 누군가가 접속을 해주면 풀리도록 구현되어있음.
//		// System.out.println("누군가 접속을 시도했음.");
//		//
//		// }
//		// catch(Exception e) {
//		// e.printStackTrace();
//		// } => 위 코드는 버튼으로 옮겼다.
//		
//		System.out.println("서버 종료");
//	}
//}
//
//
////스레드 빼내기전 -----------------------------------------------------------------------
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
//		Button btn1=new Button("서버오픈");
//
//		
//
//		//여기서부터 이해암됨...ㅠ
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
//				new Thread() {//어플리테이션 안엥에있음
//
//					@Override
//
//					public void run() {
//
//						// TODO Auto-generated method stub
//
//						
//
//						try {//스레드 안으로 다 들어갈 내용
//
//							
//
//							ServerSocket ss=new ServerSocket();
//
//							System.out.println("메인서버 소켓생성");
//
//							//ss.bind("ip주소",포트번호);
//
//							//ss.bind("ip주소",포트번호);// 클래스로 등록시키낟 바로암받고
//
//							//127.0.0.1==localhost 똑같은표현
//
//					
//
//							ss.bind(new InetSocketAddress("localhost",5001));// 내 피씨 아이피
//
//							System.out.println("바인딩 완료");
//
//							
//
//							//블로킹함수, 하나는 유아이전용 , 하나는 접속전용, 하나는 데이터받는 전용 쓰레드 있어야 ㅎ나다,.
//
//							Socket socket=ss.accept();//한없이 기다림, ui는 메인에서 자기 작업을 계속해야하는데 accept가 ui가 작업을 해야하는데 계속 누군가가 접속해주길 기다리고 있다. 
//
//							//데이터를 받는 소켓
//
//							
//
//							System.out.println("누군가 접속을 시도했음.");   //그래서 이 두개가 충돌이 나는것, 그래서 기다리는 작업을 스레드로 하라고 한것!
//
//							
//
//							
//
//							//두번쨰쓰레드()데이터벋음
//
//							new Thread() {
//
//								@Override
//
//								public void run() {
//
//									try {
//
//										InputStream is=socket.getInputStream();//스트림 만듦
//
//										byte[] recvData=new byte[512];
//
//										
//
//										int size=is.read(recvData);//읽은데이터가 저장
//
//										//5qkdlxmsms 10d이 들어감
//
//										//하지만 리드함수가 블로킹임
//
//										//한마디로 프로그램이 진행이 안됨
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
//									//InputStream is=socket.getInputStream();//스트림 만듦
//
//									
//
//								}
//
//							}.start();//스레드 만들어짐,점속 스레드 사라짐/?
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
//		});//-----> 그래서 스레드에 넣어야함?
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
//		Scene scene=new Scene(root);//루트 등록시킴
//
//		stage.setScene(scene);
//
//		stage.setTitle("Server");
//
//		stage.show();
//
//		
//
//		//여기 사이에 컨트롤이 배치
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
//		//통신객체만ㄷㄹ기
//
//		try {
//
//			ServerSocket ss=new ServerSocket();
//
//			System.out.println("메인서버 소켓생성");
//
//			//ss.bind("ip주소",포트번호);
//
//			//ss.bind("ip주소",포트번호);// 클래스로 등록시키낟 바로암받고
//
//			//127.0.0.1==localhost 똑같은표현
//
//	
//
//			ss.bind(new InetSocketAddress("localhost",5001));// 내 피씨 아이피
//
//			System.out.println("바인딩 완료");
//
//			
//
//			//블로킹함수
//
//			ss.accept();//기다리는것
//
//			System.out.println("누군가 접속을 시도했음.");//이 글자가 안나오는 이유는 
//
//											//accep이블로킹되어있다는 뜻
//
//			//누군가가 접속을 해주면 블로킹이 풀ㄹ림
//
//			
//
//			
//
//			//자기자신에게 자신의 정보를 기억해두는것을 바인딩이라고 한다.
//
//			//서버는 반드시 바인딩이라는 작업이 필요하다
//
//			//클라이언트는 바인딩이 팔요없다(접속만하는 사람이기 떄문에) 서버만 확인하면 되니까
//
//			//if(ss==null) {
//
//			//	System.out.println("소켓을 생성할 수 없다.");
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
//			e.printStackTrace();//어떤 익셉션이 뜰지 모르기 떄문에 
//
//		}
//
//		System.out.println("숫자를 입력하면 서버를 종료합니다.");
//
//		new Scanner(System.in).nextInt();//키보드 입력받음
//
//		System.out.println("Server End");
//
//		//서버는 누군가가 i주소를 가지고 나에게 접속을 할것이다.
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

