class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        
        int sum = 0;
       for(int i : array) sum+=i;
       return n*(n+1)/2 - sum;
    }
}
