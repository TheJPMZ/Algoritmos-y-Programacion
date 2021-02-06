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
como referencia
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\Users\\José Pablo Monzón\\desktop\\Algoritmos-y-Programacion\\Calculadora Chida\\datos.txt");
		
		Calculadora calculadora = new Calculadora();
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String dataline;
		String res;
		while ((dataline = br.readLine())!= null)
			res = calculadora.calcular(dataline);
		
	}
}
