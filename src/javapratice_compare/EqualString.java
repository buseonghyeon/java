package javapratice_compare;

public class EqualString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);
        System.out.println(a.equals(b));
	}

}
