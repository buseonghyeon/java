package javapractice_array;

public class Error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] members = { "최진혁", "최유빈", "한이람" };
		System.out.println(members[3]);
		//아직 예외 안배워서 오류라고만함
		
		String[] members2 = new String[3];
		members2[0] = "최진혁";
		members2[1] = "최유빈";
		members2[2] = "한이람";
		members2[3] = "이고잉";
		//저장할수 있는 공간보다 더 많은 저장하려고 하니 생기는 오류
	}

}
