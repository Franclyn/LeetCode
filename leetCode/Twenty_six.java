package leetCode;

import java.util.Arrays;

public class Twenty_six {
	
	
	
	public int removeDuplicates(int[] nums) {
        int len = nums.length, pos;
        if(len <= 1)
        	return len;
        int i, j;
        for(i = 0, j = 1; i < len; i++) {
        	while(j < len && nums[j] <= nums[i])
        		j++;
        	if(j < len) {
        		nums[i + 1] = nums[j];
        	} else {
        		break;
        	}
        }
        return i + 1;
    }
	
	public static void main(String [] args) {
		Twenty_six t = new Twenty_six();
		int a[] = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(t.removeDuplicates(a));
		System.out.println(Arrays.toString(a));
	}
	
}
