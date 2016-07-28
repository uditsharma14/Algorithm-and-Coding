package com.test;

import com.udit.sorting.algorithm.BubbleSort;
import com.udit.sorting.algorithm.SelectionSort;

public class Main {
 public static void main(String []args){
	 BubbleSort<Integer> bubbleSort=new BubbleSort<Integer>();
	 SelectionSort<Integer> selectionSort=new SelectionSort<Integer>();
	 Integer [] integer={123,244,244,212,3455,3454};
	 //integer=bubbleSort.sort(integer);
	System.out.println("Result of Bubble sort: ");
	for(int counter=0;counter<integer.length;counter++){
		System.out.print(integer[counter]+ " ");
	}
	
	System.out.println("\nResult of Selection sort: ");
	integer=selectionSort.sort(integer);
	for(int counter=0;counter<integer.length;counter++){
		System.out.print(integer[counter]+" ");
	}
 }
}
