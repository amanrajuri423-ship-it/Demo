package logicArray;

import java.util.Arrays;

public class MaximumMinimum {

	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		
		Arrays.toString(arr);
		System.out.println(maxEle(arr));
		System.out.println(minEle(arr));
	}
	public static int maxEle(int arr[])
	{
		//int max=Integer.MAX_VALUE;
		int max=0;
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]>=max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static int minEle(int arr[]) 
	{
		//int min=Integer.MAX_VALUE;
		int min=arr[0];
		for (int i = 0; i < arr.length-1; i++)
		{
			if(arr[i]<=min)
			{
				min=arr[i];
			}
		}
		return min;
	}

}
