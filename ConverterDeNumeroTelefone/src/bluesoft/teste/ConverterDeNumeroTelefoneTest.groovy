package bluesoft.teste;

import static org.junit.Assert.*;
import groovy.mock.interceptor.Ignore;

import org.junit.Test;

import bluesoft.ConverterNumeroTelefonico;

class ConverterDeNumeroTelefoneTest {

	ConverterNumeroTelefonico converte = new ConverterNumeroTelefonico()
	@Test
	public void deveRetornorNumeroDoisQuandoPassaALetraA() {
		assertResultado("2", "A")
	}
	
	@Test
	public void deveRetornarNumeroDoisQuandoPassarALetraB(){
		assertResultado("2", "B")
	}
	
	@Test
	public void deveRetornarNumeroDoisQuandoPassarALetraC(){
		assertResultado("2", "C")
	}
	
	@Test
	public void deveRetornarNumeroDoisQuandoPassarALetraD() {
		assertResultado("3", "D")
	}

	@Test
	public void "deveRetornar1-59-4653 quando passar 1-My-Home" (){
		assertResultado("1-59-4653", "1-MY-HOME")
	}
	@Test
	public void "deve retornar 234 quando for AEH" (){
		assertResultado("234", "AEH")
	}

			
	private assertResultado(def numero, def letra){
		assertEquals(numero, converte.converteLetraEmNumero(letra))
	}
	
}
