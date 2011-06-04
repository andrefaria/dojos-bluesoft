import org.junit.*



class FizzBuzzTest {
	
	FizzBuzz fizzBuzz = new FizzBuzz();
	@Test
	public void imprimirASequenciaParaONumeroUm() {
		Assert.assertEquals('1', fizzBuzz.imprimir(1));
	}
	
	
	@Test
	public void imprimirASequenciaParaONumeroDois() {
		Assert.assertEquals('1,2', fizzBuzz.imprimir(2));
	}
	
	@Test
	public void imprimirSequenciaParaONumeroTres() {
		Assert.assertEquals '1,2,Fizz', fizzBuzz.imprimir (3)
	}	
	
}
