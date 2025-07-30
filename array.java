package l2;
public class array {
	public static void main(String[] args) {
		int[] ar1= {29,6,19,25,9,14,12,1,8};
		int[] ar2= {14,1,19,29,25,8,12,9};
		int s=0;
		for(int i:ar1) {
			s+=i;
		}
		for(int i:ar2) {
			s-=i;
		}
		System.out.print(s);
	}
}