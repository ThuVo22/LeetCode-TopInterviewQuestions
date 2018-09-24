package longest.string.without.repetition;

import java.util.HashMap;

public class Solution {
	public static void main(String[] args) {
		String str = "abcabcbb";
		System.out.println(longestSubString(str));
		//longestSubString(str);
	}
	
	public static int longestSubString(String s) {
		if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        int result =0;
        for (int i=0, j=0; i<s.length(); ++i){
        	//if there was the same letter before
            if (map.containsKey(s.charAt(i))){
            	System.out.println(map.get(s.charAt(i)) +1 + " are dups");
                j = Math.max(j,map.get(s.charAt(i))+1);
                
                
            }
            // if all letter are different keep adding
            map.put(s.charAt(i),i);
            System.out.println( i -j + 1 +"    i = " + i +"j= " + j);
            max = Math.max(max,i-j+1);
           
        }
        return max;
	}
}
