package bluesoft

class ConverterNumeroTelefonico {

	def converteLetraEmNumero(def letras) {
		
		def array = [
					 "2":["A","B","C"],
					 "3":["D","E","F"],
					 "4":["G","H","I"],
					 "5":["J","K","L","M"],
					 "6":["N","O","P"],
					 "7":["Q","R","S","T"],
					 "8":["U","V","W"],
					 "9":["X","Y","Z"],
					 "1":["1"],
					 "0":["0"],
					 "-": ["-"]
					 ]
		
		def retorno =""

				
		array.each { key, values ->
			for (def letraDoArray : values) {
				letras.each { letra -> 
					if (letraDoArray == letra)
						retorno += key.toString()
				}
			}
		}
		
		retorno
	}
}
