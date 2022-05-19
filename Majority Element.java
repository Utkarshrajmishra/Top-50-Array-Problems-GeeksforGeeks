class Solution
{
    static int majorityElement(int nums[], int size)
    {
        // your code here
        int count = 0;
        Arrays.sort(nums);
        
        for(int i = 0; i<nums.length; i++)
        {
            if(i == 0)
            {
                count++;
            }
            else
            {
                if(nums[i] == nums[i-1])
                    count++;
                else
                    count = 1;
            }
            if(count > nums.length/2)
                return nums[i];
        }
        return -1;
    }
}
