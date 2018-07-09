package leetCode;

public class Four {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length, s1 = 0, s2 =0, cnt = 0, len = l1 + l2;
        int after[] = new int[len];
        double ret;
        while(s1 < l1 && s2 < l2) {
        	if(nums1[s1] < nums2[s2]) {
        		after[cnt++] = nums1[s1++];
        	} else {
        		after[cnt++] = nums2[s2++];
        	}
        }
        if(s1 < l1) {
        	for(int i = s1; i < l1; i++)
        		after[cnt++] = nums1[i];
        }
        if(s2 < l2) {
        	for(int i = s2; i < l2; i++)
        		after[cnt++] = nums2[i];
        }
        if(len % 2 != 0) {
        	ret = after[len / 2];
        } else {
        	ret = 1.0 * (after[len / 2 - 1] + after[len / 2]) / 2.0;
        }
        return ret;
    }
	
	public static void main(String [] args) {
		Four four = new Four();
		int a[] = {1, 3}, b[] = {2};
		System.out.println(four.findMedianSortedArrays(a, b));
	}
	
}
