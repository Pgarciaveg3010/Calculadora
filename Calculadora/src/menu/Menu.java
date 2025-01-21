package menu;
import java.util.Scanner;
/**
 * La clase Menu sirve para mostrarle al usuario el menu con el cual interactuar
 * 
 * @author Paul Garcia
 * 
 */
public class Menu {
    private static Scanner teclado = new Scanner(System.in);
    /**
     * El metodo pedirNumeros le solicitara al usuario dos operando para ejecutar la operacion
     * 
     * @return ret devuelve el array con los numeros introducidos
     */
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    
    /**
     * El metodo menuOpciones sirve para que el usuario seleccione la operacion que desea ejecutar
     * 
     * 
     * @return ret devuelve la operacion solicitada por el usuario
     */
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    /**
     * El metodo repetir, como su nombre indica, sirve para que en caso de que el usuario desee seguir usando la calculadora, se siga usando
     * 
     * @return ret devuelve el booleano para saber si el programa se debe repetir o no
     */
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("�Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}