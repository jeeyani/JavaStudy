package ch06.exam04;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
	
		boolean res = ms.login("hong", "12345");
		if(res) {
			System.out.println("로그인되었습니다.");
			ms.logout("hong");
		}else {
			System.out.println("아이디 혹은 비밀번호가 잘못되었습니다.");
		}
	
	}

}
