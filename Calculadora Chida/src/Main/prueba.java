package Main;

/*Aqui se realizan las pruebas unitarias
 * ver main para lista completa
*/

import static org.junit.Assert.*;

import org.junit.Test;

public class prueba {
	
	@Test
	public void testsuma() {
		Calculadora calculadora = new Calculadora();
		String res = calculadora.Calculo("2 2 +");
		String expresult = "4";
		if (res.equals(expresult)){
		}else{
			fail("Hubo un erorr");
		}
	}
	@Test
	public void testresta() {
		Calculadora calculadora = new Calculadora();
		String res = calculadora.Calculo("2 2 -");
		String expresult = "0";
		if (res.equals(expresult)){
		}else{
			fail("Hubo un erorr");}
	}
	@Test
	public void testmult() {
		Calculadora calculadora = new Calculadora();
		String res = calculadora.Calculo("2 2 *");
		String expresult = "4";
		if (res.equals(expresult)){
		}else{
			fail("Hubo un erorr");
		}
	}
	
	@Test
	public void testdiv() {
		Calculadora calculadora = new Calculadora();
		String res = calculadora.Calculo("2 2 /");
		String expresult = "1";
		if (res.equals(expresult)){
		}else{
			fail("Hubo un erorr");
		}
	}
	
	@Test
	public void testhoja() {
		Calculadora calculadora = new Calculadora();
		String res = calculadora.Calculo("1 2 + 4 * 3 +");
		String expresult = "15";
		if (res.equals(expresult)){
		}else{
			fail("Hubo un erorr");
		}
	}
	
	@Test
	public void testtodo() {
		Calculadora calculadora = new Calculadora();
		String res = calculadora.Calculo("1 2 + 4 * 3 - 1 + 5 / 2 / ");
		String expresult = "1";
		if (res.equals(expresult)){
		}else{
			fail("Hubo un erorr");
		}
	}
	@Test
	public void testmultinum() {
		Calculadora calculadora = new Calculadora();
		String res = calculadora.Calculo("1 2 3 4 * + -");
		String expresult = "-13";
		if (res.equals(expresult)){
		}else{
			fail("Hubo un erorr");
		}
	}
}

