package javapractice_variable;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수 선언과 할당
		int a;
		a = 1;
		System.out.println(a+1); //2
		 
		a = 2;
		System.out.println(a+1); //3
		
		//실수
		double b = 1.1; 
		System.out.println(a+1.1); // 2.2
		 
		b = 2.1; 
		System.out.println(a+1.1); // 3.2
		
		//에러발생 - a는 정수형인데 실수형이라서
//		int a = 1.1; 
//		System.out.println(a+1.1);
		
		//문자열 변수
		String first = "coding"; 
		System.out.println(first+" "+"everybody");
		
		String c, d;
		c = "coding";
		d = " everybody";
		System.out.println(c+d);
		
		// 변수를 사용해야 하는 이유
		// 코드의 재활용성으로 간결해짐
		
	}

}
