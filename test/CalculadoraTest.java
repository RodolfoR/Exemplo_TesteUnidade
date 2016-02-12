
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RODOLFO ROCHA
 */
public class CalculadoraTest {
    
    private final Calculadora calc = new Calculadora();
	
	@Test
	public void testSomar() { 
		assertEquals(30, calc.somar(10,30), 0);
	} 
	
	@Test
	public void testSubtrair() { 
		assertEquals(20, calc.subtrair(30,10), 0);
	}
}
