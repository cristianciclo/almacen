package almacen;


public class Pale {
	private String codigo;
	private double peso;
	private int numcajas;
	public Pale(String codigo, double peso, int numcajas) {
		super();
		this.codigo = codigo;
		this.peso = peso;
		this.numcajas = numcajas;
	}
	public Pale() {
		// TODO Apéndice de constructor generado automáticamente
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getNumcajas() {
		return numcajas;
	}
	public void setNumcajas(int numcajas) {
		this.numcajas = numcajas;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pale other = (Pale) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (numcajas != other.numcajas)
			return false;
		if (peso != other.peso)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pale [codigo=" + codigo + ", peso=" + peso + ", numcajas=" + numcajas + "]";
	}
	
	public void PedirPale(){
		this.codigo=PedirDatos.leerCadena("Dame el codigo del pale:");
		this.peso=PedirDatos.leerDecimal("Dame el peso del pale:");
		this.numcajas=PedirDatos.leerEntero("Dame el numero de cajas del pale:");
	}
	public void PedirPale(String codigo){
		this.codigo=codigo;
		this.peso=PedirDatos.leerDecimal("Dame el peso del pale:");
		this.numcajas=PedirDatos.leerEntero("Dame el numero de cajas del pale:");
	}
	
}
