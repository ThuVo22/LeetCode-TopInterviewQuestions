package anagram.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnagramList {
	public static void main(String[] args) {
		String[] arr = { "ead", "dea", "rrrrr", "wwww", "rw", "wr" };
		Anagram(arr);
	}

	public static void Anagram(String[] arr) {
	//	HashSet<char[]> hs = new HashSet<>();
		char[]str = new char[arr.length];
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			str = arr[i].toCharArray();
			Arrays.sort(str);	
			list.add(Arrays.hashCode(str));
			Collections.sort(list);
			if(list.get(i)==list.get(i+1)) {
				System.out.println("i: "+i+"i+1: "+ i+1);
			}
		}		
		System.out.println(list);
		
		
	}
}
