package sorting;

public class merge {

	static void merge(int arr[],int l,int m,int r)
	{
		int n1=m-l+1;
		int n2=r-m;
		
		int[] L=new int[n1];
		int[] R=new int[n2];
		//copy temp array
		for(int i=0;i<n1;i++)
		{
			L[i]=arr[l+i];
		}
		for(int j=0;j<n2;j++)
		{
			R[j]=arr[m+1+j];
		}
//		merge temp array
		
		int i=0,j=0;
		//initial index pf merge sub array
		int k=l;
		while(i<n1 && j<n2)
		{
			if(L[i]<=R[j])
			{
				arr[k]=L[i];
				i++;
			}
			else
			{
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
		//copy remaining element of L[] if any 
		while(i<n1)
		{
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=R[j];
			j++;
			k++;
		}
	}
	
	static void sort(int arr[],int l,int r)
	{
		if(l<r)
		{
			int m=l+(r-l)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}
	
	public static void printArr(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,3,2,1};
		sort(arr,0,arr.length-1);
		printArr(arr);
	}

}
