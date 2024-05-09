package javapractice_method;

public class Return {
	
	public static int one() {
        return 1;
        return 2;
        return 3;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(one());
	}

	// 실행 안됨 왜 ? - return은 메소드 종료 역할 -> 따라서 return 첫번째 이후로 실행 x
}
