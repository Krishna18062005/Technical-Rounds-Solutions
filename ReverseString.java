package l2;

public class ReverseString {
	public static void main(String[] args) {
	//String str1="today is a good day";
	String str2="i at  e an apple";
	char[] arr=str2.toCharArray();
	int i=0;
	int j=arr.length-1;
	while(i<j) {
		while(i<arr.length&&arr[i]==' ') i++;
		while(j>=0&&arr[j]==' ') j--;
		if(i<j) {
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		i++;
		j--;
	}
	//System.out.print("Krih");
	System.out.print(arr);
	}
}
