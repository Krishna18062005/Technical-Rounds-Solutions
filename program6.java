package l3;

import java.util.ArrayList;
public class program6 {
  public static void main(String[] args) {
	  String s="This is a // PowerShot.Total-75-runs$";
	  ArrayList<String> arr=new ArrayList<>();
	  int ind=0;
	  for(int i=1;i<s.length();i++) {
		  char c1=s.charAt(i);
		  char c2=s.charAt(i-1);
		  if(c2==' ') continue;
		  else if(i>0&&s.charAt(i)<='Z'&&s.charAt(i)>='A'&&s.charAt(i-1)<='z'&&s.charAt(i-1)>='a') {
			  arr.add(s.substring(ind,i));
			  ind=i;
		  }
		  else if(s.charAt(i)==' ') {
			  arr.add(s.substring(ind,i));
			  ind=i+1;
		  }
		  else if(s.charAt(i)>=48&&s.charAt(i)<=57&&!(s.charAt(i-1)>=48&&s.charAt(i-1)<=57)) {
			  arr.add(s.substring(ind,i));
			  ind=i;
		  }
		  else if((Character.isLetterOrDigit(c1))&&!Character.isLetterOrDigit(c2)) {
			  arr.add(s.substring(ind,i));
			  ind=i;
		  } 
		  else if(!(Character.isLetterOrDigit(c1))&&Character.isLetterOrDigit(c2)) {
			  arr.add(s.substring(ind,i));
			  ind=i;
		  } 
	  }
	  arr.add(s.substring(ind));
	  for(String i:arr)
	  System.out.println(i);
	  
	  
  }
}
