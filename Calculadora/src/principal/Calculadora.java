package principal;

import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import menu.Menu;
import operaciones.Operaciones;

/**
 * La clase principal que imita el funcionamiento de una calculadora
 * 
 * @author Paul Garcia
 */
public class Calculadora {

	private static final Logger logger = Logger.getLogger(Calculadora.class.getName());
	private static final LogManager logManager = LogManager.getLogManager();
	
    static {
		try {

			// confg logger
            logManager.readConfiguration(new FileInputStream("./Calculadora/src/propiedades/configLog.properties"));

		} catch (Exception e) {
			System.err.println("No se pudo configurar el logger: " + e.getMessage());
		}
	}

	/**
	 * Se ejecuta la llamada a otros metodos para que se ejecute correctamente la
	 * funcion de una calculadora
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
			try {
				if (operacion.equalsIgnoreCase("+")) {
					resultado = operaciones.sumar(operandos[0], operandos[1]);
					System.out.println("Resultado: " + resultado);
					logger.log(Level.FINE, "Operacion sumar");
				} else if (operacion.equalsIgnoreCase("-")) {
					resultado = operaciones.restar(operandos[0], operandos[1]);
					System.out.println("Resultado: " + resultado);
					logger.log(Level.FINE, "Operacion restar");
				} else if (operacion.equalsIgnoreCase("*")) {
					resultado = operaciones.multiplicar(operandos[0], operandos[1]);
					System.out.println("Resultado: " + resultado);
					logger.log(Level.FINE, "Operacion multiplicar");
				} else if (operacion.equalsIgnoreCase("/")) {
					resultado = operaciones.dividir(operandos[0], operandos[1]);
					System.out.println("Resultado: " + resultado);
					logger.log(Level.FINE, "Operacion dividir");
				} else if (operacion.equalsIgnoreCase("%")) {
					resultado = operaciones.resto(operandos[0], operandos[1]);
					System.out.println("Resultado: " + resultado);
					logger.log(Level.FINE, "Operacion resto");
				} else {
					System.out.println("Operaci�n no v�lida");
				}
			} catch (Exception e) {
				System.err.println("Error: " + e.getMessage());
			}
		} while (menu.repetir());
	}
}