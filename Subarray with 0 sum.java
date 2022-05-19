class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            
        if(sum ==0 ||(map.get(sum)!=null))
        {
            return true;
        }
        map.put(sum,i);
        }
        return false;
    }
}
