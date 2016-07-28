package com.udit.sorting.algorithm;

public class SelectionSort<T extends Comparable<T>> implements Sort<T>{

	@Override
	public T[] sort(T[] obj) {
		for(int counter=0;counter<obj.length;counter++){
			int min=counter;
			for(int counter2=counter+1;counter2<obj.length;counter2++){
				if(obj[min].compareTo(obj[counter2])>0){
					min=counter2;
				}
			}
			T temp=obj[counter];
			obj[counter]=obj[min];
			obj[min]=temp;
		}
		return obj;
	} 
	

}
