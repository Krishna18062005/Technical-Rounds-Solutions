package l2;

import java.util.*;

public class parenthesis {
	public static void main(String[] args) {
	Stack<Integer> stk=new Stack<>();
	Stack<String> lst=new Stack<>();
	
	String st="((x+y)+((z)))";
	
	boolean f=false;
	for(int i=0;i<st.length();i++) {
		char ch=st.charAt(i);
		if(ch=='(') stk.push(i);
		
		else if(ch==')') {
			String rr=(st.substring(stk.peek(),i+1));			
			if(!lst.isEmpty()&&lst.peek().equals(rr.substring(1,rr.length()-1))) f=true;
			lst.push(rr);
			stk.pop();
		} 	
	}
	
	System.out.print(f);
	}
}
