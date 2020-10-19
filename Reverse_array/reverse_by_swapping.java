package Arrays;

import java.util.Scanner;

public class reverse_by_swapping {
	public static void reverse(int[] a) {
		int temp;
		int start=0;
		int end=a.length-1;
		for(int i=0;i<a.length/2;i++) {
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start=start+1;
			end=end-1;
			
		}
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int k=0;k<n;k++) {
			System.out.println("enter element");
			int x=sc.nextInt();
			arr[k]=x;
		}
		reverse(arr);
	}

}
//O(n)
