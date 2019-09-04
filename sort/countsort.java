package ≈≈–Ú;

import java.util.Arrays;
import java.util.Scanner;

public class countsort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=3;		
		int a[]= {1,3,2};
		countSort(a,n);
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
}
	private static void countSort(int[] a,int n) {
		if (n==0)  return;			
		 int bias, min = a[0], max = a[0];
		for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
        }
		 bias = 0 - min;
	        int[] bucket = new int[max - min + 1];
	        Arrays.fill(bucket, 0);
	        for (int i = 0; i <n; i++) {
	            bucket[a[i] + bias]++;
	        }
	        int index = 0, i = 0;
	        while (index < n) {
	            if (bucket[i] != 0) {
	                a[index] = i - bias;
	                bucket[i]--;
	                index++;
	            } else
	                i++;
	        }	       
	}
}
