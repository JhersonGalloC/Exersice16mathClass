package com.exersice16MathClass;

import java.lang.Math;
import java.util.Scanner;

public class MathClass 
{

	public static void main(String[] args) 
	{
		double number =3.56;
		double number2 = 5.5;
		Scanner input = new Scanner(System.in);
		
		System.out.println("e value: "+Math.E);
		System.out.println("pi value:"+Math.PI);
		System.out.println("Absolute value of -2.15 is: "+Math.abs(-2.15));
		System.out.println("The cube root of 27 is: "+Math.cbrt(27));
		System.out.println("The round of 3.56: "+Math.round(3.56));
		System.out.println("The round of 3.56: "+Math.ceil(3.56));
		System.out.println("The round of 3.56: "+Math.floor(number)); 
		System.out.println("increment of 5"+Math.incrementExact(5));
		System.out.println("Decrement of 5"+Math.decrementExact(5));
		System.out.println("power value is"+Math.exp(3));
		System.out.println(String.format("Whis is bigger? %2f or %4f: %3f",number,number2, Math.max(number, number2)));
		System.out.println(String.format("Whis is bigger? %2f or %4f: %3f",number,number2, Math.min(number, number2)));
		System.out.println("Sin of 90 degree is "+Math.asin(0));
		System.out.println("Sin of PI/2 degrees is "+Math.sin((Math.PI/2)));
		System.out.println("Cos of 0 degrees is "+Math.acos(0));
		System.out.println("Cos of PI/2 degree is "+Math.cos(Math.PI/2));
		for(int i=0;i<5;i++);
		{
		System.out.println("input a number");
		number =input.nextDouble();
		System.out.println("The square of"+number+" is "+Math.pow(number, 2));
		}
		int cont=0;
		do
		{
			
			cont++;
		}while(cont<5);
		
		
	}

}
