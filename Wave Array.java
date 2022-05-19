class Solution{

    
    // arr: input array
    // n: size of the array
    //Function to sort the array into a wave-like array.
    public static void convertToWave(int arr[], int n){
        
        // Your code here
        int counter=0;
        if(arr.length%2!=0)
        {
            counter++;
        }
          int index=0;
         for(int i=0;i<arr.length;i+=2)
         {
             if(counter==1)
             {
                 if(i==arr.length-1)
                 {
                     break;
                 }
             }
