package javapractice_io;
import java.util.Scanner;
import java.io.*;


public class SC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            File file = new File("out.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000); 
            }
            sc.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
		
	}

}
