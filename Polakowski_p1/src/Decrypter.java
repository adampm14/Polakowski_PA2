
public class Decrypter {
	public static int decrypt(int a, int b, int c, int d) {
		  int j;
		  int k;
		  int l;
		  int m;
		  
		  j = a;
		  k = b;
		  l = c;
		  m = d;
		  j = (j + 7) % 10;
		  k = (k + 7) % 10;
		  l = (l + 7) % 10;
		  m = (m + 7) % 10;
				
		  System.out.println("Decrypted value is:"+ j + k + l + m);
		  return 0; 
	}
}
	   
