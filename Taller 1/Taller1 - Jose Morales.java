package MC;

import java.util.HashSet;
import java.util.Scanner;

public class Taller1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
                
                int aux = 0, n = 0;
                
                System.out.println("Digite los digitos del conjunto A y se eliminaran los numeros repetidos");
		HashSet<Integer> A = new HashSet<>();
		for (int i = 1; i < 6; i++) {
			System.out.println("Numero " + i + ": ");
			aux = sc.nextInt();
			A.add(aux);
		}
		System.out.println("A = " + A);
		
                System.out.println("Digite los digitos del conjunto B y se eliminaran los numeros repetidos");
		HashSet<Integer> B = new HashSet<>();
		for (int i = 1; i < 6; i++) {
			System.out.println("Numero " + i + ": ");
			aux = sc.nextInt();
			B.add(aux);
		}
		System.out.println("A = " + B);
		
                System.out.println(" ");
                System.out.println("Que operacion desea hacer:");
                System.out.println(" ");
		System.out.println(" 1. Union ");
		System.out.println(" 2. Interseccion ");
		System.out.println(" 3. Diferencia ");
                System.out.println(" 4. Diferencia Simetrica ");
                System.out.println(" 5. Salir ");
                System.out.println(" ");
                
                n = sc.nextInt();
		
		
                switch(n) {
		case 1:
			HashSet<Integer> U = new HashSet<>();
			for (int elemento : A) {
				U.add(elemento);
			}
			
			for (int elemento : B) {
				U.add(elemento);
			}
			
			System.out.println("A Union B = " + U);
			break;
			
		case 2:
			HashSet<Integer> I = new HashSet<>();
                        B.retainAll(A);
                        I = B;
			
			System.out.println("A n B = " + I);
			break;
		
                case 3:
                        HashSet<Integer> D = new HashSet<>();
                        A.removeAll(B);
                        D = A;
                        System.out.println("A - B = " + D);
                        break;
                
                case 4:
                    HashSet<Integer> Un = new HashSet<>();
			for (int elemento : A) {
				Un .add(elemento);
			}
			
			for (int elemento : B) {
				Un.add(elemento);
			}
			HashSet<Integer> IN = new HashSet<>();
                        B.retainAll(A);
                        IN = B;
            
                        HashSet<Integer> DI= new HashSet<>();
                        Un.removeAll(IN);
                        DI = Un;
                        HashSet<Integer> Ds = new HashSet<>();
                        Ds = Un;
                        System.out.println("A ∆ B = " + Ds);
                    break;
                    
                case 5:
                         System.out.println("Saliendo...");
                    break; 
		}
	}

}