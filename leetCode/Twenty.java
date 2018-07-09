package leetCode;

import java.util.*;

public class Twenty {
	
	public boolean valid(char c1, char c2) {
		if(c1 == '{' && c2 == '}')
			return true;
		if(c1 == '[' && c2 == ']')
			return true;
		if(c1 == '(' && c2 == ')')
			return true;
		return false;
	}
	
	public boolean isValid(String s) {
		boolean bRet = true;
		if(s.equals(""))
			return bRet;
        Stack<Character> stack = new Stack<Character>();
        int len = s.length();
        char tmp, top;
        for(int i = 0; i < len; i++) {
        	tmp = s.charAt(i);
        	if(tmp == '{' || tmp == '[' || tmp == '(')
        		stack.push(s.charAt(i));
        	else {
        		if(stack.isEmpty()){
        			bRet = false;
        			break;
        		}
        		top  = stack.pop();
        		if(!valid(top, tmp)){
        			bRet = false;
        			break;
        		}
        	}
        }
        if(!stack.isEmpty())
        	bRet = false;
        return bRet;
    }
	
	public static void main(String [] args) {
		Twenty t = new Twenty();
		System.out.println(t.isValid("{[]}"));
	}
}
