package com.arrays;

public class CyclicRotation {
	
	public static void cycle(int arr[], int n,int d) {
		for(int i=0;i<d;i++) {
			leftrotate(arr,n);
		}
	}

	private static void leftrotate(int[] arr, int n) {
		int temp=arr[n-1];
		for(int i=n-1;i>0;i--) {
			arr[i] = arr[i-1]; 
		}
		arr[0]=temp;
	}

	public static void printArray(int arr[]) 
    { 
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " "); 
    } 

	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		cycle(arr,7,3);
		
		printArray(arr);
	}

}
