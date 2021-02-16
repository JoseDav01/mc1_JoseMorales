package MatCom;

import java.util.HashSet;

public class MC {
	

	public static void main(String[] args) {
		
		///Creacion de listas  

		HashSet<Integer> A = new HashSet<>();
		HashSet<Integer> B = new HashSet<>();
		HashSet<Integer> C = new HashSet<>();
		HashSet<Integer> D = new HashSet<>();

		///Llenado listas 
		///Lista A
		
		for (int i = 6; i < 25; i++) {
			A.add(i);
		}

		///Lista B
		
		for (int j = 0; j < 30; j++) {
			if(j%2 ==1) {
				B.add(j);
				
			}
		}	
		
		///Lista C
	    C.add(0);
	    C.add(3);
	    C.add(6);
	    C.add(9);
	    C.add(11);
	    C.add(15);
	    C.add(18);
	    C.add(20);
	    
		///Lista D
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

		
		///Primer Proceso
		
		HashSet<Integer> c1 =new HashSet<Integer>();
		c1 = diferenciasim(A, B);
		HashSet<Integer> c2 =new HashSet<Integer>();
		c2 = interseccion(c1, C);
		System.out.println("Respuesta #1 = " + c2);
		
		///Segundo Proceso
		
		HashSet<Integer> c3 =new HashSet<Integer>();
		c3 = diferenciasim(A, C);
		HashSet<Integer> c4 =new HashSet<Integer>();
		c4 = union(c3, B);
		System.out.println("Respuesta #2 = " + c4);
		
		///Tercer Proceso
		
		HashSet<Integer> c5 =new HashSet<Integer>();
		c5 =union(C, D);
		HashSet<Integer> c6 =new HashSet<Integer>();
		c6 =diferenciasim(A, c5);
		System.out.println("Respuesta #3 = " + c6);
		
		///Cuarto Proceso
		
		HashSet<Integer> c7 =new HashSet<Integer>();
		c7 =diferenciasim(C,A);
		HashSet<Integer> c8 =new HashSet<Integer>();
		c8 =interseccion(B, D);
		HashSet<Integer> c9 =new HashSet<Integer>();
		c9= diferenciasim(c7, c8);
		System.out.println("Respuesta #4 = " + c9);	
		
	}
	
	private static HashSet<Integer> union(HashSet<Integer>c1, HashSet<Integer> c2) {
		HashSet<Integer> U =new HashSet<Integer>();
		U.addAll(c1);
		U.addAll(c2);
		return U;
		
	}
	private  static HashSet<Integer>interseccion(HashSet<Integer>c1,HashSet<Integer>c2){
		HashSet<Integer> I =new HashSet<Integer>();
		c1.retainAll(c2);
		I=c1;
		return I;
		
	}
	private  static HashSet<Integer>diferencia(HashSet<Integer>c1,HashSet<Integer>c2){
		HashSet<Integer> D =new HashSet<Integer>();
		c1.removeAll(c2);
		D = c1;
		return D;		
		
	}

	private  static HashSet<Integer>diferenciasim(HashSet<Integer>c1,HashSet<Integer>c2){
	HashSet<Integer> DS = new HashSet<Integer>();
	DS.addAll(c1);
	DS.addAll(c2);
	HashSet<Integer> d = new HashSet<Integer>();
	c1.retainAll(c2);
	d=c1;
	HashSet<Integer> i = new HashSet<Integer>();
	DS.removeAll(d);
	i=DS;
	return DS;

	}
}




