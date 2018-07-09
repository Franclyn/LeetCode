package leetCode;

public class Nine {
	public boolean isPalindrome(int x) {
        String str = x + "";
        boolean ret = true;
        int len = str.length();
        for(int s = 0, e = len - 1; s < e; s++, e--) {
        	if(str.charAt(s) != str.charAt(e)) {
        		ret = false;
        		break;
        	}
        }
        return ret;
    }
	
	public static void main(String [] args) {
		Nine nine = new Nine();
		System.out.println(nine.isPalindrome(-454));
	}
}
