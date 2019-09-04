package 排序;

import java.util.Scanner;

public class quicksort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=3;		
		int a[]= {1,3,2};
		quickSort(a,0,n-1);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static void quickSort(int[] a,int start,int end) {
		if(start<end)
		{
			int basenum=a[start];//基准数
			int temp;
			int left=start;//左右指针
			int right=end;
			while (left<right) {
				while (a[left]<basenum&&left<end) {
					left++;
				}
				while (a[right]>basenum&&right>start) {
					right--;
				}
				if(left<=right) {
					temp=a[left];
					a[left]=a[right];
					a[right]=temp;
					left++;
					right--;
				}
			}
			if (start<right) {
				quickSort(a, start, right);
			}
			if (end>left) {
				quickSort(a, left, end);
			}			
	}
	}
}
	


