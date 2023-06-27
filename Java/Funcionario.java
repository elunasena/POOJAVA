
public class Funcionario {

	private String nombre;
	private String documento;
	private double salario;
	private static int total = 0;
	
	public Funcionario () {
		
	}
	
	public Funcionario(String nombre, String documento, double salario) {
		this.nombre = nombre;
		this.documento = documento;
		this.salario = salario;
		total++;
	}
		
	
	public static int getFuncTotales() {
		return total;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
