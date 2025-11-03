package L22;

import java.util.Arrays;
public class sort {
	public static void main(String[] args) {
		//int[] arr= {-9,-4,-3,2,7,8,5};
		int[] arr2= {1,-1,2,2,3,3};
		Sort(arr2);
		System.out.println(Arrays.toString((arr2)));
		
	}
	public static void Sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int key=Math.abs(arr[i])%2;
			for(int j=i+1;j<arr.length;j++) {
				int sk=Math.abs(arr[j])%2;
				if(key==sk&&key==1&&arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				if(key==sk&&key==0&&arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

}

