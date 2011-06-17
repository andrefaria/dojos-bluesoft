package algarismosRomanos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

class ConversorAlgarismosRomanosTest {
	ConversorAlgarismosRomanos  conversor 
	
	@Before
	void setUp(){
		 conversor = new ConversorAlgarismosRomanos()
		}
	
	@Test
	void "Deve retornar o algarismo I quando passado numero 1" (){
		assertAlgarismo "I", 1
	}
	
	@Test
	void "Deve retornar o algarismo II quando passado numero 2"(){
		assertAlgarismo "II", 2
	}
	
	@Test
	void "Deve retornar o algarismo III quando passado numero 3"(){
		assertAlgarismo "III", 3
	}
	
	@Test
	void "Deve retornar o algarismo IV quando passado numero 4"(){
		assertAlgarismo "IV", 4
	}
	
	@Test
	void "Deve retornar o algarismo V quando passado numero 5"(){
		assertAlgarismo "V", 5
	}

	@Test
	void "Deve retornar o algarismo VI quando passado numero 6"(){
		assertAlgarismo "VI", 6
	}
	
	@Test
	void "Deve retornar o algarismo VII quando passado numero 7"(){
		assertAlgarismo "VII", 7
	}
	
	@Test
	void "Deve retornar o algarismo VIII quando passado numero 8"(){
		assertAlgarismo "VIII", 8
	}
	
	@Ignore
	@Test
	void "Deve retornar o algarismo IX quando passado numero 9"(){
		assertAlgarismo "IX", 9
	}
	
	void "assertAlgarismo"(esperado,numero){
		assertEquals (esperado, conversor.converteNumero(numero))
	}
		
	
	
}
