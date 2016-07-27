package com.udit.sorting.algorithm;

public class BubbleSort<T extends Comparable<T>> implements Sort<T > {
	@Override
	public T[] sort(T[] obj) {
		 T temp=null;
		 Boolean swapped=true;
		 for (int counter=0;counter< obj.length-1 &&swapped;counter++) {
			 swapped=false;
			for(int counter1=0;counter1<obj.length-counter-1;counter1++){
				if(obj[counter1].compareTo(obj[counter1+1])>0){
					temp=obj[counter1];
					obj[counter1]=obj[counter1+1];
					obj[counter1+1]=temp;
					swapped=true;
				}	
			}
		}
		return obj;
	}
	
	
}

