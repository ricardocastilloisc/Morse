
public class morse {

	// ABECEDARIO el cual se usara para recorrer y buscar las leytas y convertirlo
	// al sistema que estamos buscando
	static String abecedario[][] = {
			// 0
			{ "A", ".-" },
			// 1
			{ "B", "-..." },
			// 2
			{ "C", "-.-." },
			// 3
			{ "D", "-.." },
			// 4
			{ "E", "." },
			// 5
			{ "F", "..-." },
			// 6
			{ "G", "--." },
			// 7
			{ "H", "...." },
			// 8
			{ "I", ".." },
			// 9
			{ "J", ".---" },
			// 10
			{ "K", "-.-" },
			// 11
			{ "L", ".-.." },
			// 12
			{ "M", "--" },
			// 13
			{ "N", "-." },
			// 14
			{ "O", "---" },
			// 15
			{ "P", ".--." },
			// 16
			{ "Q", "--.-" },
			// 17
			{ "R", ".-." },
			// 18
			{ "S", "..." },
			// 19
			{ "T", "-" },
			// 20
			{ "U", "..-" },
			// 21
			{ "V", "...-" },
			// 22
			{ "W", ".--" },
			// 23
			{ "X", "-..-" },
			// 24
			{ "Y", "-.--" },
			// 25
			{ "Z", "--.." },
			// 26
			{ "1", ".----" },
			// 27
			{ "2", "..---" },
			// 28
			{ "3", "...--" },
			// 29
			{ "4", "....-" },
			// 30
			{ "5", "....." },
			// 31
			{ "6", "-...." },
			// 32
			{ "7", "--..." },
			// 33
			{ "8", "---.." },
			// 34
			{ "9", "----." },
			// 35
			{ "0", "-----" },
			// 36
			{ " ", "   " },

			// 37 error faltal
			{ "error", "error" } };

	// metodo morse el cual hara la convercion de
	// texto a morse, tendra que tener que recibir
	// el parametro
	public static String Morse(String Texto) {
		// cadena final que se estara manipulando
		String CadenaFinal = "";
		// matriz para separa el texto y poder identificar en el
		// abecedario uno por uno para hacer la conversion de morse
		String[] matriztexto = Texto.toUpperCase().split("");
		// identificador si no hay error
		int bandera = 0;
		// recorrido
		for (int recorrido1 = 0; recorrido1 < matriztexto.length; recorrido1++) {

			// si la bandera sigue siendo 0 procede a buscar ya
			// esto es porque no tiene error
			if (bandera == 0) {
				// es el cual estara en el buscador
				int buscador = 0;
				// empezar a buscar la letra por letra para terminar manipular la cadena
				while (buscador < abecedario.length - 1) {
					//si es igual al comparar con el abecedario rompe el ciclo y sigue con el otro elemento
					if (matriztexto[recorrido1].equals(abecedario[buscador][0])) 
					{
						//convierte el valor a morse
						CadenaFinal = CadenaFinal+abecedario[buscador][1]+" ";
						//rompe el ciclo
						break;
					}//por el contrario sigue vuscando 
					else 
					{
						//suma para seguir buscando
						buscador++;
					}
					
				}
				// condicion donde se verificara que no haya erro
				// si hay error modificar el valor
				// de la bandera a 1
				if (buscador == abecedario.length - 1) {
					bandera = 1;
				}
				;

			} else {
				// rompe el ciclo
				break;
			}
			;

		}
		;
		
		//retornar si hay error o no
		//si hay error 
		if(bandera==1) 
		{
			//mensaje donde dice que hay un error
			CadenaFinal = "la cadena capturada tiener error";
			return CadenaFinal;
		}
		// retornar cadena
		return CadenaFinal;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// INICIANDO CODIGO
		// Cadena donde tendremos que identificar si es morse o normal
		String Cadena = "hoy es";
		// Validador si es morse o normal donde
		// se identifica con el primer caracter del string
		if (Character.toString(Cadena.charAt(0)).equals(".") || Character.toString(Cadena.charAt(0)).equals("-")) {
			// convertir a normal
			System.out.println("PALABRA EN MORSE");

		} else {
			// convertir a morse
			System.out.println(Morse(Cadena));
		}
		;
	}

}
