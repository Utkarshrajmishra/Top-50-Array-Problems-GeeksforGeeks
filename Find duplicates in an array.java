class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
      ArrayList<Integer> a=new ArrayList<>();
      int[] ar=new int[n];
      Arrays.fill(ar,0);
      for(int i=0;i<arr.length;i++){
          ar[arr[i]]++;
      }
     for(int i=0;i<n;i++){
         if(ar[i]>1){
             a.add(i);
         }
     }
     if(a.size()==0){
         a.add(-1);
     }
     return a;
      
    }
}
