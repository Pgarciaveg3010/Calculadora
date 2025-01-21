package principal;

import menu.Menu;
import operaciones.Operaciones;

/**
 * La clase principal que imita el funcionamiento de una calculadora
 * 
 * @author Paul Garcia
 */
public class Calculadora {
	/**
	 * Se ejecuta la llamada a otros metodos para que se ejecute correctamente la funcion de una calculadora
	 * 
	 * @param args Argumentos de la linea de comandos
	 * 
	 */
	public static void main(String[] args) {
		int resultado = 0;
		String operacion = "";
		int[] operandos = new int[2];

		Menu menu = new Menu();
		Operaciones operaciones = new Operaciones();

		do {
			operandos = menu.pedirNumeros();
			operacion = menu.menuOpciones();

			if (operacion.equalsIgnoreCase("+")) {
				resultado = operaciones.sumar(operandos[0], operandos[1]);
				System.out.println("Resultado: " + resultado);
			} else if (operacion.equalsIgnoreCase("-")) {
				resultado = operaciones.restar(operandos[0], operandos[1]);
				System.out.println("Resultado: " + resultado);
			} else if (operacion.equalsIgnoreCase("*")) {
				resultado = operaciones.multiplicar(operandos[0], operandos[1]);
				System.out.println("Resultado: " + resultado);
			} else if (operacion.equalsIgnoreCase("/")) {
				resultado = operaciones.dividir(operandos[0], operandos[1]);
				System.out.println("Resultado: " + resultado);
			} else if (operacion.equalsIgnoreCase("%")) {
				resultado = operaciones.resto(operandos[0], operandos[1]);
				System.out.println("Resultado: " + resultado);
			} else {
				System.out.println("Operaci�n no v�lida");
			}
		} while (menu.repetir());
	}
}