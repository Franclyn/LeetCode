package leetCode;

import java.util.Arrays;

public class Twenty_seven {
	public int removeElement(int[] nums, int val) {
        int len = nums.length, tmp, i, j;
        for(i = 0, j = 0; i < len; i++) {
        	if(nums[i] != val) {
        		tmp = nums[i];
        		nums[i] = nums[j];
        		nums[j] = tmp;
        		j++;
        	}
        }
        return j;
    }
	
	public static void main(String [] args) {
		int a[] = {1};
		Twenty_seven t = new Twenty_seven();
		System.out.println(t.removeElement(a, 1));
		System.out.println(Arrays.toString(a));
	}
}
