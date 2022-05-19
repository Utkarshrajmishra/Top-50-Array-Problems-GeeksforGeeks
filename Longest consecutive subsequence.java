class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	 
        int maxcounter=0;
	   
	   HashSet<Integer> set= new HashSet<Integer>();
	    for(int i=0;i<N;i++)
	    {
	        set.add(arr[i]);
	    }
	    for(int i=0;i<N;i++)
	    {
	        if(set.contains((arr[i])-1)==false)
	        {
	            int key=arr[i];
	           
	            while(set.contains(key))
	            {
	               
	                key++;
	            }
	            if(maxcounter<key-arr[i])
	            {
	                maxcounter=key-arr[i];
	            }
	        }
	        
	       
	    }
	    return maxcounter;
	}
}
