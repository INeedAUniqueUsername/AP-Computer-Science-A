package FRQ_Warmup2;

import java.util.ArrayList;

public class FRQ_Warmup2 {
	public static void main(String[] args) {
		ArrayList<E> eee = new ArrayList<E>(4);
		for(int i = 0; i < 4; i++) {
			eee.add(new E(i, i));
		}
		for(E e : eee) {
			System.out.println(e);
		}
	}
}
