import static org.junit.Assert.*;
import org.junit.Test;

public class Circulo_MMOTest {
	private final double radio = -3;
	@Test
	public void testArea() {
		Circulo_MMO circulo = new Circulo_MMO(radio,"circulo");
		double resultado= radio * radio * Circulo_MMO.PI;
		
		assertEquals(resultado,circulo.area(),0);
	
	}

	@Test
	public void testPerimetro() {
		Circulo_MMO circulo = new Circulo_MMO(radio,"circulo");
		double resultado= Math.abs(radio * 2 * Circulo_MMO.PI);
		
		assertEquals(resultado,circulo.perimetro(),0);
		
	}
}
