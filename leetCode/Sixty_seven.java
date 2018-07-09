package leetCode;

public class Sixty_seven {

	public String handle(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	public String addBinary(String a, String b) {
        String ra = handle(a), rb = handle(b);
        int i = 0, c = 0, p, q;
        StringBuilder sb = new StringBuilder();
        while(i < ra.length() || i < rb.length() || c != 0) {
        	p = 0;
        	q = 0;
        	if(i < ra.length())
        		p = ra.charAt(i) - '0';
        	if(i < rb.length())
        		q = rb.charAt(i) - '0';
        	c = c + p + q;
        	sb.append(c % 2);
        	c /= 2;
        	i++;
        }
        return handle(sb.toString());
    }
	
	public static void main(String [] args) {
		Sixty_seven s = new Sixty_seven();
		System.out.println(s.addBinary("1010", "1011"));
	}
	
}
