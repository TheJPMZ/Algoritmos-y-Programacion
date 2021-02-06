package Main;

/*Programa hecho por Jose Pablo Monzon 20309
 
Se utilizó:
https://www.javatpoint.com/java-int-to-string
https://www.w3schools.com/java/java_methods_param.asp
https://jaxenter.com/convert-java-string-int-134101.html
https://www.tutorialspoint.com/java/util/java_util_vector.htm
https://www.geeksforgeeks.org/stack-pop-method-in-java/
https://www.geeksforgeeks.org/how-to-split-a-string-in-cc-python-and-java/
https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
como referencia para utilizarlo
*/

import java.util.Vector;

public class Calculadora {

	public String Calculo(String dataline) { //Le ingresa un string en formato postfix "3 3 +"
		 
		Vector<String> vector = new Vector<String>();
		
		for (String x: dataline.split(" "))

			if (x.equals("+")){ //Operacion si es suma
				int a = obtener(vector); //Obtiene los ultimos dos numeros
				int b = obtener(vector);
				int operacion = b + a;
				String resultado=String.valueOf(operacion);
				vector.add(resultado); //Regresa el resultado al vector
			}else if (x.equals("-")){ //Operacion si es resta
				int a = obtener(vector);
				int b = obtener(vector);
				int operacion = b - a;
				String resultado=String.valueOf(operacion);
				vector.add(resultado);
			}else if (x.equals("*")){ //Operacion si es multiplicacion
				int a = obtener(vector);
				int b = obtener(vector);
				int operacion = b * a;
				String resultado=String.valueOf(operacion);
				vector.add(resultado);
			}else if (x.equals("/")){ //Operacion si es division
				int a = obtener(vector);
				int b = obtener(vector);
				int operacion = b / a;
				String resultado=String.valueOf(operacion);
				vector.add(resultado);
			}else {
				vector.add(x);
			}
		System.out.println("El resultado de '"+dataline+"' es "+ vector.lastElement());
		return vector.lastElement(); //El unico elmento del vector es la respuesta, lo regresa en string
	}
	
	private int obtener(Vector<String> vector) { //Obtiene un vector
		String operandoa = (String) vector.lastElement();//Obtiene el ultimo elemento
		int number = vector.lastIndexOf(operandoa); //Obtiene su posicion
		vector.remove(number); //Lo elimina del vector
		int a = Integer.parseInt(operandoa);//lo vuelve int
		return a ;//Regresa un entero
	}
}


