package L22;

public class Version {
public static void main(String[] args) {
	String ver1="12.3.4.3";
	String ver2="12.3.4.3.0.1";
	String v1[]=ver1.split("\\.");
	String v2[]=ver2.split("\\.");
	int max=Math.max(v1.length,v2.length);
    for(int i=0;i<max;i++) {
        int fi=((v1.length>i))?inn(v1[i]):0;
        int se=((v2.length>i))?inn(v2[i]):0;
        if(fi<se) {
        	System.out.println(-1);
        	return ;
        }
        else if(fi>se) {
        	System.out.println(1);
        	return ;
        }
        
    }
    System.out.println(0);	
}
public static int inn(String st) {
	int num=0;
	for(int i=0;i<st.length();i++) {
		num=num*10+(st.charAt(i)-'0');
	}
	return num;
}
}
