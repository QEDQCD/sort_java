package ≈≈–Ú;

import java.util.Scanner;

public class bubblesort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < n; i++) {
		a[i]=sc.nextInt();
	}
	bubbleSort(a);
}

private static void bubbleSort(int[] a) {
	// TODO Auto-generated method stub
	for (int i = 0; i < a.length-1; i++) {
		for (int j = 0; j < a.length-i-1; j++) {
			if (a[j]>a[j+1]) {
				a[j]=a[j]^a[j+1];
				a[j+1]=a[j+1]^a[j];
				a[j]=a[j]^a[j+1];
			}
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}	
}
}
