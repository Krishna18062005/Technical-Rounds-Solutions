package l2;

public class Patternre {
	public static void main(String args[]) {
		int n=4;
		int son=(n*(n+1))/2;
		for(int i=0;i<n;i++) {
			int st=son-i;
			int r=n-i-1;			
			int s=0;
			int ii=n;			
			while(r-->0) {
				s+=ii;
				ii--;
			}
			st=st-s;
			for(int j=i+1;j<=n;j++) {
				if(j==i+1) {
					System.out.print(st+" ");
				}
				else {
				System.out.print(st+(j)+" ");
				st=st+j;
				}
			}
			System.out.println();
		}
	}

}
