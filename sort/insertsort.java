package ≈≈–Ú;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class insertsort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		insertSort(a,n);
	}

	private static void insertSort(int[] a, int n) {
		if (n==0) return;
		int temp=0;
		for(int i=0;i<n-1;i++) {
			temp=a[i+1];
			int preindex=i;
			while(preindex>=0&&temp<a[preindex]) {
				a[preindex+1]=a[preindex];
				preindex--;
				}
			a[preindex+1]=temp;
			}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}			
	}
}




