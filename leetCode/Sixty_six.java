package leetCode;

import java.util.Arrays;

public class Sixty_six {

	public int[] plusOne(int[] digits) {
        int c = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = digits.length - 1; i >= 0; i--) {
        	digits[i] += c;
        	if(digits[i] >= 10) {
        		c = 1;
        	} else {
        		c = 0;
        	}
        	sb.append((digits[i] % 10) + "");
        }
        if(c != 0)
        	sb.append(1 + "");
        int ret[] = new int[sb.length()], len = sb.length();
        for(int i = len - 1; i >= 0; i--) {
        	ret[len - 1 - i] = sb.toString().charAt(i) - '0';
        }
        return ret;
    }
	
	public static void main(String [] args) {
		int a[] = {9, 9, 9};
		Sixty_six s = new Sixty_six();
		System.out.println(Arrays.toString(s.plusOne(a)));
	}
	
}
