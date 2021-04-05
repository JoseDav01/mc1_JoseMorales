package Taller13;

import java.util.Scanner;

/**
 *
 * @author jdmor
 */

public class Punto1 {
    
	public static void main(String [] args) {
            Scanner sc = new Scanner(System.in); 
            int dim, dim1;
            System.out.println("Ingrese la dimension del primer vector");
            dim = sc.nextInt();
            int a[] = new int[dim];
		
            System.out.println("Ingrese la dimension del segundo vector");
            dim1 = sc.nextInt();
            int b[] = new int[dim1];	
                
            System.out.println("Ingrese los valores del primer vector en orden");
           
            for (int j = 0; j < dim; j++) {
            	a[j] = sc.nextInt();
            }
            
		
            System.out.println("Ingrese los valores del segundo vector en orden");
          
            for (int j = 0; j < dim1; j++) {
				b[j] = sc.nextInt();
			}
			
		
		
            System.out.println("Los vectores generados son ");
            
            	for (int j = 0; j < dim; j++) {
            		System.out.print(a[j] + " ");
            	}	
		
            System.out.println(" ");
            System.out.println(" ");
		
            	for (int j = 0; j < dim1; j++) {
            		System.out.print(b[j] + " ");
            	}
		
            System.out.println(" ");
            
            int resu = 0, resul = 0;
            
            if (dim == dim1) {
            for (int i = 0; i < dim; i++) {
				resu = ((a[i])*(b[i])) + resu;
				resul = resul + resu;
			}
    
    		System.out.println("RTA: " + resu);
    		
            }else {
				System.out.println("Los vectores no cumplen las condiciones para realizar la operacion");
			}
	}
	
}