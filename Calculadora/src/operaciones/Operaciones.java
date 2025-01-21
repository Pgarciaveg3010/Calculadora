package operaciones;
/**
 * La clase operaciones sirve para ejecutar las operaciones de la calculadora
 * 
 * @author Paul Garcia
 * 
 */
public class Operaciones{
	/**
	 * Se hace una suma entre el valor1 y valor2
	 * 
	 * @param valor1 Es el primer numero que introduce el usuario
	 * @param valor2 Es el segundo numero que introduce el usuario
	 * @return numero Es la solucion de la ecuacion
	 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    /**
     * Se hace una resta entre el valor1 y valor2
     * 
     * @param valor1 Es el primer numero que introduce el usuario
	 * @param valor2 Es el segundo numero que introduce el usuario
	 * @return numero Es la solucion de la ecuacion
     */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    /**
     * Se hace una multiplicacion entre el valor1 y valor2
     * 
     * @param valor1 Es el primer numero que introduce el usuario
	 * @param valor2 Es el segundo numero que introduce el usuario
	 * @return numero Es la solucion de la ecuacion
     */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    /**
     * Se hace una division entre el valor1 y valor2
     * 
     * @param valor1 Es el primer numero que introduce el usuario
	 * @param valor2 Es el segundo numero que introduce el usuario
	 * @return numero Es la solucion de la ecuacion
     */
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    /**
     * Se calcula el resto entre valor1 y valor2
     * 
     * @param valor1 Es el primer numero que introduce el usuario
	 * @param valor2 Es el segundo numero que introduce el usuario
	 * @return numero Es la solucion de la ecuacion
     */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}