package l3;

public class program3 {
	public static void main(String[] args) {
		//int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
		//int[] []mat= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] mat= {{1,2,3,4,5}};
		
		int rs=0;
		int re=mat.length-1;
		int cs=0;
		int ce=mat[0].length-1;
		
		while(rs<=re&&cs<=ce){
			for(int j=cs;j<=ce;j++) {
				System.out.print(mat[rs][j]+" ");
			}
			rs++;
			if(cs<=ce)
			for(int j=rs;j<=re;j++) {
				System.out.print(mat[j][ce]+" ");
			}
	        ce--;		
			if(rs<=re)
			for(int j=ce;j>=cs;j--) {
				System.out.print(mat[re][j]+" ");
			}
			re--;
			for(int j=re;j>=rs;j--) {
				System.out.print(mat[j][cs]+" ");
			}
			cs++;						
		}	
	}
}
