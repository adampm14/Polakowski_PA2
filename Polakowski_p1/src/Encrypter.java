
public class Encrypter {
	public static int encrypt(int digit1, int digit2, int digit3, int digit4) {
		  int a;
		  int b;
		  int c;
		  int d;
		  
		  a = digit1;
		  b = digit2;
		  c = digit3;
		  d = digit4;
		  a = (a + 7) % 10;
		  b = (b + 7) % 10;
		  c = (c + 7) % 10;
		  d = (d + 7) % 10;
				
		  System.out.println("Encrypted value is:"+ c + d + a + b);
		  return 0; 
		  
	   }
}
	       
	
