package almacen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pale {
	private String codigo;
	private double peso;
	private int numcajas;
	BufferedReader teclado =new BufferedReader(new InputStreamReader(System.in));
	public Pale(String codigo, double peso, int numcajas) {
		super();
		this.codigo = codigo;
		this.peso = peso;
		this.numcajas = numcajas;
	}
	public Pale() {
		// TODO Ap�ndice de constructor generado autom�ticamente
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
	
	public void PedirPale() throws IOException{
		System.out.println("Dame el codigo del pale");
		this.codigo=teclado.readLine();
		System.out.println("Dame el peso del pale");
		this.peso=Integer.parseInt(teclado.readLine());
		System.out.println("Dame el numero de cajas del pale");
		this.numcajas=Integer.parseInt(teclado.readLine());
	}
	public void PedirPale(String codigo) throws NumberFormatException, IOException{
		this.codigo=codigo;
		System.out.println("Dame el peso del pale");
		this.peso=Integer.parseInt(teclado.readLine());
		System.out.println("Dame el numero de cajas del pale");
		this.numcajas=Integer.parseInt(teclado.readLine());
	}
	
}
