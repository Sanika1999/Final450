package Arrays;
import java.util.Scanner;

public class reverse_array_by_recursion {
	public static void reverse(int[] arr, int start, int end) {
		if(start>=end) {
			return ;
		}else {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start=start+1;
			end=end-1;
			reverse(arr,start,end);
			
			
		}
		
		
	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int k=0;k<n;k++) {
			System.out.println("enter element");
			int x=sc.nextInt();
			array[k]=x;
			
		}
		reverse(array,0,n-1);
		print(array);
		
		
	}

}
