package leetCode;

import java.util.*;

public class Three {
	
	public int lengthOfLongestSubstring(String s) {
		HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
		int len = s.length(), ret = 0, ans = 0;
		char tmp;
		for(int i = 0; i < len; i++) {
			map.clear();
			ans = 0;
			for(int j = i; j < len; j++) {
				tmp = s.charAt(j);
				
				if(map.get(tmp) == null) {
					map.put(tmp, true);
					ans++;
				} else {
					break;
				}
			}
			ret = Math.max(ret, ans);
		}
		return ret;
    }
	
	public static void main(String [] args) {
		String str = "pwwkew";
		Three three = new Three();
		System.out.println(three.lengthOfLongestSubstring(str));
	}
}
