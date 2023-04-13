package clase130423;

import java.util.Scanner;

public class Arreglo {

	public static void main(String[] args) {
		
		
		Scanner tc = new Scanner(System.in);
		
		int a[];
		int b[];
		int n,n2,ppunto=0,suma=0,suma2=0;
	    float sumaraiz1=0,sumaraiz2=0,sumatot,z=0;
		do {
		System.out.println("Ingrese el tamaño del primer arreglo");
		n=tc.nextInt();
		} while (n<=0);
		a= new int[n];
		do {
		System.out.println("Ingrese el tamaño del segudo arreglo");
		n2=tc.nextInt();
		} while (n2<=0);
		
		b= new int[n2];
		
		try {
		
		if (n==n2)	{
		
		for (int i=0;i<a.length;i++) {
			System.out.println("Arreglo1 = Ingrese el numero "+(i+1));
			a[i]=tc.nextInt();
			suma = (int) (suma + Math.pow(a[i], 2));
		}
		
		int i=a.length;
		
		for (int j=0;j<b.length;j++) {
			System.out.println("Arreglo2 = Ingrese el numero "+(j+1));
			b[j]=tc.nextInt();
			suma2 = (int) (suma2 + Math.pow(b[j], 2));
		}
		
	sumaraiz1= (float) Math.sqrt(suma);
	sumaraiz2= (float) Math.sqrt(suma2);
	sumatot= sumaraiz1*sumaraiz2;
		int j=b.length;
		for (int x=0;x<a.length;x++) {
		ppunto= ppunto+ a[x]*b[x];
		
		}
			z=ppunto/sumatot;
		System.out.println("El producto punto es = "+ppunto);
		System.out.println("Z = "+z);
		
		}
		else {
			System.out.println("Los arreglos deben de ser iguales");
		}
		
		} catch (java.util.InputMismatchException l) {
			System.out.println("Error");
		}
		
		 }
		 
	}


