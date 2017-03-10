package Assessments;

import java.util.ArrayList;

public class Assessment6 {
	Integer[] array;
	ArrayList<Integer> arrayList;
	int range;
	int count;
	public Assessment6() {
		this(0, 0);
	}
	public Assessment6(int c, int r) {
		setCount(c);
		setRange(r);
		initializeArray();
	}
	public void setRange(int r) {
		range = r;
	}
	public void setCount(int c) {
		count = c;
	}
	public void initializeArray() {
		array = new Integer[range];
		arrayList = new ArrayList<Integer>();
		for(int i = 0; i < range; i++) {
			array[i] = 0;
			arrayList.add(0);
		}
	}
	public void generateRandomNumbers() {
		for(int i = 0; i < count; i++) {
			int n = (int) (Math.random() * range);
			array[n] += 1;
			arrayList.set(n, arrayList.get(n)+1);
		}
	}
	public String toString() {
		String result = "";
		for(int n = 0; n < range; n++) {
			String entry = n + " " + array[n];
			//Add spaces
			while(entry.length() < 7) {
				entry = entry.replaceFirst(" ", "  ");
			}
			result += entry + "\n";
		}
		return result;
	}
}