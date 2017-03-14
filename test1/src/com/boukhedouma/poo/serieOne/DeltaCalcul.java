package com.boukhedouma.poo.serieOne;

public class DeltaCalcul {

	double a, b, c, d;

	public DeltaCalcul(double a, double b, double c, double d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public static double ResultatDelta(double a, double b, double c, double d){

		double partieDroiteEquation=(((-4)*a));
		double pa=(partieDroiteEquation*c);
		int delta=(int)(Math.pow(b, d));
		double deltaa=delta+(pa);
		double x1=0;
		double x2=0;
		
		if(delta < 0){
			System.out.println("resultat impossible car delta negatif");
		}
		else {
			if(delta == 0){

				x1=x2=(-b/(2*a));
			}
			else{

				x1=(-b-(Math.sqrt(delta))/2*a);

				x2=(-b+(Math.sqrt(delta))/2*a);

			}

		}
		return x1;
	}




}
