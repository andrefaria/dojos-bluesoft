package algarismosRomanos

class ConversorAlgarismosRomanos {

	def converteNumero(def numero){
		
		def mapa = [1:"I",5:"V", 10:"X"]
		
		def decremento = numero
		def repeticao1 = 0
		def repeticao5 = 0
		def repeticao10 = 0
		def resultado = ""
		
		for (int i = numero; i > 0; i--) {
			
			if (i % 10 == 0){
				decremento -= 10
				++repeticao5

				if (repeticao10 > 3){
					resultado = resultado.replace(resultado.substring(resultado.length() -3, resultado.length()), '')
					resultado += mapa[50]
				}
								
				resultado += mapa[10]
				if (decremento == 0){
					break
				}
			}
			
			if (i % 5 == 0){
				decremento -= 5
				++repeticao5

				if (repeticao5 > 3){
					resultado = resultado.replace(resultado.substring(resultado.length() -3, resultado.length()), '')
					resultado += mapa[10]
				}
								
				resultado += mapa[5]
				if (decremento == 0){
					break
				}
			}
			
			if (i % 1 == 0){
				decremento -= 1
				++repeticao1
				
				if (repeticao1 > 3){
					resultado = resultado.replace(resultado.substring(resultado.length() -3, resultado.length()), '')
					resultado += mapa[5]
				}
				resultado += mapa[1]
				
				if (decremento == 0){
					break
					}
			}
		}
		
		return resultado.reverse()
	}
}
