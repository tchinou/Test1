package com.boukhedouma.poo.serieOne;

import java.util.Scanner;

public class ExoUnSerieUne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, d;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Donnez le degré de votre équation");
		
		d=sc.nextDouble();
		
		System.out.println("Donnez la valuer de A ");
		
		a=sc.nextDouble();
		
		System.out.println("Donnez la valuer de B ");
		
		b=sc.nextDouble();
		
		System.out.println("Donnez la valuer de C ");
		
		c=sc.nextDouble();
		DeltaCalcul del = null;
		
		double res=del.ResultatDelta(a, b, c, d);
		
		
		System.out.println(res);
			}

}
