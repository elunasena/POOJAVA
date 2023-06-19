
public class myBanck {

	public static void main(String[] args) {

		// Se instancia la cuenta c1
		Cuenta c1 = new Cuenta();
		c1.numero = 1111;
		c1.saldo = 100.5;
		// Se instancia la cuenta c2
		Cuenta c2 = new Cuenta();
		c2.numero = 2222;
		c2.saldo = 1000;

		System.out.println("Cuenta No.: " + c1.numero + " \tSaldo: " + c1.saldo);
		System.out.println("Cuenta No.: " + c2.numero + "\tSaldo: " + c2.saldo);

				
		c2.transferir(750, c1);
		System.out.println("Cuenta No.: " + c1.numero + " \tSaldo: " + c1.saldo);
		System.out.println("Cuenta No.: " + c2.numero + "\tSaldo: " + c2.saldo);
		
		c1.transferir(150, c2);
		System.out.println("Cuenta No.: " + c1.numero + " \tSaldo: " + c1.saldo);
		System.out.println("Cuenta No.: " + c2.numero + "\tSaldo: " + c2.saldo);
		
		c1.transferir(750, c2);
		System.out.println("Cuenta No.: " + c1.numero + " \tSaldo: " + c1.saldo);
		System.out.println("Cuenta No.: " + c2.numero + "\tSaldo: " + c2.saldo);
		
	}
	

}
