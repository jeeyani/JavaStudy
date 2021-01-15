package ch05.exam02;

public class MainStringArrayArgument {
	
	public static void main(String[] args) {
	
	
		if(args.length !=2) { //입력된 데이터 갯수가 2가 아닐경우 
			System.out.println("값의 수가 부족합니다.");
			System.exit(0); //시스템 강제종료
		}
		//기본값은 0 임으로 값을 넣어주지 않는 이상, 시스템 강제종료!
		
		String strName1 = args[0];
		String strName2 = args[1];
		
		int num1 = Integer.parseInt(strName1);
		int num2 = Integer.parseInt(strName2);
		
		int res = num1 + num2;
		System.out.println(num1+" + "+num2+" = "+ res);
		
	//run을 이용해 수동적으로 값을 넣어주면 실행됨 
	}
	
}
