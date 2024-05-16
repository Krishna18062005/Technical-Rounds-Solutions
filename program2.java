package l3;

import java.util.HashSet;
import java.util.Set;

public class program2 {
public static void main(String[] args) {
	//String[] arr= {"test.email+alex@xyz.com","test.e.mail+bob.cathy@xyz.com","testemail+david@x.y.z.com"};
	String[] arr2= {"abb@xyz.com","abb@xyz.com","c@xyz.com"};
	Set<String> set=new HashSet<>();
	for(String i:arr2) {
		String email="";
		int j=0;
		for(;j<i.length();j++) {
			if(i.charAt(j)=='+'||i.charAt(j)=='@') break;
			else if(i.charAt(j)=='.') continue;
			else email+=i.charAt(j);
		}
		while(j<i.length()&&i.charAt(j)!='@') {
			j++;
		}
		boolean f=false;
		while(j<i.length()) {
			email+=i.charAt(j++);
			f=true;
		}
		if(f)
		set.add(email);
	}
	System.out.print(set.size());
}
}
