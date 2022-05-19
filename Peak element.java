
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] nums,int n)
    {
       //add code here.
        int larger = nums[0];
        int index = 0;
        for(int a = 0;a<nums.length;a++){
            larger = Math.max(larger,nums[a]);
            if(larger == nums[a])
                index = a;
        }
        return index;
    }
}
