package leetCode;

public class Five {

	public int test(String s, int b, int e) {
		if(e  == s.length()  && b != e)
			return 0;
		int len = s.length();
		for(; b >= 0 && e < len; b--, e++) {
			if(s.charAt(b) != s.charAt(e))
				break;
		}
		b++;
		e--;
		return e - b + 1;
	}
	
	public String longestPalindrome(String s) {
        int ans = 0, tmp;
        String ret = "";
        for(int i = 0; i < s.length(); i++) {
        	tmp = test(s, i, i);
        	if(tmp > ans) {
        		ans = tmp;
        		ret = s.substring(i - tmp / 2, i + tmp / 2 + 1);
        	}
        	tmp = test(s, i, i + 1);
        	if(tmp > ans) {
        		ans = tmp;
        		ret = s.substring(i + 1 - tmp / 2, i + 1 + tmp / 2);
        	}
        }
		return ret;
    }
	
	public static void main(String [] args) {
		Five five = new Five();
		System.out.println(five.longestPalindrome("aa"));
	}
	
}
