package L22;
import java.util.*;
public class Sum {
public static void main(String[] args) {
	//int max=Integer.MIN_VALUE;
	//int min=Integer.MAX_VALUE;
	//int maxOccur=1;
	//int[] arr= {1,1,2,3,4};
	//arr=new int[] {1,2,2,3,3,3,4,4,4,4};
	//arr=new int[] {-3,2,2,1 ,1,3,3};
//	for(int i=0;i<arr.length;i++) {
//		if(min>arr[i]) {
//			min=arr[i];
//		}
//		if(max<arr[i]) {
//			max=arr[i];
//		}
//	}
//	int size=Math.abs(max)+(Math.abs(min))+1;
//	int[] freq=new int[size];
//	for(int i:arr) {
//		freq[i-min]++;
//		if(maxOccur<freq[i-min]) {
//			maxOccur=freq[i-min];
//		}
//	}
//	for(int i=1;i<=maxOccur;i++) {
//		int sum=0;
//		for(int j=0;j<size;j++) {
//			if(i==freq[j]) {
//				sum+=((j+min)*freq[j]);
//			}
//		}
//		if(sum!=0)
//		System.out.println(i+"->"+sum);
//	}	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr= new int[n];
	for(int i=0;i<n;i++) arr[i]=sc.nextInt();
	int maxOcc=0;
	HashMap<Integer,Integer> map=new HashMap<>();
	for(int i:arr) {
		if(map.containsKey(i)) {
			map.put(i,map.get(i)+1);
		}
		else
		map.put(i,1);
		maxOcc=Math.max(map.get(i),maxOcc);
	}
	int[] ans=new int[maxOcc];
	for(int i:arr)
	{
	ans[map.get(i)-1]+=i;
	}
	for(int i=1;i<=ans.length;i++) {
		if(ans[i-1]!=0)
	System.out.println(i+"->"+ans[i-1]);}
		
}
}