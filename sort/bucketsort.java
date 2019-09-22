package ����;

import java.util.ArrayList;
import java.util.Collections;

public class bucketsort {
public static void main(String[] args) {
	int []a= {2,5,4,7,9};
	bucketSort(a);
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
}

private static void bucketSort(int[] a) {	    
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    for(int i = 0; i < a.length; i++){
	        max = Math.max(max, a[i]);
	        min = Math.min(min, a[i]);
	    }	  
	    //Ͱ��
	    int bucketNum = (max - min) / a.length + 1;
	    //��Ͱ
	    ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketNum);
	    for(int i = 0; i < bucketNum; i++){
	        bucketArr.add(new ArrayList<Integer>());
	    }
	    
	    //��ÿ��Ԫ�ط���Ͱ
	    for(int i = 0; i < a.length; i++){
	        int num = (a[i] - min) / (a.length);//�õ�a[i]����num��Ͱ
	        bucketArr.get(num).add(a[i]);
	    }
	    
	    //��ÿ��Ͱ��������
	    for(int i = 0; i < bucketArr.size(); i++){
	        Collections.sort(bucketArr.get(i));
	    }	    
	  //  System.out.println(bucketArr.toString());	 	    
	}	
}

