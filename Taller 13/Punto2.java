package Taller13;

import java.util.Scanner;

/**
 *
 * @author jdmor
 */

public class Punto2 {
    
	public static void main(String [] args) {
            Scanner sc = new Scanner(System.in); 
            int col,fil,col1,fil1;
            System.out.println("Ingrese el numero de filas de la primera matriz");
            fil = sc.nextInt();
            System.out.println("Ingrese el numero de Columnas de la primera matriz");
            col = sc.nextInt();
            int a[][] = new int[fil][col];
		
            System.out.println("Ingrese el numero de filas de la segunda matriz");
            fil1 = sc.nextInt();
            System.out.println("Ingrese el numero de Columnas de la segunda matriz");
            col1 = sc.nextInt();
            int b[][] = new int[fil1][col1];	
		
            int resu[][] = new int[col][fil1];
                
            System.out.println("Ingrese los valores de la primera matriz en orden");
            for (int i = 0; i < fil; i++) {
            	for (int j = 0; j < col; j++) {
            		a[i][j] = sc.nextInt();
            	}
            }
		
            System.out.println("Ingrese los valores de la segunda matriz en orden");
            for (int i = 0; i < fil1; i++) {
            	for (int j = 0; j < col1; j++) {
					b[i][j] = sc.nextInt();
				}
			}
		
		
            System.out.println("La Matrices generadas son ");
            for (int i = 0; i < fil; i++) {
            	for (int j = 0; j < col; j++) {
            		System.out.print(a[i][j] + " ");
            	}
            	System.out.println(" ");
            }		
		
            System.out.println(" ");
		
            for (int i = 0; i < fil1; i++) {
            	for (int j = 0; j < col1; j++) {
            		System.out.print(b[i][j] + " ");
            	}
            	System.out.println(" ");
            }
		
            System.out.println(" ");
		
            if (fil == col1) {
            	
            	for (int k = 0; k < fil; k++) {
            		for (int l = 0; l < col1; l++) {
            			for (int x = 0; x < resu.length; x++) {
            				resu[k][l] = resu[k][l] + ( a[k][x] * b[x][l] ) ;
            			}
            		}
            	}
		
            	System.out.println("3A Da como resultado: ");
            	int ar[][] = new int[fil][col];
                for (int i = 0; i < fil; i++) {
                	for (int j = 0; j < col; j++) {
                		ar[i][j] = (3 * a[i][j]);
                	}
                }
                
                for (int i = 0; i < fil; i++) {
            		for (int j = 0; j < col; j++) {
            			System.out.print(ar[i][j] + " ");
            		}
            		System.out.println(" ");
            	}
                
                System.out.println(" ");
                
                System.out.println("4B Da como resultado: ");
            	int br[][] = new int[fil1][col1];
                for (int i = 0; i < fil1; i++) {
                	for (int j = 0; j < col1; j++) {
                		br[i][j] = (4 * b[i][j]);
                	}
                }
                
                for (int i = 0; i < fil; i++) {
            		for (int j = 0; j < col; j++) {
            			System.out.print(br[i][j] + " ");
            		}
            		System.out.println(" ");
            	}
                
                System.out.println(" ");
                
                int suma[][] = new int [fil][col];
                
                if (col == col1 && fil == fil1) {
                    System.out.println("La suma de las matrices da: ");	
                    
                    for (int i = 0; i < fil; i++) {
                    	for (int j = 0; j < col; j++) {
                    		suma[i][j] = (a[i][j] + b[i][j]);
                    	}
                    }
                    
                    for (int i = 0; i < fil; i++) {
                		for (int j = 0; j < col; j++) {
                			System.out.print(suma[i][j] + " ");
                		}
                		System.out.println(" ");
                	}
                    
				}else {
					System.out.println("Las matrices no cumplen las condiciones para sumarse");
				}
                
                System.out.println(" ");
                
            	System.out.println("A X B Da como resultado :  ");
            	for (int i = 0; i < fil; i++) {
            		for (int j = 0; j < col; j++) {
            			System.out.print(resu[i][j] + " ");
            		}
            		System.out.println(" ");
            	}		
		
            }else {
            	System.out.println("No se puede realizar ya que el numero de filas de la primera matriz, no coincide con el numero de columnas de la segunda matriz ");	
            }
		}
}
