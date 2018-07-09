package leetCode;

public class Fourteen {
	//输入的数组中没有元素   数组元素的长度为0
	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0)
			return "";
		if(strs.length == 1)
			return strs[0];
		int ret = 0;
		for(int i = 0; i < Math.min(strs[0].length(), strs[1].length()); i++) {
			if(strs[0].charAt(i) == strs[1].charAt(i)) {
				ret++;
			} else {
				break;
			}
		}
		for(int i = 2; i < strs.length; i++) {
			if(ret == 0) 
				break;
			ret = Math.min(ret, strs[i].length());
			for(int j = 0; j < ret; j++) {
				if(strs[i].charAt(j) != strs[0].charAt(j)) {
					ret = j;
					break;
				}
			}
		}
		return strs[0].substring(0, ret);
    }
	
	public static void main(String [] args) {
		Fourteen fourteen = new Fourteen();
//		String [] str = {"flower","flow","flight"};
		String [] str = {"abab","aba",""};
		System.out.println(fourteen.longestCommonPrefix(str));
	}
}
