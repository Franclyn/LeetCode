package leetCode;

public class Seven {

	public int reverse(int x) {
        long tmp = 0L;
        while(x != 0) {
        	tmp = tmp * 10 + x % 10;
        	x /= 10;
        }
        if(tmp > Integer.MAX_VALUE || tmp < Integer.MIN_VALUE) {
        	tmp = 0;
        }
        return (int)tmp;
    }
	
	public static void main(String [] args) {
		Seven seven = new Seven();
		System.out.println(seven.reverse(1434432456));
	}
	
}
