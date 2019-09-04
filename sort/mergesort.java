package 排序;

import java.util.Scanner;

public class mergesort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=3;		
		int a[]= {1,3,2};
		mergeSort(a,0,n-1);
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
}

	private static void mergeSort(int[] a,int left,int right) {
		if (left>=right) {
			return;
		}
		int mid=(left+right)/2;
		mergeSort(a, left, mid);
		mergeSort(a, mid+1, right);
		merge(a,left,mid,right);
	}
//i:临时数组左边比较的元素下标；j:临时数组右边比较的元素的下标；
//k:原数组将要放置的元素下标
	private static void merge(int[] a, int left, int mid, int right) {
		int aux[]=new int[right-left+1];			
		for (int i = left; i <=right; i++) {
			aux[i-left]=a[i];/*减去的left是原数组相对于临时数组的偏移量*/
		}
		int i=left, j=mid+1;
		for(int k=left; k<=right; k++) {
			if(i > mid) { //检查左下标是否越界
				a[k] = aux[j-left];
				j++;
			} else if(j > right) { //检查右下标是否越界
				a[k] = aux[i-left];
				i++;
			} else if(aux[i-left] <= aux[j-left]) {
				a[k] = aux[i-left];
				i++;
			} else {
				a[k] = aux[j-left];
				j++;	
			}						
		}
	}
}