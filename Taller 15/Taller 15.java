package TalleresMC;
import java.util.*;
public class Taller14{
	static void muestramatriz(float matriz[][], int var){
		for(int x=0;x<3;x++){
			for(int y=0;y<(6);y++)
				System.out.print(" "+matriz[x][y]+" |");
				System.out.println("");
		}

	}
	
	static void pivote(float matriz[][],int piv, int var)
	{
		float temp=0;
		temp=matriz[piv][piv];
		for(int y=0;y<(6);y++)
		{

			matriz[piv][y]=matriz[piv][y]/temp;
		}
	}
	static void hacerceros(float matriz[][],int piv, int var)
	{
		for(int x=0;x<3;x++)
		{
			if(x!=piv)
			{
				float c=matriz[x][piv];
				for(int z=0;z<(6);z++)
					matriz[x][z]=((-1*c)*matriz[piv][z])+matriz[x][z];
			}
		}
	}

	public static void main(String args[])
	{
		Scanner leer=new Scanner(System.in);
		int var=3, piv=0;
		float matriz[][] = {{4,6,7,0,1,0} , {0,2,3,1,0,0}, {2,-2,6,0,0,1}};
		
	
		for(int a=0;a<3;a++)
		{
			pivote(matriz,piv,var);

			System.out.println("\tRenglon "+(a+1)+" entre el pivote");
			muestramatriz(matriz,var);

			System.out.println("");

			System.out.println("\tHaciendo ceros");
			hacerceros(matriz,piv,var);

			muestramatriz(matriz,var);
			System.out.println("");
			piv++;
		}
		
		System.out.println(" ");
		System.out.println("La matriz inversa es: ");
		
		for (int x=0; x < matriz.length; x++) {
			  System.out.print("|");
			  for (int y=4; y < matriz[x].length; y++) {
			    System.out.print (matriz[x][y]);
			    if (y!=matriz[x].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
		}

	}
}