import java.util.Scanner;

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
	public static String Morse(String Texto, int identificadorAbecedario) {
		// cadena final que se estara manipulando
		String CadenaFinal = "";
		// matriz para separa el texto y poder identificar en el
		String[] matriztexto;
		// abecedario uno por uno para hacer la conversion de morse o normal
		if (identificadorAbecedario == 0) {
			// poner un vacio para que el recorrido pueda mas adelante hacer el
			// identificador
			Texto = Texto + " ";
			// normal
			matriztexto = Texto.toUpperCase().split("");
		} else {
			
			//parte morse el cual aqui hay que ajustar ciertas cosas
			//matrix morse es como se genera la matriz
			//al tratar de ajustar a la manera normal 
			//da error en espacio por eso hay saber exactamente cuantas letras
			//tenemos contando espacios
			int matrizMorse = 0;
			//el numero de espacios que habra ose "  "
			//dependiendo a la palabra
			int numeroDEespacios = 0;
			//una matriz temporal que separa las palabras
			String temp []  = Texto.split("   ");
			//se calcula el numero de espacios que habra entre las palabras
			numeroDEespacios = temp.length-1;
			//un ciclo donde se calculara cuantas letras hay para poder hacer la matriz
			for(int acomodo = 0; acomodo<temp.length; acomodo++) 
			{
				//se calcula como se va dividiendo un matriz en matiz y dara el resultado 
				//de cuantas letras tenemos
				matrizMorse = matrizMorse + temp[acomodo].split(" ").length;
			}
			//cuando tengas el numero total de letras
			//sumamos los espacios entre las letras
			matrizMorse = matrizMorse + numeroDEespacios;
			//hacemos un array donde ya sabesmos 
			//exactamete cuantas letras contando el espacio que tendra la clave morse
			String array[] = new String[matrizMorse];
			//hacemos conteo para poder saber la pocisiones que esta recorriendo 
			// el arreglo
			int recorridoMatrix = 0; 
			//recorrido del arreglo
			int recorrido = 0;
			//recorrido principal que dividira las palbras a cada letra
			while(recorrido<temp.length) 
			{
				//un temporal 2 donde solo se utilizara para
				//extraer las letras
				String temp2 [] = temp[recorrido].split(" ");
				//un acomodo que servira para poner
				//las letras en un arreglo
				for(int acomodo = 0; acomodo<temp2.length; acomodo++) 
				{
					//se ponen las letras extraidas
					array[recorridoMatrix] = temp2[acomodo];
					//se sigue el recorrido
					recorridoMatrix++;		
				}
				//para no generar conflicto en el arreglo ponemos un medidor
				//de distancia 
				if(recorridoMatrix<array.length) 
				{
					//al terminar cada ciclo y si hay un espacio 
					//pones el identificar del abecedario
					array[recorridoMatrix] = "   ";
					//seguimos el recorrido
					recorridoMatrix++;	
				}				
				//seguimos el recorrido principal
				recorrido++;
			}
			//si es en morse dividir en 2 por el separador de 3 espacios
			//System.out.println(Texto.split(" ").length);
			
			// morse
			//ajustamos la matriz a la que queremos
			matriztexto = array;
		}
		;
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
					// si es igual al comparar con el abecedario rompe el ciclo y sigue con el otro
					// elemento
					// el identificador dira cual abecedario tomar
					if (matriztexto[recorrido1].equals(abecedario[buscador][identificadorAbecedario])) {
						// depende del identificador sera la busqueda
						if (identificadorAbecedario == 0) {
							// convierte el valor a morse
							if (matriztexto[recorrido1].equals(" ")) {
								//evitar que se hagan mas espacios inecesarios
								CadenaFinal = CadenaFinal + abecedario[buscador][1];
							} else {
								//recorre el siguiente para no poner mas espacios
								//si es asi no pongas espacio sino lo que es
								if (matriztexto[recorrido1 + 1].equals(" ")) {
									CadenaFinal = CadenaFinal + abecedario[buscador][1];
								} else {
									//si es normal sigue normal
									CadenaFinal = CadenaFinal + abecedario[buscador][1] + " ";
								}

							}
						} else {
							// convierte el valor a normal
							CadenaFinal = CadenaFinal + abecedario[buscador][0];
						}
						// rompe el ciclo
						break;
					} // por el contrario sigue vuscando
					else {
						// suma para seguir buscando
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

		// retornar si hay error o no
		// si hay error
		if (bandera == 1) {
			// mensaje donde dice que hay un error
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
		String Cadena;
		//escanea lo que teclemos en consola
		Scanner entrada = new Scanner(System.in);
		//pedimos al usuario que nos diga el caracter que quiera convertir
		System.out.print("Ingrese la palabra o el morse que quiera convertir: "); 
		//lo convierte a la variable principal
		Cadena = entrada.nextLine();
		// Validador si es morse o normal donde
		// se identifica con el primer caracter del string
		if (Character.toString(Cadena.charAt(0)).equals(".") || Character.toString(Cadena.charAt(0)).equals("-")) {
			// convertir a normal
			System.out.println(Morse(Cadena, 1));

		} else {
			// convertir a morse
			System.out.println(Morse(Cadena, 0));
		}
		;
	}

}
