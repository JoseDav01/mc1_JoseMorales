package metodosNumericos;

import java.util.ArrayList;
import java.util.Scanner;

public class Taller20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double sumatoriaX = 0, sumatoriaY = 0, sumatoriaXY = 0, sumatoriaX2 = 0;
        int opc; 

        System.out.println("");
        System.out.println("1. Minimos Cuadrados");
        System.out.println("2. Regresiones lineales");
        System.out.println("3. Razon de crecimiento regresiones lineal");
        System.out.println("4. Razon potencia");
        System.out.println("5. Salir ");
        System.out.println("");
        opc = sc.nextInt();

        ArrayList<Integer> xy = new ArrayList<Integer>();
        ArrayList<Integer> x2 = new ArrayList<Integer>();

        double[] x = {0.5, 0.8, 1.3, 1.8, 3, 5};
        double[] y = {0.1, 0.2, 0.5, 1, 3, 8.8};

        switch (opc) {
            case 1:
                
                for (int i = 0; i < x.length; i++) {
                    sumatoriaX += x[i];
                    sumatoriaY += y[i];
                    sumatoriaXY += x[i] * y[i];
                    sumatoriaX2 += Math.pow(x[i], 2);
                }

                double promedioX = sumatoriaX / x.length;
                double promedioy = sumatoriaY / y.length;

                double A1 = ((x.length * sumatoriaXY) - (sumatoriaX * sumatoriaY)) / ((x.length * sumatoriaX2) - Math.pow(sumatoriaX, 2));

                double A0 = promedioy - (A1 * promedioX);

                System.out.println("Ecuacion con Minimos Cuadrados: y = " + A0 + " + " + A1 + "x");

                break;

            case 2:

                for (int i = 0; i < x.length; i++) {
                    sumatoriaX += x[i];
                    sumatoriaY += Math.log(y[i]);
                    sumatoriaXY += x[i] * Math.log(y[i]);
                    sumatoriaX2 += Math.pow(x[i], 2);
                }
                promedioX = sumatoriaX / x.length;
                promedioy = sumatoriaY / y.length;

                A1 = ((x.length * sumatoriaXY) - (sumatoriaX * sumatoriaY)) / ((x.length * sumatoriaX2) - Math.pow(sumatoriaX, 2));

                A0 = promedioy - (A1 * promedioX);

                double alfa = Math.exp(A0);
 
                System.out.println("Ecuacion con Regresiones lineales: y = " + alfa + "e^" + A1 + "x");

                break;

            case 3:

                for (int i = 0; i < x.length; i++) {
                    sumatoriaX += 1/x[i];
                    sumatoriaY += 1/y[i];
                    sumatoriaXY += (1 / x[i]) * (1 / y[i]);
                    sumatoriaX2 += Math.pow(1 / x[i], 2);
                }
                promedioX = sumatoriaX / x.length;
                promedioy = sumatoriaY / y.length;

                A1 = ((x.length * sumatoriaXY) - (sumatoriaX * sumatoriaY)) / ((x.length * sumatoriaX2) - Math.pow(sumatoriaX, 2));

                A0 = promedioy - (A1 * promedioX);

                alfa = (1 / A0);
                //beta 
                double beta = A1 / A0;

                System.out.println("La ecuacion con Razon de crecimiento regresiones lineal es y = " + alfa + " " + "( x / (" + beta + " + x))");
                System.out.println("y = " + alfa + "*" + "( x/(" + beta + " + x))");

                break;

            case 4:

                for (int i = 0; i < x.length; i++) {
                    sumatoriaX += Math.log10(x[i]);
                    sumatoriaY += Math.log10(y[i]);
                    sumatoriaXY +=  Math.log10(x[i]) * Math.log10(y[i]);
                    sumatoriaX2 += Math.pow( Math.log10(x[i]), 2);
                }
                promedioX = sumatoriaX / x.length;
                promedioy = sumatoriaY / y.length;

                A1 = ((x.length * sumatoriaXY) - (sumatoriaX * sumatoriaY)) / ((x.length * sumatoriaX2) - Math.pow(sumatoriaX, 2));

                A0 = promedioy - (A1 * promedioX);

                alfa = Math.pow(10,A0);
                beta = A1 ;

                System.out.println("Ecuacion con Razon de potencia regresiones lineal: y = " + alfa + " " + "( x / (" + beta + " + x))");

                break;

        }

    }

}