package com.boukhedouma.poo.serieOne;

import java.util.Scanner;

public class DescriptionOuvrage {


	public static void main(String[] args) {

		int n;

		

		System.out.println("donnez le nombre n");

		Scanner e = new Scanner(System.in);

		n=e.nextInt();

		Ouvrage [] T = new Ouvrage[n];

		for (int i=0; i<T.length; i++){

			T[i]=Ouvrage.Saisie();


		}

		Scanner sc = new Scanner(System.in);

		System.out.println("Donnez année A1");

		int A1=sc.nextInt();

		System.out.println("Donnez année A2");

		int A2=sc.nextInt();

		for(int i=0; i<T.length; i++){

			if (T[i].AnneEdition >= A1 && T[i].AnneEdition <= A2) 

				T[i].AfficherTitre();

		}
		
		e.close();
		sc.close();





	}



}
