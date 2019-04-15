package ar.edu.utn.vista;

import java.util.Scanner;

import ar.edu.utn.controlador.EntrenadoresControlador;
import ar.edu.utn.modelo.Boxeador;
import ar.edu.utn.modelo.Categoria;

public class VistaMain {
	
	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);
	Boxeador boxeadores[] = new Boxeador[25];
		
		for (int i = 0; i < 25; i++){
			
			
			Boxeador box = new Boxeador();
			
			System.out.println("Ingrese nombre del boxeador: ");
			String nombre = scan.next();
			box.setNombre(nombre);
			
			System.out.println("Ingrese el peso: ");
			double peso = scan.nextDouble();
			box.setPeso(peso);
			
			box.setCategoria(peso); //Asigno la categoria al boxeador ingresado
			
			
			boxeadores[i] = box;
			
			
			
		}
		
         EntrenadoresControlador ec = new EntrenadoresControlador();
         
         for(int i =0 ; i < 25 ; i++){
         
         if(boxeadores[i].getCategoria() == Categoria.MOSCA || boxeadores[i].getCategoria() == Categoria.GALLO ){
        	 
        ec.asignacionBox(boxeadores[i], 0);
         
         }
         else if (boxeadores[i].getCategoria() == Categoria.PLUMA || boxeadores[i].getCategoria() == Categoria.LIGERO ){
        	 
        	 ec.asignacionBox(boxeadores[i], 1);
        	 
        	 
         }
          else if (boxeadores[i].getCategoria() == Categoria.WELTER || boxeadores[i].getCategoria() == Categoria.MEDIANO ){
        	 
        	 ec.asignacionBox(boxeadores[i], 2);
        	 
        	 
         }
        	 
          else{
        	  
         	 ec.asignacionBox(boxeadores[i], 3);

        	  
        	  
          }
              
         }
         
         for(int i = 0 ; i < 4;  i++ ){
         ec.imprimirResultado(i);
    
         
         
         }
	}
}

	

