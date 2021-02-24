package Matcompu;

import java.util.Scanner;
public class Taller7 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double x, top, errora = 100, valor = 0,aux;
        int exp = 0, Iter = 0;
        
        System.out.println("Digite el valor de X para evaluar 1 / (e ^ (-x)) ");
        x = sc.nextDouble();

        top = 0.5;
        
        do{
        aux = valor;
        if (Iter % 2 == 0) {
        	valor += Math.pow(x, exp) / factorial(exp);
        }else {
        	valor -= Math.pow(x, exp) / factorial(exp);
        }
        
        errora = Math.abs((valor - aux) / valor) * 100;
        
        Iter = Iter + 1;
        
        exp += 1;
        
        }while(errora >= top);

        System.out.println("*************Respuesta***************");
        System.out.println("El valor del e ^ (" + x + ") es = " + valor);
        System.out.println("Error relativo porcentual: " + errora + "%");
        System.out.println("Numero de Iteraciones: " + Iter);
	}
	 public static double factorial(int n){
	        double aux1 = 1;
	        for (int i = 2; i <= n; i++) {
	        aux1 *= i;
	        }
	        return aux1;
}
}