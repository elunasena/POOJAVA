
public class TestReferencia2 {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Esteban");
		cliente1.setDocumento("1214718");
		
		Cuenta c1 = new Cuenta();
		c1.setNumero(1111);
		c1.setSaldo(100.5);
		c1.setTitular(cliente1);
		
		System.out.println(cliente1);
		System.out.println(c1.getTitular());
		
		System.out.println(cliente1.getDocumento());
		System.out.println(c1.getTitular().getNombre());
		
		
		
	}
	
}
