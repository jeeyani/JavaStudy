package ch07.exam03.check;

public class HttpServletExample {

	public static void main(String[] args) {
		
		method(new LoginServlet());
		method(new FileDownloadServelt());
	}
	
	public static void method(HttpServlet http) {
		http.service();
	}

}
