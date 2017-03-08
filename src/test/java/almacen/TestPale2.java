package almacen;

import static org.junit.Assert.assertEquals;
import almacen.Pale;
import org.junit.Test;


public class TestPale2 {

	@Test
	public void testGetNumcajas() {
		Pale p=new Pale("2",20.0,20);
		 
		assertEquals(20, p.getNumcajas());
		System.out.println("Numero de cajas obtenido correctamente");
	}

}
