package 排序;

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
	    //桶数
	    int bucketNum = (max - min) / a.length + 1;
	    //建桶
	    ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketNum);
	    for(int i = 0; i < bucketNum; i++){
	        bucketArr.add(new ArrayList<Integer>());
	    }
	    
	    //将每个元素放入桶
	    for(int i = 0; i < a.length; i++){
	        int num = (a[i] - min) / (a.length);//得到a[i]放入num个桶
	        bucketArr.get(num).add(a[i]);
	    }
	    
	    //对每个桶进行排序
	    for(int i = 0; i < bucketArr.size(); i++){
	        Collections.sort(bucketArr.get(i));
	    }	    
	  //  System.out.println(bucketArr.toString());	 	    
	}	
}

