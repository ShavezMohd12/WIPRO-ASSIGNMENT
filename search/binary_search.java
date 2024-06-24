package search;




public class binary_search {
	
	 static int binarysearch(int[] arr,int x)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
		int mid=low+(high-low)/2;
		if(arr[mid]==x)
		{
			return mid;
		}
		if(arr[mid]<x)
		{
			low=mid+1;
		}
		if(arr[mid]>x)
		{
			high=mid-1;
		}

		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int x=4;
		int result=binarysearch(arr,x);
		
		if(result==-1)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("element found at index :"+result);
		}
		
	}

}
