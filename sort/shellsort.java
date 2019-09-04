package ≈≈–Ú;

import java.util.Scanner;

public class shellsort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		ShellSort(a,n);
	}
	private static void ShellSort(int[] a, int n) {
		int gap=n/2;
		while (gap>0) {
			for (int i = gap; i < n; i++) {
				int temp=a[i];
				int preindex=i-gap;
				while (preindex>=0&&temp<a[preindex]) {
					a[preindex+gap]=a[preindex];
					preindex=preindex-gap;
				}
				a[preindex+gap]=temp;
			}		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
}

