
public class probandoMetodos {

	public static void main(String[] args) {

		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta();
		//c1.saldo = 100;
		//c1.numero = 123;
		c2.depositar(150);
		//System.out.println("Saldo C1: " + c1.saldo);
		//System.out.println("Saldo C2: " + c2.saldo);
		c2.retirar(400);
		//System.out.println("Saldo C2: " + c2.saldo);

	}
}
