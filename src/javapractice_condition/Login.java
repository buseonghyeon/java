package javapractice_condition;

public class Login {
	public static void main(String[] args) {
		String id = args[0];
		if (id.equals("egoing")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
	}
}
