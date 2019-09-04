package ����;

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
//i:��ʱ������߱Ƚϵ�Ԫ���±ꣻj:��ʱ�����ұ߱Ƚϵ�Ԫ�ص��±ꣻ
//k:ԭ���齫Ҫ���õ�Ԫ���±�
	private static void merge(int[] a, int left, int mid, int right) {
		int aux[]=new int[right-left+1];			
		for (int i = left; i <=right; i++) {
			aux[i-left]=a[i];/*��ȥ��left��ԭ�����������ʱ�����ƫ����*/
		}
		int i=left, j=mid+1;
		for(int k=left; k<=right; k++) {
			if(i > mid) { //������±��Ƿ�Խ��
				a[k] = aux[j-left];
				j++;
			} else if(j > right) { //������±��Ƿ�Խ��
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