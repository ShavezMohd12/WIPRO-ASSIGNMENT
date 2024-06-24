package sorting;

public class bubble {

	static void bubble_sort(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,3,2,1};
		bubble.bubble_sort(arr);
	}

}
