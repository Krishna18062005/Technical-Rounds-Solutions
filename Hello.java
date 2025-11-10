package l2;
public class Hello {
	public static void main(String[] arg) {	
		int n=7;
		int son=(n*(n+1))/2;
		for(int i=n-1;i>=0;i--) {
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