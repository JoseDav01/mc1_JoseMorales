package TalleresMC;

public class Taller12{

    public double potencia (double base, int exponente){
        double a = 1;
        for ( int i = 0; i< exponente; i ++){
            a = a * base;
        }
        return a;
    }
    
    public int factorial (int numero){
        int b = 1;
        while(numero != 0)
        {
            b = b * numero;
            numero = numero - 1;
        }
        return b;
    }
    
    public double exponencial (double x, int n)
    {
        double exp = 0;
        double suma = 0;
        for(int i = 0; i<n; i++)
        {
            exp = potencia(x,i)/factorial(i);
            suma = suma + exp;            
        }
        return suma;
    }
    
    public float error(double valt, double x) {
    	float error = 100;
    	error = (float)(Math.abs((valt-x)/x))*100;
		return error;
    	
    }
    
         public static void main(String args[]) {
        	 double e = 2.71828, e1;
        	 Taller12 Taller = new Taller12 ();
        	 
        	 System.out.println("****** APROXIMACIONES ******");
        	 System.out.println("0: " + Taller.exponencial(0.755,0));
        	 System.out.println("Error Porcentual: 100%");
        	 System.out.println(" ");
        	 
        	 for (int i = 1; i < 16; i++) {
        		 e1 = Math.pow(e, -i);
        		 System.out.println(i + ": " + Taller.exponencial(0.755,i));
            	 System.out.println("Error Porcentual: " + (100-Taller.error(e1, i)) + "%");
            	 System.out.println(" ");
			}
    }
}

