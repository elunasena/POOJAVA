
public class test {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(1111,105.23);
		Cuenta cuenta2 = new Cuenta(2222,505.32);
		Cuenta cuenta3 = new Cuenta(3333,505.32);
		
		System.out.println(cuenta1.getNumero());
		System.out.println(cuenta2.getNumero());
		
		System.out.println(Cuenta.getTotal());
		
		
	}
	
}
