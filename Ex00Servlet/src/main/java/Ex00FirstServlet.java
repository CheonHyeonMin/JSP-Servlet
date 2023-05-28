

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @ : annotation(주석) -> 컴파일 될 때 한 번 확인함!
// @WebServlet : url-mapping 해줌

@WebServlet("/first")
public class Ex00FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//객체 -> 직렬화(자바 바이트 형태 변환)
    //자바 바이트 형태 -> 객체(역직렬화)
	//클래스 자체가 변환 <- 버전을 부여
	
    /**
     * @see HttpServlet#HttpServlet()
     */
	//생성자
	//이 생성자를 사용해서 객체가 생성되었다고 해서 바로 서블릿의 기능을 사용할 수 있는게 아님
	//(서블릿객체 -> 통신 (요청, 응답))
    public Ex00FirstServlet() {
       System.out.println("생성자 호출!");
    }

	//init 메서드 : 객체가 서블릿역할을 할 수 있도록 초기화 시켜주는 역할!
    //비용이 많이 드는 작업
    //서버로 요청이 들어올때마다 이작업을 해줘야된다 -> 비효율적
    //최초로 요청이 들어오면 객체 -> init 호출 서블릿객체로 초기화시켜줌
    //그 다음 요청이 들어올때는 이미 생성되어있는 객체를 그대로 사용
    
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 호출!");
	}

	//destroy 메서드 : 서블릿 객체 소멸(서버가 종료가 됐거나, 재시작할때 사용)
	//이 메서드가 호출되고 난 다음 요청이 들어오는 경우에는
	//다시 객체 생성하고 init 메서드 호출함
	public void destroy() {
		System.out.println("destroy 호출!");
	}

	//service 메서드 : 사용자의 요청 처리 / 응답 기능
	// **http 요청 메서드 : *GET, *POST, DELETE, PATCH, PUT
	//1. 모든 요청은 Service에서 받음
	//2. GET/POST(요청 메서드)에 따라서 다르게 처리하고 싶은 경우에는
	//	 Service가 doGet/ doPost 메서드가 호출되게 할 수도 있음
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Service호출!");
		super.service(request, response);
		
	}

	//http 요청 메서드가 get일 경우 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGET 호출!");
	}

	//http 요청 메서드가 post인경우 호출
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출!");
	}

}
