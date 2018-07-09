package leetCode;

import java.util.Arrays;

public class One {

	public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int ret[] = new int[2];
//        Arrays.sort(nums);
//        int s = 0, e = len - 1, tmp;
//        while(s < e) {
//        	tmp = nums[s] + nums[e];
//        	if(tmp == target) {
//        		ret[0] = s;
//        		ret[1] = e;
//        		break;
//        	} else if(tmp > target) {
//        		e--;
//        	} else {
//        		s++;
//        	}
//        }
        boolean flag = false;
        for(int i = 0; i < len - 1; i++) {
        	for(int j = i + 1; j < len; j++) {
        		if(nums[i] + nums[j] == target) {
        			ret[0] = i;
        			ret[1] = j;
        			flag = true;
        			break;
        		}
        	}
        	if(flag) 
        		break;
        }
        return ret;
    }
	
	public static void main(String [] args) {
		One one = new One();
		int num[] = {7, 11, 5, 2};
		System.out.println(Arrays.toString(one.twoSum(num, 9)));
	}
}
