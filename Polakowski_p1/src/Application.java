import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 4 digits one by one:");
		int a;
		int b;
		int c;
		int d;
		     a = sc.nextInt();
		     b = sc.nextInt();
		     c = sc.nextInt();
		     d = sc.nextInt();
		
		     
		
		Encrypter.encrypt(a , b , c , d);
		Decrypter.decrypt(a , b , c , d);
	}
}