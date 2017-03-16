package Unit13.InstructionExamples;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class MergeSort
{
	private static int passCount;

	public static void mergeSort(Comparable[] list)
	{
		passCount=0;
		mergeSort(list, 0, list.length);
	}

	private static void mergeSort( Comparable[] list, int front, int back)  //O( Log N )
	{
		int middle = (front+back)/2;
		if(middle != front) {
			mergeSort(list, front, middle);
			mergeSort(list, middle, back);
			merge(list, front, back);
		}
		System.out.println(Arrays.toString(list));
	}

	private static void merge(Comparable[] list, int front, int back)  //O(N)
	{
		passCount++;
		System.out.println("---------");
		int size = back-front;
		System.out.println("Pass:"+passCount+"\n"+"Array:"+Arrays.toString(list)+"\n"+"Front:"+front+"\n"+"Back:"+back+"\n"+"Size:"+size);
		Comparable[] temp = new Comparable[size];
		int middle = (front+back)/2;
		int i = front;
		int j = middle;
		int k = 0;
		while(i < middle && j < back) {
			Comparable c_i = list[i];
			Comparable c_j = list[j];
			System.out.println("I:" + i + "\n" + "J:" + j + "\n" + "C/I:" + c_i + "\n" + "C/J:" + c_j);
			if(c_i.compareTo(c_j) < 0) {
				temp[k] = c_i;
				System.out.println(c_i + "->" + k);
				i++;
			} else {
				temp[k] = c_j;
				System.out.println(c_j + "->" + k);
				j++;
			}
			k++;
		}
		while(i < middle) {
			temp[k] = list[i];
			k++;
			i++;
		}
		while(j < back) {
			temp[k] = list[j];
			k++;
			j++;
		}
		for(int n = 0; n < size; n++) {
			list[n] = temp[n];
		}
		System.out.println("---------");
	}
}