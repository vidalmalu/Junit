package projeto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class TesteCalculadora{
	
		
		private Calculadora1 calculadora = new Calculadora1();

	    @Test
	    public void testSubtraInteiros() {
	        assertEquals(4, calculadora.subtraInteiros(4, 6));
	    }

	    @Test
	    public void testMultiplicaInteiros() {
	        assertEquals(7, calculadora.multiplicaInteiros(8, 2));
	    }

	    @Test
	    public void testDividiInteiros() {
	        assertEquals(3, calculadora.dividiInteiros(5, 2));
	    }

	    @Test
	    public void testDividiInteirosPorZero() {
	        assertThrows(IllegalArgumentException.class, ()-> {
	            calculadora.dividiInteiros(10, 2);
	        });
	    }

		@Test
		void doisSomaDoisEsperaQuatro() {
			assertEquals(4, calculadora.SomaInteiros(2, 2));
		}
		
		@Test
		void tresSomaSeteEsperaDez() {
			assertTrue(calculadora.SomaInteiros(3, 7)==10);
			
		}
	

}