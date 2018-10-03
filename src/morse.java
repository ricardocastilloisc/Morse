
public class morse {

	//ABECEDARIO el cual se usara para recorrer y buscar las leytas y convertirlo
	//al sistema que estamos buscando
	 static String abecedario[][] =
			 {
					 //0
					 {"A",".-"},
					 //1
					 {"B","-..."},
					//2
					 {"C","-.-."},
					//3
					 {"D","-.."},
					//4
					 {"E","."},
					//5
					 {"F","..-."},
					//6
					 {"G","--."},
					//7
					 {"H","...."},
					//8
					 {"I",".."},
					//9
					 {"J",".---"},
					//10 
					 {"K","-.-"},
					//11 
					 {"L",".-.."},
					//12
					 {"M","--"},
					//13
					 {"N","-."},
					//14
					 {"O","---"},
					//15
					 {"P",".--."},
					//16
					 {"Q","--.-"},
					//17
					 {"R",".-."},
					//18
					 {"S","..."},
					//19
					 {"T","-"},
					//20
					 {"U","..-"},
					//21
					 {"V","...-"},
					//22
					 {"W",".--"},
					//23
					 {"X","-..-"},
					//24
					 {"Y","-.--"},
					//25
					 {"Z","--.."},
					//26
					 {"1",".----"},
					//27
					 {"2","..---"},
					//28
					 {"3","...--"},
					//29
					 {"4","....-"},
					//30
					 {"5","....."},
					//31
					 {"6","-...."},
					//32
					 {"7","--..."},
					//33
					 {"8","---.."},
					//34
					 {"9","----."},
					//35
					 {"0","-----"},
					//36
					 {" "," "}
			 };
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//INICIANDO CODIGO
		//Cadena donde tendremos que identificar si es morse o normal
		String Cadena ="h";		
		//Validador si es morse o normal donde 
		//se identifica con el primer caracter del string 
		if(Character.toString(Cadena.charAt(0)).equals(".")  || Character.toString(Cadena.charAt(0)).equals("-"))		
			if(Character.toString(Cadena.charAt(0)).equals(".")  || Character.toString(Cadena.charAt(0)).equals("-"))		
		{
			//si es algunas de las opciones es morse
			System.out.println("morse");
		}else 
		{
			//si no es normal
			System.out.println("normal");
		}
		;
	}

}
