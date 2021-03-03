package Punto1Par;

import java.util.HashSet;

public class Punto1{

	public static void main(String[] args) {

                ///Elaboracion Conjunto A
		HashSet<Integer> A = new HashSet<>();
		for (int i = 10; i < 30; i++) {
			A.add(i);
		}
		
                ///Elaboracion Conjunto B
		HashSet<Integer> B = new HashSet<>();
		    B.add(0);
		    B.add(2);
		    B.add(4);
		    B.add(6);
		    B.add(12);
		    B.add(24);
		    B.add(48);
			
                ///Elaboracion Conjunto C
		HashSet<Integer> C = new HashSet<>();
		for (int p = 0; p < 45; p++) {
			if(p%4 ==2) {
				C.add(p);
				
			}
		}	
		
                ///Elaboracion Conjunto D
                HashSet<Integer> D = new HashSet<>();
                D.add(2);
                D.add(3);
		D.add(5);
		D.add(7);
		D.add(11);
		D.add(13);
		D.add(17);
		D.add(19);
		D.add(23);
		D.add(29);
		D.add(31);
		D.add(37);
	    
                ///Impresion Conjuntos
		System.out.println("El conjunto A es = " + A);
		System.out.println("El conjunto B es = " + B);
		System.out.println("El conjunto C es = " + C);
		System.out.println("El conjunto D es = " + D);
		
                ///Procesos
		HashSet<Integer> aux1 =new HashSet<Integer>();
		aux1 =diferencia(A, C);
		HashSet<Integer> aux2 =new HashSet<Integer>();
		aux2 =interseccion(B, D);
		HashSet<Integer> aux3 =new HashSet<Integer>();
		aux3 =diferenciasim(aux1, aux2);
		System.out.println("RESPUESTA #1 = " + aux3);
		
		HashSet<Integer> aux4 =new HashSet<Integer>();
		aux4 =interseccion(B, D);
		HashSet<Integer> aux5 =new HashSet<Integer>();
		aux5 =diferenciasim(aux4, C);
		HashSet<Integer> aux6 =new HashSet<Integer>();
		aux6 =union(A, D);
		HashSet<Integer> aux7 =new HashSet<Integer>();
		aux7 =diferencia(aux5, aux6);
		System.out.println("RESPUESTA #2 = " +aux7);
		
		HashSet<Integer> aux8 =new HashSet<Integer>();
		aux8 =diferencia(B, D);
		HashSet<Integer> aux9 =new HashSet<Integer>();
		aux9 =union(aux1, aux8);
		System.out.println("RESPUESTA #3 = " +aux8);
	
	
			
		
	}
        ///Definicion Operaciones entre conjuntos
		public static HashSet<Integer> union(HashSet<Integer> aux1,HashSet<Integer> aux2){
			HashSet<Integer> rta= new HashSet<>();
			rta.addAll(aux1);
			rta.addAll(aux2);
				 return rta;
			
		} 
		   public static HashSet<Integer> diferencia(HashSet<Integer> aux1,HashSet<Integer> aux2){
			HashSet<Integer> rta= new HashSet<>();
			for(int elemento:aux1){
							 if(aux1.contains(elemento) && aux2.contains(elemento)){
								 
							 }else{
								 rta.add(elemento);
						 }
							 
						 }
						 for(int elemento:aux2){
							 if(aux1.contains(elemento) && aux2.contains(elemento)){
								 
							 }else{
								 rta.add(elemento);
						 }
							 
						 }
				 return rta;
		}
		   public static HashSet<Integer> interseccion(HashSet<Integer> aux1,HashSet<Integer> aux2){
			 HashSet<Integer> rta= new HashSet<>();
		 for(int elemento:aux1){
							 if(aux1.contains(elemento) && aux2.contains(elemento)){
								 rta.add(elemento);
							 }
							 
						 }
				 return rta;
			
		} 
			
		   ///Definicion Diferencia Simetrica
			private  static HashSet<Integer> diferenciaS (HashSet<Integer>aux1,HashSet<Integer>aux2){
			HashSet<Integer> rta =new HashSet<Integer>();
			rta.addAll(aux1);
			rta.addAll(aux2);
			HashSet<Integer> f =new HashSet<Integer>();
			aux1.retainAll(aux2);
			f=aux1;
			HashSet<Integer> i =new HashSet<Integer>();
			rta.removeAll(f);
			i=rta;
			return rta;
			
			
			}
		}
