package ar.edu.utn.vista;

import java.util.Scanner;

public class CumpleanosATi {

	public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
    
       int valor = ingresoDato(scan, "dia", 29);
       System.out.println(valor);
       int mes = ingresoDato(scan, "mes", 12);
    	   //TODO Usar el metodo ingresoDato para que soporte la
    	   // condicion de menor a ... cuando el momento es a�o
    	   
    	   //TODO Solicitar al usuario el nombre
       
           //TODO mostrar el siguiente texto:
    	   // <nombre>: tu cumple es el <dia>/<mes>/<a�o>
    	   
    	   
	}
	
	
	private static int ingresoDato(Scanner scan, String momento, int valorMaximo) {
		String mensaje = "Ingrese %s de su cumple (valor maximo %d)";
		System.out.println("Ingrese " + momento +" de su cumple");
		int valor = scan.nextInt();
		if (momento == "a�o") {
			while(valor < valorMaximo) {
				System.out.println(String.format(mensaje, momento,valorMaximo));
				valor = scan.nextInt();

		}
		} 
		while(valor > valorMaximo) {
			System.out.println(String.format(mensaje, momento,valorMaximo));
			valor = scan.nextInt();
		}
		
		
		return valor;
	}

}
