

class FizzBuzz {

	def imprimir(def numero) {
		
		def sequencia = ""
		for (int i = 1; i <= numero; i++) {
			if (numero != 1)
				sequencia += i+","
			else 
			sequencia += i
		}		
		return sequencia
		
	}
}
