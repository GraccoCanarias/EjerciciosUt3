package com.cip.program;

import java.util.Scanner;

public class EjerciciosUt3 {

	public static void main(String[] args) {
	
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdusca el diametro");
		double diametro = sc.nextDouble();
		
		double radio = diametro / 2;
		
		System.out.println("El Radio es" + radio);
		
	sc.close();
		
	*/
		/*
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Introdusca su peso");
	double peso = sc.nextDouble();
	
	System.out.println("Introdusca su altura en metros");
	double altura = sc.nextDouble();
	
		double IMC = peso / altura*altura;
		System.out.println("Su IMC es" + IMC);
	
	sc.close();	
	*/
		/*
		Scanner sc = new Scanner (System.in);
		
		final double PI = 3.1416;
				
		System.out.println("Introdusca el radio");
		double radio = sc.nextDouble();
		 
			double Area = PI*radio*radio;
			System.out.println("El Area es" + Area);
	
	sc.close();
	*/
		
		/*
		Scanner sc = new Scanner (System.in);
		
		final float Valor1 = (float) 1.17473;
		
		System.out.println("Introdusca Cantidad en Euros");
		float Euros = sc.nextFloat();
		
		float Dollar = Euros*Valor1;
		System.out.println("Son en Dollars" + Dollar);
		
	sc.close();
	*/
	    public static int Promedio() {
		  
	    	int y = 0;
	    	int z = 0;
	    	while (z == 0) {
	    	 
	    	try{
	    		System.out.println("Introdusca valor");
	            Scanner valor0 = new Scanner (System.in);
		        y = valor0.nextInt();
		        z = 1;
	    	
	    	}
		        
		   catch (Exception e){
			   System.out.println("N ha introducido valor");
			   z = 0;
		   }
	   }
	 return  y;
	}
	    	
	    	
		void resolver () {
	    	System.out.println("Introdusca 1º valor");
		    int valor1 = Promedio();
		    System.out.println("Introdusca 2º valor");
		    int valor2 = Promedio();
		    System.out.println("Introdusca 3º valor");
		    int valor3 = Promedio();
		    
		
		
		double promedio = valor1+valor2+valor3/3;
		System.out.println("El promedio es" + promedio);
		
		
 }   	
}		
				
				
				
		
		
	
	


