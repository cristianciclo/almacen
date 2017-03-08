package almacen;

import static org.junit.Assert.assertEquals;
import almacen.Pale;
import org.junit.Test;


public class TestPale  {
@Test
	public void testPale() {
		Pale p=new Pale("1", 10.0, 10);
		assertEquals("1", p.getCodigo());
		assertEquals(10, p.getNumcajas());
		System.out.println("Pale creado correctamente");
	}

}
