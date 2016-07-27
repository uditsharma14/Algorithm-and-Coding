package com.test;

import com.udit.sorting.algorithm.BubbleSort;

public class Main {
 public static void main(String []args){
	 BubbleSort<Integer> bubbleSort=new BubbleSort<Integer>();
	 Integer [] integer={123,244,244,212,3455,3454};
	 integer=bubbleSort.sort(integer);
	for(int counter=0;counter<integer.length;counter++){
		System.out.println(integer[counter]);
	}
 }
}
