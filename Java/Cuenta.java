
public class Cuenta {
	double saldo;
	int numero;
	String titular;

	// Comportamiento para depositar de la misma cuenta
	public void depositar(double valor) {
		this.saldo += valor;
	}

	// Comportamiento para retirar de la mmisma cuenta
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("¡No cuenta con saldo suficiente para efectuar esta operación!");
			return false;
		}
	}

	// Comportamiento para transferir de una cuenta a otra
	// Se pasa la refencia del objeto cuenta para acceder a las informaciones del objeto en memoria
	public boolean transferir(double valor, Cuenta cuenta) {
		System.out.println("----------- Transferencia a la cuenta No. " + cuenta.numero + " ----------");
		// boolean operacion;
		if (this.saldo >= valor) {
			cuenta.depositar(valor);
			//this.saldo -= valor;
			retirar(valor);
			System.out.println("Transacción exitosa");
			return true;
			// operacion=true;
		} else {
			// operacion = false;
			System.out.println("Transacción no realizada");
			return false;
		}
		//return operacion;
	}

}
