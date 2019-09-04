package ����;
import java.util.Scanner;

public class heapsort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		heapSort(a);
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
}
	public static  void heapSort(int[] a){
        int len=a.length;
        //ѭ������  
        for(int i=0;i<len-1;i++){
            //����  
            buildMaxHeap(a,len-1-i);
            //�����Ѷ������һ��Ԫ��  
            swap(a,0,len-1-i);
        }
    }
     //��������
    private static  void swap(int[] a, int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    //��data�����0��lastIndex���󶥶�  
    private static void buildMaxHeap(int[] a, int lastIndex) {
        //��lastIndex���ڵ㣨���һ���ڵ㣩�ĸ��ڵ㿪ʼ  
        for(int i=(lastIndex-1)/2;i>=0;i--){
            //k���������жϵĽڵ�  
            int k=i;
            //�����ǰk�ڵ���ӽڵ����  
            while(k*2+1<=lastIndex){
                //k�ڵ�����ӽڵ������  
                int biggerIndex=2*k+1;
//���biggerIndexС��lastIndex����biggerIndex+1�����k�ڵ�����ӽڵ����  
                if(biggerIndex<lastIndex&&a[biggerIndex]<a[biggerIndex+1]){
                    //�����ӽڵ��ֵ�ϴ�  
                    //biggerIndex���Ǽ�¼�ϴ��ӽڵ������  
                   biggerIndex++;                  
                }
                //���k�ڵ��ֵС����ϴ���ӽڵ��ֵ  
                if(a[k]<a[biggerIndex]){
                    //��������  
                    swap(a,k,biggerIndex);
//��biggerIndex����k����ʼwhileѭ������һ��ѭ�������±�֤k�ڵ��ֵ�����������ӽڵ��ֵ  
                    k=biggerIndex;
                }else{
                    break;
                }                														
            }
        }
    }
}
