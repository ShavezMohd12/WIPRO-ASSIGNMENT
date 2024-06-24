package search;

public class jump_search {
	
	static void search(int[] arr,int value)
	
	{
		int jump=(int)Math.sqrt(arr.length);
		System.out.println(jump);
		int start=0;
	    boolean b=true;
	   
	    if(arr[arr.length-1]<value)
	    {
	    	System.out.println("Element not found");
	    }
	    else
	    {
		while(b!=false) 
		{	
			int skip=jump+start;
		   if(skip>arr.length-1) 
		   {
			 skip=arr.length-1; 
		   } 
		   
		if(arr[skip]>=value)
		{
			for(int i=start;i<=skip;i++)
			{
				if(arr[i]==value)
				{
					
					System.out.println("element found at index :"+i);
					b=false;
				}
			}
		 }
		 else {
	    	start=skip;
		  }
		
	    }
	    }
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6};
		search(arr,1);
	}

}
