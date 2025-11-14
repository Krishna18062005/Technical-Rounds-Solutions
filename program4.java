package l3;

import java.util.Arrays;
public class program4 {
public static void main(String[] args) {
	int[] ar= {4,7,5,1,1,3};
	int[] cp=ar.clone();
	int f=Integer.MIN_VALUE;
	int c=0;
	for(int i=0;i<cp.length;i++) {
		for(int j=i+1;j<cp.length;j++) {
			if(cp[i]>cp[j]) {
				int t=cp[i];
				cp[i]=cp[j];
				cp[j]=t;
			}
			if(cp[i]==cp[j]) {cp[i]=f;c++;break;}
			
		}
	}
	//System.out.println(Arrays.toString(cp));
	int[] ans=new int[ar.length];
	for(int i=0;i<ar.length;i++) {
		int ind=-1;
		int r=c-1;
		int l=cp.length-1;
		while(r<=l) {
			int mid=(l+r)/2;
			if(cp[mid]==ar[i]) { ind=mid;break;}
			else if(cp[mid]<ar[i]) r=mid+1;
			else l=mid-1;
		}
		ans[i]=ind-c;
	}
	System.out.print(Arrays.toString(ans));	
	
}
}
