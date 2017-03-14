package com.boukhedouma.poo.serieOne;

import java.util.Arrays;

public class Pile {

	int T[ ], A[ ];

	private String [] stackArray;
	private int stackSize;
	private int topOfStack = -1;

	public Pile(int size){

		stackSize=size;
		stackArray=new String[size];
		//Arrays.fill(stackArray, "-1");

	}


	public void push(String input ){

		if(topOfStack +1 < stackSize){

			topOfStack++;

			stackArray[topOfStack]=input;

		}
		else System.out.println("Sorry the stack is ful");

		displayTheStack();

		System.out.println("PUSH" +" "+input+ " "+ "Was added to the stack");
	}


	public void displayTheStack(){

		for(int i=0; i<stackArray.length; i++){
			System.out.println(stackArray[i]);
		}
		//System.out.println(Arrays.toString(stackArray));

	}

	public String pop(){

		if(topOfStack >= 0){

			System.out.println("POP" + " " +stackArray[topOfStack]+ "was removed from the stack");

			stackArray[topOfStack]="-1";

			return stackArray[topOfStack--]; 
		}

		else {

			displayTheStack();

			System.out.println("Sorry but the stack is empty");

			return "-1";
		}

	}

	public String peek(){

		displayTheStack();

		System.out.println("PEEK" + " " +stackArray[topOfStack] + "is at the top of the Stack");
		return stackArray[topOfStack];

	}

	public boolean isEmpty()
	{
		if(topOfStack==-1)
			return true;
		else 
			return false;
	}

	public int NombreElementPile(int T[]){
		int count=0;
		for(int i=0; i<T.length; i++){

			if (T[i]!=0) count++;
		}
		return count;
	}

	public String ElementTetePile(){

		if(topOfStack == -1){

			System.out.println("La pile est vide");
			return "vide";
		}
		else 
			return stackArray[topOfStack];
	}

	public void ViderPile(int T[]){

		for(int i=0; i<T.length; i++){

			T[i]=0;
		}
	}
}
