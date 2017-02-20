package almacen;

public class Almacen {
	private Pale[] pales= new Pale[1000];
	private int posicion=0;
	private int totalcajas=0;
	private double totalpeso=0;
	public void menu(){
		int opcion;
			do{
			System.out.println("1.Nuevo pale");
			System.out.println("2.Quitar pale");
			System.out.println("3.Mostrar pales");
			System.out.println("4.Mostrar totales");
			System.out.println("0.Salir");
			opcion=PedirDatos.leerEntero("Dame la opcion:");
			switch (opcion) {
			case 1:
				nuevoPale();
					break;
			case 2:
				quitarPale();
				break;
			case 3:
				mostrarPale();
				break;
			case 4:
				mostrarTotal();
				break;
			case 0:
				System.out.println("ADIOS");
				break;
	
			default:
				System.out.println("Dame una opcion entre 0 y 4");
				break;
			}
		}while(opcion!=0);
	}
	private boolean existePale(String codigo){
		for(int i=0;i<posicion;i++){
			if(codigo.equals(pales[i].getCodigo())){
				return true;
			}
		}
		return false;
	}
	
	private void nuevoPale(){
		String codigo=PedirDatos.leerCadena("Dame el codigo del pale:");
		if(existePale(codigo)){
			System.out.println("El pale que quiere añadir ya esta añadido.");
			return;
		}
		Pale p=new Pale();
		p.PedirPale(codigo);
		pales[posicion]=p;
		posicion++;
		totalcajas=totalcajas+p.getNumcajas();
		totalpeso=totalpeso+p.getPeso();
	}
	private void quitarPale(){
		if(posicion>0){
			posicion--;
			totalcajas-=pales[posicion].getNumcajas();
			totalpeso-=pales[posicion].getPeso();
		}
	}
	private void mostrarPale(){
		for(int i=posicion-1;i>=0;i--){
			System.out.println(pales[i]);
		}
	}
	private void mostrarTotal(){
		System.out.println("Existen "+posicion+" pales, con "+totalcajas+" cajas y "+totalpeso+" kilos");
		
	}
}
