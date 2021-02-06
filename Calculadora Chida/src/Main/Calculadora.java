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

	public String calcular(String dataline) {
		
		Vector<String> v = new Vector<String>();
		
		for (String x: dataline.split(" "))

			if (x.equals("+")){
				int a = obtener(v);
				int b = obtener(v);
				int operacion = b + a;
				String s=String.valueOf(operacion);
				v.add(s);
			}else if (x.equals("-")){
				int a = obtener(v);
				int b = obtener(v);
				int operacion = b - a;
				String s=String.valueOf(operacion);
				v.add(s);
			}else if (x.equals("*")){
				int a = obtener(v);
				int b = obtener(v);
				int operacion = b * a;
				String s=String.valueOf(operacion);
				v.add(s);
			}else if (x.equals("/")){
				int a = obtener(v);
				int b = obtener(v);
				int operacion = b / a;
				String s=String.valueOf(operacion);
				v.add(s);
			}else {
				v.add(x);
			}
		System.out.println("El resultado de '"+dataline+"' es "+ v.lastElement());
		return v.lastElement();
	}
	
	private int obtener(Vector<String> v) {
		String operandoa = (String) v.lastElement();
		int numa = v.lastIndexOf(operandoa);
		v.remove(numa);
		int a = Integer.parseInt(operandoa);
		return a ;
	}
}


