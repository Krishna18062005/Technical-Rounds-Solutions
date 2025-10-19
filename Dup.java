package L22;

public class Dup {
public static void main(String[] args) {
	String ip="a1b2c34c3b2cb3a1d";
	ip="2abs11111sjaass21";
	int[] freq=new int[256];
	for(int i=0;i<ip.length();i++) {
		freq[ip.charAt(i)]++;
	}
	for(int i=0;i<ip.length();i++) {
		char ch=ip.charAt(i);
		if(ch<='9'&&ch>='0') {
			if(freq[ch]>1) {
				freq[ch]--;
				if(i==0) {
					ip=ip.substring(i+1);
				}
				else
				ip=ip.substring(0,i)+ip.substring(i+1);
				i-=1;
			}
		}
		else {
			if(freq[ch]!=-1) {
				freq[ch]=-1;
			}
			else if(freq[ch]==-1) {
				ip=ip.substring(0,i)+ip.substring(i+1);
				i-=1;
			}
		}
	}
	System.out.println(ip);
}
}
