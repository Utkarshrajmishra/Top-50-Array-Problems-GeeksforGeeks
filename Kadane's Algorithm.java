class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
         int sum=0,max=arr[0];
        for(int i=0;i<n;i++)
        {
            sum=Math.max(sum+arr[i],arr[i]);
            max=Math.max(sum,max);
        }
        return max;
    
        
    }
    
}
