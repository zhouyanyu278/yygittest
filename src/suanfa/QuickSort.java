package suanfa;

import java.util.Arrays;

public class QuickSort {

	public static double[] quickSort(double[] array,int i,int j)
	{
		int left=i;
		int right=j;
		if(i>j)
		{
			 return array;
		}
		else
		{
			double temp;
			double compare=array[i];
			while(true)
			{
				
				while(array[right]>compare && left<right)
				{
					right--;
				}
				while(array[left]<=compare && left<     right)
				{
					left++;
				}
				
				
				
				if(left>=right)
				{
					break;
				}
				temp=array[right];
				array[right]=array[left];
				array[left]=temp;
				if(array[i]==compare)
				{
					right--;
				}
				else
				{
					left++;
				}
			}
			temp=array[i];
			array[i]=array[left];
			array[left]=temp;
		
		}
		if(i<left-1)
		{
			quickSort(array,i,left-1);
		}
		if(right+1<j)
		{
			quickSort(array,right+1,j);
		}
	    return array;
		
	}
	public static void main(String[] args) 
	{
		double[] a= {11,23,34,234,12,54,76,32,65,43};
		System.out.println("待排序的数组:"+Arrays.toString(a));
		double[] b =QuickSort.quickSort(a,0,a.length-1);
		System.out.println("已排序的数组:"+Arrays.toString(b));
		// TODO Auto-generated method stub

	}
	
}
