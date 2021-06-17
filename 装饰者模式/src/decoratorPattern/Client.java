package decoratorPattern;

public class Client {

	public static void main(String args[]) {
		String password = "sunnyLiu";
		String cpassword;
		Cipher sc,cc;
		
		sc= new SimpleCipher();
		cpassword = sc.encrypt(password);
		System.out.println(cpassword);
		System.out.println("-----------");
		
		cc = new ComplexCipher(sc);
		cpassword = cc.encrypt(password);
		System.out.println(cpassword);
		
		
		
	}
}
